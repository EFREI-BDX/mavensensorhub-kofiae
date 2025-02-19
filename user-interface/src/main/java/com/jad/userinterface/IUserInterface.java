package com.jad.userinterface;

import com.jad.utils.SensorData;

import java.util.List;

public interface IUserInterface {
    void stop();

    void start();

    void displayDashboard();

    void displayHelp();

    void displayAllData(final List<SensorData> allData);
}
