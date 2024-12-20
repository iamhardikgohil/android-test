package com.example.quotes;

public class Quote {
    private int id;
    private String qoute;
    private String source;
    private String religion;

    public Quote(int id, String qoute, String source, String religion) {
        this.id = id;
        this.qoute = qoute;
        this.source = source;
        this.religion = religion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQoute() {
        return qoute;
    }

    public void setQoute(String qoute) {
        this.qoute = qoute;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }
}
