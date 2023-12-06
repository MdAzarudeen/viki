module com.example.dummy {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dummy to javafx.fxml;
    exports com.example.dummy;
}