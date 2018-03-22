package ru.geekbrains.listener;

import java.util.List;

// Метеоданные(метеодатчик)
public class WeatherData implements Observable {
    // Список всех стаций которые надо оповестить
    private List<Observer> observers;

    //Данные для стаций
    private float temperature;
    private float humidity;
    private int pressure;

    /**
     * Регистрация нового слушателя
     * @param o - слушатель
     */
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    /**
     * Удаление слушателя из списка
     * @param o - слушатель
     */
    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    /**
     * Оповещение всех слушателей
     */
    @Override
    public void notifyObservers() {
        for (Observer observer: this.observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    /**
     * Устанавливает значения с датчиков и отправляет
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, int pressure) {
        //Устанавливаем значения
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        // Оповещаем слущателей
        notifyObservers();
    }

}
