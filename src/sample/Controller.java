package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javax.swing.text.html.ImageView;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.net.URL;

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
    private ImageView imagen1 = new ImageView("..\img\masculino.png");

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

        datosPokemon Pokemon1 = new datosPokemon("Jolteon",65,204, 'M');

        datosPokemon Pokemon2 = new datosPokemon("Charizard",45,148, 'M');

        datosPokemon Pokemon3 = new datosPokemon("Vaporeon",54,234, 'M');

        datosPokemon Pokemon4 = new datosPokemon("Blastoise",65,222, 'M');

        datosPokemon Pokemon5 = new datosPokemon("Newtwo",75,298, 'M');

        datosPokemon Pokemon6 = new datosPokemon("Butterfree",54,160, 'M');



        nombre1.setText(Pokemon1.getNombre());
        nivel1.setText(Pokemon1.getNivel());
        vida1.setText(Pokemon1.getvida());
        if (Pokemon1.getNivel()='M'){
            imagen1.getLoadingImageIcon("..\img\masculino.png");
        }else{
            imagen1.getLoadingImageIcon("..\img\femenino.png");
        }

        nombre2.setText(Pokemon2.getNombre());
        nivel2.setText(Pokemon2.getNivel());
        vida2.setText(Pokemon2.getvida());

        nombre3.setText(Pokemon3.getNombre());
        nivel3.setText(Pokemon3.getNivel());
        vida3.setText(Pokemon3.getvida());

        nombre4.setText(Pokemon4.getNombre());
        nivel4.setText(Pokemon4.getNivel());
        vida4.setText(Pokemon4.getvida());

        nombre5.setText(Pokemon5.getNombre());
        nivel5.setText(Pokemon5.getNivel());
        vida5.setText(Pokemon5.getvida());

        nombre6.setText(Pokemon6.getNombre());
        nivel6.setText(Pokemon6.getNivel());
        vida6.setText(Pokemon6.getvida());




    }



}
