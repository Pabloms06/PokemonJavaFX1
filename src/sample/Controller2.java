package sample;

import com.sun.prism.Image;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
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

    datosPokemon pokemonrival = new datosPokemon("Pikachu", "65", "192", "M","80");

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
        //numero1.setImage(new Image(info.));
        vida1.setText(info.vida);
        aux=info;
    }
    public void initialize() {
        rival(nombre1, nivel1, vida1, controladorpokemon.sexo1, pb1, pokemonrival);
    }
    public void rival(Label nombre, Label nivel, Label vida, Label sexo, ProgressBar pb, datosPokemon rival){
        nombre.setText(rival.getNombre());
        nivel.setText(rival.getNivel());
        vida.setText(rival.getvida());
        sexo.setText(rival.getSexo());
    }

    @FXML
    private void cerrarventana(ActionEvent event) {
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();
    }


    public void Curar(){
        Random curar = new Random();
        int vidanumRival = pokemonrival.getvida()+ (curar.nextInt(60-40+1)+40);
        double barraRival = (vida2*100);
        pokemonrival.setVida(vidanumRival);
        pb2.setProgress(barraRival/100);

        int vidanum = aux.getvida()+(curar.nextInt(60-40+1)+40);
        int barra = (vidanum*100);
        aux.setVida(vidanum);
        pb1.setProgress(barra/100);

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

    public void comenzar(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Pokemon");
        alert.setContentText("Va a comenzar la partida");
        alert.showAndWait();
    }


    public void reenviarinfo(Controller controlador){
        this.controladorpokemon=controlador;
    }


}
