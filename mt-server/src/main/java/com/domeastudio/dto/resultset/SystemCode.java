package com.domeastudio.dto.resultset;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.map.annotate.JsonRootName;

import java.io.Serializable;

/**
 * Created by domea on 16-1-23.
 */
@JsonRootName("SystemCode")
public class SystemCode implements Serializable {
    private MessageTemplate message;
    private Code code;

    public MessageTemplate getMessage() {
        return message;
    }

    public void setMessage(MessageTemplate message) {
        this.message = message;
    }

    public Code getCode(){
        return code;
    }

    public void setCode(Code code) {
        this.code = code;
    }
}
