<%@ page contentType="text/html" pageEncoding="UTF8" %>
<!DOCTYPE html>
        <%@ include file="entete_inc.html" %>
        <%@ page import="Travail.*" %>
        <% Station uneStation = (Station)request.getAttribute("uneStation"); %>
        <div id="corps">
            <div id="partie_gauche">
                <img src="./images/<%= uneStation.getImage() %>" width="90%" height="100%"/>
            </div>
            <div id="partie_droite">
                <form method="post" action="ControleurSki?choix=1">
                    <span class="texteLong">
                        La station de <%= uneStation.getNom() %> :<br/>
                        <%= uneStation.getCommentaire() %><br/>
                        Capacité : <%= uneStation.getCapacite() %> personnes
                    </span>
                    <br/><br/>
                    <input type="submit" name="btnValid" value="Retour">
                </form>
             
        </div>



