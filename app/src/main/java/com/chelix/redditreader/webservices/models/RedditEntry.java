package com.chelix.redditreader.webservices.models;

import java.util.ArrayList;

/**
 * Created by jose.preciado on 22/03/2018.
 */

public class RedditEntry {

    private String kind;
    private ArrayList<RedditEntryData> data;

    public RedditEntry() {
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public ArrayList<RedditEntryData> getData() {
        return data;
    }

    public void setData(ArrayList<RedditEntryData> data) {
        this.data = data;
    }
}
