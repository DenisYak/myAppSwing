package service;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class Server {

    private ServerSocket serverSocket;
    //private Vector<ClientHandler> clients;

    public Server () {
        try {
            serverSocket = new ServerSocket(9999);
            System.out.println("Сервер запущен");
            while (true) {
                Socket socket = serverSocket.accept(); // блокирующая операция (ожидание подключения)
                System.out.println("Клиент подключился");
                //new ClientHandler(this, socket);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
