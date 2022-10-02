package com.chaitanya.daggerinjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car1;

    @Inject
    Car car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityComponent component = ((ExampleApp) getApplication())
                .getAppComponent()
                .getActivityComponent(new DieselEngineModule(1200));
        component.inject(this);

        car1.drive();
        car1.drive();
    }
}