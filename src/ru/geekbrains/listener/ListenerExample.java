package ru.geekbrains.listener;

public class ListenerExample {
    public void start(){
        //Создаем объект данных
        WeatherData weatherData = new WeatherData();
        // Подписываем на данные новый дисплей/станцию
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        // Генерируем данные
        weatherData.setMeasurements(29f, 65f, 745);
        weatherData.setMeasurements(39f, 70f, 760);
        weatherData.setMeasurements(42f, 72f, 763);
    }
}
