package proxy.model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static javax.imageio.ImageIO.*;

public class MyMouseEventListener extends JPanel {
    private BufferedImage image;
    private Point imagePosition = new Point(0, 0);

    public MyMouseEventListener() {
        JButton button3 = new JButton("Click!");
        button3.setActionCommand("«Button 3 was pressed!»");
        this.add(button3);

        button3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent ev) {
                BufferedImage i = null;
                try {
                    i = read(new File("src/main/resources/belate.jpg"));
                    System.out.println("Ресурсы картинки");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                image = i;
            }
        });


        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent me) {
                int centerX = 0;
                int centerY = 0;

                imagePosition.x = centerX + me.getX();
                imagePosition.y = centerY + me.getY();
                System.out.println("imageX: " + imagePosition.x + ", imageY: " + imagePosition.y);

                repaint();
            }

        });
    }

    public void paintComponent(Graphics gr) {
        super.paintComponent(gr);

        Graphics2D g = (Graphics2D) gr;
        g.setRenderingHint(
                RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);
        System.out.println("перерисовывается" );
        g.drawImage(image, imagePosition.x, imagePosition.y,
                300,
                450,
                null);
    }

}
