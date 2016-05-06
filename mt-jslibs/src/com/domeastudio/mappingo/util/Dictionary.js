/**
 * Created by Administrator on 2016/5/6 0006.
 */
define("com/domeastudio/mappingo/util/Dictionary",[],function () {
    var createNew=function () {
        var dictionary = {};
        var dataStore = [];
        dictionary.add = function (key, value) {
            dataStore[key] = value;
        };
        dictionary.find = function (key) {
            return dataStore[key];
        };
        dictionary.remove = function (key) {
            delete dataStore[key];
        };
        dictionary.showAll = function () {

        };
        dictionary.size=function () {

        };
        return dictionary;
    };
    return {
        getInstance:createNew
    };
});