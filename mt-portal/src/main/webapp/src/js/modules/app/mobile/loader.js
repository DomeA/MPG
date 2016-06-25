/**
 * Created by domea on 16-6-25.
 */
define(['./config','../../utils/utils'],function (config,utils) {
    var _testModule=function(){
        utils.logger('mobile module is loaded success!');
    };
    return {
        test:_testModule
    }
});