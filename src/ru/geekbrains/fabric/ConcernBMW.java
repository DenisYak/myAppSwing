package ru.geekbrains.fabric;

public class ConcernBMW extends Creator {
    @Override
    public Car factoryMethod() {
        return new BMW();
    }
}
