package com.nio2Path.practica.practica1;

import java.io.BufferedReader; // 1. Importa la clase BufferedReader desde el paquete java.io.
import java.io.FileReader;     // 2. Importa la clase FileReader desde el paquete java.io.
import java.io.IOException;   // 3. Importa la clase IOException desde el paquete java.io.

public class P01BufferedReader { // 4. Declaración de la clase P01BufferedReader.

    public static void main(String[] args) { // 5. Declaración del método principal.
        
        try { // 6. Inicio del bloque try para manejar excepciones.
            BufferedReader bReader = new BufferedReader(new FileReader("files//hamlet.txt"));
            // 7. Crea un objeto BufferedReader para leer el archivo "hamlet.txt" utilizando un objeto FileReader.

            System.out.println("=== Archivo Completo ==="); // 8. Imprime un encabezado en la consola.

            bReader.lines() // 9. Lee líneas del archivo usando el método lines() del BufferedReader.
                .forEach(linea -> // 10. Para cada línea leída, realiza la siguiente acción.
                    System.out.println(linea)); // 11. Imprime la línea en la consola.

            bReader.close(); // 12. Cierra el BufferedReader para liberar los recursos.

        } catch (IOException e) { // 13. Captura una excepción de tipo IOException (errores de entrada/salida).
            System.out.println("Error: " + e.getMessage()); // 14. Imprime un mensaje de error en la consola.
        }
    } 
}
