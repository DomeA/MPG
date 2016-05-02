/**
 * Created by domea on 16-5-2.
 */
define("com/domeastudio/mappingo/util/IsValid",[],function () {
    var isList=function(data){
        return data instanceof List;
    };
    var isArray=function (data) {

    };
    var isHasTable=function (data) {

    };
    return {
        isList:isList,
        isArray:isArray,
        isHasTable:isHasTable
    };
});