package movement;

import gui.Window;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controls implements KeyListener {
    Window window;
    public Controls(Window window) {
        this.window = window;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_UP) {
            this.window.setMoveup(true);

        }else if(e.getKeyCode() == KeyEvent.VK_DOWN){
            this.window.setMovedown(true);
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_UP) {
            this.window.setMoveup(false);
        }else if(e.getKeyCode() == KeyEvent.VK_DOWN){
            this.window.setMovedown(false);
        }

    }
}
