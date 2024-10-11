module com.example.lab1nawaz {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.lab1nawaz to javafx.fxml;
    exports com.example.lab1nawaz;
}