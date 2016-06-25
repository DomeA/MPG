/**
 * Created by domea on 16-6-11.
 */
define(['jquery','./config','../utils/utils','dhtmlx','jquery.particleground'],function ($,config,utils) {
    var _testModule=function(){
        utils.test();
        utils.logger('login module is loaded success!');
    };
    var _show=function(){
        __titleInit();
        __loginInit();
        utils.logger("show function is running ok!");
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
        utils.logger('backgroundInit function is running ok!');
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
        utils.logger('carouselInit function is running ok!');
    };
    var __loginFormInit=function () {

    };
    var __loginInit=function(){
        var background=config.background;
        __backgroundInit(background.domId,background.dotColor, background.lineColor, background.minSpeedX, background.maxSpeedX, background.minSpeedY, background.maxSpeedY, background.directionX, background.directionY);
        __carouselInit();
        __loginFormInit();
        utils.logger('loginInit function is running ok!');
    };
    var __headerInit=function(){
        var title=config.title;
        //todo
        utils.logger('titleInit function is running ok!');
    };
    var __titleInit=function(){
        var title=config.title;
        $('title').html(title.mainTitle.value);
        utils.logger('titleInit function is running ok!');
    };
    return {
        test:_testModule,
        show:_show
    };
});