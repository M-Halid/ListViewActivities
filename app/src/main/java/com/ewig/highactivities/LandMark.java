package com.ewig.highactivities;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.widget.ImageView;

import java.io.Serializable;

public class LandMark implements Serializable {
   public String city;
    public String country;
    public String name;
    public int image;
    public LandMark(String city, String country, String name, int image){
        this.city=city;
        this.country=country;
        this.name=name;
        this.image=image;
    }
    public String getNames(){

        return this.name;
    }
}
