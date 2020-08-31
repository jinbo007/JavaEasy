package com.jinbo.javaeasy.dynamic;

/**
 * @author houjinbo
 * @date 2020-08-24
 */
public class LianjiaAgency implements IRoom {

    private IRoom agent;//中介

    public LianjiaAgency(IRoom iRoom) {
        this.agent = iRoom;
    }

    @Override
    public void findRoom() {
        agent.findRoom();
    }

    @Override
    public void sign() {
        agent.sign();
    }
}
