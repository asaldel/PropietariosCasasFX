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
public class Almacen {
    
    private ArrayList<Propietario> propietarios_mostrados;
    private int posPropietarios = 0;
    private ArrayList<Casa> casas_mostradas;
    private int posCasas = 0;

    public Almacen() {
        this.propietarios_mostrados = new ArrayList();
        this.casas_mostradas = new ArrayList();
    }

    public void setPropietarios_mostrados() {
        this.propietarios_mostrados = Sentencias.queryAllPropietarios();
    }

    public Propietario propietarios_move(int num){
        Propietario propietarioResult = null;
        if(num == 0){
            if(posPropietarios - 1 >= 0){
                posPropietarios = posPropietarios - 1;
                propietarioResult=propietarios_mostrados.get(posPropietarios);
            }else{
                propietarioResult=propietarios_mostrados.get(posPropietarios);
            }
        }else if(num == 1){
           if(posPropietarios + 1 < propietarios_mostrados.size()){
                posPropietarios = posPropietarios + 1;
                propietarioResult=propietarios_mostrados.get(posPropietarios);
            }else{
                propietarioResult=propietarios_mostrados.get(posPropietarios);
            } 
        }
        return propietarioResult;
    }
    
    public void setCasas_mostradas() {
        this.casas_mostradas = Sentencias.queryAllCasas();
    }
    
    public Casa casas_move(int num){
        Casa casaResult = null;
        if(num == 0){
            if(posCasas - 1 >= 0){
                posCasas = posCasas - 1;
                casaResult=casas_mostradas.get(posCasas);
            }else{
                casaResult=casas_mostradas.get(posCasas);
            }
        }else if(num == 1){
           if(posCasas + 1 < casas_mostradas.size()){
                posCasas = posCasas + 1;
                casaResult=casas_mostradas.get(posCasas);
            }else{
                casaResult=casas_mostradas.get(posCasas);
            } 
        }
        return casaResult;
    }
    
    
    private ArrayList<Casa> casas_mostradas_propietario;
    private int posCasasPropietario = 0;
    
    public void setCasas_propietario(Propietario p) {
        this.casas_mostradas_propietario = Sentencias.queryCasas(p);
    }
    
    public Casa casasDePropietario_move(int num){
        Casa casaResult = null;
        if(num == 0){
            if(posCasasPropietario - 1 >= 0){
                posCasasPropietario = posCasasPropietario - 1;
                casaResult=casas_mostradas_propietario.get(posCasasPropietario);
            }else{
                casaResult=casas_mostradas_propietario.get(posCasasPropietario);
            }
        }else if(num == 1){
           if(posCasasPropietario + 1 < casas_mostradas_propietario.size()){
                posCasasPropietario = posCasasPropietario + 1;
                casaResult=casas_mostradas_propietario.get(posCasasPropietario);
            }else{
                casaResult=casas_mostradas_propietario.get(posCasasPropietario);
            } 
        }
        return casaResult;
    }
    
    
    
    private ArrayList<Propietario> propietarios_casas_mostrados;
    private int posPropietariosCasas = 0;
    
    public void setPropietarios_casas_mostrados(Casa c) {
        this.propietarios_casas_mostrados = Sentencias.queryPropietarios(c);
    }
    
    public Propietario propietarios_casas_mostrados_move(int num){
        Propietario propietarioResult = null;
        if(num == 0){
            if(posPropietariosCasas - 1 >= 0){
                posPropietariosCasas = posPropietariosCasas - 1;
                propietarioResult=propietarios_casas_mostrados.get(posPropietariosCasas);
            }else{
                propietarioResult=propietarios_casas_mostrados.get(posPropietariosCasas);
            }
        }else if(num == 1){
           if(posPropietariosCasas + 1 < propietarios_casas_mostrados.size()){
                posPropietariosCasas = posPropietariosCasas + 1;
                propietarioResult=propietarios_casas_mostrados.get(posPropietariosCasas);
            }else{
                propietarioResult=propietarios_casas_mostrados.get(posPropietariosCasas);
            } 
        }
        return propietarioResult;
    }
}
