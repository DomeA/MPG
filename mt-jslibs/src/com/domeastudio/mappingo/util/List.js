/**
 * Created by domea on 16-5-1.
 */
define("com/domeastudio/mappingo/util/List",["com/domeastudio/mappingo/util/Iterator"],function (Iterator) {
    //静态变量
    //var xx=xx
    var createNew=function () {
        var list={};
        var listSize=0;
        var pos=0;
        var dataStore=[];

        list.size=function(){
            return listSize;
        };
        list.clear=function(){
            delete dataStore;
            dataStore=[];
            listSize=pos=0;
        };
        var find=function(element){
            for(var i=0;i<dataStore.length;++i){
                if(dataStore[i]==element){
                    return i;
                }
            }
            return -1;
        };
        list.insert=function(element,after){
            var insertPos=find(after);
            if(insertPos>-1){
                dataStore.splice(insertPos+1,0,element);
                ++listSize;
                return true;
            }
            return false;
        };
        list.front=function(){
            pos=0;
        };
        list.remove=function(element){
            var foundAt=find(element);
            if(foundAt>-1){
                dataStore.splice(foundAt,1);
                --listSize;
                return true;
            }
            return false;
        };
        list.end=function(){
            pos=listSize-1;
        };
        list.next=function(){
            if(pos<listSize-1){
                ++pos;
            }
        };
        list.moveTo=function(position){
            pos=position;
        };
        list.getElement=function(){
            return dataStore[pos];
        };
        list.currPos=function(){
            return pos;
        };
        list.contains=function(element){
            for(var i=0;i<dataStore.length;++i){
                if(dataStore[i]==element){
                    return true;
                }
            }
            return false;
        };
        list.prev=function(){
            if(pos>0){
                --pos;
            }
        };
        list.append=function(element){
            dataStore[listSize++]=element;
        };
        list.toString=function(){};
        list.getIterator=function(){
            return Iterator.getInstance(dataStore);
        };
        return list;
    };
    return {
        getInstance:createNew
    };
});