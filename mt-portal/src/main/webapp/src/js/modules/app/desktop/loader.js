/**
 * Created by domea on 16-6-25.
 */
define(['./config',
    '../../utils/utils'
    //'ol3',
    //'baidu',
    //'google',
    //'tianditu'
],function (config,utils) {
    var _testModule=function(){
        utils.logger(this + 'desktop module is loaded success!');
    };
    var _getGISModules=function(){

    };
    return {
        test:_testModule
    };
});