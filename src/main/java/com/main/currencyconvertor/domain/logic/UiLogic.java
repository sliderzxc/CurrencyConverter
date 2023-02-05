package com.main.currencyconvertor.domain.logic;

import com.main.currencyconvertor.data.entity.CurrencyData;
import com.main.currencyconvertor.domain.service.NetworkService;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

import java.text.DecimalFormat;

public class UiLogic {

    NetworkService networkService = new NetworkService();

    String[] currencies = {
            "AED", "AFN", "ALL", "AMD", "ANG", "AOA", "ARS", "AUD", "AWG", "AZN", "BAM", "BBD", "BDT", "BGN", "BHD", "BIF",
            "BMD", "BND", "BOB", "BRL", "BSD", "BTN", "BWP", "BYN", "BZD", "CAD", "CDF", "CHF", "CLP", "CNY", "COP", "CRC",
            "CUP", "CVE", "CZK", "DJF", "DKK", "DOP", "DZD", "EGP", "ERN", "ETB", "EUR", "FJD", "FKP", "FOK", "GBP", "GEL",
            "GGP", "GHS", "GIP", "GMD", "GNF", "GTQ", "GYD", "HKD", "HNL", "HRK", "HTG", "HUF", "IDR", "ILS", "IMP", "INR",
            "IQD", "IRR", "ISK", "JMD", "JOD", "JPY", "KES", "KGS", "KHR", "KID", "KMF", "KRW", "KWD", "KYD", "KZT", "LAK",
            "LBP", "LKR", "LRD", "LSL", "LYD", "MAD", "MDL", "MGA", "MKD", "MMK", "MNT", "MOP", "MRU", "MUR", "MVR", "MWK",
            "MXN", "MYR", "MZN", "NAD", "NGN", "NIO", "NOK", "NPR", "NZD", "OMR", "PAB", "PEN", "PGK", "PHP", "PKR", "PLN",
            "PYG", "QAR", "RON", "RSD", "RUB", "RWF", "SAR", "SBD", "SCR", "SDG", "SEK", "SGD", "SHP", "SLE", "SOS", "SRD",
            "SSP", "STN", "SYP", "SZL", "THB", "TJS", "TMT", "TND", "TOP", "TRY", "TTD", "TVD", "TWD", "TZS", "UAH", "UGX",
            "USD", "UYU", "UZS", "VES", "VND", "VUV", "WST", "XAF", "XCD", "XDR", "XOF", "XPF", "YER", "ZAR", "ZMW", "ZWL"
    };

    public void initChooseBoxes(ChoiceBox<String> cbFromCurrent, ChoiceBox<String> cbToCurrent) {
        cbFromCurrent.getItems().setAll(currencies);
        cbFromCurrent.setValue("USD");
        cbToCurrent.getItems().setAll(currencies);
        cbToCurrent.setValue("EUR");
    }

    public void btnConvertClickListener(
            ChoiceBox<String> cbFromCurrency,
            ChoiceBox<String> cbToCurrency,
            TextField etFromCurrency,
            TextField etToCurrency
    ) {
        String fromCurrency = cbFromCurrency.getValue();
        String toCurrency = cbToCurrency.getValue();
        CurrencyData currencyData = networkService.convertCurrency(fromCurrency, toCurrency);
        Double value = Double.parseDouble(etFromCurrency.getText().replace(",", "."));
        String result = String.format("%.2f", value*currencyData.getConversion_rate()).replace(",", ".");
        etToCurrency.setText(result);
    }
}