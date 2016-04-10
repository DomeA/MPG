package com.domeastudio.dto.resultset;

import com.domeastudio.config.faultcode.SystemCode;
import com.domeastudio.util.JacksonHelper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by domea on 16-4-10.
 */
@Component("readWriteFileOutputParams")
public class ReadWriteFileOutputParams implements Serializable {
    private static Logger logger = Logger.getLogger(ReadWriteFileOutputParams.class);
    @Autowired
    private OutputParameters outputParameters;
    @Autowired
    private LogCode logCode;
    @Autowired
    private MessageTemplate messageTemplate;

    private JacksonHelper jacksonHelper;

    public ReadWriteFileOutputParams() throws Exception {
        jacksonHelper=JacksonHelper.buildNonDefaultBinder();
    }

    public String outputResult(Object bean,LogLevel logLevel,String message,String code){
        try {
            logger.info("serialization result process start.");
            messageTemplate.setDateTime(new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date()));
            messageTemplate.setLogLevel(logLevel);
            messageTemplate.setText(message);
            logCode.setMessage(messageTemplate);
            SystemCode systemCode = new SystemCode();
            logCode.setSystemCode(systemCode.getSystemCode(code));
            outputParameters.setLogCode(logCode);
            outputParameters.setBean(jacksonHelper.toJson(bean));
            logger.info("result:"+jacksonHelper.toJson(outputParameters));
            return jacksonHelper.toJson(outputParameters);
        }catch (Exception e){
            logger.error("serialization result process is failed",e);
            throw new RuntimeException("serialization result process is failed");
        }
    }

    public OutputParameters getOutputParameters() {
        return outputParameters;
    }

    public void setOutputParameters(OutputParameters outputParameters) {
        this.outputParameters = outputParameters;
    }

    public LogCode getLogCode() {
        return logCode;
    }

    public void setLogCode(LogCode logCode) {
        this.logCode = logCode;
    }

    public MessageTemplate getMessageTemplate() {
        return messageTemplate;
    }

    public void setMessageTemplate(MessageTemplate messageTemplate) {
        this.messageTemplate = messageTemplate;
    }
}
