package com.opencart.datamodel;

import lombok.Getter;

@Getter
public class SearchModel {

    private String keywords;

    SearchModel() {
    }

    public static SearchModel.Builder getBuilder() {
        return new SearchModel().new Builder();
    }

    public class Builder {

        public SearchModel.Builder keywords(String value) {
            keywords = value;
            return this;
        }

        public SearchModel build() {
            return SearchModel.this;
        }
    }
}
