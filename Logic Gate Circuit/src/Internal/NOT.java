package Internal;

public class NOT extends Elementas{

    @Override
    public void pridetiInput(Elementas in){
        if(input.isEmpty()){
            input.add(in);
        }else{
            System.out.println("Negaliu sujungti kol nepasalinsite esamo sujungimo");
        }
    }
    @Override
    public boolean gautiRezultata(){
        if(input.isEmpty()){
            return true;
        }
    return !input.get(0).gautiRezultata();
    }
}
