/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iespuerto.pro.propietarioscasasfx.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Jonay
 */
public class Sentencias {
    
    public static void insertPropietario(Propietario p){  
        String sql = 
            "INSERT INTO propietario(" +
                "dni, " + "nombre, " + "apellidos,  " + "telefono) " +
            "VALUES (" +
                "'" + p.getDni() + "', " + "'" + p.getNombre() + "', " + "'" + p.getApellidos() + "', " + "'" + p.getTelefono() + "');";
        
        sentenciaUpdate(sql);
    }
     
    
    public static void insertCasa(Casa c){
        String sql = 
            "INSERT INTO casa(" +
                "ref_catastral, " + "metros, " + "precio) " +
            "VALUES (" +
                "'" + c.getRef_catastral() + "', "+ "'" + c.getMetros() + "', " + "'" + c.getPrecio() + "');";
            
        sentenciaUpdate(sql);
    }
    
    public static void deletePropietario(Propietario p){  
        String sql = 
            "DELETE FROM propietario" +
                " WHERE dni = '" + p.getDni()+ "';";
        sentenciaUpdate(sql);
    }
    
    public static void deleteCasa(Casa c){  
        String sql = 
            "DELETE FROM casa" +
                " WHERE ref_catastral = '" + c.getRef_catastral() + "';";
        sentenciaUpdate(sql);
    }
    
    public static void insertRelacion(Propietario p, Casa c){  
        String sql = 
            "INSERT INTO propietario_casa(" +
                "dni, " + "ref_catastral) " +
            "VALUES (" +
                "'" + p.getDni() + "', " + "'" + c.getRef_catastral() + "');";
        
        sentenciaUpdate(sql);
    }
    
    public static void sentenciaUpdate(String sql){
        Conexiones.cargarDriverMysql();
        try (Connection con = Conexiones.mysql(null, null, null)) { 
            Statement st = con.createStatement();
            st.executeUpdate(sql);
            st.close();           
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public static ArrayList queryCasas(Propietario p){ 
        ArrayList<Casa> casas = new ArrayList();
        try (Connection con = Conexiones.mysql(null, null, null)) {
                Statement st = con.createStatement();
                ResultSet res = st.executeQuery("SELECT DISTINCT casa.ref_catastral, casa.metros, casa.precio"
                        + " FROM casa INNER JOIN propietario_casa on casa.ref_catastral = propietario_casa.ref_catastral"
                        + " INNER JOIN propietario on propietario_casa.dni = '"+p.getDni()+"';");
                
                while (res.next()) {
                    
                    String ref_catastral = res.getString("ref_catastral");
                    int metros = res.getInt("metros");
                    Double precio = res.getDouble("precio");
                    
                    Casa c1 = new Casa(ref_catastral, metros, precio);
                    casas.add(c1);
                }

                st.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return casas;
    }
    
    public static ArrayList queryPropietarios(Casa c){
        ArrayList<Propietario> propietarios = new ArrayList();
        try (Connection con = Conexiones.mysql(null, null, null)) {
                Statement st = con.createStatement();
                ResultSet res = st.executeQuery("SELECT DISTINCT propietario.dni, propietario.nombre, propietario.apellidos, propietario.telefono"
                        + " FROM propietario INNER JOIN propietario_casa on propietario.dni = propietario_casa.dni"
                        + " INNER JOIN casa on propietario_casa.ref_catastral = '"+c.getRef_catastral()+"';");
                
                while (res.next()) {
                    
                    String dni = res.getString("dni");
                    String nombre = res.getString("nombre");
                    String apellidos = res.getString("apellidos");
                    String telefono = res.getString("telefono");
                    
                    Propietario p1 = new Propietario(dni, nombre, apellidos, telefono);
                    propietarios.add(p1);
                }

                st.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return propietarios;
    }
    
    public static ArrayList queryAllPropietarios(){ 
        ArrayList<Propietario> almacen = new ArrayList();
        try (Connection con = Conexiones.mysql(null, null, null)) {
                Statement st = con.createStatement();
                ResultSet res = st.executeQuery("SELECT * FROM propietario;");
                
                while (res.next()) {
                    
                    String dni = res.getString("dni");
                    String nombre = res.getString("nombre");
                    String apellidos = res.getString("apellidos");
                    String telefono = res.getString("telefono");
                    
                    Propietario p1 = new Propietario(dni, nombre, apellidos, telefono);
                    almacen.add(p1);
                }

                st.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return almacen;
    }
    
    public static ArrayList queryAllCasas(){ 
        ArrayList<Casa> almacen = new ArrayList();
        try (Connection con = Conexiones.mysql(null, null, null)) {
                Statement st = con.createStatement();
                ResultSet res = st.executeQuery("SELECT * FROM casa;");
                
                while (res.next()) {
                    
                    String ref_catastral = res.getString("ref_catastral");
                    int metros = res.getInt("metros");
                    Double precio = res.getDouble("precio");
                    
                    Casa c1 = new Casa(ref_catastral, metros, precio);
                    almacen.add(c1);
                }
                st.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return almacen;
    }
}