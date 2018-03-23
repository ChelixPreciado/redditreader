package com.chelix.redditreader.webservices.models;

import java.util.ArrayList;

/**
 * Created by jose.preciado on 22/03/2018.
 */

public class RedditResponseData {

    private String after;
    private int dist;
    private ArrayList<RedditEntry> data;

    public RedditResponseData() {
    }

    public String getAfter() {
        return after;
    }

    public void setAfter(String after) {
        this.after = after;
    }

    public int getDist() {
        return dist;
    }

    public void setDist(int dist) {
        this.dist = dist;
    }

    public ArrayList<RedditEntry> getData() {
        return data;
    }

    public void setData(ArrayList<RedditEntry> data) {
        this.data = data;
    }
}
