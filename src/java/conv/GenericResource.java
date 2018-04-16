/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conv;

import javax.ejb.Stateless;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Rafael
 */
@Stateless
@Path("generic")

public class GenericResource {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String conversorApplication(@QueryParam("number") int number) {
        String res = conversorDecToBin(number);
        return res;
    }
    
    public String conversorDecToBin(int number) {
       if(number <= 1) {
           return number+"";
       } else {
           return conversorDecToBin(number/2) +  number%2;
       }
   }
    
}
