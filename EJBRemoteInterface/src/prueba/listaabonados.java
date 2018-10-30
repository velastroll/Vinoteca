/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import ejb.GUsuarioRemote;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;
import javax.naming.InitialContext;
import javax.naming.NamingException;


/**
 *
 * @author Alvaro
 */
public class listaabonados {
    BufferedReader brConsoleReader = null; 
    Properties props;
    static InitialContext ctx;
   {
      props = new Properties();
      try {
         props.load(new FileInputStream("jndi.properties"));
      } catch (IOException ex) {
         ex.printStackTrace();
      }
      try {
         ctx = new InitialContext(props);            
      } catch (NamingException ex) {
         ex.printStackTrace();
      }
      brConsoleReader = 
      new BufferedReader(new InputStreamReader(System.in));
   }
    
    public static void main (String args[]) throws NamingException{
        
        boolean result;
        
        GUsuarioRemote gUsuario;
        gUsuario = (GUsuarioRemote) ctx.lookup("GUsuario/remote");
        
        System.out.print("\nINSERTAMOS un abonado > Prueba1: ");
        result = gUsuario.addAbonado("111222333", "Prueba1", "Apellido1", "probatore", "123abc");
        System.out.print(result);
        
        System.out.print("\nINSERAMOS otro abonado > Prueba2:  ");
        result = gUsuario.addAbonado("222333444", "Prueba2", "Apellido2", "probatore2", "123abc");
        System.out.print(result);
        
        System.out.print("\nBORRAMOS el primero: ");
        result = gUsuario.delAbonado("111222333");
        System.out.print(result);
        
        System.out.print("\nNif de Prueba1: " + gUsuario.getNif("Prueba1"));
    }
    
}
