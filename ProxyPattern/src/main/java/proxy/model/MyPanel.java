package proxy.model;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Point;
import java.awt.event.MouseEvent;

public class MyPanel extends JPanel {

    RedSquare redSquare = new RedSquare();
    JLabel label;

    public MyPanel() {
        try {
            BufferedImage img = ImageIO.read(new File("src/main/resources/belate.jpg"));
            ImageIcon icon = new ImageIcon(img);
            label = new JLabel(icon);
        } catch (IOException e) {
            e.printStackTrace();
        }

        setBorder(BorderFactory.createLineBorder(Color.black));

        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                moveSquare(e);
                System.out.println("координата по x: " + e.getX());
            }
        });
        addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                moveSquare(e);
                System.out.println("координата по y: " + e.getX());
            }
        });
    }


    private void moveSquare(MouseEvent evt) {
        System.out.println("Перерисовываем");
        System.out.println("evt X: " + evt.getX() + ", evt Y: " + evt.getY());

        int thisX = label.getLocation().x;
        int thisY = label.getLocation().y;
        System.out.println("thisX: " + thisX + ", thisY: " + thisY);

        // Determine how much the mouse moved since the initial click
        int xMoved = (thisX + evt.getX());
        int yMoved = (thisY + evt.getY());
        System.out.println("xMoved: " + xMoved + ", yMoved: " + yMoved);

        // Move picture to this position
        int X = thisX + xMoved;
        int Y = thisY + yMoved;

        label.setLocation(X, Y);
        label.repaint();

        // Repaint the square at the new location.
            /*repaint(redSquare.getX(), redSquare.getY(),
                    redSquare.getWidth()+OFFSET,
                    redSquare.getHeight()+OFFSET);*/

    }

    public Dimension getPreferredSize() {
        return new Dimension(250, 200);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        redSquare.paintSquare(g);
    }
}