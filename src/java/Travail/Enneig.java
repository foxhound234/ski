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
public class Enneig {
   private String Jour;
   private double  bas,Haut;
   private Station laStation;


    public Enneig(String Jour, double basPiste, double Hautpiste, Station laStation) {
        this.Jour = Jour;
        this.bas = basPiste;
        this.Haut= Hautpiste;
        this.laStation = laStation;
    }
      public Enneig()
      {
          
      } 

    public String getJour() {
        return Jour;
    }

    public void setJour(String Jour) {
        this.Jour = Jour;
    }

    public Station getLaStation() {
        return laStation;
    }

    public double getBas() {
        return bas;
    }

    public void setBas(double bas) {
        this.bas = bas;
    }

    public double getHaut() {
        return Haut;
    }

    public void setHaut(double Haut) {
        this.Haut = Haut;
    }

    public void setLaStation(Station laStation) {
        this.laStation = laStation;
    }
   
   
}
