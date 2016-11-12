package com.example.android.miwok;


/**
 * Created by Tommy on 11/11/2016.
 */
public class Word{
    private String defaultTranslation;
    private String miwokTranslation;
    private int imageResourceID = NO_IMAGE;
    private final static int NO_IMAGE = -1;

    public Word(String defaultTranslation, String miwokTranslation){
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
    }
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID){
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.imageResourceID = imageResourceID;
    }

    public String getDefaultTranslation(){
        return defaultTranslation;
    }
    public String getMiwokTranslation(){
        return miwokTranslation;
    }
    public int getImageResourceID(){ return imageResourceID; }
    public boolean hasImage(){ return imageResourceID != NO_IMAGE; }
}
