import java.util.ArrayList;

public class CategoriaVehiculo {
    String nombre;
    double cantidad;
    ArrayList <Combustible> combustibles;

    public CategoriaVehiculo (String nombre, double cantidad){
        this.nombre=nombre;
        this.cantidad = cantidad;
        this.combustibles = new ArrayList<>();
    }
    
    public void agregarCombustible ( Combustible c){
        combustibles.add(c);
    }

    public void calcularEmisiones (){
        System.out.println("Emisiones para "+  nombre  + " : ");
        for (Combustible c: combustibles){
            double emision =c.calcularEmision(cantidad);
        System.out.printf("- %S : %.2f KG CO2%n", c.tipo,emision);
        }
        System.out.println();
    }
}
