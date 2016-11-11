package com.example.android.miwok;


/**
 * Created by Tommy on 11/11/2016.
 */
public class Word{
    private String defaultTranslation;
    private String miwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation){
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
    }

    public String getDefaultTranslation(){
        return defaultTranslation;
    }
    public String getMiwokTranslation(){
        return miwokTranslation;
    }
}
