package com.domeastudio.dto;

import com.domeastudio.dto.parameters.InputParameters;
import com.domeastudio.dto.resultset.OutputParameters;

import java.io.Serializable;

/**
 * Created by domea on 16-1-23.
 */
public abstract class InputOutputParameters implements Serializable {
    private InputParameters inputParameters;
    private OutputParameters outputParameters;

    public InputParameters getInputParameters() {
        return inputParameters;
    }

    public void setInputParameters(InputParameters inputParameters) {
        this.inputParameters = inputParameters;
    }

    public OutputParameters getOutputParameters() {
        return outputParameters;
    }
}
