package com.nio2Path.practica.practica1;

import java.io.IOException;       // 1. Importa la clase IOException desde el paquete java.io.
import java.nio.file.Files;       // 2. Importa la clase Files desde el paquete java.nio.file.
import java.nio.file.Path;        // 3. Importa la clase Path desde el paquete java.nio.file.
import java.nio.file.Paths;       // 4. Importa la clase Paths desde el paquete java.nio.file.
import java.util.List;            // 5. Importa la clase List desde el paquete java.util.

public class P03NIOLeeTodo { // 6. Declaración de la clase P03NIOLeeTodo.
    
    public static void main(String[] args) { // 7. Declaración del método principal.
        
        List<String> fileArr; // 8. Declaración de una lista de cadenas para almacenar las líneas del archivo.
        Path file = Paths.get("files//hamlet.txt"); // 9. Crea un objeto de tipo Path para representar la ubicación del archivo "hamlet.txt".

        try { // 10. Inicio del bloque try para manejar excepciones.
            fileArr = Files.readAllLines(file); // 11. Lee todas las líneas del archivo y almacénalas en la lista "fileArr".
            
            System.out.println("\n=== Rosencrantz ==="); // 12. Imprime un encabezado en la consola para la sección "Rosencrantz".

            fileArr.stream() // 13. Crea un flujo a partir de las líneas del archivo.
                .filter(line -> line.contains("Ros.")) // 14. Filtra las líneas que contienen "Ros.".
                .forEach(linea -> System.out.println(linea)); // 15. Imprime cada línea filtrada en la consola.

            System.out.println("\n=== Guildenstern ==="); // 16. Imprime un encabezado en la consola para la sección "Guildenstern".

            fileArr.stream() // 17. Crea un nuevo flujo a partir de las líneas del archivo (el mismo que en el paso 13).
                .filter(line -> line.contains("Guil.")) // 18. Filtra las líneas que contienen "Guil.".
                .forEach(linea -> System.out.println(linea)); // 19. Imprime cada línea filtrada en la consola.

        } catch (IOException e) { // 20. Captura una excepción de tipo IOException (errores de entrada/salida).
            System.out.println("Error: " + e.getMessage()); // 21. Imprime un mensaje de error en la consola junto con el mensaje de la excepción.
        }
    } 
}

