package com.iespuerto.pro.propietarioscasasfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
}
