class Produs {
    private String nume;
    private double pret;
    private int cantitate;

    public Produs(String nume, double pret, int cantitate) {
        this.nume = nume;
        this.pret = pret;
        this.cantitate = cantitate;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    public void vinde(int cantitateVanduta) {
        if (cantitateVanduta <= cantitate) {
            cantitate -= cantitateVanduta;
            System.out.println("S-au vandut " + cantitateVanduta + " buc. din produsul " + nume);
        } else {
            System.out.println("Nu sunt suficiente stocuri pentru a vinde " + cantitateVanduta + " buc. din produsul " + nume);
        }
    }

    public void afiseazaDetalii() {
        System.out.println(nume + ": pret " + pret + ", cantitate " + cantitate);
    }
}
