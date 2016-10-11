/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleats;

import java.util.ArrayList;

/**
 *
 * @author Julieta
 */
public class Empresa {
    private String nom;
    private static int souBase = 800;
    ArrayList<Empleats> empresa;
     
    public Empresa(){
        this.empresa = new ArrayList<>();
    }
    public Empresa(String nom){
        this.nom = nom;
        this.empresa = new ArrayList<>();
    }
    private boolean add(Empleats e){
        return this.empresa.add(e);
    }

    @Override
    public String toString() {
        return "Empresa{" + "nom=" + nom + ", empresa=" + empresa + '}';
    }
    public static void main(String[] args) {
        System.out.println("HOLAAA");
        Empresa emp = new Empresa("Empresa nova");
        Empleats e = new Empleats("Maria", souBase+1000);
        Empleats e1 = new Empleats("Joan", souBase+2000);
        
        emp.add(e);
        emp.add(e1);
        
        System.out.println("Hola"+emp.toString());
    }
}

