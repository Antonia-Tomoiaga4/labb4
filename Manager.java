public class Manager {
   public String name;
    public int dep;
   public int id;

    public Manager(String name, int dep, int id) {
        this.name = name;
        this.dep = dep;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public int getDep() {
        return dep;
    }
    public int getId() {
        return id;
    }
    public void setDep(int dep) {
        this.dep = dep;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return name + " " + dep + " " + id;
    }
}
