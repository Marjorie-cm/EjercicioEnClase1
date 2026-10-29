package org.example;

import java.util.ArrayList;
import java.util.List;

public class EjercicioEnClase {
    static class Estudiante {
        String nombre;
        double nota;

        public Estudiante(String nombre, double nota) {
            this.nombre = nombre;
            this.nota = nota;
        }
    }

    public static void main(String[] args) {
        // Lista única con los estudiantes
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Ana", 18.5));
        estudiantes.add(new Estudiante("Luis", 16.0));
        estudiantes.add(new Estudiante("María", 19.2));
        estudiantes.add(new Estudiante("Pedro", 15.7));
        estudiantes.add(new Estudiante("Sofía", 18.5));

        // Ordenamiento manual de mayor a menor (Algoritmo de Burbuja)
        for (int i = 0; i < estudiantes.size() - 1; i++) {
            for (int j = 0; j < estudiantes.size() - 1 - i; j++) {
                // Si el elemento actual es menor que el siguiente, los intercambiamos
                if (estudiantes.get(j).nota < estudiantes.get(j + 1).nota) {
                    Estudiante temp = estudiantes.get(j);
                    estudiantes.set(j, estudiantes.get(j + 1));
                    estudiantes.set(j + 1, temp);
                }
            }
        }

        // Mostramos el Top 3
        System.out.println("--- TOP 3 ESTUDIANTES ---");
        int limite = Math.min(3, estudiantes.size());
        for (int i = 0; i < limite; i++) {
            Estudiante e = estudiantes.get(i);
            System.out.println((i + 1) + ". " + e.nombre + " - " + e.nota);
        }
    }
}
