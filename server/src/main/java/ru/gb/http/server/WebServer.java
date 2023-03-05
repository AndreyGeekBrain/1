package ru.gb.http.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WebServer {

    public void startServer(int port) {
        System.out.println ("Сервер запущен!!!");
        System.out.println ("Используется порт № " + port);
        while (true) {
            Socket socket = new ControllerServer ().serverSocketService (port);
            new HandlerService (socket).start ();
        }
    }
}
