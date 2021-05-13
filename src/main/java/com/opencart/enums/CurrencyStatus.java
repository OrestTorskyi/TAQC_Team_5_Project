package com.opencart.enums;

public enum CurrencyStatus {

    ENABLED(1),
    DISABLED(0);

    private int value;

    private CurrencyStatus(int value) {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }

}
