package Internal;

public class XOR extends Elementas{
    @Override
    public boolean gautiRezultata(){
        int kiek_true=0;
        for(Elementas e:input){
            if(e.gautiRezultata()){
                kiek_true++;
            }
        }
        boolean rez = false;
        if(kiek_true%2==1){
            rez=true;
        }
        return rez;
    }
}
