
package com.nio2Path;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Path2 {
    public static void main(String[] args) {
        
   //Resolucion de Rutas
    Path path1 = Paths.get("C:/Users/mont_/Downloads");
Path path2 = Paths.get("archivo.txt");

// Resuelve la ruta relativa respecto a otra ruta
Path resolvedPath = path1.resolve(path2);
System.out.println("Ruta resuelta: " + resolvedPath);



//Normalización de Rutas
Path path = Paths.get("C:/Users/../mont_/Downloads/./archivo.txt");

// Normaliza la ruta eliminando las partes redundantes (por ejemplo, ../ y ./)
Path normalizedPath = path.normalize();
System.out.println("Ruta normalizada: " + normalizedPath);


//Relativización de Rutas
Path path3 = Paths.get("C:/Users/mont_/Documents");
Path path4 = Paths.get("C:/Users/mont_/Documents/Files/archivo.txt");

// Obtiene la ruta relativa de path2 respecto a path1
Path relativePath = path3.relativize(path4);
System.out.println("Ruta relativa: " + relativePath);

 }
}
