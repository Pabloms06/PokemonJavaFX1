package sample;

public class datosPokemon {


        private String nombre;
        private int nivel;
        private int vida;
        private char sexo;

    public datosPokemon(String nombre, int nivel, int vida, String sexo) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = vida;
    }


    public String getNombre()
        {
            return nombre;
        }

        public int getNivel()
        {
            return nivel;
        }

        public int vida()
        {
            return vida;
        }

        public char getSexo(){
            return sexo;
        }

    }