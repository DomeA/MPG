/**
 * Created by domea on 16-6-11.
 */
define(['jquery','jquery.log'],function ($) {
    var _testModule=function(){
        $.log('mobile module is loaded success!');
    };
    return {
        test:_testModule
    };
});