/**
 * Created by domea on 16-6-6.
 */
var fs = require('fs');
var path = require('path');
var gulp = require('gulp');
var pkg = require('./package.json');
var bower = require('gulp-bower');
var plugins = require('gulp-load-plugins')();
var dirs = pkg['mappingo-configs'].directories;
//按照顺序运行程序
var runSequence = require('run-sequence');
/**
 * cmd命令帮助
 */
gulp.task('help',function () {
    console.log('	gulp build			文件打包');
    console.log('	gulp watch			文件监控打包');
    console.log('	gulp help			gulp参数说明');
    console.log('	gulp server			测试server');
    console.log('	gulp -p				生产环境（默认生产环境）');
    console.log('	gulp -d				开发环境');
    console.log('	gulp -m <module>		部分模块打包（默认全部打包）');
});
/**
 * 创建压缩文件目录
 */
gulp.task('archive:create_archive_dir', function () {
    fs.mkdirSync(path.resolve(dirs.archive), '0755');
});
/**
 * 创建压缩文件
 */
gulp.task('archive:zip', function (done) {
    var archiveName = path.resolve(dirs.archive, pkg.name + '_v' + pkg.version + '.zip');
    var archiver = require('archiver')('zip');
    var files = require('glob').sync('**/*.*', {
        'cwd': dirs.dist,
        'dot': true // include hidden files
    });
    var output = fs.createWriteStream(archiveName);
    archiver.on('error', function (error) {
        done();
        throw error;
    });
    output.on('close', done);
    files.forEach(function (file) {
        var filePath = path.resolve(dirs.dist, file);
        // `archiver.bulk` does not maintain the file
        // permissions, so we need to add files individually
        archiver.append(fs.createReadStream(filePath), {
            'name': file,
            'mode': fs.statSync(filePath).mode
        });
    });
    archiver.pipe(output);
    archiver.finalize();
});
/**
 * 打包归档
 */
gulp.task('archive', function (done) {
    runSequence(
        'build',
        'archive:create_archive_dir',
        'archive:zip',
        done);
});
/**
 * 清除编译结果
 */
gulp.task('clean', function (done) {
    require('del')([
        dirs.archive,
        dirs.dist
    ]).then(function () {
        done();
    });
});
/**
 * 拷贝bower文件夹下的组件到源代码目录里
 */
gulp.task('bower', function() {
    return bower().pipe(gulp.dest(dirs.src+"/js/libs"));
});

gulp.task('lint:js', function () {
    return gulp.src([
        'gulpfile.js',
        dirs.src + '/js/**/*.js',
        dirs.test + '/*.js'
    ]).pipe(plugins.jscs())
        .pipe(plugins.jshint())
        .pipe(plugins.jshint.reporter('jshint-stylish'))
        .pipe(plugins.jshint.reporter('fail'));
});

/**
 * 拷贝文件到编译文件
 */
gulp.task('copy', [
    'copy:index.html',
    'copy:jquery',
    'copy:license',
    'copy:main.css',
    'copy:misc',
    'copy:normalize'
]);

/**
 * 开始编译
 */
gulp.task('build', function (done) {
    runSequence(
        ['clean', 'lint:js'],
        'copy',
        done);
});

/**
 * 默认
 */
gulp.task('default',function () {
    gulp.start()
});
gulp.task('default', ['build']);