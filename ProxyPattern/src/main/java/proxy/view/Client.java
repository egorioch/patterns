package proxy.view;

import proxy.model.DrawImage;
import proxy.repo.DrawImageInterface;

public class Client {
    DrawImageInterface drawImage = new DrawImage();

    public void printImage() {
        drawImage.drawImage();
    }
}
