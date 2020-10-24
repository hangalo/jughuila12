/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jug.huila.recursos;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("saudacao")
public class Saudacao {
    
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String saudacaoDoJUG(){
        return "<html><body><h1>Alo Huila - Fenix Innovation </h1> </body> </html>";
    }
}
