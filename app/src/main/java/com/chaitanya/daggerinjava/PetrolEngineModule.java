package com.chaitanya.daggerinjava;

import dagger.Module;
import dagger.Provides;

@Module
public class PetrolEngineModule {

    @Provides
    public Engine provideEngine(PetrolEngine engine) {
        return engine;
    }

}
