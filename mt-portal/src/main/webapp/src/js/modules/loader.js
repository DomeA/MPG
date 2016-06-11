/**
 * Created by domea on 16-6-11.
 */
define([
    'jquery',
    'require',
    './config',
    'jquery.client',
    'jquery.log',
    'jquery.particleground',
    'dhtmlx',
    './app/desktop/main',
    './app/mobile/main'
],function ($,require,config) {
    var _testModule=function(){
        __debug('loader module is loaded success!');
    };
    var __debug=function(message){
        var debug=config.debug;
        debug?$.log(message):$('Debug switch has been turned off!');
    };
    var _show=function(){
        __titleInit();
        __loginInit();
        var mod='';
        __isDesktop()?mod='desktop':mod='mobile';
        var mod=require('./app/'+mod+'/main');
        mod.test();
        __debug("show function is running ok!");
    };
    var __isDesktop=function(){
        return true;
    };
    var __backgroundInit=function(domId,
                                  dotColor,
                             lineColor,
                             minSpeedX,
                             maxSpeedX,
                             minSpeedY,
                             maxSpeedY,
                             directionX,
                             directionY){
        var dom=$('#'+domId).length?$('#'+domId):$('.'+domId).length?$('.'+domId):$(domId).length?$(domId):__debug('Dom object is not exist!');
            dom.particleground({
                dotColor: dotColor,//'#5cbdaa',
                lineColor: lineColor,
                minSpeedX: minSpeedX,
                maxSpeedX: maxSpeedX,
                minSpeedY: minSpeedY,
                maxSpeedY: maxSpeedY,
                directionX:directionX,//可以“center”,“left”或'right”。“中心”意味着点将反弹的边缘画布。
                directionY:directionY //可以 'center', 'up' or 'down'. 'center' 意味着点将反弹的边缘画布。
            });
        __debug('backgroundInit function is running ok!');
    };
    var __carouselInit=function(){
            window.dhx4.skin = 'material';
            var main_layout = new dhtmlXLayoutObject("quickContentForm", '1C');
            var a = main_layout.cells('a');
            a.hideHeader();
            var carousel_1 = a.attachCarousel({effect: 'slide', item_width: 'auto', item_height: 'auto', offset_left: '2', offset_top: '2', offset_item: '4', keys: 'true'});
            carousel_1.addCell('carousel_item_1');
            var carousel_item_1 = carousel_1.cells('carousel_item_1');
            carousel_1.addCell('carousel_item_2');
            var carousel_item_2 = carousel_1.cells('carousel_item_2');
            carousel_1.addCell('carousel_item_3');
            var carousel_item_3 = carousel_1.cells('carousel_item_3');
        __debug('carouselInit function is running ok!');
    };
    var __loginFormInit=function () {

    };
    var __loginInit=function(){
        var background=config.background;
        __backgroundInit(background.domId,background.dotColor, background.lineColor, background.minSpeedX, background.maxSpeedX, background.minSpeedY, background.maxSpeedY, background.directionX, background.directionY);
        __carouselInit();
        __loginFormInit();
        __debug('loginInit function is running ok!');
    };
    var __headerInit=function(){
        var title=config.title;
        //todo
        __debug('titleInit function is running ok!');
    };
    var __titleInit=function(){
        var title=config.title;
        $('title').html(title.mainTitle.value);
        __debug('titleInit function is running ok!');
    };
    return {
        test:_testModule,
        show:_show
    };
});