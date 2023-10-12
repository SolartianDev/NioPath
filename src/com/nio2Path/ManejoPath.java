package com.nio2Path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ManejoPath {

    public static void main(String[] args) {
        // Crear un objeto Path para un archivo
        Path filePath = Paths.get("C:/Users/mont_/Downloads/archivo.txt");

        // Obtener información sobre el Path
        System.out.println("Nombre del archivo: " + filePath.getFileName());
        System.out.println("Ruta absoluta: " + filePath.toAbsolutePath());
        System.out.println("Directorio padre: " + filePath.getParent());
        System.out.println("Número de elementos en la ruta: " + filePath.getNameCount());

        // Iterar a través de los elementos de la ruta
        System.out.println("Elementos de la ruta:");
        for (int i = 0; i < filePath.getNameCount(); i++) {
            System.out.println("Elemento " + i + ": " + filePath.getName(i));
        }

        // Comprobar si el archivo existe
        System.out.println("¿El archivo existe? " + filePath.toFile().exists());

        // Crear un objeto Path para un directorio
        Path directoryPath = Paths.get("C:/Users/mont_/Downloads");

        // Listar los archivos en el directorio
        System.out.println("Archivos en el directorio:");
        try {
            java.nio.file.DirectoryStream<Path> directoryStream = java.nio.file.Files.newDirectoryStream(directoryPath);
            for (Path path : directoryStream) {
                System.out.println(path.getFileName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}





