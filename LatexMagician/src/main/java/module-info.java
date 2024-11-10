module com.example.latexmagician {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.latexmagician to javafx.fxml;
    exports com.example.latexmagician;
}