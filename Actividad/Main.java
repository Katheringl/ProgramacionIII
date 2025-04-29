import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Inicializar la lista de categorias
        ArrayList<CategoriaVehiculo> categorias = new ArrayList<>();

        // Camiones livianos
        CategoriaVehiculo livianos = new CategoriaVehiculo("Camiones Livianos", 400000);
        livianos.agregarCombustible(new Combustible("Gasolina", 30, 2.31, 1200));
        livianos.agregarCombustible(new Combustible("Diesel", 40, 2.68, 1800));
        livianos.agregarCombustible(new Combustible("Gas", 30, 1.90, 1000));
        categorias.add(livianos);

        // Camiones medianos
        CategoriaVehiculo medianos = new CategoriaVehiculo("Camiones medianos", 280000);
        medianos.agregarCombustible(new Combustible("Gasolina", 25, 2.31, 1200));
        medianos.agregarCombustible(new Combustible("Diesel", 50, 2.68, 1800));
        medianos.agregarCombustible(new Combustible("Gas", 25, 1.90, 1000));
        categorias.add(medianos);

        // Camiones pesados
        CategoriaVehiculo pesados = new CategoriaVehiculo("Camiones pesados", 380000);
        pesados.agregarCombustible(new Combustible("Gasolina", 10, 2.31, 1200));
        pesados.agregarCombustible(new Combustible("Diesel", 80, 2.68, 1800));
        pesados.agregarCombustible(new Combustible("Gas", 10, 1.90, 1000));
        categorias.add(pesados);

        // Camiones tractocamiones
        CategoriaVehiculo tractos = new CategoriaVehiculo("Tractocamiones", 1150000);
        tractos.agregarCombustible(new Combustible("Gasolina", 5, 2.31, 1200));
        tractos.agregarCombustible(new Combustible("Diesel", 90, 2.68, 1800));
        tractos.agregarCombustible(new Combustible("Gas", 5, 1.90, 1000));
        categorias.add(tractos);

        // Camiones volquetas
        CategoriaVehiculo volquetas = new CategoriaVehiculo("Volquetas", 936000);
        volquetas.agregarCombustible(new Combustible("Gasolina", 40, 2.31, 1200));
        volquetas.agregarCombustible(new Combustible("Diesel", 40, 2.68, 1800));
        volquetas.agregarCombustible(new Combustible("Gas", 20, 1.90, 1000));
        categorias.add(volquetas);

        // Calcular emisiones para cada categoría
        for (CategoriaVehiculo cat : categorias) {
            cat.calcularEmisiones();
        }
    }
}
