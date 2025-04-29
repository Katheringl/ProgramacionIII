public class Combustible {
    String tipo;
    double porcentaje;
    double factorEmision;
    double consumoAnual;

    public Combustible(String tipo, double porcentaje, double factorEmision, double consumoAnual) {
        this.tipo = tipo;
        this.porcentaje = porcentaje;
        this.factorEmision = factorEmision;
        this.consumoAnual = consumoAnual;
    }

    public double calcularEmision(double totalVehiculos) {
        double vehiculosTipo = totalVehiculos * (porcentaje / 100);
        return vehiculosTipo * consumoAnual * factorEmision;
    }
}
