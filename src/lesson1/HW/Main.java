package lesson1.HW;


import lesson1.HW.client.ui.ClientGUI;
import lesson1.HW.server.ui.ServerWindow;

public class Main {
    public static void main(String[] args) {
        ServerWindow serverWindow = new ServerWindow();
        new ClientGUI(serverWindow);
        new ClientGUI(serverWindow);
    }
}
