package sample;

public class datosPokemon {


        private String nombre;
        private String nivel;
        private String vida;
        private char sexo;

    public datosPokemon(String nombre, String nivel, String vida, char sexo) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = vida;
        this.sexo = sexo;
    }


    public String getNombre()
        {
            return nombre;
        }

        public String getNivel()
        {
            return nivel;
        }

        public String getvida()
        {
            return vida;
        }

        public char getSexo() {
            return sexo;
        }
}