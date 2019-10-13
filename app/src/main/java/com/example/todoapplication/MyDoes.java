package com.example.todoapplication;

public class MyDoes {
    String titledoes;
    String descdoes;
    String date;

    public MyDoes() {
    }

    public MyDoes(String titledoes, String descdoes, String date) {
        this.titledoes = titledoes;
        this.descdoes = descdoes;
        this.date = date;
    }

    public String getTitledoes() {
        return titledoes;
    }

    public void setTitledoes(String titledoes) {
        this.titledoes = titledoes;
    }

    public String getDescdoes() {
        return descdoes;
    }

    public void setDescdoes(String descdoes) {
        this.descdoes = descdoes;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
