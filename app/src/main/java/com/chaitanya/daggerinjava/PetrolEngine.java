package com.chaitanya.daggerinjava;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine {

    private static final String TAG = "Car";

    int horsePower;
    int capacity;

    @Inject
    public PetrolEngine(@Named("horse power") int horsePower,
                        @Named("capacity") int capacity) {
        this.horsePower = horsePower;
        this.capacity = capacity;
    }

    @Override
    public void start() {
        Log.d(TAG, "Petrol Engine Started... " +
                "\nHorse power " + horsePower +
                "\n Capacity " + capacity);
    }
    
}
