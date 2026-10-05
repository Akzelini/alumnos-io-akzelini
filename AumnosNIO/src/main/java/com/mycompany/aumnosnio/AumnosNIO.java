/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aumnosnio;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JC
 */
public class AumnosNIO {

   public static void main(String[] args) {

        AlumnosIOManager manager = new AlumnosIOManager();

        boolean actualizado = manager.actualizarPorId("2", "Luis");

        if (actualizado) {
            System.out.println("Alumno actualizado correctamente.");
        } else {
            System.out.println("No se encontró el alumno.");
        }

        boolean eliminado = manager.eliminarPorId("3");

        if (eliminado) {
            System.out.println("Alumno eliminado correctamente.");
        } else {
            System.out.println("No se encontró el alumno.");
        }
    }
    }

