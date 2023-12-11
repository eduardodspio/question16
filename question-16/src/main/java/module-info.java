module question16.question16 {
    requires javafx.controls;
    requires javafx.fxml;


    opens question16.question16 to javafx.fxml;
    exports question16.question16;
}