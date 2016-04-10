package com.domeastudio.dto.parameters;

import com.domeastudio.util.JacksonHelper;

import java.io.Serializable;

/**
 * Created by domea on 16-1-23.
 */
public abstract class InputParameters implements Serializable {
    private JacksonHelper jacksonHelper;
    public  <T> T getInputParameters(String object, Class<T> clazz){
        return jacksonHelper.fromJson(object,clazz);
    }

    public JacksonHelper getJacksonHelper() {
        return jacksonHelper;
    }

    public void setJacksonHelper(JacksonHelper jacksonHelper) {
        this.jacksonHelper = jacksonHelper;
    }
}
