package ru.gb.http.server;

public class StartServer {

    static int port = 8080;

    public static void main (String[] args) {
        new WebServer().startServer (port);
    }

}
