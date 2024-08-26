/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.actividadhoylistas;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Biblioteca
 */
public class Actividadhoylistas {
       public static void main(String[] args) {
     ArrayList<String> personas = new ArrayList<>();
        personas.add("Ana");
        personas.add("Luis");
        personas.add("Carlos");
        personas.add("Maria");

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
          
            System.out.println("\n--- Menú ---");
            System.out.println("1. Crear persona");
            System.out.println("2. Eliminar persona");
            System.out.println("3. Listar personas");
            System.out.println("4. Buscar persona");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  

            switch (opcion) {
                case 1:
                   
                    System.out.print("Ingrese el nombre de la persona: ");
                    String nombre = scanner.nextLine();
                    personas.add(nombre);
                    System.out.println("Lista actual de personas: " + personas);
                    break;

                case 2:
                  
                    if (personas.isEmpty()) {
                        System.out.println("La lista está vacía.");
                    } else {
                        System.out.println("Lista de personas:");
                        for (int i = 0; i < personas.size(); i++) {
                            System.out.println(i + ". " + personas.get(i));
                        }
                        System.out.print("Seleccione el índice de la persona a eliminar: ");
                        int indice = scanner.nextInt();
                        scanner.nextLine();  // Consumir el salto de línea

                        if (indice >= 0 && indice < personas.size()) {
                            String eliminado = personas.remove(indice);
                            System.out.println("Se ha eliminado a " + eliminado + ".");
                        } else {
                            System.out.println("Índice no válido.");
                        }
                        System.out.println("Lista actual de personas: " + personas);
                    }
                    break;

                case 3:
                  
                    if (personas.isEmpty()) {
                        System.out.println("La lista está vacía.");
                    } else {
                        System.out.println("Lista de personas:");
                        for (String persona : personas) {
                            System.out.println(persona);
                        }
                    }
                    break;

                case 4:
                
                    if (personas.isEmpty()) {
                        System.out.println("La lista está vacía.");
                    } else {
                        System.out.print("Ingrese el nombre de la persona a buscar: ");
                        String nombreBuscado = scanner.nextLine();

                        if (personas.contains(nombreBuscado)) {
                            System.out.println("La persona fue encontrada.");
                        } else {
                            System.out.println("La persona no fue encontrada.");
                        }
                    }
                    break;

                case 5:
                   
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    
                    System.out.println("Opción no válida, por favor intente nuevamente.");
                    break;
            }

        } while (opcion != 5);

        scanner.close();  
    }
}
