package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.ProgressBar;
import javax.swing.text.html.ImageView;
import java.awt.*;
import java.awt.Button;
import java.util.Optional;
import java.util.Random;

public class Controller2 {

    datosPokemon pokemonrival = new datosPokemon("Pikachu", "65", "192", 'M',"80");

    Controller controladorpokemon;


    datosPokemon aux;

    @FXML
    private Label vida1;

    @FXML
    private Label nombre1;

    @FXML
    private Label nivel1;

    @FXML
    private ProgressBar pb1;

    @FXML
    private Label vida2;

    @FXML
    private Label nombre2;

    @FXML
    private ImageView numero1;

    @FXML
    private Label nivel2;

    @FXML
    private ProgressBar pb2;

    @FXML
    private Button botonclose;


    public void mandarInfoDesdeVentana1(datosPokemon info){
        nombre1.setText(info.nombre);
        nivel1.setText(info.nivel);
        numero1.setImage(new Image(info.numero1));
        vida1.setText(info.vida);
        aux=info;
    }
    public void initialize() {
        rival(nombre1, nivel1, vida1, sexo1, pb1, Pokemon1, numero1);
    }
    public void rival(Label nombre, Label nivel, Label vida, Label sexo, ProgressBar pb,datosPokemon rival){
        nombre.setText(rival.getNombre());
        nivel.setText(rival.getNivel());
        vida.setText(rival.getvida());
        sexo.setText(rival.getSexo());
    }

    @FXML
    private void cerrarventana(ActionEvent event) {
        Stage stage = (Stage) botonclose.getScene().getWindow();
        stage.close();
    }


    public void Curar(){
        Random curar = new Random();
        String vidanum = aux.getvida();
        int barra = (vidanum*100);
        aux.setVida(vidanum);
        pb1.setProgress(barra/100);
        String vidanumRival = pokemonrival.getvida();
        double barraRival = (vida2*100);
        pokemonrival.setVida(vidanumRival);
        pb2.setProgress(barraRival/100);

        if(aux.getvida()){
            aux.setVida(aux.getvida());
            pb1.setProgress(1.0);
            pb2.setProgress(1.0);
            barra = 100;
        }
        else{
            if(aux.getvida()){
                aux.setVida(aux.getvida());
                pb1.setProgress(0.0);
                pb2.setProgress(0.0);
                barra = 100;
            }
        }
    }

    private void alerta(Alert alert) {
        Optional<ButtonType> resultado = alert.showAndWait();
        if (resultado.get() == ButtonType.OK) {
            System.out.println("Va a comenzar la batalla");
        }

    }

    @FXML
    private void comenzar(ActionEvent event) {
        alerta(new Alert(Alert.AlertType.CONFIRMATION));
    }

    public void reenviarinfo(Controller contro){
        this.controladorpokemon=contro;
    }


}
