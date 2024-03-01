package com.example.gestionpracticas;

import com.example.modelos.Alumno;
import com.example.modelos.Empresa;
import com.example.modelos.Practicas;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.stage.Stage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testfx.api.FxToolkit;
import org.testfx.framework.junit5.ApplicationTest;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;



/**
 * Pruebas unitarias para la clase HelloController.
 */

public class HelloControllerTest extends ApplicationTest {

    private HelloController helloController;

    /**
     * Configura el entorno de prueba antes de cada caso de prueba.
     * @throws Exception Excepción lanzada si hay un problema durante la configuración.
     */
    @BeforeEach
    public void setUp() throws Exception {

        // Configura la escena y el escenario aquí si es necesario
        helloController = new HelloController();
        Scene scene = new Scene(new Parent() {});
        Stage stage = new Stage();
        stage.setScene(scene);
        FxToolkit.registerPrimaryStage();


    }
    /**
     * Prueba para el caso en que el ID del puesto de práctica ya existe.
     */
    @Test
    public void testAsignarPuestoPractica_IdPuestoRepetido() {
        // Simula el caso donde el ID del puesto ya existe
        Practicas practicaExistente = new Practicas(1, new Empresa(1, "Empresa1", "Responsable1", "Dirección1"),
                new Alumno("123456", "Estudiante1", 123, false),
                LocalDate.now(), LocalDate.now().plusDays(7), "Responsable1");
        helloController.getListPracticas().add(practicaExistente);

        // Ejecuta el método con un ID repetido
        helloController.asignarPracticas(new ActionEvent());

        // Verifica que la lista de prácticas no se haya actualizado
        assertEquals(1, helloController.getListPracticas().size());
    }
    /**
     * Prueba para el caso en que el alumno está vacío al intentar asignar prácticas.
     */
    @Test
    public void testAsignarPuestoPractica_AlumnoVacio() {
        // Simula el caso donde el alumno está vacío
        helloController.getListAlumnos().clear();

        // Ejecuta el método con el alumno vacío
        helloController.asignarPracticas(new ActionEvent());

        // Verifica que la lista de prácticas no se haya actualizado
        assertEquals(0, helloController.getListPracticas().size());
    }
    /**
     * Prueba para el caso en que la empresa está vacía al intentar asignar prácticas.
     */
    @Test
    public void testAsignarPuestoPractica_EmpresaVacia() {
        // Simula el caso donde la empresa está vacía
        helloController.getListEmpresas().clear();

        // Ejecuta el método con la empresa vacía
        helloController.asignarPracticas(new ActionEvent());

        // Verifica que la lista de prácticas no se haya actualizado
        assertEquals(0, helloController.getListPracticas().size());
    }
    /**
     * Prueba para el caso en que la fecha de inicio es mayor que la fecha de fin al asignar prácticas.
     */
    @Test
    public void testAsignarPuestoPractica_FechaInicioMayorFechaFin() {
        // Simula el caso donde la fecha de inicio es mayor que la fecha de fin
        helloController.setFechaInicio(new DatePicker(LocalDate.now()));
        helloController.setFechaFinal(new DatePicker(LocalDate.now().minusDays(7)));

        // Ejecuta el método con fechas incorrectas
        helloController.asignarPracticas(new ActionEvent());

        // Verifica que la lista de prácticas no se haya actualizado
        assertEquals(0, helloController.getListPracticas().size());
    }
    /**
     * Prueba para el caso en que el ID de la empresa ya existe al dar de alta una empresa.
     */
    @Test
    public void testAltaEmpresa_IdEmpresaRepetido() {
        // Simula el caso donde el ID de empresa ya existe
        Empresa empresaExistente = new Empresa(1, "Empresa1", "Responsable1", "Dirección1");
        helloController.getListEmpresas().add(empresaExistente);

        // Ejecuta el método con un ID repetido
        helloController.anyadirEmpresaLista(new ActionEvent());

        // Verifica que la lista de empresas no se haya actualizado
        assertEquals(1, helloController.getListEmpresas().size());
    }
    /**
     * Prueba para el caso en que el DNI del alumno ya existe al dar de alta un alumno.
     */
    @Test
    public void testAltaAlumno_DniRepetido() {
        // Simula el caso donde el DNI del alumno ya existe
        Alumno alumnoExistente = new Alumno("123456", "Estudiante1", 123, false);
        helloController.getListAlumnos().add(alumnoExistente);

        // Ejecuta el método con un DNI repetido
        helloController.anyadirAlumnos(new ActionEvent());

        // Verifica que la lista de alumnos no se haya actualizado
        assertEquals(1, helloController.getListAlumnos().size());
    }
}