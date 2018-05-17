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
    private Label lblIdPropietario;
    @FXML
    private TextField txtIdPropietario;
    @FXML
    private Label lblIdCasa;
    @FXML
    private Button btnAgregarCasa;
    @FXML
    private Button btnEliminarCasa;
    @FXML
    private Button btnSiguienteCasa;
    @FXML
    private Button btnAnteriorCasa;
    @FXML
    private Label lblDireccionCasa;
    @FXML
    private TextField txtDireccionCasa;
    @FXML
    private TextField txtIdCasa;
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
    private Label lblIdCasaEnPropietario;
    @FXML
    private TextField txtIdCasaEnPropietario;
    @FXML
    private Label lblDireccionCasaEnPropietario;
    @FXML
    private TextField txtDireccionCasaEnPropietario;
    @FXML
    private Label lblIdPropietarioEnCasa;
    @FXML
    private TextField txtIdPropietarioEnCasa;
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

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        txtIdCasaEnPropietario.setEditable(false);
        txtIdCasaEnPropietario.getStyleClass().addAll("fondoGris");
        txtDireccionCasaEnPropietario.setEditable(false);
        txtDireccionCasaEnPropietario.getStyleClass().addAll("fondoGris");

        txtIdPropietarioEnCasa.setEditable(false);
        txtIdPropietarioEnCasa.getStyleClass().addAll("fondoGris");
        txtNombrePropietarioEnCasa.setEditable(false);
        txtNombrePropietarioEnCasa.getStyleClass().addAll("fondoGris");
        txtApellidosPropietarioEnCasa.setEditable(false);
        txtApellidosPropietarioEnCasa.getStyleClass().addAll("fondoGris");
    }

    @FXML
    private void btnAgregarPropietarioOnClick(ActionEvent event) {
        if (txtIdPropietario.getText().equals("") || txtNombrePropietario.getText().equals("") || txtApellidosPropietario.getText().equals("")) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("¡Debe introducir los datos del propietario!".toUpperCase());
            alert.showAndWait();
        } else {
            txtIdPropietario.setEditable(false);
            txtIdPropietario.getStyleClass().addAll("fondoGris");
            txtNombrePropietario.setEditable(false);
            txtNombrePropietario.getStyleClass().addAll("fondoGris");
            txtApellidosPropietario.setEditable(false);
            txtApellidosPropietario.getStyleClass().addAll("fondoGris");
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
        txtIdPropietario.setEditable(true);
        txtIdPropietario.getStyleClass().remove("fondoGris");
        txtNombrePropietario.setEditable(true);
        txtNombrePropietario.getStyleClass().remove("fondoGris");
        txtApellidosPropietario.setEditable(true);
        txtApellidosPropietario.getStyleClass().remove("fondoGris");
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
        if (txtIdCasa.getText().equals("") || txtDireccionCasa.getText().equals("")) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setContentText("¡Debe introducir los datos de la casa!".toUpperCase());
            alert.showAndWait();
        } else {
            txtIdCasa.setEditable(false);
            txtIdCasa.getStyleClass().addAll("fondoGris");
            txtDireccionCasa.setEditable(false);
            txtDireccionCasa.getStyleClass().addAll("fondoGris");
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
        txtIdCasa.setEditable(true);
        txtIdCasa.getStyleClass().remove("fondoGris");
        txtDireccionCasa.setEditable(true);
        txtDireccionCasa.getStyleClass().remove("fondoGris");
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
