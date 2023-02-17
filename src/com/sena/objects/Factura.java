package com.sena.objects;

public class Factura {

    String detallefac;
    String nomcliente;
    float precio;
    float iva;
    float preciototal;

    public Factura (String detallefac, String nomcliente, float precio, float iva, float preciototal) {

        this.detallefac = detallefac;
        this.nomcliente = nomcliente;
        this.precio = precio;
        this.iva = iva;
        this.preciototal = preciototal;
    }

        public void setdetallefac (String detallefacl) {
        this.detallefac=detallefacl;}

        public String getDetallefac(){
            return this.detallefac;
        }


    public void setNomcliente (String nomclientel) {
        this.detallefac=nomclientel;}

    public String getNomcliente() {
        return this.nomcliente;

    }
        public void setPrecio (float preciol) {
            this.precio=preciol;
        }

        public float  getPrecio() {
            return this.precio;
        }


    }












}
