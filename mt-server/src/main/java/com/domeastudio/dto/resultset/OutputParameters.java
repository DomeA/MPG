package com.domeastudio.dto.resultset;

import org.codehaus.jackson.map.annotate.JsonRootName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by domea on 16-1-23.
 * {
 *     logCode:{
 *         message:{
 *             dateTime:"",
 *             logLevel:"",
 *             text:""
 *         },
 *         systemCode:{
 *             message:"",
 *             code:""
 *         },
 *     },
 *     resultObject:{
 *
 *     }
 * }
 */
@JsonRootName("outputParameters")
@Component("outputParameters")
public class OutputParameters implements Serializable {
    @Autowired
    private LogCode logCode;
    private String bean;

    public LogCode getLogCode() {
        return logCode;
    }

    public void setLogCode(LogCode logCode) {
        this.logCode = logCode;
    }

    public String getBean() {
        return bean;
    }

    public void setBean(String bean) {
        this.bean = bean;
    }
}
