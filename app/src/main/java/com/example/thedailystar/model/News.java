package com.example.thedailystar.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class News {

    @Expose
    @SerializedName("id")
    String id;
    @Expose
    @SerializedName("title")
    String tittle;
    @Expose
    @SerializedName("headline")
    String headline;
    @Expose
    @SerializedName("featuredImage")
    String featuredImage;
    @Expose
    @SerializedName("imageCaption")
    String imageCaption;
    @Expose
    @SerializedName("highlight")
    String highlight;
    @Expose
    @SerializedName("shoulder")
    String shoulder;
    @Expose
    @SerializedName("intro")
    String intro;
    @Expose
    @SerializedName("content")
    String content;
    @Expose
    @SerializedName("authorName")
    String authorName;
    @Expose
    @SerializedName("slug")
    String slug;
    @Expose
    @SerializedName("publishDate")
    String publishDate;
    @Expose
    @SerializedName("viewCount")
    String viewCount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getFeaturedImage() {
        return featuredImage;
    }

    public void setFeaturedImage(String featuredImage) {
        this.featuredImage = featuredImage;
    }

    public String getImageCaption() {
        return imageCaption;
    }

    public void setImageCaption(String imageCaption) {
        this.imageCaption = imageCaption;
    }

    public String getHighlight() {
        return highlight;
    }

    public void setHighlight(String highlight) {
        this.highlight = highlight;
    }

    public String getShoulder() {
        return shoulder;
    }

    public void setShoulder(String shoulder) {
        this.shoulder = shoulder;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getViewCount() {
        return viewCount;
    }

    public void setViewCount(String viewCount) {
        this.viewCount = viewCount;
    }
}
