package com.iespuerto.pro.propietarioscasasfx;

import com.iespuerto.pro.propietarioscasasfx.model.Almacen;
import com.iespuerto.pro.propietarioscasasfx.model.Casa;
import com.iespuerto.pro.propietarioscasasfx.model.Conexiones;
import com.iespuerto.pro.propietarioscasasfx.model.Propietario;
import com.iespuerto.pro.propietarioscasasfx.model.Sentencias;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

public class FXMLController implements Initializable {
    Propietario propietario;
    Casa casa;
    Almacen almacen;
    
    @FXML
    private Button btnAgregarPropietario;
    @FXML
    private Button btnEliminarPropietario;
    @FXML
    private Button btnSiguientePropietario;
    @FXML
    private Button btnAnteriorPropietario;
    @FXML
    private Label lblNombrePropietario;
    @FXML
    private TextField txtNombrePropietario;
    @FXML
    private Label lblApellidosPropietario;
    @FXML
    private TextField txtApellidosPropietario;
    @FXML
    private Button btnAgregarCasa;
    @FXML
    private Button btnEliminarCasa;
    @FXML
    private Button btnSiguienteCasa;
    @FXML
    private Button btnAnteriorCasa;
    @FXML
    private Pane paneCasasEnPropietario;
    @FXML
    private Button btnSiguienteCasaEnPropietario;
    @FXML
    private Button btnAnteriorCasaEnPropietario;
    @FXML
    private Button btnEliminarCasaEnPropietario;
    @FXML
    private Button btnAsociarCasaEnPropietario;
    @FXML
    private Pane panePropietariosEnCasa;
    @FXML
    private Button btnSiguientePropietarioEnCasa;
    @FXML
    private Button btnAnteriorPropietarioEnCasa;
    @FXML
    private Button btnEliminarPropietarioEnCasa;
    @FXML
    private Button btnAsociarPropietarioEnCasa;
    @FXML
    private Label lblNombrePropietarioEnCasa;
    @FXML
    private TextField txtNombrePropietarioEnCasa;
    @FXML
    private Label lblApellidosPropietarioEnCasa;
    @FXML
    private TextField txtApellidosPropietarioEnCasa;
    @FXML
    private Button btnCancelarCasaEnPropietario;
    @FXML
    private Button btnAceptarCasaEnPropietario;
    @FXML
    private Button btnModificarPropietario;
    @FXML
    private Button btnCancelarPropietarioEnCasa;
    @FXML
    private Button btnAceptarPropietarioEnCasa;
    @FXML
    private Button btnModificarCasa;
    @FXML
    private Label lblDniPropietario;
    @FXML
    private TextField txtDniPropietario;
    @FXML
    private Label lblReferenciaCatastralCasaEnPropietario;
    @FXML
    private TextField txtReferenciaCatastralCasaEnPropietario;
    @FXML
    private Label lblMetrosCasaEnPropietario;
    @FXML
    private TextField txtMetrosCasaEnPropietario;
    @FXML
    private Label lblPrecioCasaEnPropietario;
    @FXML
    private TextField txtPrecioCasaEnPropietario;
    @FXML
    private Label lblTelefonoPropietario;
    @FXML
    private TextField txtTelefonoPropietario;
    @FXML
    private Label lblMetrosCasa;
    @FXML
    private TextField txtMetrosCasa;
    @FXML
    private Label lblReferenciaCatastralCasa;
    @FXML
    private TextField txtReferenciaCatastralCasa;
    @FXML
    private Label lblDniPropietarioEnCasa;
    @FXML
    private TextField txtDniPropietarioEnCasa;
    @FXML
    private Label lblTelefonoPropietarioEnCasa;
    @FXML
    private TextField txtTelefonoPropietarioEnCasa;
    @FXML
    private Label lblPrecioCasa;
    @FXML
    private TextField txtPrecioCasa;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Conexiones.cargarDriverMysql();
        
        propietario = new Propietario();
        casa = new Casa();
        almacen = new Almacen();
        
        txtReferenciaCatastralCasaEnPropietario.setEditable(false);
        txtReferenciaCatastralCasaEnPropietario.getStyleClass().addAll("fondoGris");
        txtMetrosCasaEnPropietario.setEditable(false);
        txtMetrosCasaEnPropietario.getStyleClass().addAll("fondoGris");
        txtPrecioCasaEnPropietario.setEditable(false);
        txtPrecioCasaEnPropietario.getStyleClass().addAll("fondoGris");

        txtDniPropietarioEnCasa.setEditable(false);
        txtDniPropietarioEnCasa.getStyleClass().addAll("fondoGris");
        txtNombrePropietarioEnCasa.setEditable(false);
        txtNombrePropietarioEnCasa.getStyleClass().addAll("fondoGris");
        txtApellidosPropietarioEnCasa.setEditable(false);
        txtApellidosPropietarioEnCasa.getStyleClass().addAll("fondoGris");
        txtTelefonoPropietarioEnCasa.setEditable(false);
        txtTelefonoPropietarioEnCasa.getStyleClass().addAll("fondoGris");
    }

    @FXML
    private void btnAgregarPropietarioOnClick(ActionEvent event) {
        if( ! txtDniPropietario.isEditable()){
            txtDniPropietario.clear();
            txtNombrePropietario.clear();
            txtApellidosPropietario.clear();
            txtTelefonoPropietario.clear();
            txtDniPropietario.setEditable(true);
            txtDniPropietario.getStyleClass().remove("fondoGris");
            txtNombrePropietario.setEditable(true);
            txtNombrePropietario.getStyleClass().remove("fondoGris");
            txtApellidosPropietario.setEditable(true);
            txtApellidosPropietario.getStyleClass().remove("fondoGris");
            txtTelefonoPropietario.setEditable(true);
            txtTelefonoPropietario.getStyleClass().remove("fondoGris");
        }else if (txtDniPropietario.getText().equals("") || txtNombrePropietario.getText().equals("") || txtApellidosPropietario.getText().equals("") || txtTelefonoPropietario.getText().equals("")) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("¡Debe introducir los datos del propietario!".toUpperCase());
            alert.showAndWait();
        } else {
            propietario.setDni(txtDniPropietario.getText());
            propietario.setNombre(txtNombrePropietario.getText());
            propietario.setApellidos(txtApellidosPropietario.getText());
            propietario.setTelefono(txtTelefonoPropietario.getText());
            
            Sentencias.insertPropietario(propietario);
            almacen.setPropietarios_mostrados();
            
            txtDniPropietario.setText(propietario.getDni());
            txtNombrePropietario.setText(propietario.getNombre());
            txtApellidosPropietario.setText(propietario.getApellidos());
            txtTelefonoPropietario.setText(propietario.getTelefono());
            
            txtDniPropietario.setEditable(false);
            txtDniPropietario.getStyleClass().addAll("fondoGris");
            txtNombrePropietario.setEditable(false);
            txtNombrePropietario.getStyleClass().addAll("fondoGris");
            txtApellidosPropietario.setEditable(false);
            txtApellidosPropietario.getStyleClass().addAll("fondoGris");
            txtTelefonoPropietario.setEditable(false);
            txtTelefonoPropietario.getStyleClass().addAll("fondoGris");
        }
    }

    @FXML
    private void btnAnteriorPropietarioOnClick(ActionEvent event) {
//        txtDniPropietario.setEditable(false);
//        txtDniPropietario.getStyleClass().addAll("fondoGris");
//        txtNombrePropietario.setEditable(false);
//        txtNombrePropietario.getStyleClass().addAll("fondoGris");
//        txtApellidosPropietario.setEditable(false);
//        txtApellidosPropietario.getStyleClass().addAll("fondoGris");
//        txtTelefonoPropietario.setEditable(false);
//        txtTelefonoPropietario.getStyleClass().addAll("fondoGris");

        if( ! txtDniPropietario.isEditable()){
            propietario = almacen.propietarios_move(0);
//            almacen.setCasas_propietario(propietario);
            txtDniPropietario.setText(propietario.getDni());
            txtNombrePropietario.setText(propietario.getNombre());
            txtApellidosPropietario.setText(propietario.getApellidos());
            txtTelefonoPropietario.setText(propietario.getTelefono());
        }    
    }

    @FXML
    private void btnSiguientePropietarioOnClick(ActionEvent event) {
//        txtDniPropietario.setEditable(false);
//        txtDniPropietario.getStyleClass().addAll("fondoGris");
//        txtNombrePropietario.setEditable(false);
//        txtNombrePropietario.getStyleClass().addAll("fondoGris");
//        txtApellidosPropietario.setEditable(false);
//        txtApellidosPropietario.getStyleClass().addAll("fondoGris");
//        txtTelefonoPropietario.setEditable(false);
//        txtTelefonoPropietario.getStyleClass().addAll("fondoGris");

        if( ! txtDniPropietario.isEditable()){
            propietario = almacen.propietarios_move(1);
            
            txtDniPropietario.setText(propietario.getDni());
            txtNombrePropietario.setText(propietario.getNombre());
            txtApellidosPropietario.setText(propietario.getApellidos());
            txtTelefonoPropietario.setText(propietario.getTelefono());
        }
    }

    @FXML
    private void btnEliminarPropietarioOnClick(ActionEvent event) {
        Sentencias.deletePropietario(propietario);
        almacen.setPropietarios_mostrados();
    }

    @FXML
    private void btnModificarPropietarioOnClick(ActionEvent event) {
//        txtDniPropietario.setEditable(true);
//        txtDniPropietario.getStyleClass().remove("fondoGris");
//        txtNombrePropietario.setEditable(true);
//        txtNombrePropietario.getStyleClass().remove("fondoGris");
//        txtApellidosPropietario.setEditable(true);
//        txtApellidosPropietario.getStyleClass().remove("fondoGris");
//        txtTelefonoPropietario.setEditable(true);
//        txtTelefonoPropietario.getStyleClass().remove("fondoGris");
    }

    @FXML
    private void btnAsociarCasaEnPropietarioOnClick(ActionEvent event) {
        if( ! txtReferenciaCatastralCasaEnPropietario.isEditable()){
            txtReferenciaCatastralCasaEnPropietario.clear();
            txtMetrosCasaEnPropietario.clear();
            txtPrecioCasaEnPropietario.clear();
            
            txtReferenciaCatastralCasaEnPropietario.setEditable(true);
            txtMetrosCasaEnPropietario.setEditable(true);
            txtPrecioCasaEnPropietario.setEditable(true);
            
            txtReferenciaCatastralCasaEnPropietario.getStyleClass().remove("fondoGris");
            txtMetrosCasaEnPropietario.getStyleClass().remove("fondoGris");
            txtPrecioCasaEnPropietario.getStyleClass().remove("fondoGris");
            
        }else if (txtReferenciaCatastralCasaEnPropietario.getText().isEmpty() || txtMetrosCasaEnPropietario.getText().isEmpty() || txtPrecioCasaEnPropietario.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("¡Debe introducir los datos de la casa!".toUpperCase());
            alert.showAndWait();
        } else {
            casa.setRef_catastral(txtReferenciaCatastralCasaEnPropietario.getText());
            casa.setMetros(Integer.parseInt(txtMetrosCasaEnPropietario.getText()));
            casa.setPrecio(Double.parseDouble(txtPrecioCasaEnPropietario.getText()));
            
            Sentencias.insertCasa(casa);
            Sentencias.insertRelacion(propietario, casa);
            
            almacen.setCasas_propietario(propietario);
            
            txtReferenciaCatastralCasaEnPropietario.setText(casa.getRef_catastral());
            txtMetrosCasaEnPropietario.setText(""+casa.getMetros());
            txtPrecioCasaEnPropietario.setText(""+casa.getPrecio());
            
            txtReferenciaCatastralCasaEnPropietario.setEditable(false);
            txtMetrosCasaEnPropietario.setEditable(false);
            txtPrecioCasaEnPropietario.setEditable(false);
            
            txtReferenciaCatastralCasaEnPropietario.getStyleClass().addAll("fondoGris");
            txtMetrosCasaEnPropietario.getStyleClass().addAll("fondoGris");
            txtPrecioCasaEnPropietario.getStyleClass().addAll("fondoGris");
        }
    }

    @FXML
    private void btnAnteriorCasaEnPropietarioOnClick(ActionEvent event) {
        if( ! txtReferenciaCatastralCasaEnPropietario.isEditable()){
            almacen.setCasas_propietario(propietario);
            casa = almacen.casasDePropietario_move(0);
            txtReferenciaCatastralCasaEnPropietario.setText(casa.getRef_catastral());
            txtMetrosCasaEnPropietario.setText(""+casa.getMetros());
            txtPrecioCasaEnPropietario.setText(""+casa.getPrecio());
        }
    }

    @FXML
    private void btnSiguienteCasaEnPropietarioOnClick(ActionEvent event) {
        if( ! txtReferenciaCatastralCasaEnPropietario.isEditable()){
            almacen.setCasas_propietario(propietario);
            casa = almacen.casasDePropietario_move(1);
            txtReferenciaCatastralCasaEnPropietario.setText(casa.getRef_catastral());
            txtMetrosCasaEnPropietario.setText(""+casa.getMetros());
            txtPrecioCasaEnPropietario.setText(""+casa.getPrecio());
        }
    }

    @FXML
    private void btnEliminarCasaEnPropietarioOnClick(ActionEvent event) {
        Sentencias.deleteCasa(casa);
        almacen.setCasas_propietario(propietario);
    }

    @FXML
    private void btnCancelarCasaEnPropietarioOnClick(ActionEvent event) {

    }

    @FXML
    private void btnAceptarCasaEnPropietarioOnClick(ActionEvent event) {

    }

    @FXML
    private void btnAgregarCasaOnClick(ActionEvent event) {
        if( ! txtReferenciaCatastralCasa.isEditable()){
            
            txtReferenciaCatastralCasa.clear();
            txtMetrosCasa.clear();
            txtPrecioCasa.clear();
            
            txtReferenciaCatastralCasa.setEditable(true);
            txtReferenciaCatastralCasa.getStyleClass().addAll("fondoGris");
            txtMetrosCasa.setEditable(false);
            txtMetrosCasa.getStyleClass().addAll("fondoGris");
            txtPrecioCasa.setEditable(false);
            txtPrecioCasa.getStyleClass().addAll("fondoGris");
            
        }else if( txtReferenciaCatastralCasa.getText().isEmpty() || txtMetrosCasa.getText().isEmpty() || txtPrecioCasa.getText().isEmpty() ){
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("¡Debe introducir los datos de la casa!".toUpperCase());
            alert.showAndWait();
        } else {
            casa.setRef_catastral(txtReferenciaCatastralCasa.getText());
            casa.setMetros(Integer.parseInt(txtMetrosCasa.getText()));
            casa.setPrecio(Double.parseDouble(txtPrecioCasa.getText()));
            
            Sentencias.insertCasa(casa);
            almacen.setCasas_mostradas();
            
            txtReferenciaCatastralCasa.setText(casa.getRef_catastral());
            txtMetrosCasa.setText(""+casa.getMetros());
            txtPrecioCasa.setText(""+casa.getPrecio());
            
            txtReferenciaCatastralCasa.setEditable(false);
            txtReferenciaCatastralCasa.getStyleClass().addAll("fondoGris");
            txtMetrosCasa.setEditable(false);
            txtMetrosCasa.getStyleClass().addAll("fondoGris");
            txtPrecioCasa.setEditable(false);
            txtPrecioCasa.getStyleClass().addAll("fondoGris");
        }
    }

    @FXML
    private void btnAnteriorCasaOnClick(ActionEvent event) {
//        txtReferenciaCatastralCasa.setEditable(false);
//        txtReferenciaCatastralCasa.getStyleClass().addAll("fondoGris");
//        txtMetrosCasa.setEditable(false);
//        txtMetrosCasa.getStyleClass().addAll("fondoGris");
//        txtPrecioCasa.setEditable(false);
//        txtPrecioCasa.getStyleClass().addAll("fondoGris");

        if( ! txtReferenciaCatastralCasa.isEditable()){
            almacen.setCasas_mostradas();
            casa = almacen.casas_move(0);
            txtReferenciaCatastralCasa.setText(casa.getRef_catastral());
            txtMetrosCasa.setText(""+casa.getMetros());
            txtPrecioCasa.setText(""+casa.getPrecio());
        }
    }

    @FXML
    private void btnSiguienteCasaOnClick(ActionEvent event) {
//        txtReferenciaCatastralCasa.setEditable(false);
//        txtReferenciaCatastralCasa.getStyleClass().addAll("fondoGris");
//        txtMetrosCasa.setEditable(false);
//        txtMetrosCasa.getStyleClass().addAll("fondoGris");
//        txtPrecioCasa.setEditable(false);
//        txtPrecioCasa.getStyleClass().addAll("fondoGris");

        if( ! txtReferenciaCatastralCasa.isEditable()){
            almacen.setCasas_mostradas();
            casa = almacen.casas_move(1);
            txtReferenciaCatastralCasa.setText(casa.getRef_catastral());
            txtMetrosCasa.setText(""+casa.getMetros());
            txtPrecioCasa.setText(""+casa.getPrecio());
        }
    }

    @FXML
    private void btnEliminarCasaOnClick(ActionEvent event) {
        Sentencias.deleteCasa(casa);
        almacen.setCasas_mostradas();
    }

    @FXML
    private void btnModificarCasaOnClick(ActionEvent event) {
//        txtReferenciaCatastralCasa.setEditable(true);
//        txtReferenciaCatastralCasa.getStyleClass().remove("fondoGris");
//        txtMetrosCasa.setEditable(true);
//        txtMetrosCasa.getStyleClass().remove("fondoGris");
//        txtPrecioCasa.setEditable(true);
//        txtPrecioCasa.getStyleClass().remove("fondoGris");
    }

    @FXML
    private void btnAsociarPropietarioEnCasaOnClick(ActionEvent event) {
        if( ! txtDniPropietarioEnCasa.isEditable()){
            txtDniPropietarioEnCasa.clear();
            txtNombrePropietarioEnCasa.clear();
            txtApellidosPropietarioEnCasa.clear();
            txtTelefonoPropietarioEnCasa.clear();
            txtDniPropietarioEnCasa.setEditable(true);
            txtDniPropietarioEnCasa.getStyleClass().remove("fondoGris");
            txtNombrePropietarioEnCasa.setEditable(true);
            txtNombrePropietarioEnCasa.getStyleClass().remove("fondoGris");
            txtApellidosPropietarioEnCasa.setEditable(true);
            txtApellidosPropietarioEnCasa.getStyleClass().remove("fondoGris");
            txtTelefonoPropietarioEnCasa.setEditable(true);
            txtTelefonoPropietarioEnCasa.getStyleClass().remove("fondoGris");
        }else if (txtDniPropietarioEnCasa.getText().equals("") || txtNombrePropietarioEnCasa.getText().equals("") || txtApellidosPropietarioEnCasa.getText().equals("") || txtTelefonoPropietarioEnCasa.getText().equals("")) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("¡Debe introducir los datos del propietario!".toUpperCase());
            alert.showAndWait();
        } else {
            propietario.setDni(txtDniPropietarioEnCasa.getText());
            propietario.setNombre(txtNombrePropietarioEnCasa.getText());
            propietario.setApellidos(txtApellidosPropietarioEnCasa.getText());
            propietario.setTelefono(txtTelefonoPropietarioEnCasa.getText());
            
            Sentencias.insertPropietario(propietario);
            Sentencias.insertRelacion(propietario, casa);
            almacen.setPropietarios_casas_mostrados(casa);
            
            txtDniPropietarioEnCasa.setText(propietario.getDni());
            txtNombrePropietarioEnCasa.setText(propietario.getNombre());
            txtApellidosPropietarioEnCasa.setText(propietario.getApellidos());
            txtTelefonoPropietarioEnCasa.setText(propietario.getTelefono());
            
            txtDniPropietarioEnCasa.setEditable(false);
            txtDniPropietarioEnCasa.getStyleClass().addAll("fondoGris");
            txtNombrePropietarioEnCasa.setEditable(false);
            txtNombrePropietarioEnCasa.getStyleClass().addAll("fondoGris");
            txtApellidosPropietarioEnCasa.setEditable(false);
            txtApellidosPropietarioEnCasa.getStyleClass().addAll("fondoGris");
            txtTelefonoPropietarioEnCasa.setEditable(false);
            txtTelefonoPropietarioEnCasa.getStyleClass().addAll("fondoGris");
        }
        
    }

    @FXML
    private void btnAnteriorPropietarioEnCasaOnClick(ActionEvent event) {
        if( ! txtDniPropietarioEnCasa.isEditable()){
            almacen.setPropietarios_casas_mostrados(casa);
            propietario = almacen.propietarios_casas_mostrados_move(0);  
            txtDniPropietarioEnCasa.setText(propietario.getDni());
            txtNombrePropietarioEnCasa.setText(propietario.getNombre());
            txtApellidosPropietarioEnCasa.setText(propietario.getApellidos());
            txtTelefonoPropietarioEnCasa.setText(propietario.getTelefono());
        }

    }

    @FXML
    private void btnSiguientePropietarioEnCasaOnClick(ActionEvent event) {
        if( ! txtDniPropietarioEnCasa.isEditable()){
            almacen.setPropietarios_casas_mostrados(casa);
            propietario = almacen.propietarios_casas_mostrados_move(1);
            txtDniPropietarioEnCasa.setText(propietario.getDni());
            txtNombrePropietarioEnCasa.setText(propietario.getNombre());
            txtApellidosPropietarioEnCasa.setText(propietario.getApellidos());
            txtTelefonoPropietarioEnCasa.setText(propietario.getTelefono());
        }
    }

    @FXML
    private void btnEliminarPropietarioEnCasaOnClick(ActionEvent event) {
        Sentencias.deletePropietario(propietario);
        almacen.setPropietarios_casas_mostrados(casa);
    }

    @FXML
    private void btnCancelarPropietarioEnCasaOnClick(ActionEvent event) {

    }

    @FXML
    private void btnAceptarPropietarioEnCasaOnClick(ActionEvent event) {

    }
}
