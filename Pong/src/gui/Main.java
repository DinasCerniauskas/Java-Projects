package gui;

import movement.BallMover;
import movement.BallCollision;
import movement.EnemyMover;
import movement.PlayerMovement;
import objects.Ball;
import objects.Paddle;

public class Main {

    public static void main(String[] args){

        Paddle player = new Paddle(20,185);
        Paddle enemy  = new Paddle(755, 185);
        Ball ball = new Ball();
        Window window = new Window();
        new Font(window);
        new GUI(enemy, player, ball, window);
        new PlayerMovement(player, window);
        new EnemyMover(enemy, ball, window);
        new BallMover(ball);
        new BallCollision(enemy, player, ball, window);
    }

}
