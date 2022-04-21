/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea7A;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hinda
 */
public class LeerFichero {

    public static void main(String[] args) {
        // Fichero a leer con datos de ejemplo
        ArrayList<Empleado> empleados = new ArrayList<>();
        String idFichero = "RelPerCen.csv";

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;

        System.out.println("Leyendo el fichero: " + idFichero);

        try ( Scanner sc = new Scanner(new File(idFichero))) {
                 sc.nextLine();
            //while there is line for read
            while (sc.hasNextLine()) {
                //save the line in a String
                linea = sc.nextLine();
                //take every caracter and save it in a array of String
                tokens = linea.split(",");
                //recorrer el token and show the strings
                Empleado emp = new Empleado();
                emp.setNombre(tokens[0].substring(1).concat(tokens[1]));
                emp.setDni(tokens[2]);
                emp.setPuesto(tokens[3]);
                emp.setFechaPosesion(LocalDate.parse(tokens[4]));
                emp.setTelefono(tokens[5]);
                emp.setEvaluador(Boolean.parseBoolean(tokens[6]));
                emp.setCoordinador(Boolean.parseBoolean(tokens[7]));
                empleados.add(emp);
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
