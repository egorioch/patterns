package proxy.model;

import proxy.help.HelpClass;

import java.awt.*;

class Box {

    private int xPos = 50;
    private int yPos = 50;
    private int width = HelpClass.getWidth();
    private int height = HelpClass.getHeight();

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
        g.setColor(Color.BLACK);
        g.drawRect(xPos, yPos, width, height);
    }
}