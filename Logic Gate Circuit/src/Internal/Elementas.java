package Internal;

import java.util.ArrayList;

public class Elementas {
    int id;
    static int nr = 1;
    boolean output;
    int x, y;
    int seka = 0;
    
    public int getSeka() {
        return seka;
    }

    public void setSeka(int seka) {
        this.seka = seka;
    }

    public int gautiLygi(){
        int kiek = 0;
        for(Elementas e:input){
            int e_lygis = e.gautiLygi();
            kiek = Math.max(kiek,e_lygis);
        }
        return kiek+1;
    }
    
    public ArrayList<Elementas> getInput() {
        return input;
    }

    public int getId() {
        return id;
    }

    public static void setNr(int nr) {
        Elementas.nr = nr;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    Elementas(){
        id = nr;
        nr++;
        System.out.println("sukurtas elementas su id: " + id);
    }

    ArrayList<Elementas> input = new ArrayList();

    public boolean gautiRezultata(){
        return output;
    }

    public void pridetiInput(Elementas in){
        input.add(in);
    }
}
