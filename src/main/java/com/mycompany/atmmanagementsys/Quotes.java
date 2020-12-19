
package com.mycompany.atmmanagementsys;

import java.util.Random;


public class Quotes {
    
    String quote ;
    
    public String returnQuotes(){
    
    
    Random ran = new Random();
        int num = ran.nextInt(7);

        switch (num) {

            case 0:
               quote  = "Money mdanagement";
                
                break;
            case 1:
                quote  = "Money Management";
                break;
            case 2:
                quote  = "Money Management";
                break;
            case 3:
                quote  = "Money Management";
                break;
            case 4:
                quote  = "Money Management";
                break;
            case 5:
                quote  = "Money Management";
                break;

            case 6:
                quote  = "Money Management";
    
    
    
    }
    
    
    return quote;
    
    
    }
    
}
