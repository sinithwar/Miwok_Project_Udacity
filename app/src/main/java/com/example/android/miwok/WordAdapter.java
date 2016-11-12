package com.example.android.miwok;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

/**
 * Created by Tommy on 11/11/2016.
 */
public class WordAdapter extends ArrayAdapter<Word>{

    public WordAdapter(Context context, List<Word> words){
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_view, parent, false);
        }
        Word local_word = getItem(position);
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_space);
        miwokTextView.setText(local_word.getMiwokTranslation());
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_space);
        defaultTextView.setText(local_word.getDefaultTranslation());
        ImageView imagesView = (ImageView) listItemView.findViewById(R.id.ic_launcher);
        if (local_word.hasImage()){
            imagesView.setImageResource(local_word.getImageResourceID());
        }else{
            imagesView.setVisibility(View.GONE);
        }
        return listItemView;
    }
}
