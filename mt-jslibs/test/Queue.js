/**
 * Created by domea on 16-5-2.
 */
var Queue={
    createNew:function () {
        var queue={};
        var dataStore=[];
        queue.enqueue=function (element) {
            dataStore.push(element);
        };
        queue.dequeue=function () {
            return dataStore.shift();
        };
        queue.back=function () {
            return dataStore[dataStore.length-1];
        };
        queue.empty=function () {
            return dataStore.length==0;
        };
        queue.toString=function () {
            
        };
        queue.size=function () {

        };
        queue.front=function () {
            return dataStore[0];
        };
        return queue;
    }
};