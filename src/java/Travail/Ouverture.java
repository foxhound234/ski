/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Travail;

/**
 *
 * @author Rabelais
 */
public class Ouverture {
    private int codepiste;
    private String Ouverture;
    private  String  Jour;
      private  Piste LaPiste;

    public Ouverture(int codepiste, String Ouverture, String Jour, Piste LaPiste) {
        this.codepiste = codepiste;
        this.Ouverture = Ouverture;
        this.Jour = Jour;
        this.LaPiste = LaPiste;
    }
      
    public int getCodepiste() {
        return codepiste;
    }

    public void setCodepiste(int codepiste) {
        this.codepiste = codepiste;
    }

    public String getOuverture() {
        return Ouverture;
    }

    public void setOuverture(String Ouverture) {
        this.Ouverture = Ouverture;
    }

    public String getJour() {
        return Jour;
    }

    public void setJour(String Jour) {
        this.Jour = Jour;
    }

    public Piste getLaPiste() {
        return LaPiste;
    }

    public void setLaPiste(Piste LaPiste) {
        this.LaPiste = LaPiste;
    }

 
}
