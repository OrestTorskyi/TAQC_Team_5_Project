package com.opencart.repository;

import com.opencart.datamodel.CurrencyModel;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

public class CurrencyModelRepository {

    private CurrencyModelRepository() {
    }

    public static CurrencyModel getCurrencyModel() {
        return CurrencyModel.builder()
                .currencyTitle(RandomStringUtils.randomAlphabetic(7))
                .currencyCode(RandomStringUtils.randomAlphabetic(3).toUpperCase())
                .currencySymbolLeft(RandomStringUtils.random(1,128,159,false,false))
                .currencySymbolRight(RandomStringUtils.random(1,128,159,false,false))
                .currencyDecimalPlaces(RandomStringUtils.random(1,49,52,false,true))
                .currencyValue(String.valueOf(RandomUtils.nextDouble(0.001,1)))
                .build();
    }
}
