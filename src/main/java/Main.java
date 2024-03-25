import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produs> produse = new ArrayList<>();

        produse.add(new Produs("Lapte", 2.5, 10));
        produse.add(new ProdusAlimentar("Branza", 5.0, 8, "2023-03-31"));
        produse.add(new Produs("Cartofi", 1.5, 20));
        produse.add(new ProdusElectronic("Telefon", 1200.0, 5, "Samsung"));
        produse.add(new ProdusElectronic("Televizor", 2500.0, 3, "LG"));
        produse.add(new ProdusAlimentar("Ciocolata", 3.0, 15, "2023-05-31"));
        produse.add(new Produs("Apa", 2.0, 50));
        produse.add(new Produs("Paine", 2.0, 15));
        produse.add(new ProdusElectronic("Laptop", 10.0, 2, "Apple"));
        produse.add(new Produs("Sare", 3.0, 30));

        afiseazaDetalii(produse);

        produse.get(0).vinde(3);
        produse.get(3).vinde(2);
        produse.get(5).vinde(4);
        produse.get(2).vinde(3);
        produse.get(8).vinde(1);
        
        System.out.println("Dupa vanzari:");
        afiseazaDetalii(produse);
    }
    public static void afiseazaDetalii(List<? extends Produs> produse) {
        for (Produs produs : produse) {
            produs.afiseazaDetalii();
        }
    }
}
