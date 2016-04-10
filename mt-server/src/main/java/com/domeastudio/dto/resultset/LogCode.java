package com.domeastudio.dto.resultset;

import com.domeastudio.config.faultcode.SystemCode;
import org.codehaus.jackson.map.annotate.JsonRootName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by domea on 16-1-23.
 */
@JsonRootName("logCode")
@Component("logCode")
public class LogCode implements Serializable {
    @Autowired
    private MessageTemplate message;
    private SystemCode systemCode;

    public MessageTemplate getMessage() {
        return message;
    }

    public void setMessage(MessageTemplate message) {
        this.message = message;
    }

    public SystemCode getSystemCode() {
        return systemCode;
    }

    public void setSystemCode(SystemCode systemCode) {
        this.systemCode = systemCode;
    }
}
