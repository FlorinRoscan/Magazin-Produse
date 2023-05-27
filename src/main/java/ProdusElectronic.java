class ProdusElectronic extends Produs {
    private String producator;

    public ProdusElectronic(String nume, double pret, int cantitate, String producator) {
        super(nume, pret, cantitate);
        this.producator = producator;
    }

    public String getProducator() {
        return producator;
    }

    public void setProducator(String producator) {
        this.producator = producator;
    }

    public boolean disponibil() {
        return getCantitate() > 0;
    }

    @Override
    public void afiseazaDetalii() {
        String detalii = getNume() + ": pret " + getPret() + ", cantitate " + getCantitate() + ", produs de " + producator;
        if (disponibil()) {
            detalii += " (Disponibil)";
        } else {
            detalii += " (Indisponibil)";
        }
        System.out.println(detalii);
    }
}
