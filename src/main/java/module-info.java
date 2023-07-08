module com.example.datastructuresandalgorithmsexercise {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.datastructuresandalgorithmsexercise to javafx.fxml;
    exports com.example.datastructuresandalgorithmsexercise;
}