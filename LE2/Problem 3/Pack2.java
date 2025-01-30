package com.jiet;
import com.juet.Pack1;

public class Pack2 {
    public static void main(String[] args){
        Pack1 pack1 = new Pack1();  
        
        // This will cause a compilation error when display() is protected
        //pack1.display();  // Error: display() has protected access in Pack1
        
        
        pack1.display();
        
    }
}
