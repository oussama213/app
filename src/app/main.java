package app;

import java.io.File;
import java.util.HashMap;

/**
 *
 * @author pc
 */
public class main {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        // lire les fichier +1
        File folder = new File("F:\\memoire\\Corpus\\1");
        
        HashMap<String,Integer> motCompte;
   
        for(File file : folder.listFiles())
        {            
            motCompte=ManipulationFichier.getMotOccurence(file);
            
            if(!motCompte.isEmpty())
            {           
//                traitement sur la base de données
              
            }
                
        }
        
        // lire les fichier -1
        folder = new File("F:\\memoire\\Corpus\\-1");
        
        for(File file : folder.listFiles())
        {            
            motCompte=ManipulationFichier.getMotOccurence(file);
            
            if(!motCompte.isEmpty())
            {           
//                traitement sur la base de données
            }
                
        }
                
    }

       
   
    
}
