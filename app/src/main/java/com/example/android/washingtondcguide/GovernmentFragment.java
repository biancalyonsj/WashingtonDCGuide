package com.example.android.washingtondcguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class GovernmentFragment extends Fragment {

    public GovernmentFragment () {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        //Create list of DC Government Buildings
        final ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(R.string.uscap_govt, R.drawable.us_capitol_building));
        places.add(new Places(R.string.house_govt, R.drawable.white_house));
        places.add(new Places(R.string.archives_govt, R.drawable.national_archives));
        places.add(new Places(R.string.library_govt, R.drawable.library_of_congress));
        places.add(new Places(R.string.supreme_govt, R.drawable.supreme_court));
        places.add(new Places(R.string.pentagon_govt, R.drawable.the_pentagon));
        places.add(new Places(R.string.fbi_govt, R.drawable.fbi_building));

        // Create a PlacesAdapter that creates list items for each item in the list
        PlacesAdapter adapter = new PlacesAdapter (getActivity(), places);

        // Find the ListView object in the view hierarchy of the Activity.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Set the adapter on the ListView to the display the list items in the places list.
        listView.setAdapter(adapter);

        return rootView;
    }
}
