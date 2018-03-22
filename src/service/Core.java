package service;

import ru.geekbrains.SocketBuilder;

import java.io.IOException;
import java.net.Socket;

/**
 * Реализует логику клиента
 */
public class Core {
    //тут будет рализована логика
    private Socket socket;

    /**
     * Конструктор
     */
    public Core() {
        try {
            socket = SocketBuilder.getSocket();
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
