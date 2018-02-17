package com.example.anrdoid.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Labtop on 15/02/18.
 */

public class ConentAdpater extends ArrayAdapter<Content> {

    public ConentAdpater(Context context, ArrayList<Content> contents) {
        super(context, 0, contents);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_conent, parent, false);
        }

        Content currentContent = getItem(position);

        TextView contentNameTextView = listItemView.findViewById(R.id.content_name);
        contentNameTextView.setText(currentContent.getContentName());

        ImageView imageView =  listItemView.findViewById(R.id.content_image);
        imageView.setImageResource(currentContent.getContentImageId());

        if (currentContent.hasImage()) {
            imageView.setImageResource(currentContent.getContentImageId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }

}

