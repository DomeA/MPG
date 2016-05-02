/**
 * Created by domea on 16-5-2.
 */
define("com/domeastudio/mappingo/util/Iterator",[
    "com/domeastudio/mappingo/util/IsValid"
],function (IsValid) {
    var createNew=function(aggregate){
        var iterator={};
        var dataStore=function () {
            if(IsValid.isList(aggregate)||IsValid.isArray(aggregate)||IsValid.isHasTable(aggregate)){
                return aggregate;
            }else {
                return null;
            }
        };
        var index=0;
        iterator.next=function(){
            
        };
        iterator.hasNext=function () {
            return index<=(dataStore().size()-1);
        };
        iterator.hasPrevious=function () {
            return index>0;
        };
        iterator.previous=function () {
            
        };
        return iterator;
    };

    return {
        getInstance:createNew
    };
});