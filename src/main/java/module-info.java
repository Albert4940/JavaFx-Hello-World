module com.example.demo_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demo_1 to javafx.fxml;
    exports com.example.demo_1;
}