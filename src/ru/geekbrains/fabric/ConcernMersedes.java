package ru.geekbrains.fabric;

public class ConcernMersedes extends Creator {
    @Override
    public Car factoryMethod() {
        return new Mersedes();
    }
}
