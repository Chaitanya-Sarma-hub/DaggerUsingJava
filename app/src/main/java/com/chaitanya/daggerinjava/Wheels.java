package com.chaitanya.daggerinjava;

import javax.inject.Inject;

public class Wheels {

//    We don't own this class, so we cannot annotate it with @Inject

    Rims rims;
    Tyres tyres;

    public Wheels(Rims rims, Tyres tyres) {
        this.rims = rims;
        this.tyres = tyres;
    }
}
