package com.main.currencyconvertor.data.entity;

public class CurrencyData {

    private String result;
    private String documentation;
    private String terms_of_use;
    private Long time_last_update_unix;
    private String time_last_update_utc;
    private Long time_next_update_unix;
    private String time_next_update_utc;
    private String base_code;
    private String target_code;
    private Double conversion_rate;

    public CurrencyData(
            String result,
            String documentation,
            String terms_of_use,
            Long time_last_update_unix,
            String time_last_update_utc,
            Long time_next_update_unix,
            String time_next_update_utc,
            String base_code,
            String target_code,
            Double conversion_rate
    ) {
        this.result = result;
        this.documentation = documentation;
        this.terms_of_use = terms_of_use;
        this.time_last_update_unix = time_last_update_unix;
        this.time_last_update_utc = time_last_update_utc;
        this.time_next_update_unix = time_next_update_unix;
        this.time_next_update_utc = time_next_update_utc;
        this.base_code = base_code;
        this.target_code = target_code;
        this.conversion_rate = conversion_rate;
    }

    public CurrencyData() {

    }

    public String getResult() {
        return result;
    }

    public String getDocumentation() {
        return documentation;
    }

    public String getTerms_of_use() {
        return terms_of_use;
    }

    public Long getTime_last_update_unix() {
        return time_last_update_unix;
    }

    public Long getTime_next_update_unix() {
        return time_next_update_unix;
    }

    public String getBase_code() {
        return base_code;
    }

    public Double getConversion_rate() {
        return conversion_rate;
    }

    public String getTarget_code() {
        return target_code;
    }

    public String getTime_last_update_utc() {
        return time_last_update_utc;
    }

    public String getTime_next_update_utc() {
        return time_next_update_utc;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setBase_code(String base_code) {
        this.base_code = base_code;
    }

    public void setConversion_rate(Double conversion_rate) {
        this.conversion_rate = conversion_rate;
    }

    public void setDocumentation(String documentation) {
        this.documentation = documentation;
    }

    public void setTarget_code(String target_code) {
        this.target_code = target_code;
    }

    public void setTerms_of_use(String terms_of_use) {
        this.terms_of_use = terms_of_use;
    }

    public void setTime_last_update_unix(Long time_last_update_unix) {
        this.time_last_update_unix = time_last_update_unix;
    }

    public void setTime_last_update_utc(String time_last_update_utc) {
        this.time_last_update_utc = time_last_update_utc;
    }

    public void setTime_next_update_unix(Long time_next_update_unix) {
        this.time_next_update_unix = time_next_update_unix;
    }

    public void setTime_next_update_utc(String time_next_update_utc) {
        this.time_next_update_utc = time_next_update_utc;
    }
}