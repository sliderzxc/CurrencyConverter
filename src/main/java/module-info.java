module com.main.currencyconvertor {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires com.fasterxml.jackson.databind;

    opens com.main.currencyconvertor to javafx.fxml;
    exports com.main.currencyconvertor;
    exports com.main.currencyconvertor.presentation.ui;
    opens com.main.currencyconvertor.presentation.ui to javafx.fxml;
    exports com.main.currencyconvertor.data.entity to com.fasterxml.jackson.databind;
}