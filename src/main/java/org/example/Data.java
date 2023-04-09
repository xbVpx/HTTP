package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {
    private String id;
    private String text;
    private String type;
    private String user;
    private int upvotes;

    public Data(@JsonProperty("id") String id,
                @JsonProperty("text") String text,
                @JsonProperty("type") String type,
                @JsonProperty("user") String user,
                @JsonProperty("upvotes") int upvotes) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getUpvotes() {
        return upvotes;
    }

    public void setUpvotes(int upvotes) {
        this.upvotes = upvotes;
    }

    @Override
    public String toString() {
        return "Data{" +
                "\n\t id = " + id +
                ",\n\t text = " + text +
                ",\n\t type = " + type +
                ",\n\t user = " + user +
                ",\n\t upvotes = " + upvotes +
                "\n}";
    }
}