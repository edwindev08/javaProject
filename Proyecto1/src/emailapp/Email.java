package emailapp;
/**
 * @author edwgarca
 */
import java.util.Scanner;
public class Email {
    private String nombre;
    private String apellido;
    private String password;
    private String departamento;
    private int mailboxCapacity;
    private String alternateMail;
    
    //Constructor para recibir nombre y apellido
    public Email(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("EMAIL CREADO: " + this.nombre + "." + this.apellido + "@mail.com");
        //Metodo para preguntar por el departamento
        this.departamento = setDepartamento();
        //Muestro el departamento seleccionado..
        System.out.println("Usted pertenece al Departamento: " + this.departamento);
    }
    
    //Preguntar por el departamento
    private String setDepartamento(){
        System.out.print("Seleccione su Departamento\n1 para Vantas\n2 para Desarrollo\n3 para Cuentas\n4 para Ninguno\n");
        Scanner in = new Scanner(System.in);
        int depOpcion = in.nextInt();
        /**if (depOpcion == 1){ return "ventas";}
        else if (depOpcion == 2){ return "devs";}
        else if (depOpcion == 3){ return "cuentas";}
        else { return "";}**/
        //Reemplazo con la función Switch
         switch (depOpcion) {
            case 1:
                return "ventas";
            case 2:
                return "devs";
            case 3:
                return "cuentas";
            default:
                return "";
        }
    }
    
    //Generar password aleatoria
    
    //Definir el tamaño del mailbox
    
    //Cambiar el password
    
    
    
    
}
