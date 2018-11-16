import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a16016772
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        // Date puede se convertido a String con el método toString()
        // Usa una sintaxis general del tipo DD MM dd HH:mm:ss
        Date date = new Date();
        
	// Se pueden definir formatos diferentes con la clase DateFormat
	// Obtenemos la fecha y la hora con el formato yyyy-MM-dd HH:mm:ss
	DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss\n");
        String variable = hourdateFormat.format(date);
        System.out.println(variable);
        
        Logger logger = new Logger();
        
        FileWriter fichero = null; //FileWriter es para especificar el archivo en el que vas a escribir.
        PrintWriter pw = null;
        try{
            fichero = new FileWriter("D:\\Actividad 3 - Arquitectura de Software\\src\\archivo.txt\\");
            pw = new PrintWriter(fichero);
            
            pw.println(variable);
            
            pw.println(logger.debug("Iniciar Programa"));
            pw.println(logger.info("Terminar Programa"));
            pw.println(logger.trace("Corrigiendo errores del Programa"));
            pw.println(logger.fatal("Funcionamiento erroneo del Programa"));
            pw.println(logger.error("Error en el Programa"));
            pw.println(logger.warning("Peligro en el Programa"));
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // El finally  es para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
        
    }
    
}
