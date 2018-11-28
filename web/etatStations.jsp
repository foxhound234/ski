<%@ page contentType="text/html" pageEncoding="UTF8" %>
<!DOCTYPE html>
        <%@ include file="entete_inc.html" %>
        <%@ page import="java.util.*" %>
        <%@ page import="Travail.*" %>
        <div id="corps">
                <table>
                <%		
                    Date today = new Date();
                %>
                <caption>Etat des stations au <%=today.toString()%></caption>
                <tr><th>Station</th><th>Haut piste</th><th>Bas piste</th><th>Option</th></tr>    
                    <%
                        ArrayList lesOuvertures = (ArrayList)request.getAttribute("lesOuvertures");
                        int i,j;
                        ArrayList lesEnneigements = (ArrayList)request.getAttribute("lesEnneigements");
                        for(i=0;i<lesEnneigements.size();i++)
                        {
                            Enneig unEnneigement = (Enneig)lesEnneigements.get(i);
                            %>
                            <tr><td><%= unEnneigement.getLaStation().getNom() %></td>
                                <td><%= unEnneigement.getHaut() %></td>
                                <td><%= unEnneigement.getBas() %></td>
                                <%
                                    String tabHTML = "<table><tr><th>Code piste</th><th>Nom de la piste</th><th>Etat</th></tr>";
                                    
                                    for(j=0;j<lesOuvertures.size();j++)
                                    {
                                        Ouverture uneOuverture = (Ouverture)lesOuvertures.get(j);
                                        if (unEnneigement.getLaStation().getCode()==uneOuverture.getLaPiste().getCodeStation())
                                        {
                                            tabHTML += "<tr><td>" + uneOuverture.getLaPiste().getCodePiste()  + "</td>";
                                            tabHTML += "<td>" + uneOuverture.getLaPiste().getNomPiste() + "</td>";
                                            tabHTML += "<td>" + uneOuverture.getOuvert() + "</td></tr>";
                                        }
                                    }
                                    tabHTML += "</table>";
                                %>
                                <td><a href="javascript:afficheOuvertures('<%= tabHTML %>')">Voir les ouvertures</a></td>
                            </tr>
                            <%
                        }
                        %>
                </table>
             <br/>
             
        </div>
        <span id="ouvertures">
        </span>


