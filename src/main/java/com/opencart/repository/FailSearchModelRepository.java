package com.opencart.repository;

import com.opencart.datamodel.FailSearchModel;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class FailSearchModelRepository {

    private FailSearchModelRepository() {
    }

    public static FailSearchModel getFailSearchModel() {

        return FailSearchModel.getBuilder()
                .incorrectKeywords(RandomStringUtils.randomAlphabetic(6))
                .build();
    }
}

