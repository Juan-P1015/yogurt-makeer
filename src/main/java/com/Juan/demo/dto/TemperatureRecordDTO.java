package com.juan.demo.dto;

import com.juan.demo.domain.model.TemperatureLog;

import lombok.Data;

@Data
public class TemperatureRecordDTO {
    private Double temperature;
    private TemperatureLog.LogType type;
}


