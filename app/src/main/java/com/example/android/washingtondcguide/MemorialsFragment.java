package com.example.android.washingtondcguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MemorialsFragment extends Fragment {


    public MemorialsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        //Create list of DC Memorials
        final ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(R.string.washington_memorial, R.drawable.washington_monument));
        places.add(new Places(R.string.wwii_memorial, R.drawable.wwii_memorial));
        places.add(new Places(R.string.vietnam_memorial, R.drawable.vietnam_veterans_memorial));
        places.add(new Places(R.string.lincoln_memorial, R.drawable.lincoln_memorial));
        places.add(new Places(R.string.mlk_memorial, R.drawable.mlk_memorial));
        places.add(new Places(R.string.fdr_memorial, R.drawable.fdr_memorial));
        places.add(new Places(R.string.jefferson_memorial, R.drawable.jefferson_memorial));
        places.add(new Places(R.string.iwo_memorial, R.drawable.marine_corps_memorial));
        places.add(new Places(R.string.air_memorial, R.drawable.air_force_memorial));
        places.add(new Places(R.string.albert_memorial, R.drawable.albert_einstein_memorial));

        // Create a PlacesAdapter that creates list items for each item in the list
        PlacesAdapter adapter = new PlacesAdapter (getActivity(), places);

        // Find the ListView object in the view hierarchy of the Activity.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Set the adapter on the ListView to the display the list items in the places list.
        listView.setAdapter(adapter);

        return rootView;
    }

}
