/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iespuerto.pro.propietarioscasasfx.model;

import java.util.ArrayList;

/**
 *
 * @author Jonay
 */
public class Casa {
    
    private String ref_catastral;  
    private int metros;
    private double precio;
//    private ArrayList<Propietario> propietarios;
    
    //Direccion
    private String calle;
    private int numero;
    private String municipio;
    private String provincia;
    private String codigo_postal;

    public Casa() {
    }

    public Casa(String ref_catastral, int metros, double precio) {
        this.ref_catastral = ref_catastral;
        this.metros = metros;
        this.precio = precio;
//        this.propietarios = new ArrayList();
    }
    
    public Casa(String ref_catastral, String calle, int numero, String municipio, String provincia, int metros, double precio) {
        this.ref_catastral = ref_catastral;
        this.calle = calle;
        this.numero = numero;
        this.municipio = municipio;
        this.provincia = provincia;
        this.metros = metros;
        this.precio = precio;
    }

    public String getRef_catastral() {
        return ref_catastral;
    }

    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }

    public String getMunicipio() {
        return municipio;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getCodigo_postal() {
        return codigo_postal;
    }

    public int getMetros() {
        return metros;
    }

    public double getPrecio() {
        return precio;
    }

//    public ArrayList<Propietario> getPropietarios() {
//        return propietarios;
//    }

    public void setRef_catastral(String ref_catastral) {
        this.ref_catastral = ref_catastral;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setCodigo_postal(String codigo_postal) {
        this.codigo_postal = codigo_postal;
    }

    public void setMetros(int metros) {
        this.metros = metros;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

//    public void setPropietarios(Propietario propietario) {
//        this.propietarios.add(propietario);
//    }
    
    
    @Override
    public String toString() {
        return "Casa{" + "ref_catastral=" + ref_catastral + ", metros=" + metros + ", precio=" + precio + '}';
    }
}
