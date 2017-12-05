package movement;

import objects.Ball;
import objects.Paddle;
import gui.Window;

import java.util.Timer;
import java.util.TimerTask;

public class BallCollision {
    Timer collision;

    public BallCollision(Paddle enemy, Paddle player, Ball ball, Window window){

        collision = new Timer();
        collision.scheduleAtFixedRate(new TimerTask() {
        @Override
        public void run() {

            if(ball.getBally() +50 >= window.getHeight()){
                ball.setBalldiry(-1);
            }

            if(ball.getBally() <= 0){
                ball.setBalldiry(1);
            }

            if(ball.getBallx() +20 >= window.getWidth()){
                ball.setBallx(window.getWidth()/2 -10);
                ball.setBally(window.getHeight()/2 -10);

                ball.setBalldirx(-1);
                ball.setPoints(ball.getPoints()+1);

            }

            if(ball.getBallx() <= 0){
                ball.setBallx(window.getWidth()/2 -10);
                ball.setBally(window.getHeight()/2 -10);

                ball.setBalldirx(1);
                ball.setEnemypoints(ball.getEnemypoints()+1);
            }

            if(ball.getBallx() < player.getX() +25 && ball.getBallx() > player.getX() && ball.getBally() -20 < player.getY() + 150 && ball.getBally() > player.getY()){
                ball.setBalldirx(1);

            }
            if(ball.getBallx() < enemy.getX() && ball.getBallx() > enemy.getX() -20 && ball.getBally() -20 < enemy.getY() + 150 && ball.getBally() > enemy.getY()){
                ball.setBalldirx(-1);

            }

        }
    }, 0, 4);
    }
}
