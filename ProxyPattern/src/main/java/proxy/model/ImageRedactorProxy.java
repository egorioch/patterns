package proxy.model;

import proxy.repo.DrawImageInterface;

public class ImageRedactorProxy implements DrawImageInterface {
    ImageRedactor imageRedactor = new ImageRedactor();
    DrawLogic drawLogic;

    @Override
    public DrawLogic createAndShowGUI() {
        if (drawLogic == null)  {
            drawLogic = imageRedactor.createAndShowGUI();
        }

        return drawLogic;
    }

    public void deleteCache() {
        drawLogic = null;
    }
}
