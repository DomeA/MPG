package com.domeastudio.dto.resultset;

import org.codehaus.jackson.map.annotate.JsonRootName;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by domea on 16-1-23.
 */
@JsonRootName("messageTemplate")
@Component("messageTemplate")
public class MessageTemplate implements Serializable {
    private String dateTime;
    private LogLevel logLevel;
    private String text;


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public LogLevel getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(LogLevel logLevel) {
        this.logLevel = logLevel;
    }
}
