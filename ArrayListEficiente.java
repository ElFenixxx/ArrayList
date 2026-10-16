import java.util.ArrayList;
public class ArrayListAutos {
    public static void main(String[] args) {
        ArrayList<String> autos = new ArrayList<>();
        autos.add("Corvette");
        autos.add("Challenger");
        autos.add("Dodge Viper");
        autos.add("Tsuru");
        autos.add("Chevy");
        System.out.println("Lista inicial: " + autos);
        System.out.println("Total de autos (size): " + autos.size());
        autos.remove("Challenger"); 
        System.out.println("\nLista después de eliminar: " + autos);
        System.out.println("¿Hay Challenger?: " + autos.contains("Challenger"));
        System.out.println("Elemento en posición 0: " + autos.get(0));
    }
}
