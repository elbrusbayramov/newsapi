package com.example.elbrus.newsapi;

public class News {

    private String agentName;
    private String title;
    private String description;
    private String publishedTime;
    private String url;

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPublishedTime() {
        return publishedTime;
    }

    public void setPublishedTime(String publishedTime) {
        this.publishedTime = publishedTime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public News(String agentName, String title,String description, String publishedTime, String url) {
        this.agentName = agentName;
        this.description = description;
        this.publishedTime = publishedTime;
        this.url = url;
        this.title = title;
    }
}
