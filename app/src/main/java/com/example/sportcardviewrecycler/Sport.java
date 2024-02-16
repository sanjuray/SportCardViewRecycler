package com.example.sportcardviewrecycler;

public class Sport {
    private int sportImage;
    private String sportTitle;

    public Sport(int sportImage, String sportTitle) {
        this.sportImage = sportImage;
        this.sportTitle = sportTitle;
    }

    public int getSportImage() {
        return sportImage;
    }

    public void setSportImage(int sportImage) {
        this.sportImage = sportImage;
    }

    public String getSportTitle() {
        return sportTitle;
    }

    public void setSportTitle(String sportTitle) {
        this.sportTitle = sportTitle;
    }
}
