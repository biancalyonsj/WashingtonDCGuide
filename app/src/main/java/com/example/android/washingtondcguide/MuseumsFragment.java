package com.example.android.washingtondcguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MuseumsFragment extends Fragment {

    public MuseumsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        //Create list of DC Museums
        final ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(R.string.air_museum, R.drawable.air_space_museum_exterior));
        places.add(new Places(R.string.african_museum, R.drawable.african_american_history_culture_museum_exterior));
        places.add(new Places(R.string.american_museum, R.drawable.american_history_museum_exterior ));
        places.add(new Places(R.string.natural_museum, R.drawable.natural_history_museum_exterior));
        places.add(new Places(R.string.indian_museum, R.drawable.american_indian_museum_exterior));
        places.add(new Places(R.string.hirshhorn_museum, R.drawable.hirshhorn_museum_exterior));
        places.add(new Places(R.string.smithsonian_museum, R.drawable.african_art_museum_exterior));
        places.add(new Places(R.string.gallery_museum, R.drawable.gallery_of_art_exterior));
        places.add(new Places(R.string.holocaust_museum, R.drawable.holocaust_memorial_museum_exterior));

        // Create a PlacesAdapter that creates list items for each item in the list
        PlacesAdapter adapter = new PlacesAdapter (getActivity(), places);

        // Find the ListView object in the view hierarchy of the Activity.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Set the adapter on the ListView to the display the list items in the places list.
        listView.setAdapter(adapter);

        return rootView;
    }

}
