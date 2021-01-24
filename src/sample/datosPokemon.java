package sample;

public class datosPokemon {


    public Object numero1;
    public String nombre;
    public String nivel;
    public String vida;
    public String sexo;
    public String nivelpb;


    public datosPokemon(String nombre, String nivel, String vida, String sexo,String nivelpb) {
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

        public boolean getvida()
        {
            return vida;
        }

        public String getSexo() {
            return sexo;
        }

        public String getnivelpb() {
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

        public void setSexo (String sexo){
        this.sexo=sexo;
        }

        public void setnivelpb (String nivelpb){
        this.nivelpb=nivelpb;
        }
}