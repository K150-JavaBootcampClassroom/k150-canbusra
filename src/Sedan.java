
import java.util.ArrayList;
import java.util.Arrays;
public class Sedan extends Araba {

    private ArrayList<String> list = new ArrayList();
    public Sedan(String renk,String Model,int bagajkapasitesi){
        super(renk, Model, bagajkapasitesi);
    }
    private int günlükkira;
     private int aylikkira;

    public void setaylikkira(){
        System.out.println("aylikkira="+300*30);

    }
}



