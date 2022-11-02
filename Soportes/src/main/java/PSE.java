
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class PSE {
    Scanner leer = new Scanner(System.in);
    String nombre = "  ", correo = " ";
    int num=0, conf=0;
    
    public void pagoPSE(){     
       System.out.println("..::PAGO PSE::..");
       System.out.print("Ingrese su nombre: ");
       nombre=leer.nextLine();
       System.out.print("Ingrese su correo: ");
       correo=leer.nextLine();
       System.out.print("Ingrese su token: ");
       num=leer.nextInt();

   }
    
    
}
