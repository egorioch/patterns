package proxy.model;

import proxy.help.HelpClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static javax.imageio.ImageIO.*;

public class DrawLogic extends JPanel {
    private BufferedImage image;
    private Point boxPosition = new Point(0, 0);
    private final Box box;
    private final int height = HelpClass.getHeight();
    private final int width = HelpClass.getWidth();
    private JButton button3;
    private boolean imageSetFlag = false;

    public DrawLogic() {
        button3 = new JButton("Click!");
        button3.setActionCommand("«Button 3 was pressed!»");
        this.add(button3);
        box = new Box();

        clickButton(button3);
        mousePressedEvent();
    }

    private void mousePressedEvent() {
        addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent me) {
                int centerX = 0;
                int centerY = 0;

                boxPosition.x = centerX + me.getX();
                boxPosition.y = centerY + me.getY();
                box.setX(boxPosition.x);
                box.setY(boxPosition.y);

                System.out.println("imageX: " + boxPosition.x + ", imageY: " + boxPosition.y);

                repaint();
            }

        });
    }

    private void clickButton(JButton button3) {
        button3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent ev) {
                BufferedImage i = null;
                try {
                    i = read(new File("src/main/resources/belate.jpg"));
                    System.out.println("Ресурсы картинки");
                    imageSetFlag = true;
                    repaint();

                    button3.setEnabled(false);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                image = i;


            }
        });


    }

    public void paintComponent(Graphics gr) {
        super.paintComponent(gr);

        Graphics2D g = (Graphics2D) gr;
        g.setRenderingHint(
                RenderingHints.KEY_RENDERING,
                RenderingHints.VALUE_RENDER_QUALITY);
        System.out.println("перерисовывается");

        //может, стоит вынести его в отдельный объект
        if (imageSetFlag) {
            g.drawImage(image, boxPosition.x, boxPosition.y,
                    HelpClass.getWidth(),
                    HelpClass.getHeight(),
                    null);
        }
        /*g.drawImage(image, boxPosition.x, boxPosition.y,
                HelpClass.getWidth(),
                HelpClass.getHeight(),
                null);*/
        box.paintSquare(gr);
    }

}
