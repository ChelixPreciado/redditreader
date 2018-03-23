package com.chelix.redditreader.webservices.models;

/**
 * Created by jose.preciado on 22/03/2018.
 */

public class RedditEntryData {

    private String title;
    private String author;
    private Long created_utc;
    private String thumbnail;
    private String url;
    private Long num_comments;

    public RedditEntryData() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Long getCreated_utc() {
        return created_utc;
    }

    public void setCreated_utc(Long created_utc) {
        this.created_utc = created_utc;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getNum_comments() {
        return num_comments;
    }

    public void setNum_comments(Long num_comments) {
        this.num_comments = num_comments;
    }
}
