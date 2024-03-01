module com.example.gestionpracticas {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gestionpracticas to javafx.fxml;
    exports com.example.gestionpracticas;
}