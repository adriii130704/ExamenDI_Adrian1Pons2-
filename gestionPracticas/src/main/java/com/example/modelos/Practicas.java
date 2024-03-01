package com.example.modelos;

import java.time.LocalDate;

/**
 * Clase que representa un puesto de prácticas.
 */
public class Practicas {

    private int id_puesto;              // Identificador único del puesto de prácticas
    private Empresa empresa;            // Empresa asociada al puesto de prácticas
    private Alumno alumno;              // Alumno asignado al puesto de prácticas
    private LocalDate dateInicio;       // Fecha de inicio de las prácticas
    private LocalDate dataFin;          // Fecha de fin de las prácticas
    private String resposablePuesto;    // Responsable del puesto de prácticas

    /**
     * Constructor para la clase Practicas.
     *
     * @param id_puesto         Identificador único del puesto de prácticas.
     * @param empresa           Empresa asociada al puesto de prácticas.
     * @param alumno            Alumno asignado al puesto de prácticas.
     * @param dateInicio        Fecha de inicio de las prácticas.
     * @param dataFin           Fecha de fin de las prácticas.
     * @param resposablePuesto Responsable del puesto de prácticas.
     */
    public Practicas(int id_puesto, Empresa empresa, Alumno alumno, LocalDate dateInicio, LocalDate dataFin, String resposablePuesto) {
        this.id_puesto = id_puesto;
        this.empresa = empresa;
        this.alumno = alumno;
        this.dateInicio = dateInicio;
        this.dataFin = dataFin;
        this.resposablePuesto = resposablePuesto;
    }

    /**
     * Obtiene el identificador único del puesto de prácticas.
     *
     * @return Identificador único del puesto de prácticas.
     */
    public int getId_puesto() {
        return id_puesto;
    }

    /**
     * Establece el identificador único del puesto de prácticas.
     *
     * @param id_puesto Identificador único del puesto de prácticas.
     */
    public void setId_puesto(int id_puesto) {
        this.id_puesto = id_puesto;
    }

    /**
     * Obtiene la empresa asociada al puesto de prácticas.
     *
     * @return Empresa asociada al puesto de prácticas.
     */
    public Empresa getEmpresa() {
        return empresa;
    }

    /**
     * Establece la empresa asociada al puesto de prácticas.
     *
     * @param empresa Empresa asociada al puesto de prácticas.
     */
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    /**
     * Obtiene el alumno asignado al puesto de prácticas.
     *
     * @return Alumno asignado al puesto de prácticas.
     */
    public Alumno getAlumno() {
        return alumno;
    }

    /**
     * Establece el alumno asignado al puesto de prácticas.
     *
     * @param alumno Alumno asignado al puesto de prácticas.
     */
    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    /**
     * Obtiene la fecha de inicio de las prácticas.
     *
     * @return Fecha de inicio de las prácticas.
     */
    public LocalDate getDateInicio() {
        return dateInicio;
    }

    /**
     * Establece la fecha de inicio de las prácticas.
     *
     * @param dateInicio Fecha de inicio de las prácticas.
     */
    public void setDateInicio(LocalDate dateInicio) {
        this.dateInicio = dateInicio;
    }

    /**
     * Obtiene la fecha de fin de las prácticas.
     *
     * @return Fecha de fin de las prácticas.
     */
    public LocalDate getDataFin() {
        return dataFin;
    }

    /**
     * Establece la fecha de fin de las prácticas.
     *
     * @param dataFin Fecha de fin de las prácticas.
     */
    public void setDataFin(LocalDate dataFin) {
        this.dataFin = dataFin;
    }

    /**
     * Obtiene el responsable del puesto de prácticas.
     *
     * @return Responsable del puesto de prácticas.
     */
    public String getResposablePuesto() {
        return resposablePuesto;
    }

    /**
     * Establece el responsable del puesto de prácticas.
     *
     * @param resposablePuesto Responsable del puesto de prácticas.
     */
    public void setResposablePuesto(String resposablePuesto) {
        this.resposablePuesto = resposablePuesto;
    }

    /**
     * Representación en cadena del objeto Practicas (utilizado en la interfaz de usuario, por ejemplo, en listas).
     *
     * @return Representación en cadena de la empresa, el alumno, las fechas y el responsable del puesto de prácticas.
     */
    @Override
    public String toString() {
        return empresa + " - " + alumno + " - " + dateInicio + " - " + dataFin +
                " - " + resposablePuesto;
    }
}