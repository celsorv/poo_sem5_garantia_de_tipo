// https://replit.com/@crvitorino/poosem5garantiadetipo#Main.java

import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {

        // ExemploSemGenerics.imprimir();
        // ExemploComGenerics.imprimir();

        Collection<Produto> lista = new ArrayList<>();

        lista.add(new Eletronico("Samsung Galaxy", 1640.0));
        lista.add(new Eletrodomestico("Refrigerador Consul", 1280.0));

        System.out.println("\n" + "-".repeat(50));
        lista.forEach(System.out::println);
        System.out.println("-".repeat(50) + "\n");

    }

}
