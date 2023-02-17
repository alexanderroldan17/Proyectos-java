package com.sena.objects;

public class Producto {

    String nombre;
    String color;
    float precio;




    public Producto(String nombre, String color, float precio){
        this.nombre =nombre;
        this.color =color;
        this.precio=precio;
    }

    public void setNombre(String nombrel){
        this.nombre=nombrel;
    }
    public String getNombre(){
        return this.nombre;
    }



    public void setColor(String colorl){
        this.color=colorl;
    }
    public String getColor(){
        return this.color;
    }



    public void setPrecio(String preciol){
        this.precio=preciol;
    }
    public String getPrecio(){
        return this.precio;
    }






}
