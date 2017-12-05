package gui;

import javax.swing.*;
import java.awt.Font;

public class Window {
    JFrame jframe1;
    private int width = 800;
    private int height = 600;
    private boolean moveup = false, movedown = false;
    Font pixelFont;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isMoveup() {
        return moveup;
    }

    public void setMoveup(boolean moveup) {
        this.moveup = moveup;
    }

    public boolean isMovedown() {
        return movedown;
    }

    public void setMovedown(boolean movedown) {
        this.movedown = movedown;
    }
}
