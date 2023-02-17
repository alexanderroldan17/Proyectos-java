package com.sena;

import com.sena.objects.Producto;
import com.sena.objects.Vehiculo;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Vehiculo v = new Vehiculo();
        Vehiculo v2 = new Vehiculo("sjy77a");
        Vehiculo v3 = new Vehiculo("syj77a","2020","mazda","rojo","carlos");
        Producto p1=new Producto("cartulina","verde",8000);
        v.setplaca("sjy77a");
        v.setmodelo("2020");
        v.setmarca("Ferrari");
        v.setColor("Rojo");
        v.setPropietario("carlos arturo");


        System.out.println("la placa es : "+v.getPlaca());

        JOptionPane.showMessageDialog(null,"la placa es : "+v.getPlaca() + "El modelo es :  " +v.getmodelo() +"La marca es : "+v.getMarca()
        +"El color del carro es : "+v.getColor() + "El propietario del vehiculo es : "+v.getPropietario()
        );
    }
}
