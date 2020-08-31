package com.jinbo.javaeasy.dynamic;

import android.util.Log;

/**
 * @author houjinbo
 * @date 2020-08-24
 */
public class DynamicTest {


    public static void main(String[] args) {


        AgentXiaoming agentXiaoming = new AgentXiaoming();

        LianjiaAgency proxy = new LianjiaAgency(agentXiaoming);


        proxy.findRoom();

        proxy.sign();

        Log.d("","main");

    }

}
