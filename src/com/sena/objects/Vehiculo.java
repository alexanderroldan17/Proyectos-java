package com.sena.objects;

public class Vehiculo {
    String placa;
    String modelo;
    String marca;
    String Color;
    String propietario;

    public Vehiculo(){

    }
    public Vehiculo(String placa) {
        this .placa=placa;
    }

    public Vehiculo(String placa, String modelo, String marca, String color, String propietario){
        this.placa=placa;
        this.modelo=modelo;
        this.marca=marca;
        this.Color=color;
        this.propietario=propietario;

    }



    public void setplaca (String placaL){
        this.placa=placaL;
    }
    public String getPlaca (){
        return  this.placa;
    }



    public void setmodelo (String modeloL) {
        this.modelo = modeloL;
    }

    public String getmodelo() {
        return this.modelo;
    }



    public void setmarca (String marcaL){
        this.marca=marcaL;
    }

    public String getMarca() {
        return this.marca;
    }



    public void setColor (String colorl){
        this.Color=colorl;
    }
    public String getColor(){
        return  this. Color ;
    }


    public void setPropietario (String propietariol){
        this.propietario=propietariol;
    }
    public String getPropietario (){
        return  this.propietario;
    }




}