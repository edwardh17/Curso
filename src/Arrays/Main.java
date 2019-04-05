package Arrays;
import java.util.ArrayList;

public class Main {
    private ArrayList<Producto> lista = new ArrayList<Producto>();
    public void Agregar(){
        //Producto pr = new Producto(1, 'Pera', 35.20);
        lista.add(new Producto(1, "Pera", 35.20));
        lista.add(new Producto(2, "Manzana", 22.17));
        lista.add(new Producto(3, "Durazno", 55.39));
        for (Object i : lista) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.Agregar();
    }
}
