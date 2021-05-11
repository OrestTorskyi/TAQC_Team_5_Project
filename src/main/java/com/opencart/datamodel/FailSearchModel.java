package com.opencart.datamodel;

import lombok.Getter;

@Getter
public class FailSearchModel {

    private String incorrectKeywords;

    FailSearchModel() {
    }

    public static FailSearchModel.Builder getBuilder() {
        return new FailSearchModel().new Builder();
    }

    public class Builder {

        public FailSearchModel.Builder incorrectKeywords(String value) {
            incorrectKeywords = value;
            return this;
        }

        public FailSearchModel build() {
            return FailSearchModel.this;
        }
    }
}
