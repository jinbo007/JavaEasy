package com.jinbo.javaeasy.dynamic;

import android.util.Log;

/**
 * @author houjinbo
 * @date 2020-08-24
 */
public class AgentXiaoming implements IRoom {
    @Override
    public void findRoom() {
        Log.d("小明", "小明找好了房子");
    }

    @Override
    public void sign() {
        Log.d("小明", "签约了");
    }
}
