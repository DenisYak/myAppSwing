package ru.geekbrains.listener;

//Класс станции метеданных
public class CurrentConditionsDisplay implements Observer {
    // Данные с датчиков
    private float temperature;
    private float humidity;
    private int pressure;
    // Реализация данных
    private WeatherData weatherData;

    //Конструкор
    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    //Обновление данных
    @Override
    public void update(float temperature, float humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    // Вывод данных
    public void display() {
        System.out.printf("Сейчас значения:%.1f градусов цельсия и %.1f %% влажности. Давление %d мм рт. ст.\n", temperature, humidity, pressure);
    }

}
