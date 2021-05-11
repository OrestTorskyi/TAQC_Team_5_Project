package com.opencart.repository;

import com.opencart.datamodel.SearchModel;

public class SearchModelRepository {

    private SearchModelRepository(){
    }

    public static SearchModel getSearchModel(){

        return SearchModel.getBuilder()
                .keywords("mac")
                .build();
    }
}
