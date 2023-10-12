package com.nio2Path.practica.practica1;

import java.io.IOException;       // 1. Importa la clase IOException desde el paquete java.io.
import java.nio.file.Files;       // 2. Importa la clase Files desde el paquete java.nio.file.
import java.nio.file.Path;        // 3. Importa la clase Path desde el paquete java.nio.file.
import java.nio.file.Paths;       // 4. Importa la clase Paths desde el paquete java.nio.file.
import java.util.List;            // 5. Importa la clase List desde el paquete java.util.
import java.util.stream.Stream;   // 6. Importa la clase Stream desde el paquete java.util.stream.

public class P04NIOLeerTodo { // 7. Declaración de la clase P04NIOLeerTodo.

    public static void main(String[] args) { // 8. Declaración del método principal.
        Path archivo = Paths.get("files//hamlet.txt"); // 9. Crea un objeto de tipo Path para representar la ubicación del archivo "hamlet.txt".
        List<String> lineasArchivo; // 10. Declaración de una lista de cadenas para almacenar las líneas del archivo.

        try { // 11. Inicio del bloque try para manejar excepciones.
            lineasArchivo = Files.readAllLines(archivo); // 12. Lee todas las líneas del archivo y almacénalas en la lista "lineasArchivo".

            System.out.println("\n=== Contar 'Lord' ==="); // 13. Imprime un encabezado en la consola para la sección "Contar 'Lord'".

            long cuentaLord = lineasArchivo.stream() // 14. Crea un flujo a partir de las líneas del archivo.
                .flatMap(linea -> Stream.of(linea.split(" "))) // 15. Divide cada línea en palabras y las combina en un solo flujo.
                .filter(palabra -> palabra.contains("lord")) // 16. Filtra las palabras que contienen "lord".
                .peek(palabra -> System.out.println(palabra)) // 17. Imprime cada palabra en la consola.
                .count(); // 18. Cuenta la cantidad de palabras que cumplen con el filtro.

            System.out.println("Cantidad de veces: " + cuentaLord); // 19. Imprime la cantidad de veces que se encontró "lord".

            System.out.println("\n=== Contar 'Prison' ==="); // 20. Imprime un encabezado en la consola para la sección "Contar 'Prison'".

            long cuentaPrison = lineasArchivo.stream() // 21. Crea un nuevo flujo a partir de las líneas del archivo (el mismo que en el paso 14).
                .flatMap(linea -> Stream.of(linea.split(" "))) // 22. Divide cada línea en palabras y las combina en un solo flujo.
                .filter(palabra -> palabra.contains("prison") || palabra.equalsIgnoreCase("prison,")) // 23. Filtra las palabras que contienen "prison" o "prison," (insensible a mayúsculas/minúsculas).
                .peek(palabra -> System.out.println(palabra)) // 24. Imprime cada palabra en la consola.
                .count(); // 25. Cuenta la cantidad de palabras que cumplen con el filtro.

            System.out.println("Cantidad de veces: " + cuentaPrison); // 26. Imprime la cantidad de veces que se encontró "prison".

        } catch (IOException e) { // 27. Captura una excepción de tipo IOException (errores de entrada/salida).
            System.out.println("Error: " + e.getMessage()); // 28. Imprime un mensaje de error en la consola junto con el mensaje de la excepción.
        }
    }
}



