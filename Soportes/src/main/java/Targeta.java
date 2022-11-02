
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author USUARIO
 */
public class Targeta {

    Scanner leer = new Scanner(System.in);
    String nombre = "  ";
    int metodo = 0, num = 0, conf = 0;

    public void pagoTargeta() {
        System.out.println("..::PAGO TARGETA::..");
        System.out.println("1. Debito");
        System.out.println("2. Credito");
        metodo = leer.nextInt();
        switch (metodo) {
            case 1:
                System.out.println("..::PAGO DEBITO::..");
                System.out.print("Ingrese su nombre: ");
                nombre = leer.nextLine();
                System.out.print("Ingrese el numero de la targeta: ");
                num = leer.nextInt();
                System.out.print("Ingrese la contraseña: ");
                num = leer.nextInt();
                
                break;
            case 2:
                System.out.println("..::PAGO CREDITO::..");
                System.out.print("Ingrese su nombre: ");
                nombre = leer.nextLine();
                System.out.print("Ingrese el numero de la targeta: ");
                num = leer.nextInt();
                System.out.print("Ingrese el CVC: ");
                num = leer.nextInt();
                System.out.print("Ingrese el año de caducidad: ");
                num = leer.nextInt();
                
                break;
        }

    }
}
