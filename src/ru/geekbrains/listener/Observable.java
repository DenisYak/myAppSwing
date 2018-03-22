package ru.geekbrains.listener;

// Подписываемый
public interface Observable {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
