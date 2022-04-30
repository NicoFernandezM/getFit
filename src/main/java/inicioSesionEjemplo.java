import java.util.Scanner;

public class inicioSesionEjemplo {

    public static void main(String[] args){
        Scanner x= new Scanner(System.in);
        String us ="Gonzalo", pass="1234h";
        String user, password;

        System.out.print("ingrese su usuario");
        user=x.nextLine();
        System.out.println("Ingrese su contraseña");
        password=x.nextLine();

        int intentos=0;
        if(us.equals(user)&& pass.equals(password)){
            System.out.println("Bienvenido al sistema");
        }

        while (pass.equals(password)==false&&intentos<3){
            System.out.println("Hay un error en los datos, intete nuevamente");
        }

    }




}
