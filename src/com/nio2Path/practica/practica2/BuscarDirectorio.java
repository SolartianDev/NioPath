package com.nio2Path.practica.practica2; // 1. Declaración del paquete donde se encuentra la clase.

import java.io.IOException;              // 2. Importa la clase IOException desde el paquete java.io.
import java.nio.file.Files;              // 3. Importa la clase Files desde el paquete java.nio.file.
import java.nio.file.Path;               // 4. Importa la clase Path desde el paquete java.nio.file.
import java.nio.file.Paths;              // 5. Importa la clase Paths desde el paquete java.nio.file.
import java.util.stream.Stream;          // 6. Importa la clase Stream desde el paquete java.util.stream.

public class BuscarDirectorio { // 7. Declaración de la clase BuscarDirectorio.

    public static void main(String[] args) { // 8. Declaración del método principal.
        
        try (Stream<Path> archivos = 
              Files.find(Paths.get("."), 9, (ruta, atributos) -> atributos.isDirectory())) {
            // 9. Abre un flujo de Paths que representa directorios encontrados a partir del directorio actual (".").
            //    El valor "9" especifica la profundidad de búsqueda, y la expresión lambda filtra directorios.

            System.out.println("\n=== Encontrar todos los directorios ==="); // 10. Imprime un encabezado en la consola.

            archivos.forEach(linea -> System.out.println(linea)); // 11. Para cada directorio encontrado, imprime su ubicación en la consola.
                
        } catch (IOException e) { // 12. Captura una excepción de tipo IOException (errores de entrada/salida).
            System.out.println("Error: " + e.getMessage()); // 13. Imprime un mensaje de error en la consola junto con el mensaje de la excepción.
        }
    } 
}

