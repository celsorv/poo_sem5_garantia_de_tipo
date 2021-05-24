import java.util.ArrayList;
import java.util.Collection;

public class ExemploSemGenerics {

    public static void imprimir() {

        Collection lista = new ArrayList();

        lista.add(1);
        lista.add("Samsung Galaxy");
        lista.add("Eletrônicos");
        lista.add(1680.00);

        lista.add(2);
        lista.add("Refrigerador Consul");
        lista.add("Eletrodomésticos");
        lista.add(1100.90);

        System.out.println();
        lista.forEach(System.out::println);

    }

}