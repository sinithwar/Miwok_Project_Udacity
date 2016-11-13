package com.example.android.miwok;


import android.media.MediaPlayer;
import android.view.View;
import android.widget.AdapterView;

/**
 * Created by Tommy on 11/11/2016.
 */
public class Word{
    private String defaultTranslation;
    private String miwokTranslation;
    private int imageResourceID = NO_IMAGE;
    private final static int NO_IMAGE = -1;
    private int layoutID;
    private int audioFileContainer;

    public Word(String defaultTranslation, String miwokTranslation){
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
    }
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID, int layoutID, int audioFileContainer){
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.imageResourceID = imageResourceID;
        this.layoutID = layoutID;
        this.audioFileContainer = audioFileContainer;
    }

    public String getDefaultTranslation(){
        return defaultTranslation;
    }
    public String getMiwokTranslation(){
        return miwokTranslation;
    }
    public int getImageResourceID(){ return imageResourceID; }
    public boolean hasImage(){ return imageResourceID != NO_IMAGE; }
    public int getLayoutID(){ return layoutID;}
    public int getAudioFileContainer(){ return audioFileContainer; }



}
