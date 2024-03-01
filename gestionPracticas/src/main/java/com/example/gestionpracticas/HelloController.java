package com.example.gestionpracticas;

import com.example.modelos.Alumno;
import com.example.modelos.Empresa;
import com.example.modelos.Practicas;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase controladora para la aplicación principal.
 */
public class HelloController {

    // Lista de Alumnos
    @FXML
    private ListView<Alumno> alumnos;
    List<Alumno> listAlumnos = new ArrayList<>();

    // Lista de Empresas
    @FXML
    private ListView<Empresa> empresas;
    List<Empresa> listEmpresas = new ArrayList<>();

    // DatePickers para las fechas de inicio y fin de prácticas
    @FXML
    private DatePicker fechaFinal;
    @FXML
    private DatePicker fechaInicio;

    // Lista de Prácticas
    @FXML
    private ListView<Practicas> practicas;
    List<Practicas> listPracticas = new ArrayList<>();

    // Campos de texto para añadir una nueva Empresa
    @FXML
    private TextField direccionDarAltaEmpresa;
    @FXML
    private TextField idDarAltaEmpresa;
    @FXML
    private TextField nombreDarAltaEmpresa;
    @FXML
    private TextField responsableDarAltaEmpresa;

    // Campos de texto para añadir un nuevo Alumno
    @FXML
    private TextField dniDarAltaAlumno;
    @FXML
    private TextField nombreDarAltaAlumno;
    @FXML
    private TextField telefonoAltaAlumno;


    /**
     * Obtiene la lista de alumnos como un objeto ListView.
     *
     * @return La lista de alumnos.
     */
    public ListView<Alumno> getAlumnos() {
        return alumnos;
    }

    /**
     * Establece la lista de alumnos utilizando un objeto ListView.
     *
     * @param alumnos La lista de alumnos a establecer.
     */
    public void setAlumnos(ListView<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    /**
     * Obtiene la lista de alumnos como una lista estándar.
     *
     * @return La lista de alumnos.
     */
    public List<Alumno> getListAlumnos() {
        return listAlumnos;
    }

    /**
     * Establece la lista de alumnos utilizando una lista estándar.
     *
     * @param listAlumnos La lista de alumnos a establecer.
     */
    public void setListAlumnos(List<Alumno> listAlumnos) {
        this.listAlumnos = listAlumnos;
    }

    /**
     * Obtiene la lista de empresas como un objeto ListView.
     *
     * @return La lista de empresas.
     */
    public ListView<Empresa> getEmpresas() {
        return empresas;
    }

    /**
     * Establece la lista de empresas utilizando un objeto ListView.
     *
     * @param empresas La lista de empresas a establecer.
     */
    public void setEmpresas(ListView<Empresa> empresas) {
        this.empresas = empresas;
    }

    /**
     * Obtiene la lista de empresas como una lista estándar.
     *
     * @return La lista de empresas.
     */
    public List<Empresa> getListEmpresas() {
        return listEmpresas;
    }

    /**
     * Establece la lista de empresas utilizando una lista estándar.
     *
     * @param listEmpresas La lista de empresas a establecer.
     */
    public void setListEmpresas(List<Empresa> listEmpresas) {
        this.listEmpresas = listEmpresas;
    }

    /**
     * Obtiene la fecha final como un objeto DatePicker.
     *
     * @return La fecha final.
     */
    public DatePicker getFechaFinal() {
        return fechaFinal;
    }

    /**
     * Establece la fecha final utilizando un objeto DatePicker.
     *
     * @param fechaFinal La fecha final a establecer.
     */
    public void setFechaFinal(DatePicker fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    /**
     * Obtiene la fecha de inicio como un objeto DatePicker.
     *
     * @return La fecha de inicio.
     */
    public DatePicker getFechaInicio() {
        return fechaInicio;
    }

    /**
     * Establece la fecha de inicio utilizando un objeto DatePicker.
     *
     * @param fechaInicio La fecha de inicio a establecer.
     */
    public void setFechaInicio(DatePicker fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * Obtiene la lista de prácticas como un objeto ListView.
     *
     * @return La lista de prácticas.
     */
    public ListView<Practicas> getPracticas() {
        return practicas;
    }

    /**
     * Establece la lista de prácticas utilizando un objeto ListView.
     *
     * @param practicas La lista de prácticas a establecer.
     */
    public void setPracticas(ListView<Practicas> practicas) {
        this.practicas = practicas;
    }

    /**
     * Obtiene la lista de prácticas como una lista estándar.
     *
     * @return La lista de prácticas.
     */
    public List<Practicas> getListPracticas() {
        return listPracticas;
    }

    /**
     * Establece la lista de prácticas utilizando una lista estándar.
     *
     * @param listPracticas La lista de prácticas a establecer.
     */
    public void setListPracticas(List<Practicas> listPracticas) {
        this.listPracticas = listPracticas;
    }

    /**
     * Obtiene el campo de texto de dirección para dar de alta una empresa.
     *
     * @return El campo de texto de dirección.
     */
    public TextField getDireccionDarAltaEmpresa() {
        return direccionDarAltaEmpresa;
    }

    /**
     * Establece el campo de texto de dirección para dar de alta una empresa.
     *
     * @param direccionDarAltaEmpresa El campo de texto de dirección a establecer.
     */
    public void setDireccionDarAltaEmpresa(TextField direccionDarAltaEmpresa) {
        this.direccionDarAltaEmpresa = direccionDarAltaEmpresa;
    }

    /**
     * Obtiene el campo de texto de ID para dar de alta una empresa.
     *
     * @return El campo de texto de ID.
     */
    public TextField getIdDarAltaEmpresa() {
        return idDarAltaEmpresa;
    }

    /**
     * Establece el campo de texto de ID para dar de alta una empresa.
     *
     * @param idDarAltaEmpresa El campo de texto de ID a establecer.
     */
    public void setIdDarAltaEmpresa(TextField idDarAltaEmpresa) {
        this.idDarAltaEmpresa = idDarAltaEmpresa;
    }

    /**
     * Obtiene el campo de texto de nombre para dar de alta una empresa.
     *
     * @return El campo de texto de nombre.
     */
    public TextField getNombreDarAltaEmpresa() {
        return nombreDarAltaEmpresa;
    }

    /**
     * Establece el campo de texto de nombre para dar de alta una empresa.
     *
     * @param nombreDarAltaEmpresa El campo de texto de nombre a establecer.
     */
    public void setNombreDarAltaEmpresa(TextField nombreDarAltaEmpresa) {
        this.nombreDarAltaEmpresa = nombreDarAltaEmpresa;
    }

    /**
     * Obtiene el campo de texto del responsable para dar de alta una empresa.
     *
     * @return El campo de texto del responsable.
     */
    public TextField getResponsableDarAltaEmpresa() {
        return responsableDarAltaEmpresa;
    }

    /**
     * Establece el campo de texto del responsable para dar de alta una empresa.
     *
     * @param responsableDarAltaEmpresa El campo de texto del responsable a establecer.
     */
    public void setResponsableDarAltaEmpresa(TextField responsableDarAltaEmpresa) {
        this.responsableDarAltaEmpresa = responsableDarAltaEmpresa;
    }

    /**
     * Obtiene el campo de texto del DNI para dar de alta un alumno.
     *
     * @return El campo de texto del DNI.
     */
    public TextField getDniDarAltaAlumno() {
        return dniDarAltaAlumno;
    }

    /**
     * Establece el campo de texto del DNI para dar de alta un alumno.
     *
     * @param dniDarAltaAlumno El campo de texto del DNI a establecer.
     */
    public void setDniDarAltaAlumno(TextField dniDarAltaAlumno) {
        this.dniDarAltaAlumno = dniDarAltaAlumno;
    }

    /**
     * Obtiene el campo de texto del nombre para dar de alta un alumno.
     *
     * @return El campo de texto del nombre.
     */
    public TextField getNombreDarAltaAlumno() {
        return nombreDarAltaAlumno;
    }

    /**
     * Establece el campo de texto del nombre para dar de alta un alumno.
     *
     * @param nombreDarAltaAlumno El campo de texto del nombre a establecer.
     */
    public void setNombreDarAltaAlumno(TextField nombreDarAltaAlumno) {
        this.nombreDarAltaAlumno = nombreDarAltaAlumno;
    }

    /**
     * Obtiene el campo de texto del teléfono para dar de alta un alumno.
     *
     * @return El campo de texto del teléfono.
     */
    public TextField getTelefonoAltaAlumno() {
        return telefonoAltaAlumno;
    }

    /**
     * Establece el campo de texto del teléfono para dar de alta un alumno.
     *
     * @param telefonoAltaAlumno El campo de texto del teléfono a establecer.
     */
    public void setTelefonoAltaAlumno(TextField telefonoAltaAlumno) {
        this.telefonoAltaAlumno = telefonoAltaAlumno;
    }

    /**
     * Agrega una nueva Empresa a la lista.
     *
     * @param event ActionEvent desencadenado por el clic en el botón.
     */
    public void anyadirEmpresaLista(ActionEvent event) {
        if (idDarAltaEmpresa == null || nombreDarAltaEmpresa == null || responsableDarAltaEmpresa == null || direccionDarAltaEmpresa == null) {
            System.out.println("ERROR AL AÑADIR EMPRESA LLENA TODOS LOS CAMOPOS ");
        } else {
            int idempresas = Integer.parseInt(idDarAltaEmpresa.getText());
            Empresa emp = new Empresa(idempresas, nombreDarAltaEmpresa.getText(), responsableDarAltaEmpresa.getText(), direccionDarAltaEmpresa.getText());
            listEmpresas.add(emp);
            ObservableList<Empresa> obEmp = FXCollections.observableList(listEmpresas);
            empresas.setItems(obEmp);
            idDarAltaEmpresa.clear();
            nombreDarAltaEmpresa.clear();
            responsableDarAltaEmpresa.clear();
            direccionDarAltaEmpresa.clear();
                }
    }

    /**
     * Agrega un nuevo Alumno a la lista.
     *
     * @param event ActionEvent desencadenado por el clic en el botón.
     */
    public void anyadirAlumnos(ActionEvent event) {
        if (dniDarAltaAlumno == null || nombreDarAltaAlumno == null || telefonoAltaAlumno == null) {
            System.out.println("ERROR AL AÑADIR ALUMNO LLENA TODOS LOS CAMOPOS");
        } else {
            int telefonoAlumnos = Integer.parseInt(telefonoAltaAlumno.getText());
            Alumno alu = new Alumno(dniDarAltaAlumno.getText(), nombreDarAltaAlumno.getText(), telefonoAlumnos, false);
            listAlumnos.add(alu);
            ObservableList<Alumno> obAlu = FXCollections.observableList(listAlumnos);
            alumnos.setItems(obAlu);
            dniDarAltaAlumno.clear();
            nombreDarAltaAlumno.clear();
            telefonoAltaAlumno.clear();
        }
    }

    /**
     * Asigna prácticas a la Empresa y Alumno seleccionados con las fechas de inicio y fin especificadas.
     *
     * @param event ActionEvent desencadenado por el clic en el botón.
     */
    @FXML
    void asignarPracticas(ActionEvent event) {
        int i1 = empresas.getSelectionModel().getSelectedIndex();
        int i2 = alumnos.getSelectionModel().getSelectedIndex();
        if(fechaInicio==null||fechaFinal==null||i1<=-1||i2<=-1){
            System.out.println("ERROR AL AÑADIR UNA PRACTICA LLENA LOS CAmPOS DE FECHA INICIO Y DE FECHA FINAL Y SELECCIONA LA EMPRESA CON EL ALUMNO QUE VA HACER LAS PRACTICAS");
        }else{
            LocalDate fechaIni = fechaInicio.getValue();
            LocalDate fechaFin = fechaFinal.getValue();
            Practicas pra = new Practicas(i1, empresas.getItems().get(i1), alumnos.getItems().get(i2), fechaIni, fechaFin, empresas.getItems().get(i1).getResponsable());
            alumnos.getItems().get(i2).setAsignado(true);
            listPracticas.add(pra);
            ObservableList<Practicas> obPra = FXCollections.observableList(listPracticas);
            practicas.setItems(obPra);
            abrirVentanaModal();
        }

    }

    /**
     * Método privado para abrir una ventana modal de éxito.
     * Se utiliza para mostrar información sobre la asignación exitosa de prácticas a un alumno.
     */
    private void abrirVentanaModal() {
        // Crear una instancia de la clase Alert para mostrar un cuadro de diálogo informativo
        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        // Establecer el título del cuadro de diálogo
        alert.setTitle("EXITO");

        // Establecer el encabezado del cuadro de diálogo como nulo para no mostrar encabezado
        alert.setHeaderText(null);

        // Establecer el texto de contenido del cuadro de diálogo con el mensaje de éxito
        alert.setContentText("SE HA ASIGNADO LAS PRACTICAS CORRECTAMENTE AL ALUMNO");

        // Mostrar el cuadro de diálogo informativo y esperar hasta que el usuario lo cierre
        alert.showAndWait();
    }

    /**
     * Elimina las prácticas seleccionadas de la lista.
     *
     * @param event ActionEvent desencadenado por el clic en el botón.
     */
    @FXML
    void delete(ActionEvent event) {
        int i = practicas.getSelectionModel().getSelectedIndex();
        if (i != -1) {
            practicas.getItems().remove(i);
            practicas.getSelectionModel().select(-1);
            practicas.getItems().get(i).getAlumno().setAsignado(false);
        }
    }
}


