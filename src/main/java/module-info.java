module com.example.task01 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.task01 to javafx.fxml;
    exports com.example.task01;
}