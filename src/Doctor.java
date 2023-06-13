import java.util.Date;

public class Doctor extends Persona{
    private int codigo;
    private String especialidad;
    private Date horario;
    private String hospital;
    private int edad;
    private String signo;
    public Doctor() {
        super();
    }
    public Doctor(int CI, String nombre, String apellido, String direccion, String telefono,int codigo,String especialidad,String hospital,Date horario,int edad,String signo) {
        super(CI, nombre, apellido, direccion, telefono);
    //atributos propios de la clase doctor
        this.codigo=codigo;
        this.especialidad=especialidad;
        this.hospital=hospital;
        this.horario=horario;
        this.edad=edad;
        this.signo=signo;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Date getHorario() {
        return horario;
    }

    public void setHorario(Date horario) {
        this.horario = horario;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
    public void examinar() {
        System.out.println("Este es el método examinar que pertenece a Doctor");
    }
}
