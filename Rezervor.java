public class Rezervor {
    public int capMax;
    public int nivelCurent;

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }

    public int getCapMax() {
        return this.capMax;
    }

    public void setNivelRez(int nivelRez) {
        this.nivelCurent = nivelRez;
    }

    public int getNivelRez() {
        return this.nivelCurent;
    }

    public void golire(int goliere) {
        if (nivelCurent - goliere < 0) {
            nivelCurent=0;
        }
        nivelCurent=nivelCurent - goliere;
    }

    public void adaugare(int adaug) {
        if (adaug + nivelCurent > capMax) {
            nivelCurent=capMax;
        } else nivelCurent = nivelCurent + adaug;
    }
    public void adaugare(int adaug1, int adaug2){
        if(nivelCurent+adaug1+adaug2 > capMax){
            nivelCurent=capMax;
        }
        else nivelCurent = nivelCurent + adaug2+adaug1;
    }
}

