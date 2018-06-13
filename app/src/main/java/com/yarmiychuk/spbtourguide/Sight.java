package com.yarmiychuk.spbtourguide;

/**
 * Created by DmitryYarmiychuk on 13.06.2018.
 * Создал DmitryYarmiychuk 13.06.2018
 */

public class Sight {

    private String sightName, description, link;
    private int imageResourceId;

    public Sight(String name, int imageId, String description, String link) {
        this.sightName = name;
        this.imageResourceId = imageId;
        this.description = description;
        this.link = link;
    }

    public String getSightName() {
        return sightName;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getDescription() {
        return description;
    }

    public String getLink() {
        return link;
    }
}
