package com.example.android.washingtondcguide;

public class Places {

    //Name of Place in DC
    private int mPlaceName;

    //Drawable resource ID
    private int mPlaceID;

    /*
     * Create a new com.example.android.washingtondcguide.Places object.
     *
     * @param placeName is the name of the Place in DC
     * @param placeID is drawable reference ID that corresponds to the Place
     * */
    public Places(int placeName, int placeID)
    {
        mPlaceName = placeName;
        mPlaceID = placeID;
    }

    /**
     * Gets the name of the Place in DC
     */
    public int getPlaceName() {

        return mPlaceName;
    }


    /**
     * Get the Place image resource ID
     */
    public int getPlaceID() {

        return mPlaceID;
    }
}

