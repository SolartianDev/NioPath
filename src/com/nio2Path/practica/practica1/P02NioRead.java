package com.nio2Path.practica.practica1;

import java.io.IOException;       // 1. Importa la clase IOException desde el paquete java.io.
import java.nio.file.Files;       // 2. Importa la clase Files desde el paquete java.nio.file.
import java.nio.file.Path;        // 3. Importa la clase Path desde el paquete java.nio.file.
import java.nio.file.Paths;       // 4. Importa la clase Paths desde el paquete java.nio.file.
import java.util.stream.Stream;   // 5. Importa la clase Stream desde el paquete java.util.stream.

public class P02NioRead { // 6. Declaración de la clase P02NioRead.

    public static void main(String[] args) { // 7. Declaración del método principal.
        Path rutaTexto = Paths.get("files//hamlet.txt"); // 8. Crea un objeto de tipo Path para representar la ubicación del archivo "hamlet.txt".

        try (Stream<String> lineas = Files.lines(rutaTexto)) { // 9. Abre un flujo de líneas desde el archivo utilizando Files.lines().

            System.out.println("\n=== Archivo Completo ==="); // 10. Imprime un encabezado en la consola.

            lineas.forEach(linea -> System.out.println(linea)); // 11. Para cada línea leída del archivo, imprime la línea en la consola.

        } catch (IOException e) { // 12. Captura una excepción de tipo IOException (errores de entrada/salida).
            System.out.println("Error: " + e.getMessage()); // 13. Imprime un mensaje de error en la consola junto con el mensaje de la excepción.
        }
    } 
}

