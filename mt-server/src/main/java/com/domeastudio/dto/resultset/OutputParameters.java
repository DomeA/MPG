package com.domeastudio.dto.resultset;

import com.domeastudio.util.JacksonHelper;

import java.io.Serializable;

/**
 * Created by domea on 16-1-23.
 * {
 *     code:{
 *         message:{
 *             dateTime:"",
 *             logLevel:"",
 *             text:""
 *         },
 *         number:"",
 *     },
 *     resultObject:{
 *
 *     }
 * }
 */
public abstract class OutputParameters implements Serializable {
    private SystemCode code;
    private JacksonHelper jacksonHelper;
    public SystemCode getCode() {
        return code;
    }

    public void setCode(SystemCode code) {
        this.code = code;
    }

    public String getOutputParameters(Object object){
        return jacksonHelper.toJson(object);
    }

    public JacksonHelper getJacksonHelper() {
        return jacksonHelper;
    }

    public void setJacksonHelper(JacksonHelper jacksonHelper) {
        this.jacksonHelper = jacksonHelper;
    }
}
