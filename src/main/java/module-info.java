module com.example.kritylorinc_javafxrestclientdolgozat {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.kritylorinc_javafxrestclientdolgozat to javafx.fxml;
    exports com.example.kritylorinc_javafxrestclientdolgozat;
}