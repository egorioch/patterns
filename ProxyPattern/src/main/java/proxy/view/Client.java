package proxy.view;

import proxy.model.ImageRedactorProxy;
import proxy.repo.DrawImageInterface;

import javax.swing.*;

public class Client {
    DrawImageInterface drawImage = new ImageRedactorProxy();

    public void start () {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(1920, 1080);
        f.add(drawImage.createAndShowGUI());
        f.setVisible(true);
    }
}
