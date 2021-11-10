package com.kodluyoruz.generics;

import com.kodluyoruz.generics.model.GeometricObject;

public class GeometricGeneric<T extends GeometricObject> {
    private final T geometricObject;

    public GeometricGeneric(T geometricObject) {
        this.geometricObject = geometricObject;
    }

    public T getGeometricObject() {
        return geometricObject;
    }

    public double findPerimeter(){
        return geometricObject.findPerimeter();
    }
}
