package sample;

public class datosPokemon {


        private String nombre;
        private int nivel;
        private int vida;
        private char sexo;

    public datosPokemon(String nombre, int nivel, int vida, char sexo) {
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
    public String setNombre(String nombre)
    {
        return nombre;
    }

    public int setNivel(int nivel)
    {
        return nivel;
    }

    public int setvida(int vida)
    {
        return vida;
    }

    public char setSexo(char sexo) {
        return sexo;
    }


    @Override
    public String toString() {
        return "datosPokemon{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", vida=" + vida +
                ", sexo=" + sexo +
                '}';
    }
}