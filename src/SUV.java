public class SUV extends Araba {
    private int aylikkira;
    private int günlükkira;

    public SUV(String renk, String model, int bagajkapasitesi) {
        super(renk, model, bagajkapasitesi);
    }


    public void setaylikkira() {
        System.out.println("aylikkira="+aylikkira * 10);
    }
}
