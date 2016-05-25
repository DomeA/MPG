package com.domeastudio.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by domea on 16-5-25.
 */
public class EquipmentOperationParams implements Serializable {
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
