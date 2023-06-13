public class Futbolista extends Persona {
    private int N_camiseta;
    private String posicion;
    private String equipo;
    private String representante;
    private String entrena;
    public Futbolista() {
        super();
    }
    public Futbolista(int CI, String nombre, String apellido, String direccion, String telefono, int N_camiseta, String posicion, String equipo, String representante, String entrena) {
        super(CI, nombre, apellido, direccion, telefono);
        //atributos propios de la clase futbolista
        this.N_camiseta = N_camiseta;
        this.posicion = posicion;
        this.equipo = equipo;
        this.representante = representante;
        this.entrena = entrena;
    }

    public String getEntrena() {
        return entrena;
    }

    public void setEntrena(String entrena) {
        this.entrena = entrena;
    }

    public int getN_camiseta() {
        return N_camiseta;
    }

    public void setN_camiseta(int n_camiseta) {
        N_camiseta = n_camiseta;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public void correr() {
        System.out.println("Este es el método correr que pertenece a Futbolista");
    }
}
