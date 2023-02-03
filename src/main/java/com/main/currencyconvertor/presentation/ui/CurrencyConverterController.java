package com.main.currencyconvertor.presentation.ui;

import com.main.currencyconvertor.domain.logic.UiLogic;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class CurrencyConverterController {

    @FXML
    private Button btnConvert;

    @FXML
    private ChoiceBox<String> cbFromCurrent;

    @FXML
    private ChoiceBox<String> cbToCurrent;

    @FXML
    private TextField etFromValue;

    @FXML
    private TextField etToValue;

    @FXML
    private AnchorPane mainLayout;

    @FXML
    private Label tvFrom;

    @FXML
    private Label tvTitle;

    @FXML
    private Label tvTo;

    @FXML
    void initialize() {
        UiLogic uiLogic = new UiLogic();
        uiLogic.initChooseBoxes(cbFromCurrent, cbToCurrent);
        btnConvert.setOnAction(event -> {
            uiLogic.btnConvertClickListener(cbFromCurrent, cbToCurrent, etFromValue, etToValue);
        });
    }
}