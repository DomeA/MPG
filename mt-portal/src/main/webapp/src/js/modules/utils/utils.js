/**
 * Created by domea on 16-6-25.
 */
define(['jquery','./config','jquery.log','jquery.client','jquery.dateFormat'],function ($,config) {
    var _testModule=function(){
        this.logger('utils module is loaded success!');
    };
    var _logger=function(message){
        var flag=config.bLogger;
        var __logger=function(){
            var longDateFormat  = 'yyyy-MM-dd HH:mm:ss';
            $.log($.format.date(new Date(),longDateFormat)+':'+message);
        };
        flag?__logger():$.log('logger has been turned off!');
    };
    var _getClientType=function(){
        return $.client.os+":"+$.client.browser;
    };
    return {
        test:_testModule,
        logger:_logger,
        getClientType:_getClientType
    };
});