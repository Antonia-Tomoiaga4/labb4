import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Sofer Ion=new Sofer();
        Sofer Marcel=new Sofer("Marcel",56,89999);
        Auto bmw= new Auto();
        Auto mercedes =new Auto("mercedes", Color.pink,6,250,4,Marcel);
        System.out.println(mercedes);
        System.out.println(bmw);
        mercedes.acelerate(190);
        for(int i=0;i<10;i++){
            mercedes.acelerate(20);
            mercedes.getVitezaCurenta();
            mercedes.oprire(20);
            mercedes.getCurentGear();
            System.out.println(mercedes);
        }
        Rezervor rezervor=new Rezervor();
        rezervor.setCapMax(1000);
        rezervor.setNivelRez(100);
        rezervor.adaugare(150);
        System.out.println("Nivel rezervor după adăugare: " + rezervor.getNivelRez());
        rezervor.golire(50);
        System.out.println("Nivel rezervor după gloire" + rezervor.getNivelRez());
        rezervor.adaugare(150,50);
        System.out.println("Nivel rezervor după adăugare2: " + rezervor.getNivelRez());



        }
    }
