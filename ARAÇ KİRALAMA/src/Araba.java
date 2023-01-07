public abstract class Araba {
    private int renk;
    private String Model;
    private int bagajkapasitesi;
    public Araba(int renk,String Model,int bagajkapasitesi){
        this.renk=renk;
        this.Model=Model;
        this.bagajkapasitesi=bagajkapasitesi;
    }
    public Araba(String renk, String model, int bagajkapasitesi) {
    }

    public Araba(int bagajkapasitesi) {
    }
}




