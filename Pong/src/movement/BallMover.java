package movement;

import objects.Ball;

import java.util.Timer;
import java.util.TimerTask;

public class BallMover {
    Timer timer;

    public BallMover(Ball ball){
        timer = new Timer();

        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                ball.setBallx(ball.getBallx()+ball.getBalldirx());
                ball.setBally(ball.getBally()+ball.getBalldiry());
            }
        }, 0, 3);

    }

}
