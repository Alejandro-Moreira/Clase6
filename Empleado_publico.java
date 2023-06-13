public class Empleado_publico extends Persona{
    private String puesto;
    private String cargo;
    private int codigo;
    public Empleado_publico() {
        super();
    }
    public Empleado_publico(int CI, String nombre, String apellido, String direccion, String telefono,String puesto,String cargo,int codigo) {
        super(CI, nombre, apellido, direccion, telefono);
        //atributos propios de la clase empleado publico
        this.puesto=puesto;
        this.cargo=cargo;
        this.codigo=codigo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public void tramitar() {
        System.out.println("Este es el método tramitar que pertenece a Empleado publico");
    }
}
