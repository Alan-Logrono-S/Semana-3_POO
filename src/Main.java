import java.util.Scanner;
class Cocinero {
    String nombre;
    String experiencia;
    String especialidad;
    String informacion;

    public Cocinero(String nombre, String experiencia, String especialidad, String informacion) {
        this.nombre = nombre;
        this.experiencia = experiencia;
        this.especialidad = especialidad;
        this.informacion = informacion;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Experiencia: " + experiencia);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Información adicional: " + informacion);
        System.out.println("----------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cocinero[] cocineros = new Cocinero[3];

        for (int i = 0; i < cocineros.length; i++) {
            System.out.println("Registro del cocinero #" + (i + 1));
            System.out.print("Ingrese el nombre del cocinero: ");
            String nombre = sc.nextLine();

            System.out.print("Ingrese la experiencia del cocinero: ");
            String experiencia = sc.nextLine();

            System.out.print("Ingrese la especialidad del cocinero: ");
            String especialidad = sc.nextLine();

            System.out.print("Ingrese información adicional del cocinero: ");
            String informacion = sc.nextLine();

            cocineros[i] = new Cocinero(nombre, experiencia, especialidad, informacion);
            System.out.println();
        }

        System.out.println("Informacion de los COcineros");
        for (Cocinero cocinero : cocineros) {
            cocinero.mostrarInformacion();
        }

        sc.close();
    }
}
