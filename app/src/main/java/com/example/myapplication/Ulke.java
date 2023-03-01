package com.example.myapplication;

public class Ulke
{
    private String Ulkeadi;
    private String Baskent;
    private int Bayrak;

    public Ulke(String ulkeadi, String baskent, int bayrak) {
        Ulkeadi = ulkeadi;
        Baskent = baskent;
        Bayrak = bayrak;
    }
    public String getUlkeadi(){return Ulkeadi;}
    public void setUlkeadi(String ulkeadi){this.Ulkeadi = ulkeadi; }
    public String getBaskent(){return Baskent;}
    public void setBaskent(String baskent){this.Baskent = baskent;}
    public int getBayrak(){return Bayrak;}
    public void setBayrak(int bayrak){this.Bayrak = bayrak;}
}
