/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleats;

/**
 *
 * @author Julieta
 * 
 * Utilització de constants
 * Reanomenar
 * Moure
 * Extraure a una variable local
 * Convertir una variable local en un camp
 * Extreure una interficie
 * Extreure el metode
 */

/* ENUNCIAT
Tenim una empresa amb 10 empleats, dels quals volem saber el seu nom i sou.
El sou d'aquests empleats dependrà d'un sou base que serà de 800€ més els complements.
Realitzeu un programa que guarde el empleats i el seu sou. Per a donar d'alta un empleat
posarem el seu nom i el diners que rep com a complement (ja que el sou base ja el sabem)
i quant ens mostre el llistat d'empleats veurem per cada un el nom i el sou.

*/

public class Empleats {
    private String nom;
    private int sou;

    public Empleats(String nom, int sou) {
        this.nom = nom;
        this.sou = sou;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getSou() {
        return sou;
    }

    public void setSou(int sou) {
        this.sou = sou;
    }

    @Override
    public String toString() {
        return "Empleats{" + "nom=" + nom + ", sou=" + sou + '}';
    }

    
    
    /**
     * @param args the command line arguments
     */
}
