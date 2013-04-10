package com.uiautomator_cucumber.android_server.actions;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.uiautomator_cucumber.android_server.Action;
import com.uiautomator_cucumber.android_server.Result;

import java.util.Map;

public class Click extends Action {
    public Click(UiDevice uiDevice) {
        super(uiDevice);
    }

    @Override
    public Result execute(Map<String, Object> arguments) throws UiObjectNotFoundException {
        getUiObject(arguments).click();
        return Result.OK;
    }
}
