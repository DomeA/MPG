/**
 * Created by domea on 16-6-25.
 */
'use strict';
(function(root){
    require(['require',"./config"], function(require,config){
        requirejs.config(config);
        require([
            '../modules/utils/utils',
            '../modules/app/desktop/loader',
            '../modules/app/mobile/loader',
            'domReady!'
        ], function(utils,desktop,mobile){
            utils.test();
            if(utils.getClientType().indexOf('Android')>-1){
                mobile.test();
            }else{
                desktop.test();
            }
        });
    });
})(this);