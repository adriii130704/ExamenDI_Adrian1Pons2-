package com.example.modelos;

/**
 * Clase que representa a una empresa.
 */
public class Empresa {
    private int id_empresa;     // Identificador único de la empresa
    private String nombre;      // Nombre de la empresa
    private String responsable; // Nombre del responsable de la empresa
    private String direccion;   // Dirección de la empresa

    /**
     * Constructor para la clase Empresa.
     *
     * @param id_empresa  Identificador único de la empresa.
     * @param nombre      Nombre de la empresa.
     * @param responsable Nombre del responsable de la empresa.
     * @param direccion   Dirección de la empresa.
     */
    public Empresa(int id_empresa, String nombre, String responsable, String direccion) {
        this.id_empresa = id_empresa;
        this.nombre = nombre;
        this.responsable = responsable;
        this.direccion = direccion;
    }

    /**
     * Obtiene el identificador único de la empresa.
     *
     * @return Identificador único de la empresa.
     */
    public int getId_empresa() {
        return id_empresa;
    }

    /**
     * Establece el identificador único de la empresa.
     *
     * @param id_empresa Identificador único de la empresa.
     */
    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }

    /**
     * Obtiene el nombre del responsable de la empresa.
     *
     * @return Nombre del responsable de la empresa.
     */
    public String getResponsable() {
        return responsable;
    }

    /**
     * Establece el nombre del responsable de la empresa.
     *
     * @param responsable Nombre del responsable de la empresa.
     */
    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    /**
     * Obtiene la dirección de la empresa.
     *
     * @return Dirección de la empresa.
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección de la empresa.
     *
     * @param direccion Dirección de la empresa.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtiene el nombre de la empresa.
     *
     * @return Nombre de la empresa.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la empresa.
     *
     * @param nombre Nombre de la empresa.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Representación en cadena del objeto Empresa (utilizado en la interfaz de usuario, por ejemplo, en listas).
     *
     * @return Representación en cadena del nombre de la empresa.
     */
    @Override
    public String toString() {
        return nombre;
    }
}