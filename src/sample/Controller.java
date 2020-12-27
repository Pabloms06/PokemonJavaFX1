package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;

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
    public ImageView imagen1;

    @FXML
    public ImageView imagen2;

    @FXML
    public ImageView imagen3;

    @FXML
    public ImageView imagen4;

    @FXML
    public ImageView imagen5;

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





    public Object datosPokemon;
    private Object sexo;


    @FXML
    public void initialize(){

        datosPokemon Pokemon1 = new datosPokemon("Jolteon","65","204", 'M');

        datosPokemon Pokemon2 = new datosPokemon("Charizard","45","148", 'M');

        datosPokemon Pokemon3 = new datosPokemon("Vaporeon","54","234", 'M');

        datosPokemon Pokemon4 = new datosPokemon("Blastoise","65","222", 'M');

        datosPokemon Pokemon5 = new datosPokemon("Newtwo","75","298", 'M');

        datosPokemon Pokemon6 = new datosPokemon("Butterfree","54","160", 'M');

        public void datosPokemon1(ImageView sexo) {
            nombre1.setText(Pokemon1.getNombre());
            nivel1.setText(Pokemon1.getNivel());
            vida1.setText(Pokemon1.getvida());
            Image image;
            if (Pokemon1.getSexo() == 'M') {
                image = new Image("img/masculino.png");
            } else {
                image = new Image("img/femenino.png");
            }
            sexo.setImage(image);
            pb1.setStyle("-fx-accent: green");

        }

        public void datosPokemon2(ImageView Object sexo = this.sexo;){
            nombre2.setText(Pokemon2.getNombre());
            nivel2.setText(Pokemon2.getNivel());
            vida2.setText(Pokemon2.getvida());
            Image image2;
            if (Pokemon1.getSexo() == 'M') {
                image2 = new Image("img/masculino.png");
            } else {
                image2 = new Image("img/femenino.png");
            }
            this.sexo.setImage(image2);
            pb2.setStyle("-fx-accent: green");

        }
        public void datosPokemon3(ImageView this.sexo){
            nombre3.setText(Pokemon3.getNombre());
            nivel3.setText(Pokemon3.getNivel());
            vida3.setText(Pokemon3.getvida());
            Image image3;
            if (Pokemon1.getSexo() == 'M') {
                image3 = new Image("img/masculino.png");
            } else {
                image3 = new Image("img/femenino.png");
            }
            this.sexo.setImage(image3);
            pb3.setStyle("-fx-accent: green");

        }

        public void datosPokemon4(ImageView this.sexo){

            nombre4.setText(Pokemon4.getNombre());
            nivel4.setText(Pokemon4.getNivel());
            vida4.setText(Pokemon4.getvida());
            Image image4;
            if (Pokemon1.getSexo() == 'M') {
                image4 = new Image("img/masculino.png");
            } else {
                image4 = new Image("img/femenino.png");
            }
            this.sexo.setImage(image4);
            pb4.setStyle("-fx-accent: green");

        }


        public void datosPokemon5(ImageView this.sexo){
            nombre5.setText(Pokemon5.getNombre());
            nivel5.setText(Pokemon5.getNivel());
            vida5.setText(Pokemon5.getvida());

            Image image5;
            if (Pokemon1.getSexo() == 'M') {
                image5 = new Image("img/masculino.png");
            } else {
                image5 = new Image("img/femenino.png");
            }
            this.sexo.setImage(image5);
            pb5.setStyle("-fx-accent: green");

        }


        public void datosPokemon6(ImageView this.sexo){
            nombre6.setText(Pokemon6.getNombre());
            nivel6.setText(Pokemon6.getNivel());
            vida6.setText(Pokemon6.getvida());
            Image image6;
            if (Pokemon1.getSexo() == 'M') {
                image6 = new Image("img/masculino.png");
            } else {
                image6 = new Image("img/femenino.png");
            }
            this.sexo.setImage(image6);
            pb6.setStyle("-fx-accent: green");

        }
    }



}
