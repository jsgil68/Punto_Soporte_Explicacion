
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author USUARIO
 */
public class Envio {

    String correo = "", direccion = " ";
    int hogar = 0;
    Scanner leer = new Scanner(System.in);
    Scanner rr = new Scanner(System.in);
    
    public void catalogoCorreo() {
        System.out.print("Ingrese su correo: ");
        correo = leer.nextLine();
        System.out.print("Se le enviara un correo con el catalogo el 1ro de cada mes a este correo: " + correo);
    }

    public void direccionEnvio() {
        System.out.println("Su direccion es:");
        System.out.println("1. casa");
        System.out.println("2. trabajo");
        hogar = leer.nextInt();
        switch (hogar) {
            case 1:
                System.out.print("Ingrese su direccion: ");
                direccion = rr.nextLine();
                System.out.print("Sus pedidos seran enviados a: " + direccion);
                break;
            case 2:
                System.out.print("Ingrese su direccion: ");
                direccion = rr.nextLine();
                System.out.print("Sus pedidos seran enviados a: " + direccion);
                break;
        }

    }

}
