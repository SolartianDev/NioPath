package com.nio2Path.practica.practica2;

import java.io.IOException;     // 1. Importa la clase IOException desde el paquete java.io.
import java.nio.file.Files;     // 2. Importa la clase Files desde el paquete java.nio.file.
import java.nio.file.Path;      // 3. Importa la clase Path desde el paquete java.nio.file.
import java.nio.file.Paths;     // 4. Importa la clase Paths desde el paquete java.nio.file.
import java.util.stream.Stream; // 5. Importa la clase Stream desde el paquete java.util.stream.

public class ListaDirectorio { // 6. Declaración de la clase ListaDirectorio.
  public static void main(String[] args) { // 7. Declaración del método principal.
                
    try (Stream<Path> archivos = Files.list(Paths.get("."))) { // 8. Abre un flujo de rutas de archivos en el directorio actual.

        System.out.println("\n=== Lista de Directorios ==="); // 9. Imprime un encabezado en la consola.

        archivos.forEach(linea -> System.out.println(linea)); // 10. Para cada ruta de archivo, imprime la ruta en la consola.          

    } catch (IOException e) { // 11. Captura una excepción de tipo IOException (errores de entrada/salida).
        System.out.println("Error: " + e.getMessage()); // 12. Imprime un mensaje de error en la consola junto con el mensaje de la excepción.
    }
  } 
}


