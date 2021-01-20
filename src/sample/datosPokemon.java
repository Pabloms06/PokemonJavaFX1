package sample;

public class datosPokemon {


        private String nombre;
        private String nivel;
        private String vida;
        private char sexo;
        private String nivelpb;


    public datosPokemon(String nombre, String nivel, String vida, char sexo,String nivelpb) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = vida;
        this.sexo = sexo;
        this.nivelpb= nivelpb;
    }


    public String getNombre()
        {
            return nombre;
        }

        public String getNivel()
        {
            return nivel;
        }

        public int getvida()
        {
            return vida;
        }

        public char getSexo() {
            return sexo;
        }

        public char getnivelpb() {
        return nivelpb;
        }

        public void setNombre (String nombre) {
        this.nombre = nombre;
        }

        public void setNivel (String nivel) {
        this.nivel = nombre;
        }

        public void setVida (String vida){
        this.vida=vida;
        }

        public setsexo (char sexo){
        this.sexo=sexo;
        }

        public setnivelpb (String nivelpb){
        this.nivelpb=nivelpb;
        }

    public String getActualLife() {
    }

    public String getMaxLife() {
    }
}