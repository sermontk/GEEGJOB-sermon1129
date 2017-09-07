/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack1;

import java.util.ArrayList;
import java.util.*;


//UserクラスにHumanクラスを継承
public class User extends Human{ 
    
    public int open() {
        int total= 0;
        for (int i = 0; i< mycard.size();i++){
        total += mycard.get(i);
     }
        return total;
    }  
        public void setCard(ArrayList<Integer> dh) {
        for (int i = 0; i< dh.size();i++){
        mycard.add(dh.get(i));
    }
        }
 
    public boolean checkSum() {
        if ( open() < 20){return true;}
        else{return false;}
    }
}
