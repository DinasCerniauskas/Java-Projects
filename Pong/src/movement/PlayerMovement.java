package movement;

import objects.Paddle;
import gui.Window;

import java.util.Timer;
import java.util.TimerTask;

public class PlayerMovement {
Timer move;

    public PlayerMovement(Paddle player, Window window){
    move = new Timer();

    move.scheduleAtFixedRate(new TimerTask(){

        @Override
        public void run() {

            if(window.isMoveup() == true){

                if(player.getY() >=10){
                    player.setY(player.getY()-2);
                }
            }else if(window.isMovedown() == true){

                if(player.getY() <= window.getHeight() - 190){
                    player.setY(player.getY()+2);
                }
            }

        }

    }, 0, 6);
    }

}
