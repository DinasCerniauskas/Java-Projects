package gui;

import objects.Ball;
import objects.Paddle;

import javax.swing.*;
import java.awt.*;

public class Renderer extends JLabel{
    Paddle enemy;
    Paddle player;
    Ball ball;
    Window window;

    public Renderer(Paddle enemy, Paddle player, Ball ball, Window window) {
        this.enemy = enemy;
        this.player = player;
        this.ball = ball;
        this.window = window;
    }

    protected void paintComponent(Graphics g){

        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        renderBoard(g);

        renderPaddle(this.player, g);
        renderPaddle(this.enemy, g);

        renderStatusString(this.ball.getPoints(), this.ball.getEnemypoints(), g);

        renderBall(this.ball, g);


        repaint();

    }

    private void renderBall(Ball ball, Graphics g){
        g.fillOval(ball.getBallx(), ball.getBally(), 20, 20);
    }

    private void renderStatusString(int playerPoints, int enemyPoints, Graphics g) {
        g.setFont(this.window.pixelFont);
        g.drawString("" + playerPoints, this.window.getWidth()/2 - 95, 75);
        g.drawString("" + enemyPoints, this.window.getWidth()/2 +50, 75);
    }

    private void renderPaddle(Paddle paddle, Graphics g){
        g.fillRect(paddle.getX(), paddle.getY(), 20, 150);
    }

    private void renderBoard(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, this.window.getWidth(), this.window.getHeight());

        g.setColor(Color.WHITE);

        for(int i = 0; i<=30; i++){
            g.fillRect(this.window.getWidth()/2 -5, i*20, 10, 10);
        }

    }

}
