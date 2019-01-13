package com.mainserver.beans;

public class LogicAdapter {

    private UiAdapter uiAdapter;

    public LogicAdapter() {
        System.out.println();
    }

    public void process(String input) {
        //asdfhusaidh
        uiAdapter.sendOutputToUser("asudfuasd");
    }

    public UiAdapter getUiAdapter() {
        return uiAdapter;
    }

    public void setUiAdapter(UiAdapter uiAdapter) {
        this.uiAdapter = uiAdapter;
    }
}
