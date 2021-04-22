package com.opencart.datamodel;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CurrencyModel {
    private String currencyTitle;
    private String currencyCode;
    private String currencySymbolLeft;
    private String currencySymbolRight;
    private String currencyDecimalPlaces;
    private String currencyValue;
}
