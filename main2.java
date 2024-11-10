public class main2 {
    public static void main(String[] args) {
        Manager manager1=new Manager("bianca",5,1344);
        Angajat angajat1=new Angajat("andrei", manager1);
        Manager manager2=new Manager("miha",5,1344);
        Angajat angajat2=new Angajat("maria",manager2);

        System.out.println(angajat1);
        System.out.println(angajat2.toString());
        System.out.println("numar angajati " + Angajat.nrAngajati);

        Angajat angajat3=new Angajat("maya",manager2);
        System.out.println(angajat2);
        System.out.println("numar angajati " + Angajat.nrAngajati);

    }
}
