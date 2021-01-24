package sample;

import com.sun.scenario.effect.ColorAdjust;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javax.swing.text.html.ImageView;
import java.awt.*;
import java.awt.event.MouseEvent;


public class Controller {

    @FXML
    public Label nombre1;

    @FXML
    public Label nombre2;

    @FXML
    public Label nombre3;

    @FXML
    public Label nombre4;

    @FXML
    public Label nombre5;

    @FXML
    public Label nombre6;

    @FXML
    public Label nivel1;

    @FXML
    public Label nivel2;

    @FXML
    public Label nivel3;

    @FXML
    public Label nivel4;

    @FXML
    public Label nivel5;

    @FXML
    public Label nivel6;

    @FXML
    public Label vida1;

    @FXML
    public Label vida2;

    @FXML
    public Label vida3;

    @FXML
    public Label vida4;

    @FXML
    public Label vida5;

    @FXML
    public Label vida6;

    @FXML
    public Label sexo1;

    @FXML
    public Label sexo2;

    @FXML
    public Label sexo3;

    @FXML
    public Label sexo4;

    @FXML
    public Label sexo5;

    @FXML
    public Label sexo6;

    @FXML
    public Label boton;

    @FXML
    public ProgressBar pb1;

    @FXML
    public ProgressBar pb2;
    @FXML
    public ProgressBar pb3;
    @FXML
    public ProgressBar pb4;
    @FXML
    public ProgressBar pb5;
    @FXML
    public ProgressBar pb6;

    @FXML
    public Button basura;

    @FXML
    public ImageView numero1;

    @FXML
    public ImageView numero2;

    @FXML
    public ImageView numero3;

    @FXML
    public ImageView numero4;

    @FXML
    public ImageView numero5;

    @FXML
    public ImageView numero6;


    int option = 0;


    int total =0;


    public Object datosPokemon;
    private Object sexo;


    datosPokemon Pokemon1 = new datosPokemon("Jolteon", "65", "204", "M","80");

    datosPokemon Pokemon2 = new datosPokemon("Charizard", "45", "148","M", "55");

    datosPokemon Pokemon3 = new datosPokemon("Vaporeon", "54", "234", "M","70");

    datosPokemon Pokemon4 = new datosPokemon("Blastoise", "65", "222", "M","82");

    datosPokemon Pokemon5 = new datosPokemon("Newtwo", "75", "298", "M","20");

    datosPokemon Pokemon6 = new datosPokemon("Butterfree", "54", "160", "M","30");
    @FXML
    public void initialize() {


        iniciar(nombre1,nivel1, vida1,sexo1,pb1,Pokemon1,numero1);
        iniciar(nombre2,nivel2, vida2,sexo2,pb1,Pokemon2,numero2);
        iniciar(nombre3,nivel3, vida3,sexo3,pb1,Pokemon3,numero3);
        iniciar(nombre4,nivel4, vida4,sexo4,pb1,Pokemon4,numero4);
        iniciar(nombre5,nivel5, vida5,sexo5,pb1,Pokemon5,numero5);
        iniciar(nombre6,nivel6, vida6,sexo6,pb1,Pokemon6,numero6);
    }

    private void iniciar(Label nombre, Label nivel, Label vida, Label sexo, ProgressBar pb,datosPokemon Pokemon,ImageView imagen){
            nombre.setText(Pokemon.getNombre());
            vida.setText(Pokemon.getvida());
            nivel.setText(Pokemon.getNivel());
            imagen.getImage();

        ColorAdjust color = new ColorAdjust();
            color.setSaturation(0);
            if(total <= 50){
                color.setHue((float) 0.80);

            }else {
                if(total<=20){
                    color.setHue(1);
                }else if(total <= 0){
                    color.setSaturation((float) -1.3);
                }else{
                    color.setHue((float) -0.60);
                }

            }
            System.out.println(Pokemon.getvida());
        }

    public void cambio(Label pokeName,Label pokeLife,Label pokeLvl,ImageView imagen){
        pokeName.setTextFill(Color.WHITE);
        pokeLife.setTextFill(Color.WHITE);
        pokeLvl.setTextFill(Color.WHITE);
        imagen.setSize(300,100);
    }

    public void seleccionarPoke(Label pokeName,Label pokeLife,Label pokeLvl,ImageView imagen){
        Eliminar();
        boton.setDisable(false);
        pokeName.setTextFill(Color.BLUE);
        pokeLife.setTextFill(Color.BLUE);
        pokeLvl.setTextFill(Color.BLUE);
        imagen.setSize(200,100);
    }

    @FXML
    public void Eliminar(){
        cambio(nombre1,vida1,nivel1,numero1);
        cambio(nombre2,vida2,nivel2,numero2);
        cambio(nombre3,vida3,nivel3,numero3);
        cambio(nombre4,vida4,nivel4,numero4);
        cambio(nombre5,vida5,nivel5,numero5);
        cambio(nombre6,vida6,nivel6,numero6);
        basura.setDisable(true);
    }

    @FXML
    private void Abrirventana() {
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("sample2.fxml"));
            GridPane root = (GridPane) loader.load();
            Scene scene = new Scene(root, 600, 500);
            stage.setMaxWidth(200);
            stage.setMaxHeight(400);
            stage.setMinWidth(400);
            stage.setMinHeight(400);
            stage.setScene(scene);
            stage.show();

            Controller2 controller = loader.getController();
            controller.mandarInfoDesdeVentana1(Pokemon1);
            controller.reenviarinfo(this);

            switch (option) {
                case 1:
                    controller.mandarInfoDesdeVentana1(Pokemon1);
                    break;
                case 2:
                    controller.mandarInfoDesdeVentana1(Pokemon2);
                    break;
                case 3:
                    controller.mandarInfoDesdeVentana1(Pokemon3);
                    break;
                case 4:
                    controller.mandarInfoDesdeVentana1(Pokemon4);
                    break;
                case 5:
                    controller.mandarInfoDesdeVentana1(Pokemon5);
                    break;
                case 6:
                    controller.mandarInfoDesdeVentana1(Pokemon6);
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void Pokemon1(){
        seleccionarPoke(nombre1,vida1,nivel1,numero1);
    }

    @FXML
    public void Pokemon2(){
        seleccionarPoke(nombre2,vida2,nivel2,numero2);
    }

    @FXML
    public void Pokemon3(){
        seleccionarPoke(nombre3,vida3,nivel3,numero3);
    }

    @FXML
    public void Pokemon4(){
        seleccionarPoke(nombre4,vida4,nivel4,numero4);
    }

    @FXML
    public void Pokemon5(){
        seleccionarPoke(nombre5,vida5,nivel5,numero5);
    }

    @FXML
    public void Pokemon6(){
        seleccionarPoke(nombre6,vida6,nivel6,numero6);
    }

}
