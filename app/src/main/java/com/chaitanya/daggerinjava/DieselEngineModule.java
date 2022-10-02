package com.chaitanya.daggerinjava;

import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {

    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    public int getHorsePower(){
        return horsePower;
    }

    @Provides
    public Engine provideEngine(DieselEngine engine) {
        return engine;
    }

}
