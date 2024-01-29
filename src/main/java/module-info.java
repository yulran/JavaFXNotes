module com.example.demojavafx13dz {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.demojavafx13dz to javafx.fxml;
    exports com.example.demojavafx13dz;
}