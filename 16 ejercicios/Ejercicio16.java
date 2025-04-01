public class Ejercicio16 {
    public static void main(String[] args) {
        // Datos de los profesores (nombre, edad y sexo)
        String[] nombres = { "Juan", "Ana", "Carlos", "Marta", "Luis", "Elena" };
        int[] edades = { 35, 29, 42, 23, 50, 38 };
        char[] sexos = { 'M', 'F', 'M', 'F', 'M', 'F' };

        // Calcular la edad promedio
        int sumaEdades = 0;
        for (int i = 0; i < edades.length; i++) {
            sumaEdades += edades[i];
        }
        double edadPromedio = (double) sumaEdades / edades.length;

        // Encontrar el profesor más joven y el más viejo
        int indiceMasJoven = 0, indiceMasViejo = 0;
        for (int i = 1; i < edades.length; i++) {
            if (edades[i] < edades[indiceMasJoven]) {
                indiceMasJoven = i;
            }
            if (edades[i] > edades[indiceMasViejo]) {
                indiceMasViejo = i;
            }
        }

        // Contar cuántas profesoras tienen edad mayor al promedio
        int countProfesoraMayorPromedio = 0;
        int countProfesorMenorPromedio = 0;
        for (int i = 0; i < edades.length; i++) {
            if (sexos[i] == 'F' && edades[i] > edadPromedio) {
                countProfesoraMayorPromedio++;
            }
            if (sexos[i] == 'M' && edades[i] < edadPromedio) {
                countProfesorMenorPromedio++;
            }
        }

        // Imprimir los resultados
        System.out.println("a. Edad promedio del grupo de profesores: " + edadPromedio);
        System.out.println("b. Nombre del profesor más joven: " + nombres[indiceMasJoven]);
        System.out.println("c. Nombre del profesor con mayor edad: " + nombres[indiceMasViejo]);
        System.out.println("d. Número de profesoras con edad mayor al promedio: " + countProfesoraMayorPromedio);
        System.out.println("e. Número de profesores con edad menor al promedio: " + countProfesorMenorPromedio);
    }
}
