package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
//AKZELINI ARRAYLIST 280641
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> alumnos = new ArrayList<>();

        int opcion;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Agregar");
            System.out.println("2. Mostrar");
            System.out.println("3. Buscar");
            System.out.println("4. Eliminar");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Escribe el nombre del alumno: ");
                    String nombre = sc.nextLine();

                    alumnos.add(nombre);

                    System.out.println("Alumno agregado correctamente.");
                    break;

                case 2:
                    if (alumnos.isEmpty()) {
                        System.out.println("La lista esta vacia.");
                    } else {
                        System.out.println("\n--- LISTA DE ALUMNOS ---");

                        for (int i = 0; i < alumnos.size(); i++) {
                            System.out.println((i + 1) + ". " + alumnos.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Escribe el nombre que quieres buscar: ");
                    String buscar = sc.nextLine();

                    if (alumnos.contains(buscar)) {
                        System.out.println("El alumno SI se encuentra en la lista.");
                    } else {
                        System.out.println("El alumno NO se encuentra en la lista.");
                    }
                    break;

                case 4:
                    System.out.print("Escribe el nombre que quieres eliminar: ");
                    String eliminar = sc.nextLine();

                    if (alumnos.remove(eliminar)) {
                        System.out.println("Alumno eliminado correctamente.");
                    } else {
                        System.out.println("Ese alumno no existe en la lista.");
                    }
                    break;

                case 5:
                    System.out.println("Programa terminado.");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 5);

        sc.close();
    }
}