package com.chelix.redditreader.webservices.models;

import java.util.ArrayList;

/**
 * Created by jose.preciado on 22/03/2018.
 */

public class RedditResponse {

    private String kind;
    private ArrayList<RedditResponseData> data;

    public RedditResponse() {
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public ArrayList<RedditResponseData> getData() {
        return data;
    }

    public void setData(ArrayList<RedditResponseData> data) {
        this.data = data;
    }
}
