package com.kodluyoruz.generics;

public class GenericClass<T> {
    private final T item;

    public GenericClass(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

}
