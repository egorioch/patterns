package proxy.model;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

class RedSquare {

    private int xPos = 0;
    private int yPos = 0;
    private int width = 20;
    private int height = 20;

    public void setX(int xPos) {
        this.xPos = xPos;
    }

    public int getX() {
        return xPos;
    }

    public void setY(int yPos) {
        this.yPos = yPos;
    }

    public int getY() {
        return yPos;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void paintSquare(Graphics g) {
        try {
            BufferedImage img = ImageIO.read(new File("src/main/resources/belate.jpg"));
            ImageIcon icon = new ImageIcon(img);
            JLabel label = new JLabel(icon);

            g.setColor(Color.BLACK);
            g.drawRect(xPos, yPos, width, height);
            g.drawImage(img, 0, 0, 20, 20, null);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}