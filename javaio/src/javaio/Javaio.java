/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaio;
import java.io.IOException;
        import java.nio.file.Files;
                import java.nio.file.Path;
import java.nio.file.StandarOpenOptions;
                      
/**
 *
 * @author JC
 */
public class Javaio {
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Path ruta = Path.of("alumnos_nio.txt");
        
        try{
            Files.vritedString(ruta
            ,"280641 = Akzel"
                    ,
            )
        }
                
                
        
        
        // TODO code application logic here
    }
    
}
