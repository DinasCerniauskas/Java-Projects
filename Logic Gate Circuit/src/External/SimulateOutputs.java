/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package External;

/**
 *
 * @author User
 */
public class SimulateOutputs extends Thread{
    Drawing pies;
    int zingsniai = 0;
    public SimulateOutputs(Drawing p, int kiek){
        pies = p;
        zingsniai = kiek;
    }
    
    public void run(){        
       for(int i=0; i<=zingsniai; i++){
           pies.skaitiklis = i;
           pies.repaint();
           try{
           Thread.sleep(1000);
           }catch(Exception e){
               e.printStackTrace();
           }
       } 
    }
}
