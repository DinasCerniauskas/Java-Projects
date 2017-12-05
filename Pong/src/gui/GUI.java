package gui;

import movement.Controls;
import objects.Ball;
import objects.Paddle;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.IOException;

public class GUI {

    public GUI(Paddle enemy, Paddle player, Ball ball, Window window){

        window.jframe1 = new JFrame();

        try {
            window.jframe1.setIconImage(ImageIO.read(this.getClass().getClassLoader().getResourceAsStream("resources\\Icon.png")));
        }
        catch (IOException exc) {
            exc.printStackTrace();
        }

        window.jframe1.setSize(window.getWidth(), window.getHeight());
        window.jframe1.setTitle("Pong");
        window.jframe1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.jframe1.setLayout(null); // absolute positioning
        window.jframe1.setResizable(false);
        window.jframe1.setVisible(true);
        window.jframe1.setLocationRelativeTo(null); // center frame
        window.jframe1.addKeyListener(new Controls(window));
        window.jframe1.requestFocus();



        Renderer renderer = new Renderer(enemy, player, ball, window);
        renderer.setBounds(0, 0, window.getWidth(), window.getHeight());
        renderer.setVisible(true);
        window.jframe1.add(renderer);
    }

}
