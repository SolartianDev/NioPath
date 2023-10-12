
package com.nio2Path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Path3 {
    public static void main(String[] args) {
        Path filePath = Paths.get("C:/Users/mont_/Downloads/archivo.txt");
Path directoryPath = Paths.get("C:/Users/mont_/Documents");

// Verifica si el archivo existe
boolean fileExists = Files.exists(filePath);
System.out.println("¿El archivo existe? " + fileExists);

// Verifica si es un directorio
boolean isDirectory = Files.isDirectory(directoryPath);
System.out.println("¿Es un directorio? " + isDirectory);



Path filePath2 = Paths.get("files//archivo.txt");

// Lectura de todo el contenido del archivo
try {
    byte[] fileBytes = Files.readAllBytes(filePath2);
    System.out.println("Contenido del archivo: " + new String(fileBytes));
} catch (IOException e) {
    e.printStackTrace();
}

// Escritura de datos en un archivo
String content = "Hola, mundo!";
try {
    Files.write(filePath2, content.getBytes());
    System.out.println("Datos escritos en el archivo.");
} catch (IOException e) {
    e.printStackTrace();
}

    }
}
