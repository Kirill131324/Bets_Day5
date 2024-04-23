module com.example.bets_day3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;


    opens com.example.bets_day3 to javafx.fxml;
    exports com.example.bets_day3;
}