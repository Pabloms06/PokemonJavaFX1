package sample;

import com.sun.scenario.effect.ColorAdjust;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javax.swing.text.html.ImageView;


public class Controller implements Controller1 {

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
    public ImageView sexo1;

    @FXML
    public ImageView sexo2;

    @FXML
    public ImageView sexo3;

    @FXML
    public ImageView sexo4;

    @FXML
    public ImageView sexo5;

    @FXML
    public ImageView sexo6;

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


int total =0;


    public Object datosPokemon;
    private Object sexo;


    @FXML
    public void initialize() {

        datosPokemon Pokemon1 = new datosPokemon("Jolteon", "65", "204", 'M',"80");

        datosPokemon Pokemon2 = new datosPokemon("Charizard", "45", "148",'M', "55");

        datosPokemon Pokemon3 = new datosPokemon("Vaporeon", "54", "234", 'M',"70");

        datosPokemon Pokemon4 = new datosPokemon("Blastoise", "65", "222", 'M',"82");

        datosPokemon Pokemon5 = new datosPokemon("Newtwo", "75", "298", 'M',"20");

        datosPokemon Pokemon6 = new datosPokemon("Butterfree", "54", "160", 'M',"30");

        iniciar(nombre1,nivel1, vida1,sexo1,pb1);
        iniciar(nombre2,nivel2, vida2,sexo2,pb1);
        iniciar(nombre3,nivel3, vida3,sexo3,pb1);
        iniciar(nombre4,nivel4, vida4,sexo4,pb1);
        iniciar(nombre5,nivel5, vida5,sexo5,pb1);
        iniciar(nombre6,nivel6, vida6,sexo6,pb1);
    }
        public void iniciar(Label nombre, Label nivel, Label vida, ImageView nivelpb, ProgressBar pb,datosPokemon Pokemon){
            nombre.setText(Pokemon.getNombre());
            vida.setText(Integer.toString(Pokemon.getvida()));
            nivel.setText(Pokemon.getNivel());
            ColorAdjust color = new ColorAdjust();
            color.setSaturation(0);
            if(total <= 50){
                color.setHue((float) 0.80);
            }else if(total<=20){
                color.setHue(1);
            }else if(total <= 0){
                color.setSaturation((float) -1.3);
            }else{
                color.setHue((float) -0.60);
            }
            pb.setEffect(color);
            System.out.println(Pokemon.getActualLife()*100 /Pokemon.getMaxLife());
        }

    public void cambio(Label pokeName,Label pokeLife,Label pokeLvl){
        pokeName.setTextFill(Color.WHITE);
        pokeLife.setTextFill(Color.WHITE);
        pokeLvl.setTextFill(Color.WHITE);
    }

    public void selectPoke(Label pokeName,Label pokeLife,Label pokeLvl){
        boton.setDisable(false);
        pokeName.setTextFill(Color.BLUE);
        pokeLife.setTextFill(Color.BLUE);
        pokeLvl.setTextFill(Color.BLUE);
    }

    @FXML
    public void Eliminar(){
        cambio(nombre1,vida1,nivel1);
        cambio(nombre2,vida2,nivel2);
        cambio(nombre3,vida3,nivel3);
        cambio(nombre4,vida4,nivel4);
        cambio(nombre5,vida5,nivel5);
        cambio(nombre6,vida6,nivel6);
        boton.setDisable(true);
    }

    public Pulsado(){
        boton.getOnMouseClicked().notify();
        public void start(Stage SecondaryStage) throws Exception{
            Parent root = FXMLLoader.load(getClass().getResource("sample2.fxml"));
            SecondaryStage.setTitle("Pokemon 2");
            SecondaryStage.setScene(new Scene(root, 800, 800));
            SecondaryStage.show();
        }
    }

    @FXML
    public void Pokemon1(){
        selectPoke(nombre1,vida1,nivel1);
    }

    @FXML
    public void Pokemon2(){
        selectPoke(nombre2,vida2,nivel2);
    }

    @FXML
    public void Pokemon3(){
        selectPoke(nombre3,vida3,nivel3);
    }

    @FXML
    public void Pokemon4(){
        selectPoke(nombre4,vida4,nivel4);
    }

    @FXML
    public void Pokemon5(){
        selectPoke(nombre5,vida5,nivel5);
    }

    @FXML
    public void Pokemon6(){
        selectPoke(nombre6,vida6,nivel6);
    }


}
