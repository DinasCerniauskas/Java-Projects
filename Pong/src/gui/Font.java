package gui;

import java.awt.*;
import java.io.IOException;

public class Font {

    public Font(Window window){

        try {
            window.pixelFont = java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, this.getClass().getClassLoader().getResourceAsStream("resources\\coders_crux.ttf")).deriveFont(125f);
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(java.awt.Font.createFont(java.awt.Font.TRUETYPE_FONT, this.getClass().getClassLoader().getResourceAsStream("resources\\coders_crux.ttf")));
        } catch (FontFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
