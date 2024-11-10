public class Angajat {
    public String name;
    public Manager manager;
    public static int nrAngajati;
    public Angajat(String name, Manager manager) {
        this.name = name;
        this.manager = manager;
        nrAngajati++;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setManager(Manager manager){
        this.manager = manager;
    }
    public Manager getManager(){
        return manager;
    }
    public String getName(){
        return name;
    }

    public int getNrAngajati(){
        return nrAngajati;
    }

    public String toString(){
        return name + " " + manager;
    }
}
