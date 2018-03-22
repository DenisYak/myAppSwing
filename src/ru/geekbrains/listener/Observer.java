package ru.geekbrains.listener;

//Слушатель
public interface Observer {
    void update (float temperature, float humidity, int pressure);
    void display();
}
