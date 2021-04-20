package com.opencart.enums;

public enum SubscribeChoice {
    YES(1),
    NO(0);

    private int choice;
    private SubscribeChoice(int choice) {
        this.choice = choice;
    }

    public int getChoice(){
        return choice;
    }
}
