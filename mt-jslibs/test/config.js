/**
 * Created by domea on 16-5-1.
 */
'use strict';
define({
    packages: [],
    //urlArgs: "bust=" + (new Date()).getTime(),
    baseUrl:'js/',
    paths: {
        "jquery": '',
        "jquery.md5":'libs/jquery-md5/jquery.md5',
        "bootstrap":'libs/bootstrap/bootstrap',
        "jquery.validate":'libs/jquery-validation/jquery.validate',
        ////arcgis
        //'arcgis':'vendor/arcgis/3.10/init',
        'esri':'vendor/arcgis/3.10/js/esri',
        'dojo':'vendor/arcgis/3.10/js/dojo/dojo',
        'dijit':'vendor/arcgis/3.10/js/dojo/dijit',
        'dojox':'vendor/arcgis/3.10/js/dojo/dojox',
        'dgrid':'vendor/arcgis/3.10/js/dgrid',
        'xstyle':'vendor/arcgis/3.10/js/xstyle',
        //tianditu
        'tianditu':'//api.tianditu.com/js/maps',
        //baidu
        'baidu':'//api.map.baidu.com/api?v=1.5&ak=95a21d20cfe4df8d03f267282e62d8ae&callback=initialize',
        //google
        'google':'',
        //openlayers
        'openlayers':'vendor/openlayers/v3.0.0/build/ol'
    },
    shim: {
        "jquery.md5":{
            deps:['jquery']
        },
        'bootstrap':{
            deps:['jquery']
        },
        'jquery.validate':{
            deps:['jquery']
        }
    }
});