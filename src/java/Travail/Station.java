/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Travail;
import java.util.*;

public class Station
{ 
	private int code ;
        private String nom;
        private int capacite;
	private String cp;
        private String complementAdr;
        private String commentaire;
        public String image;
  	public Station()
	{
	}

	public Station(int pcode, String pnom, int pcapacite, String pcp, String pcomplementAdr, String pcommentaire, String pimage)
  	{
            code = pcode;
            nom = pnom;
            capacite = pcapacite;
            cp = pcp;
            complementAdr = pcomplementAdr;
            commentaire = pcommentaire;
            image = pimage;
  	}
  	
     	public int getCode() 
	{ 
   		return code; 
  	}
        public String getNom() 
	{ 
   		return nom; 
  	}
   	public int getCapacite() 
	{ 
   		return capacite; 
  	}
        public String getCp()
        { 
   		return cp; 
  	}
  	public String getComplementAdr()
        { 
   		return complementAdr; 
  	}
  	public String getCommentaire()
        { 
   		return commentaire; 
  	}
        public String getImage()
        { 
   		return image; 
  	}
 	public void setCode(int pcode)
	{
   		code = pcode; 
  	}
        public void setNom(String pnom)
	{
   		nom = pnom; 
  	}
        public void setCapacite(int pcapacite)
	{
   		capacite = pcapacite; 
  	}
    	public void setComplementAdr(String pcomplementAdr) 
	{
   		complementAdr = pcomplementAdr; 
  	}
  	public void setCommentaire(String pcommentaire)
	{
   		commentaire = pcommentaire; 
  	}
        public void setImage(String pimage)
	{
   		image = pimage; 
  	}
}