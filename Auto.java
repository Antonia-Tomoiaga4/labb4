import java.awt.Color;
public class Auto {
    private String model;
    private Color color;
    private int vitezaCurenta;
    private int vitezaMaxima;
    private static final int NR_GEAR = 0; //CONSTANTA
    private int curentGear;
    private Sofer sofer;

    public Auto(String model, Color color, int vitezaCurenta, int vitezaMaxima, int curentGear , Sofer sofer) {
        this.model = model;
        this.color = color;
        this.vitezaCurenta = vitezaCurenta;
        this.vitezaMaxima = vitezaMaxima;
        this.curentGear = curentGear;
        this.sofer = sofer;
    }



    public Auto() {
        model = "BMW";
        color = Color.BLACK;
        vitezaCurenta = 100;
        vitezaMaxima = 200;
        curentGear = 5;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getVitezaCurenta() {
        return vitezaCurenta;
    }

    public void setVitezaCurenta(int vitezaCurenta) {
        this.vitezaCurenta = vitezaCurenta;
    }

    public int getVitezaMaxima() {
        return vitezaMaxima;
    }

    public void setVitezaMaxima(int vitezaMaxima) {
        this.vitezaMaxima = vitezaMaxima;
    }

    public int getCurentGear() {
        return curentGear;
    }

    public void setCurentGear(int curentGear) {
        this.curentGear = curentGear;
    }
    public Sofer getSofer() {
        return sofer;
    }
    public void setSofer(Sofer sofer) {
        this.sofer = sofer;
    }

    public String toString() {
        return "Autovehiculul cu marca " + model + "\n" +
                "culoarea " + color + "\n" +
                "viteza curenta " + curentGear + "\n "+
                "viteza maxima " + vitezaMaxima + "\n" +
                "curent gear " + curentGear +
                "sofer " + sofer;
    }

    public void acelerate(int k){
        k=20;
        if(vitezaCurenta +k > vitezaMaxima){
            vitezaCurenta=vitezaMaxima;
        }
        else {
            vitezaCurenta+=k;
        }
    }

    public void deacelerate(int k){
        k=20;
        if(vitezaCurenta -k <0){
            vitezaCurenta=0;
        }
        else{
            vitezaCurenta-=k;
        }
    }
   public void setGear(int gear) {
        if(curentGear +gear > NR_GEAR){
            curentGear=NR_GEAR;
        }
        else{
            curentGear=curentGear+gear;
        }
   }
   public void oprire(int k){
        if(vitezaCurenta>250){
            curentGear=6;
       }
        if(vitezaCurenta<250 && vitezaCurenta>150){
            curentGear=5;
        }
        if(vitezaCurenta<150 && vitezaCurenta>80){
            curentGear=4;
        }
        if(vitezaCurenta<80 && vitezaCurenta>40){
            curentGear=3;
        }
        if(vitezaCurenta<40 && vitezaCurenta>30){
            curentGear=2;
        }
        if(vitezaCurenta<30 && vitezaCurenta>0){
            curentGear=1;
        }
   }


}
