/**
 * Created by domea on 16-6-6.
 */
'use strict';
define({
    packages: [],
    // urlArgs: "bust=" + (new Date()).getTime(),
    baseUrl:'js/libs/',
    paths: {
        "jquery": 'jquery/dist/jquery',
        'jquery.clickoutside':'../vendor/jquery.clickoutside',
        'jquery.log':'../vendor/jquery.log',
        // "jquery.md5":'jquery-md5/jquery.md5',
        "bootstrap":'bootstrap/dist/js/bootstrap',
        'jquery.client':'../vendor/jquery.client',
        'jquery.dateFormat':'jquery-dateFormat/dist/jquery-dateFormat',
        'jquery.particleground':'../vendor/jquery.particleground',
        'underscore':'underscore/underscore',
        'dhtmlx':'../vendor/dhtmlxSuite_v50_pro_eval/codebase/dhtmlx',
        'domReady':'domReady/domReady'
        // "jquery.validate":'libs/jquery-validation/jquery.validate',
        ////arcgis
        //'arcgis':'vendor/arcgis/3.10/init',
        // 'esri':'vendor/arcgis/3.10/js/esri',
        // 'dojo':'vendor/arcgis/3.10/js/dojo/dojo',
        // 'dijit':'vendor/arcgis/3.10/js/dojo/dijit',
        // 'dojox':'vendor/arcgis/3.10/js/dojo/dojox',
        // 'dgrid':'vendor/arcgis/3.10/js/dgrid',
        // 'xstyle':'vendor/arcgis/3.10/js/xstyle',
        //tianditu
        // 'tianditu':'//api.tianditu.com/js/maps',
        // //baidu
        // 'baidu':'//api.map.baidu.com/api?v=1.5&ak=95a21d20cfe4df8d03f267282e62d8ae&callback=initialize',
        // //google
        // 'google':'',
        // //openlayers
        // 'openlayers':'vendor/openlayers/v3.0.0/build/ol'
    },
    map: {
        '*': {
            'css': 'require-css/css'
        }
    },
    shim: {
        // "jquery.md5":{
        //     deps:['jquery']
        // },
        'underscore':{
            exports: '_'
        },
        'bootstrap':{
            deps:[
                'jquery',
                'css!../libs/bootstrap/dist/css/bootstrap.css',
                'css!../libs/bootstrap/dist/css/bootstrap-theme.css'
            ]
        },
        'jquery.dateFormat':{
            deps:['jquery']
        },
        'jquery.client':{
            deps:['jquery']
        },
        'jquery.particleground':{
            deps:['jquery']
        },
        'jquery.clickoutside':{
            deps:['jquery']
        },
        'jquery.log':{
            deps:['jquery']
        },
        'dhtmlx':{
            deps:['css!../vendor/dhtmlxSuite_v50_pro_eval/codebase/dhtmlx.css']
        }
        // 'jquery.validate':{
        //     deps:['jquery']
        // }
    }
});