package proxy;

import proxy.model.MyMouseEventListener;
import proxy.model.MyPanel;
import proxy.view.Client;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        System.out.println("Created GUI on EDT? " + SwingUtilities.isEventDispatchThread());
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(1920, 1080);
        f.add(new MyMouseEventListener());
        f.setVisible(true);
    }

}