module com.example.dictionarysagar11dec {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dictionarysagar11dec to javafx.fxml;
    exports com.example.dictionarysagar11dec;
}