package com.domeastudio.dto;

import org.codehaus.jackson.map.annotate.JsonRootName;

import java.io.Serializable;

/**
 * Created by domea on 16-4-10.
 */
@JsonRootName("spatialOperationParams")
public class SpatialOperationParams implements Serializable {
    private String sourceWKT;
    private String targetWKT;
    private Double radius;
    private Integer sourceEpsg;
    private Integer targetEpsg;
    private String sourceCRS;
    private String targetCRS;

    public String getSourceWKT() {
        return sourceWKT;
    }

    public void setSourceWKT(String sourceWKT) {
        this.sourceWKT = sourceWKT;
    }

    public String getTargetWKT() {
        return targetWKT;
    }

    public void setTargetWKT(String targetWKT) {
        this.targetWKT = targetWKT;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Integer getSourceEpsg() {
        return sourceEpsg;
    }

    public void setSourceEpsg(Integer sourceEpsg) {
        this.sourceEpsg = sourceEpsg;
    }

    public Integer getTargetEpsg() {
        return targetEpsg;
    }

    public void setTargetEpsg(Integer targetEpsg) {
        this.targetEpsg = targetEpsg;
    }

    public String getSourceCRS() {
        return sourceCRS;
    }

    public void setSourceCRS(String sourceCRS) {
        this.sourceCRS = sourceCRS;
    }

    public String getTargetCRS() {
        return targetCRS;
    }

    public void setTargetCRS(String targetCRS) {
        this.targetCRS = targetCRS;
    }
}
