package proxy.help;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static javax.imageio.ImageIO.read;

public class HelpClass {
    private static BufferedImage image;

    static {
        BufferedImage i = null;
        try {
            i = read(new File("src/main/resources/belate.jpg"));
            System.out.println("Ресурсы картинки");
        } catch (IOException e) {
            e.printStackTrace();
        }
        image = i;
    }

    public static int getHeight() {
        return image.getHeight();
    }

    public static int getWidth() {
        return image.getWidth();
    }
}
