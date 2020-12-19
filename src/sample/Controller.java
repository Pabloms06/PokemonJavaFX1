package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javax.swing.text.html.ImageView;

public class Controller {

    @FXML
    private Label nombre1;

    @FXML
    private Label nombre2;

    @FXML
    private Label nombre3;

    @FXML
    private Label nombre4;

    @FXML
    private Label nombre5;

    @FXML
    private Label nombre6;

    @FXML
    private Label nivel1;

    @FXML
    private Label nivel2;

    @FXML
    private Label nivel3;

    @FXML
    private Label nivel4;

    @FXML
    private Label nivel5;

    @FXML
    private Label nivel6;

    @FXML
    private Label vida1;

    @FXML
    private Label vida2;

    @FXML
    private Label vida3;

    @FXML
    private Label vida4;

    @FXML
    private Label vida5;

    @FXML
    private Label vida6;

    @FXML
    private ImageView imagen1;

    @FXML
    private ImageView imagen2;

    @FXML
    private ImageView imagen3;

    @FXML
    private ImageView imagen4;

    @FXML
    private ImageView extra;
    private Object datosPokemon;


    @FXML
    public void initialize(){

        datosPokemon Pokemon1 = new datosPokemon("Jolteon",65,204,"M");

        datosPokemon Pokemon2 = new datosPokemon("Charizard",45,148,"M");

        datosPokemon Pokemon3 = new datosPokemon("Vaporeon",54,234,"M");

        datosPokemon Pokemon4 = new datosPokemon("Blastoise",65,222,"M");

        datosPokemon Pokemon5 = new datosPokemon("Newtwo",75,298,"M");

        datosPokemon Pokemon6 = new datosPokemon("Butterfree",54,160,"M");


    }

    private void Primero(){
        nombre1.setText(nombre1.getText());

    }
}
