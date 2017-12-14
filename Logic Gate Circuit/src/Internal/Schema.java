package Internal;

import java.util.ArrayList;

public class Schema {

    ArrayList<Elementas> elementai = new ArrayList();

    public void pridetiInput(){
        elementai.add(new Input());
    }

    public void pridetiANDelementa(){
        elementai.add(new AND());
    }

    public void pridetiORelementa(){
        elementai.add(new OR());
    }

    public void pridetiXORelementa(){
        elementai.add(new XOR());
    }

    public void pridetiNOTelementa(){
        elementai.add(new NOT());
    }

    public void sujungti(int nuo, int iki){

        Elementas in=null, sis=null;
        for(Elementas e:elementai){
            if(e.id == nuo){
                in = e;
            }
            else if(e.id == iki){
                sis = e;
            }
        }
        if(in!=null && sis!=null){
            sis.pridetiInput(in);
        }else{
            System.out.println("Tokiu elementu ar bent vieno is ju nera");
        }
    }

    public boolean gautiRezultata(int id){
        Elementas in=null;
        for(Elementas e:elementai){
            if(e.id == id){
                in = e;
            }
        }
        if(in!=null){
            return in.gautiRezultata();
        }else{
            System.out.println("Tokio elemento nera");
        }
        return false;
    }

    public void nustatytiReiksme(int id, boolean r){
        Elementas in=null;
        for(Elementas e:elementai){
            if(e.id == id){
                in = e;
            }
        }
        if(in!=null){
          if(in.getClass().equals(Input.class)){
            in.output = r;
          }
        }else{
            System.out.println("Tokio elemento nera");
        }
    }

    public void salintiElementa(int id){
        Elementas in=null;
        for(Elementas e:elementai){
            if(e.id == id){
                in = e;
            }
        }
        if(in!=null) {
            elementai.remove(in);
            for(Elementas el:elementai){
                el.input.remove(in);

            }
        }

    }

    public void salintiSujungima(int nuo, int iki){
        Elementas in = null, sis = null;
        for(Elementas e: elementai){
            if(e.id == nuo){
                in = e;
            } else if(e.id == iki){
                sis = e;
            }
        }
        if(in!= null && sis!= null){
            sis.input.remove(in);
        }
    }

    public void print(){
        for(Elementas e: elementai){
            System.out.println(e.id +" "+e.getClass()+ " " +e.gautiRezultata()+ " jis sujungtas su: ");
            if(e.input.size()> 0){
            for(Elementas in:e.input){
                System.out.println("\t" + in.id+ " " + in.getClass());
            }}else{
                System.out.println("\t NERA");
            }
        }
    }
    
    public ArrayList<Elementas> getElementai(){
        return elementai;
    }

}
