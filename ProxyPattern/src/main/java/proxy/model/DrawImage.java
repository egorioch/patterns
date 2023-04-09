package proxy.model;

import proxy.repo.DrawImageInterface;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class DrawImage implements DrawImageInterface {
    @Override
    public void loadPicture() {

    }

    @Override
    public void drawImage() {
        try {
            BufferedImage img = ImageIO.read(new File("src/main/resources/belate.jpg"));
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);

            JFrame jFrame = new JFrame("imageFrame");
            jFrame.setSize(300, 300);
            jFrame.add(label);
            jFrame.setVisible(true);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
