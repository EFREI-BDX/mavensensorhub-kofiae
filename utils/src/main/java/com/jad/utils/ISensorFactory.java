package com.jad.utils;

public interface ISensorFactory {
    ISensor make(SensorType sensorType);
}
