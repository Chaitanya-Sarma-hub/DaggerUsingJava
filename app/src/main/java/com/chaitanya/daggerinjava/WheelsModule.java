package com.chaitanya.daggerinjava;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class WheelsModule {

    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tyres provideTyres() {
        Tyres tyres = new Tyres();
        tyres.inflate();
        return tyres;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tyres tyres) {
        return new Wheels(rims, tyres);
    }

}
