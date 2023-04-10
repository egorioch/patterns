package proxy;

import proxy.model.DrawLogic;
import proxy.view.Client;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                client.start();
            }
        });
    }



}