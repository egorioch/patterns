package proxy.model;

import proxy.repo.DrawImageInterface;

import javax.swing.*;

public class ImageRedactor implements DrawImageInterface {

    public DrawLogic createAndShowGUI() {
        return new DrawLogic();
    }
}
