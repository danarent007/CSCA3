/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DanielVorster
 */
public class HashFunctions {
    
    public int tableSize = 1000;
    
    
    
    public int WorstCase(String key){
        return 1;
    }
    
    
    
    public int H1(String key){
        int hash = 0;
        for (int i = 0; i < key.length(); i++) 
        {
            hash = hash + key.charAt(i);
        }
        hash = hash % tableSize;
        return hash;              
    }
    
    
    public int OwnHash(String key){
        int hash = 0;
        for (int i = 0; i < key.length(); i++) 
        {
            hash = ((789*hash) + key.charAt(i)) % tableSize;
        }
        hash = hash % tableSize;
        return hash;  
        
    }
    
    public int H2(String key){
        return key.hashCode();
    }

    
    
    
    
    
}
