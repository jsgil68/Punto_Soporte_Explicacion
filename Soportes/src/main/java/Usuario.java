
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JUAN
 */
public class Usuario {
    
    
    private ArrayList<EmpresaPrincipal> inve = new ArrayList();

    public void setInve(ArrayList<EmpresaPrincipal> inve) {
        this.inve = inve;
    }

    public ArrayList<EmpresaPrincipal> getInve() {
        return inve;
    }

    @Override
    public String toString() {
        return "Usuario{" + "inve=" + inve + '}';
    }

    public void recibirCatalogo(String catalogo){
        System.out.println(catalogo);
    
    }
    
}
