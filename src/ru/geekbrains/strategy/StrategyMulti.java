package ru.geekbrains.strategy;

public class StrategyMulti implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a * b;
    }
}
