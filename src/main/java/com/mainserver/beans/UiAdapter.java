package com.mainserver.beans;

public class UiAdapter {

    private LogicAdapter logicAdapter;

    public UiAdapter(LogicAdapter logicAdapter) {
        this.logicAdapter = logicAdapter;
    }

    public void init() {
        logicAdapter.setUiAdapter(this);
    }

    public void getInputFromUser() {
        String input = "asdfhasdi";
        logicAdapter.process(input);
    }

    public void sendOutputToUser(String asudfuasd) {
        //sending
    }

}
