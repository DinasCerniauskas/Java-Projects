package Internal;

public class AND extends Elementas{
    @Override
    public boolean gautiRezultata(){
        for(Elementas e: input)
        if(!e.gautiRezultata()){
            return false;
        }
        return true;
    }
}
