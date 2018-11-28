<%@ page contentType="text/html" pageEncoding="UTF8" %>
<!DOCTYPE html>
        <%@ include file="entete_inc.html" %>
        <%@ page import="java.util.*" %>
        <%@ page import="Travail.*" %>
        <div id="corps">
                <form method="post" action="ControleurSki?choix=0">
                <table>
                    <caption>Stations des Pyrénées</caption>
                <tr><th>Code station</th><th>Nom station</th><th>Capacité</th></tr>    
                    <%
                        ArrayList colSta = (ArrayList)request.getAttribute("colSta");
                        for(int i=0;i<colSta.size();i++)
                        {
                            Station uneStation = (Station)colSta.get(i);
                            %>
                            <tr><td><a href="ControleurSki?choix=2&code=<%= uneStation.getCode() %>"><%= uneStation.getCode() %></a></td>
                                <td><a href="ControleurSki?choix=2&code=<%= uneStation.getCode() %>"><%= uneStation.getNom() %></a></td>
                                <td><a href="ControleurSki?choix=2&code=<%= uneStation.getCode() %>"><%= uneStation.getCapacite() %></a></td>
                            </tr>
                            <%
                        }
                        %>
                        
                </table>   
                <input type="submit" name="btnValid" value="Retour">
                </form>
             
        </div>



