package com.example.android.washingtondcguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlacesAdapter extends ArrayAdapter<Places> {

    public PlacesAdapter(Activity context, ArrayList<Places> places) {
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.details_list, parent, false);
        }

        // Get the Places object located at this position in the list
        Places currentPlace = getItem(position);

        // Find the TextView in the details_list.xml layout with the ID placeName
        TextView placeTextView = (TextView) listItemView.findViewById(R.id.placeName);

        // Get the specific name of the place from the current Places object and
        // set this text on the name TextView
        placeTextView.setText(currentPlace.getPlaceName());

        // Find the ImageView in the details_list.xml layout with the ID placeIcon
        ImageView placeIconView = (ImageView) listItemView.findViewById(R.id.placeIcon);
        // Get the image resource ID from the current Places object and
        // set the image to ImageView
        placeIconView.setImageResource(currentPlace.getPlaceID());

        // Return so that it can be shown in the ListView
        return listItemView;

    }
}