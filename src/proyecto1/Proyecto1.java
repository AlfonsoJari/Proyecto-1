package proyecto1;

public class Proyecto1 {

    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        
//        ConexionDB con;
//        con = ConexionDB.getInstance();
//        con = new ConexionDB();

        Persona p = new Persona();
        p.setClave("01");
        p.setNombre("Juan");
        p.setDireccion("Av 1");
        p.setTelefono("777");
        
        DAOPersona daoP = new DAOPersona();
        boolean r = daoP.guardar(p);
        if (r) {
            System.out.println("Se guardo correctamente");
        } else {
            System.out.println("Error");
        }
        
    }
    
}
