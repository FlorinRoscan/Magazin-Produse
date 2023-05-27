import java.time.LocalDate;

class ProdusAlimentar extends Produs {
    private String dataExpirare;

    public ProdusAlimentar(String nume, double pret, int cantitate, String dataExpirare) {
        super(nume, pret, cantitate);
        this.dataExpirare = dataExpirare;
    }

    public String getDataExpirare() {
        return dataExpirare;
    }

    public void setDataExpirare(String dataExpirare) {
        this.dataExpirare = dataExpirare;
    }

    public boolean expirat() {
        LocalDate dataCurenta = LocalDate.now();
        LocalDate dataExpirare = LocalDate.parse(this.dataExpirare);
        return dataCurenta.isAfter(dataExpirare);
    }

    @Override
    public void afiseazaDetalii() {
        String detalii = getNume() + ": pret " + getPret() + ", cantitate " + getCantitate();
        if (expirat()) {
            detalii += " (Expirat)";
        } else {
            detalii += ", expira la " + dataExpirare;
        }
        System.out.println(detalii);
    }
}
