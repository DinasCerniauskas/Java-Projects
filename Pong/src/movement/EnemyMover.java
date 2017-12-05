package movement;

import objects.Ball;
import objects.Paddle;
import gui.Window;

import java.util.Timer;
import java.util.TimerTask;

public class EnemyMover {
    Timer move;

    public EnemyMover(Paddle enemy, Ball ball, Window window) {

        move = new Timer();
        move.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                if(ball.getBallx() >= window.getWidth() /2 -10) {

                    if (ball.getBally() == enemy.getY()) {

                    } else if (ball.getBally() > enemy.getY() + 75) {

                        if (enemy.getY() <= window.getHeight() - 200) {
                            enemy.setY(enemy.getY()+2);
                        }

                    } else if (ball.getBally() < enemy.getY() + 75) {

                        if (enemy.getY() >= 20) {
                            enemy.setY(enemy.getY()-2);
                        }
                    }
                }
            }
        }, 0, 10);

    }

}
