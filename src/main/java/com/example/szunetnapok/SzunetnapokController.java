package com.example.szunetnapok;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SzunetnapokController implements Initializable {
    @FXML public Spinner<Integer> spinner_year;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
            SpinnerValueFactory.IntegerSpinnerValueFactory integerSpinnerValueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(2020, 2030);
            spinner_year.setValueFactory(integerSpinnerValueFactory);
            spinner_year.getValueFactory().setValue(2026);
    }

    @FXML
    protected void onShowButtonClick() throws IOException, InterruptedException {
        Integer year = spinner_year.getValueFactory().getValue();
        YearHolidays yearHolidays = SzunetNapokApiClient.getYear(year);
    }
}