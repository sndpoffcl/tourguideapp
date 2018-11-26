package com.example.anrdoid.tourguideapp;

/**
 * Created by SandeepSinha on 15/11/18.
 */

public class Content {

    private String cName;
    private int cImageId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Content(String name) {
        this.cName = name;
    }

    public Content(String name, int imageId) {
        this.cName = name;
        this.cImageId = imageId;
    }

    public String getContentName() {
        return cName;
    }

    public int getContentImageId() {
        return cImageId;
    }

    public void setContentName(String name) {
        this.cName = name;
    }

    public void setContentImageId(int imageId) {
        this.cImageId = imageId;
    }

    public boolean hasImage() {
        return cImageId != NO_IMAGE_PROVIDED;
    }
}
