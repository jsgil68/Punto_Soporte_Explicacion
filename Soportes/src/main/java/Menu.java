
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author USUARIO
 */
public class Menu {
    Quejas que = new Quejas();
    Envio env = new Envio();
    Usuario usuario = new Usuario();
    PSE pagos = new PSE();
    Targeta pagoss = new Targeta();
    Scanner leer = new Scanner(System.in);
    int confcompra = 0;
    int ca = 50, can = 20, cant = 70, a = 0, b = 0, c = 0, compra = 0, po = 0, total = 0, pago = 0, conf = 0;
    int cancela = 0, cancelb = 0 ,cancelc = 0;

    public void menuInicio() {
Quejas que = new Quejas();
        do {
            EmpresaPrincipal inv1 = new EmpresaPrincipal(1234, "Audifonos", 15000, ca);
            EmpresaPrincipal inv2 = new EmpresaPrincipal(1235, "Celular", 600000, can);
            EmpresaPrincipal inv3 = new EmpresaPrincipal(1236, "Cargador", 10000, cant);
            System.out.println("\n   ..::INICIO::..");
            System.out.println("1.Consultar catalogo");
            System.out.println("2.Pedir catalogo mensualmente");
            System.out.println("3.Agregar al carrito");
            System.out.println("4.Definir direccion de envio");
            System.out.println("5.Realizar el pago");
            System.out.println("6.Cancelar pedido");
            System.out.println("7.Realizar una queja");
            System.out.println("8.Salir");
            po = leer.nextInt();
            switch (po) {
                case 1:
                    System.out.println("                                  ..::CATALOGO::..");
                    System.out.print("1. ");
                    usuario.recibirCatalogo(inv1.toString());
                    System.out.print("2. ");
                    usuario.recibirCatalogo(inv2.toString());
                    System.out.print("3. ");
                    usuario.recibirCatalogo(inv3.toString());
                    break;
                case 2:
                    env.catalogoCorreo();
                break;
                case 3:
                    System.out.println("ingrese el numero del producto que desea comprar");
                    System.out.println("1.Audifonos");
                    System.out.println("2.Celular");
                    System.out.println("3.Cargador");
                    System.out.println("4.Salir");
                    compra = leer.nextInt();
                    switch (compra) {
                        case 1:
                            System.out.println("cuantos Audifonos desea comprar?");
                            a = leer.nextInt();
                            if (a <= ca) {
                                total = total + (15000 * a);
                                ca = ca - a;
                            } else {
                                System.out.println("No hay tantos audifonos");
                            }
                            break;
                        case 2:
                            System.out.println("cuantos Celulares desea comprar?");
                            b = leer.nextInt();
                            if (b <= can) {
                                total = total + (600000 * b);
                                can = can - b;
                            } else {
                                System.out.println("No hay tantos audifonos");
                            }
                            break;
                        case 3:
                            System.out.println("cuantos Cargadores desea comprar?");
                            c = leer.nextInt();
                            if (c <= cant) {
                                total = total + (10000 * c);
                                cant = cant - c;
                            } else {
                                System.out.println("No hay tantos audifonos");
                            }
                            break;
                    }
                    break;
                case 4:
                    env.direccionEnvio();
                break;
                case 5:

                    System.out.println("El total de la compra es: " + total);
                    System.out.println("Como desea realizar el pago?");
                    System.out.println("1. PSE");
                    System.out.println("2. TARGETA");
                    pago = leer.nextInt();
                    switch (pago) {
                        case 1:
                            if (total > 0) {

                                pagos.pagoPSE();
                                System.out.print("Escriba 1 para confirmar el pago ");
                                conf = leer.nextInt();
                                if (conf == 1) {
                                    System.out.println("Pago confirmado");
                                    total = 0;
                                    a=0;
                                    b=0;
                                    c=0;
                                } else {
                                    System.out.println("Error inespesrado ,Pedido cancelado");
                                }

                            } else {
                                System.out.println("no tiene productos para pagar");
                            }
                        case 2:
                            if (total > 0) {

                                pagoss.pagoTargeta();
                                System.out.print("Escriba 1 para confirmar el pago ");
                                conf = leer.nextInt();
                                if (conf == 1) {
                                    System.out.println("Pago confirmado");
                                    total = 0;
                                    a=0;
                                    b=0;
                                    c=0;
                                } else {
                                    System.out.println("Error inespesrado ,Pedido cancelado");
                                }

                            } else {
                                System.out.println("no tiene productos para pagar");
                            }
                            break;
                    }

                    break;
                case 6:
                    System.out.println("ingrese el numero del producto que desea cancelar");
                    System.out.println("1.Audifonos");
                    System.out.println("2.Celular");
                    System.out.println("3.Cargador");
                    System.out.println("4.Salir");
                    compra = leer.nextInt();
                    switch (compra) {
                        case 1:
                            if (a > 0) {
                                System.out.print("Escriba cuantos audifonos desea cancelar ");
                                cancela = leer.nextInt();
                                if (cancela <= a) {
                                    total = total - (15000 * cancela);
                                    ca = ca + cancela;
                                } else {
                                    System.out.println("La cantidad de productos a cancelar supera la agragada al carrito");
                                }
                            } else {
                                System.out.println("no hay audifonos en el carrito");
                            }
                            break;
                        case 2:
                            if (b > 0) {
                                System.out.print("Escriba cuantos audifonos desea cancelar ");
                                cancelb = leer.nextInt();
                                if (cancelb <= b) {
                                    total = total - (600000 * cancelb);
                                    can = can + cancelb;
                                } else {
                                    System.out.println("La cantidad de productos a cancelar supera la agragada al carrito");
                                }
                            } else {
                                System.out.println("no hay celulares en el carrito");
                            }
                            break;
                        case 3:
                            if (c > 0) {
                                System.out.print("Escriba cuantos audifonos desea cancelar ");
                                cancelc = leer.nextInt();
                                if (cancelc <= c) {
                                    total = total - (10000 * cancelc);
                                    cant = cant + cancelc;
                                } else {
                                    System.out.println("La cantidad de productos a cancelar supera la agragada al carrito");
                                }
                            } else {
                                System.out.println("no hay cargadores en el carrito");
                            }
                            break;
                    }
                    break;
                case 7:
                    System.out.println("Escriba su queja:");   
                    
                    que.quejasIN();

                    break;
            }

        } while (po != 8);
    }
}
