/**
 * Created by domea on 16-5-2.
 */
var Stack={
    createNew:function () {
        var stack={};
        var top=0;
        var dataStore=[];
        stack.push=function (element) {
            dataStore[top++]=element;
        };
        stack.pop=function () {
            return dataStore[--top];
        };
        stack.peek=function () {
            return dataStore[top-1];
        };
        stack.size=function () {
          return top;
        };
        stack.clear=function () {
            top=0;
        };
        stack.toString=function () {

        };
        return stack;
    }
};