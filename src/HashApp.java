
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DanielVorster
 */
public class HashApp {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        
        //for (int i = 0; i < Integer.parseInt(args[0]); i++)
        
            
           
            BufferedReader br = new BufferedReader(new FileReader("querydata"));
            
            PrintWriter WorstCase = new PrintWriter(new FileWriter("WorstCase.txt"));
            PrintWriter H1 = new PrintWriter(new FileWriter("Hash1.txt"));
            PrintWriter H2 = new PrintWriter(new FileWriter("Hash2.txt"));
            PrintWriter OwnHash = new PrintWriter(new FileWriter("OwnHash.txt"));
            
            String tmp = br.readLine();
            
            HashFunctions h = new HashFunctions();
            
            while (tmp != null)
            {
                String tmp1 = new Entry(tmp).getName();
                WorstCase.println(h.WorstCase(tmp1));
                H1.println(h.H1(tmp1));
                H2.println(h.H2(tmp1));
                OwnHash.println(h.OwnHash(tmp1));
                
                tmp = br.readLine();
            }
            
            WorstCase.close();
            H1.close();
            H2.close();
            OwnHash.close();
            
            
            
          
        
        
    
}

}