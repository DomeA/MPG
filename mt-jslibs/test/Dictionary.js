/**
 * Created by domea on 16-5-3.
 */
var Dictionary={
    createNew:function () {
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
    }
};