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

    String getSightName() {
        return sightName;
    }

    int getImageResourceId() {
        return imageResourceId;
    }

    String getDescription() {
        return description;
    }

    String getLink() {
        return link;
    }
}
