package com.chaitanya.daggerinjava;

import android.util.Log;

import javax.inject.Inject;

@PerActivity
public class Car {
    private static final String TAG = "Car";
    Engine engine;
    Wheels wheels;
    Driver driver;

    @Inject
    public Car(Engine engine, Wheels wheels, Driver driver) {
        this.engine = engine;
        this.wheels = wheels;
        this.driver = driver;
    }

    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }

    public void drive() {
        engine.start();
        Log.d(TAG, driver + " drives " + this);
    }
}
