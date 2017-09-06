/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack1;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author t.k
 */
public class Dealer extends Human {
    ArrayList<Integer> list1 = new ArrayList<Integer>();
    
    public ArrayList<Integer> cards = new ArrayList();{
    list1.add(0);
        //cardsにトランプを持たせる。
           
            for(int i = 1; i <= 4;i++){
            for(int n = 1; n <= 13 ; n++) {
                if (n >= 10) {
                    cards.add(10);
                } else {
                    cards.add(n);
                }
            }
        }
}
        
        //dealメソッドにcardsからランダムで2枚のカードをセット。
        public ArrayList<Integer> deal(){
        //dealメソッドにカードをセットするメソッド。
        
        Random rand = new Random();
        //dealメソッドにcardsからランダムで1枚のカードを選択。
        int itimai = rand.nextInt(cards.size()-1);
        list1.set(0,cards.get(itimai));
        cards.remove(itimai);
         //dealメソッドにcardsからランダムで2枚目のカードを選択。
        int nimai = rand.nextInt(cards.size()-1);
        list1.set(1,cards.get(nimai));
        cards.remove(nimai);
        //dealに選んだ2枚のカードをセット。
        return list1;
        }
        
         public ArrayList<Integer>hit() {
        //dealメソッドにカードをセットするメソッド。
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        Random rand = new Random();
        //dealメソッドにcardsからランダムで1枚のカードを選択。
        Integer itimai = rand.nextInt(cards.size()- 1);
        list2.set(0,cards.get(itimai));
        cards.remove(itimai);
        return list2; }
    
    public int open() {
        int total= 0;
        for (int i = 0; i<=mycard.size();i++){
        total += mycard.get(i);
     }
        return total;
    }
        
        public void setCard(ArrayList sg) {
        for (int i = 0; i<=list1.size();i++)
        mycard.add(list1.get(i));
    }
    

    public boolean checkSum() {
        if ( open() < 20){return true;}
        else{return false;}
    }
}
            
