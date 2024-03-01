package com.example.modelos;

/**
 * Clase que representa a un alumno.
 */
public class Alumno {
    private String dni;         // DNI del alumno
    private String nombre;      // Nombre del alumno
    private int telefono;       // Número de teléfono del alumno
    private boolean asignado;   // Estado de asignación de prácticas para el alumno

    /**
     * Constructor para la clase Alumno.
     *
     * @param dni      DNI del alumno.
     * @param nombre   Nombre del alumno.
     * @param telefono Número de teléfono del alumno.
     * @param asignado Estado de asignación de prácticas para el alumno.
     */
    public Alumno(String dni, String nombre, int telefono, boolean asignado) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.asignado = asignado;
    }

    /**
     * Obtiene el DNI del alumno.
     *
     * @return DNI del alumno.
     */
    public String getDni() {
        return dni;
    }

    /**
     * Establece el DNI del alumno.
     *
     * @param dni DNI del alumno.
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Obtiene el nombre del alumno.
     *
     * @return Nombre del alumno.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del alumno.
     *
     * @param nombre Nombre del alumno.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de teléfono del alumno.
     *
     * @return Número de teléfono del alumno.
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * Establece el número de teléfono del alumno.
     *
     * @param telefono Número de teléfono del alumno.
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * Verifica si el alumno está asignado a prácticas.
     *
     * @return true si el alumno está asignado, false de lo contrario.
     */
    public boolean isAsignado() {
        return asignado;
    }

    /**
     * Establece el estado de asignación de prácticas para el alumno.
     *
     * @param asignado Estado de asignación de prácticas para el alumno.
     */
    public void setAsignado(boolean asignado) {
        this.asignado = asignado;
    }

    /**
     * Representación en cadena del objeto Alumno (utilizado en la interfaz de usuario, por ejemplo, en listas).
     *
     * @return Representación en cadena del nombre del alumno.
     */
    @Override
    public String toString() {
        return nombre;
    }
}