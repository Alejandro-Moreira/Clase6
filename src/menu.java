public class menu {
    public static void main(String[] args) {
        Persona miPersona = new Persona(1719447664, "Sandra", "Jacho", "Dos Puentes", "0984436361");
        Persona Pedro = new Persona();
        System.out.println(miPersona.getTelefono());
        System.out.println(Pedro.getTelefono());
        Estudiante Alejandro = new Estudiante(1752717932, "Alejandro", "Moreira", "Dos Puentes", "0967881741", 202020216, "moreiramikel11@gmail.com", "Tercero", "TSDS");
        Alejandro.caminar();
        Alejandro.estudiar();
        Alejandro.trabajar();
        Alejandro.memorizar();
        Alejandro.leer();

        Estudiante Jared = new Estudiante();
        Jared.setNombre("Jared");
        System.out.println("Nombre: " +Jared.getNombre());
        Jared.caminar();
        Jared.estudiar();
        Jared.trabajar();
        Jared.memorizar();
        Jared.leer();

        Doctor Ana=new Doctor();
        Ana.setNombre("Ana");
        System.out.println("Nombre: " +Ana.getNombre());
        Ana.setEdad(33);
        System.out.println("Edad: " +Ana.getEdad());
        Ana.setSigno("Leo");
        System.out.println("Signo: " +Ana.getSigno());
        Ana.examinar();

        Empleado_publico Pablo=new Empleado_publico();
        Pablo.setNombre("Pablo");
        System.out.println("Nombre: " +Pablo.getNombre());
        Pablo.setTelefono("0992049963");
        System.out.println("Teléfono: " +Pablo.getTelefono());
        Pablo.tramitar();

        Futbolista Maritza=new Futbolista();
        Maritza.setNombre("Maritza");
        System.out.println("Nombre: " +Maritza.getNombre());
        Maritza.setEntrena("5 horas");
        System.out.println("Entrena: " +Maritza.getEntrena());
        Maritza.correr();

        Estudiante Melani=new Estudiante();
        Melani.setNombre("Melani");
        System.out.println("Nombre: " +Melani.getNombre());
        Melani.setSemestre("Tercer");
        System.out.println("Semestre: " +Melani.getSemestre());
        Melani.leer();
    }
}
