package com.jad.userinterface;

import com.jad.utils.IDataManager;

public interface IApplication {
    void manageOrder(UserAction userAction);

    IDataManager getDataManager();
}
