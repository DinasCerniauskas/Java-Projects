package Internal;

public class OR extends Elementas{
    @Override
    public boolean gautiRezultata(){
        for(Elementas e: input) {
            if (e.gautiRezultata()) {
                return true;
            }
        }
        return false;
    }
}
