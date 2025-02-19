package com.jad.reportgeneration;

import com.jad.utils.SensorData;

import java.util.List;

public interface IReportGenerator {
    void generate(ReportType reportType, List<SensorData> data);
}
