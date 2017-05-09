//Daniel Vorster
//VRSDAN004
//23 April 2017
//Generate testing files

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.ArrayList;



/**
 * The QueryFileGenerator is used to generate a query file by randomly selecting n entries from the data file.
 * @author DanielVorster
 */
public class QueryFileGenerator
{
    
    static Scanner s = new Scanner(System.in);
   
    
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        
        
        
        System.out.println("Enter file length:");
        int len = s.nextInt();
        ArrayList<String> l = new ArrayList<String>();
        
        BufferedReader br = new BufferedReader(new FileReader("testdata"));
        
        PrintWriter pw = new PrintWriter(new FileWriter("querydata"));
        PrintWriter pa = new PrintWriter(new FileWriter("querydatafull"));
        
        String tmp = br.readLine();
        while(tmp != null)
        {
            l.add(tmp);
            tmp = br.readLine();
        }
        
        for (int i = 0; i < len; i++)
        {
            
            int ind = ThreadLocalRandom.current().nextInt(0, l.size());
            String data = l.get(ind);
            pa.println(data);
      
            String[] data1 = data.split("\\|");
            pw.println(data1[2]);
        }
        pw.close();
        
        
    }
    
}
