/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea7A;

import java.time.LocalDate;

/**
 *
 * @author hinda
 */
public class Empleado {
    //clase POJO
    //Atributos
    private String nombre;
    private String dni;
    private String puesto;
    private LocalDate fechaPosesion;
    private String telefono;
    private boolean evaluador;
    private boolean coordinador;
    
    //constrector
    public Empleado() {
    }

    public Empleado(String nombre, String dni, String puesto, LocalDate fechaPosesion, String telefono, boolean evaluador, boolean coordinador) {
        this.nombre = nombre;
        this.dni = dni;
        this.puesto = puesto;
        this.fechaPosesion = fechaPosesion;
        this.telefono = telefono;
        this.evaluador = evaluador;
        this.coordinador = coordinador;
    }
    
    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public LocalDate getFechaPosesion() {
        return fechaPosesion;
    }

    public void setFechaPosesion(LocalDate fechaPosesion) {
        this.fechaPosesion = fechaPosesion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isEvaluador() {
        return evaluador;
    }

    public void setEvaluador(boolean evaluador) {
        this.evaluador = evaluador;
    }

    public boolean isCoordinador() {
        return coordinador;
    }

    public void setCoordinador(boolean coordinador) {
        this.coordinador = coordinador;
    }
    
    //toString

    @Override
    public String toString() {
        return nombre + ";" + dni + ";" + puesto + ";" + fechaPosesion + ";" + telefono + ";" + evaluador + ";" + coordinador;
    }
    
    
}
