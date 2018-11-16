/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a16016772
 */
public class Logger {
    
    private static Logger instance;
    
    public static Logger getInstance(){
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
    
    public String debug(String mensaje){
        System.out.println("DEBUG: " + mensaje);
        return mensaje;
    }
    
    public String info(String mensaje){
        System.out.println("INFO: " + mensaje);
        return mensaje;
    }
    
    //TRACE
    public String trace (String mensaje){
        System.out.println("TRACE: " + mensaje);
        return mensaje;
        
    }
    
    //FATAL
    public String fatal (String mensaje){
        System.out.println("FATAL: " + mensaje);
        return mensaje;
    }
    
    //ERROR
    public String error (String mensaje){
        System.out.println("ERROR: " + mensaje);
        return mensaje;
    }
    
    //WARNING
    public String warning (String mensaje){
        System.out.println("WARNING: " + mensaje);
        return mensaje;
    }
    
}
