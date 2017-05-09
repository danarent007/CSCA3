
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
        if(args.length < 1){
            args[0] = "1";
        }
        
        //for (int i = 0; i < Integer.parseInt(args[0]); i++)
        
            
            QueryFileGenerator.main(args); //Generate query file (default len = 1)
            BufferedReader br = new BufferedReader(new FileReader("querydata"));
            
            PrintWriter WorstCase = new PrintWriter(new FileWriter("WorstCase.txt"));
            PrintWriter H1 = new PrintWriter(new FileWriter("Hash1.txt"));
            PrintWriter H2 = new PrintWriter(new FileWriter("Hash2.txt"));
            PrintWriter OwnHash = new PrintWriter(new FileWriter("OwnHash.txt"));
            
            
          
        
        
    
}

}