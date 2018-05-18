package com.iespuerto.pro.propietarioscasasfx;

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
        if (txtDniPropietario.getText().equals("") || txtNombrePropietario.getText().equals("") || txtApellidosPropietario.getText().equals("") || txtTelefonoPropietario.getText().equals("")) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("¡Debe introducir los datos del propietario!".toUpperCase());
            alert.showAndWait();
        } else {
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

    }

    @FXML
    private void btnSiguientePropietarioOnClick(ActionEvent event) {

    }

    @FXML
    private void btnEliminarPropietarioOnClick(ActionEvent event) {

    }

    @FXML
    private void btnModificarPropietarioOnClick(ActionEvent event) {
        txtDniPropietario.setEditable(true);
        txtDniPropietario.getStyleClass().remove("fondoGris");
        txtNombrePropietario.setEditable(true);
        txtNombrePropietario.getStyleClass().remove("fondoGris");
        txtApellidosPropietario.setEditable(true);
        txtApellidosPropietario.getStyleClass().remove("fondoGris");
        txtTelefonoPropietario.setEditable(true);
        txtTelefonoPropietario.getStyleClass().remove("fondoGris");
    }

    @FXML
    private void btnAsociarCasaEnPropietarioOnClick(ActionEvent event) {

    }

    @FXML
    private void btnAnteriorCasaEnPropietarioOnClick(ActionEvent event) {

    }

    @FXML
    private void btnSiguienteCasaEnPropietarioOnClick(ActionEvent event) {

    }

    @FXML
    private void btnEliminarCasaEnPropietarioOnClick(ActionEvent event) {

    }

    @FXML
    private void btnCancelarCasaEnPropietarioOnClick(ActionEvent event) {

    }

    @FXML
    private void btnAceptarCasaEnPropietarioOnClick(ActionEvent event) {

    }

    @FXML
    private void btnAgregarCasaOnClick(ActionEvent event) {
        if (txtReferenciaCatastralCasa.getText().equals("") || txtMetrosCasa.getText().equals("") || txtPrecioCasa.getText().equals("")) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("¡Debe introducir los datos de la casa!".toUpperCase());
            alert.showAndWait();
        } else {
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

    }

    @FXML
    private void btnSiguienteCasaOnClick(ActionEvent event) {

    }

    @FXML
    private void btnEliminarCasaOnClick(ActionEvent event) {

    }

    @FXML
    private void btnModificarCasaOnClick(ActionEvent event) {
        txtReferenciaCatastralCasa.setEditable(true);
        txtReferenciaCatastralCasa.getStyleClass().remove("fondoGris");
        txtMetrosCasa.setEditable(true);
        txtMetrosCasa.getStyleClass().remove("fondoGris");
        txtPrecioCasa.setEditable(true);
        txtPrecioCasa.getStyleClass().remove("fondoGris");
    }

    @FXML
    private void btnAsociarPropietarioEnCasaOnClick(ActionEvent event) {

    }

    @FXML
    private void btnAnteriorPropietarioEnCasaOnClick(ActionEvent event) {

    }

    @FXML
    private void btnSiguientePropietarioEnCasaOnClick(ActionEvent event) {

    }

    @FXML
    private void btnEliminarPropietarioEnCasaOnClick(ActionEvent event) {

    }

    @FXML
    private void btnCancelarPropietarioEnCasaOnClick(ActionEvent event) {

    }

    @FXML
    private void btnAceptarPropietarioEnCasaOnClick(ActionEvent event) {

    }
}
