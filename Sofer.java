public class Sofer {
    private String nume;
    private int age;
    private int dataPermis;
    public Sofer(String nume, int age, int dataPermis) {
        this.nume = nume;
        this.age = age;
        this.dataPermis = dataPermis;
    }
    public Sofer(){
        nume="Ion";
        age=34;
        dataPermis=0;
    }
    public String getNume() {
        return nume;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getDataPermis() {
        return dataPermis;
    }
    public void setDataPermis(int dataPermis) {
        this.dataPermis = dataPermis;
    }
    public String toString() {
        return nume + " " + age + " " + dataPermis;

    }

}
