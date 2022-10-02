package com.chaitanya.daggerinjava;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
abstract class DriverModule {

    @Provides
    @Singleton
    static Driver provideDriver(){
        return new Driver();
    }
}
