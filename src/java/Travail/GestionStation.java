/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Travail;

import java.sql.*;
import java.util.*;
import sql.*;

/**
 *
 * @author Administrateur
 */
public class GestionStation
{
    Statement stmt = null;
    
    public GestionStation()
    {
        stmt = GestionBdd.connexionBdd(GestionBdd.TYPE_MYSQL, "ski", "localhost", "root", "");
    }
    public ArrayList getListe() 
    {
 	ArrayList listeRetour = new ArrayList();
 	
 	try
   	{
            ResultSet rs = stmt.executeQuery("select codestation, nomstation, capacitestation, codepostal,"
                    + " complementadresse, commentaire, image from station");
                    
            while(rs.next())
            {
                Station uneStation=new Station(rs.getInt("codestation"),rs.getString("nomstation"),rs.getInt("capacitestation"), rs.getString("codepostal"), rs.getString("complementadresse"), rs.getString("commentaire"), rs.getString("image"));
    		listeRetour.add(uneStation);
            }
            rs.close();
            stmt.close();
            return listeRetour;
 	}
        
   	catch (SQLException sqle)
   	{
            System.out.println("Erreur accès base " + sqle.getMessage());
            return null;
	}
   }
   
   public Station getStation(String pcode) 
    {
 	try
   	{
            ResultSet rs = stmt.executeQuery("select codestation, nomstation, capacitestation, codepostal,"
                    + " complementadresse, commentaire, image from station where codestation = " + pcode);
                    
            rs.first();
            Station uneStation=new Station(rs.getInt("codestation"),rs.getString("nomstation"),rs.getInt("capacitestation"), rs.getString("codepostal"), rs.getString("complementadresse"), rs.getString("commentaire"), rs.getString("image"));
            
            rs.close();
            stmt.close();
            return uneStation;
 	}
        
   	catch (SQLException sqle)
   	{
            System.out.println("Erreur requete getStation : " + sqle.getMessage());
            return null;
	}
   }
   public ArrayList getEnneigement() throws SQLException
   {
     ArrayList listeRetour = new ArrayList();
       try
       {
         ResultSet rs = stmt.executeQuery("SELECT JOUR, station.CODESTATION, BASPISTE, HAUTPISTE,station.NOMSTATION,station.CAPACITESTATION,station.CODEPOSTAL,\n" +
                                            "station.COMPLEMENTADRESSE,station.COMMENTAIRE,station.image" +
                                             "FROM enneig, station" +
                                                  "WHERE enneig.CODESTATION=station.CODESTATION");
         
                     
       }
       	catch (SQLException sqle)
   	{
            System.out.println("Erreur requete getStation : " + sqle.getMessage());
            return null;
	}
       return  listeRetour;
   }
}
