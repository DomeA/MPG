/**
 * Created by domea on 16-6-6.
 */
'use strict';
(function(root){
    require(["config"], function(config){
        requirejs.config(config);
        require(['../modules/loader','domReady!','bootstrap'], function(loader){
            loader.test();
            loader.show();
            // var myLayout= new dhtmlXLayoutObject({
            //         parent: document.body,
            //         pattern: "3L"
            //     });
        });
    });
})(this);