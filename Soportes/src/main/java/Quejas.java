
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class Quejas {
    //atributos
    Scanner leer = new Scanner(System.in);
    String quej;
    
    //metodos
    public void quejasIN(){
            quej=leer.nextLine();
            System.out.println("gracias por sus comentarios. Estaremos al pendiente para mejorarlo");
        }
}

