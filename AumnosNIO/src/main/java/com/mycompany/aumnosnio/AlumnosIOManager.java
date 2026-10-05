package com.mycompany.aumnosnio;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JC
 */
public class AlumnosIOManager {
        private final String filePath = "alumnos_io.txt";

    public boolean actualizarPorId(String id, String nuevoNombre) {
        File file = new File(filePath);
        List<String> lineas = new ArrayList<>();
        boolean encontrado = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String linea;

            while ((linea = reader.readLine()) != null) {
                if (linea.startsWith(id + " - ")) {
                    lineas.add(id + " - " + nuevoNombre);
                    encontrado = true;
                } else {
                    lineas.add(linea);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        if (encontrado) {
            escribirArchivo(file, lineas);
        }

        return encontrado;
    }

    public boolean eliminarPorId(String id) {
        File file = new File(filePath);
        List<String> lineas = new ArrayList<>();
        boolean encontrado = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String linea;

            while ((linea = reader.readLine()) != null) {
                if (linea.startsWith(id + " - ")) {
                    encontrado = true;
                } else {
                    lineas.add(linea);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

        if (encontrado) {
            escribirArchivo(file, lineas);
        }

        return encontrado;
    }

    private void escribirArchivo(File file, List<String> lineas) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (String linea : lineas) {
                writer.write(linea);
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
