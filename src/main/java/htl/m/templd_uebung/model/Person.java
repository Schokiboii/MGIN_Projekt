/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htl.m.templd_uebung.model;

/**
 *
 * @author pilge
 */
public class Person {
    private int id;
    private String vn;
    private String nn;
    private int[] image;
    private int width;
    private int height;
    private int groesse;
    private double gewicht;
    private double bmi;
    private double ffmi;

    public Person() {
    }

    public Person(int id, String vn, String nn, int[] image, int width, int height, int groesse, double gewicht, double bmi, double ffmi) {
        this.id = id;
        this.vn = vn;
        this.nn = nn;
        this.image = image;
        this.width = width;
        this.height = height;
        this.groesse = groesse;
        this.gewicht = gewicht;
        this.bmi = bmi;
        this.ffmi = ffmi;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getGroesse() {
        return groesse;
    }

    public void setGroesse(int groesse) {
        this.groesse = groesse;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public double getFfmi() {
        return ffmi;
    }

    public void setFfmi(double ffmi) {
        this.ffmi = ffmi;
    }
    
    public int[] getImage() {
        return image;
    }

    public void setImage(int[] image) {
        this.image = image;
    }

   

    
    public int getId() {
        return id;
    }



    
    public void setId(int id) {
        this.id = id;
    }

    public String getVn() {
        return vn;
    }

    public void setVn(String vn) {
        this.vn = vn;
    }

    public String getNn() {
        return nn;
    }

    public void setNn(String nn) {
        this.nn = nn;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", vn=" + vn + ", nn=" + nn + ", image=" + image + ", width=" + width + ", height=" + height + ", groesse=" + groesse + ", gewicht=" + gewicht + ", bmi=" + bmi + ", ffmi=" + ffmi + '}';
    }

   
    
}

