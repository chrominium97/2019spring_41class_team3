package com.example.flixtyle;

public class Item {
    private final String uid;
    private final String imageUrl;
    private final String itemName;
    private final String itemUrl;

    Item(String uid, String imageUrl, String itemName, String itemUrl) {
        this.uid = uid;
        this.imageUrl = imageUrl;
        this.itemName = itemName;
        this.itemUrl = itemUrl;
    }

    public String getUid() {
        return uid;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemUrl() {
        return itemUrl;
    }
}
