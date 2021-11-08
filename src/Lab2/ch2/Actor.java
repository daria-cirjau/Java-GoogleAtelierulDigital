package Lab2.ch2;

public class Actor {
    private String nume;
    private int varsta;
    private Premiu[] premiu;

    public Actor(String nume, int varsta, Premiu[] premiu) {
        this.nume = nume;
        this.varsta = varsta;
        this.premiu = premiu;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public Premiu[] getPremiu() {
        return premiu;
    }

    public void setPremiu(Premiu[] premiu) {
        this.premiu = premiu;
    }
}
