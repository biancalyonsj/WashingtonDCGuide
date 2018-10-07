package com.example.android.washingtondcguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class EateryFragment extends Fragment {

    public EateryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        //Create list of DC Restaurants
        final ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places(R.string.hamilton_eat, R.drawable.hamilton));
        places.add(new Places(R.string.clyde_eat, R.drawable.clydes));
        places.add(new Places(R.string.georgetown_eat, R.drawable.georgetown_cupcakes));
        places.add(new Places(R.string.carmine_eat, R.drawable.carmines));
        places.add(new Places(R.string.we_eat, R.drawable.we_the_pizza));
        places.add(new Places(R.string.cafe_eat, R.drawable.cafe_dupont));
        places.add(new Places(R.string.red_eat, R.drawable.red_velvet));
        places.add(new Places(R.string.busboys_eat, R.drawable.busboys_and_poets));
        places.add(new Places(R.string.grillfish_eat, R.drawable.grillfish));
        places.add(new Places(R.string.pizza_eat, R.drawable.and_pizza));
        places.add(new Places(R.string.jaleo_eat, R.drawable.jaleo));
        places.add(new Places(R.string.toki_eat, R.drawable.toki_underground));
        places.add(new Places(R.string.astro_eat, R.drawable.astro_doughnuts));
        places.add(new Places(R.string.rinconcito_eat, R.drawable.el_rinconcito));

        // Create a PlacesAdapter that creates list items for each item in the list
        PlacesAdapter adapter = new PlacesAdapter (getActivity(), places);

        // Find the ListView object in the view hierarchy of the Activity.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Set the adapter on the ListView to the display the list items in the places list.
        listView.setAdapter(adapter);

        return rootView;
    }
}

