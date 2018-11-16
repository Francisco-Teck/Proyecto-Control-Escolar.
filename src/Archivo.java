
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a16016772
 */
public class Archivo {
    
    public void guardarArchivo(ArrayList log) throws IOException {
        String ruta = "C:\\Users\\Alex Cortés\\Desktop\\log.txt";
        File archivo = new File(ruta);
        BufferedWriter bw;
        if(archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            for (Object dato : log) {
                bw.write((String) dato);
                bw.newLine();
            }
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            for (Object dato : log) {
                bw.write((String) dato);
                bw.newLine();
            }
        }
        bw.close();
    }
    
    
}
