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
    ArrayList<Integer> cards = new ArrayList<Integer>();
    
    public Dealer(){

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
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        Random rand = new Random();
        //dealメソッドにcardsからランダムで1枚のカードを選択。
        int itimai = rand.nextInt(cards.size()-1);
        list1.add(cards.get(itimai));
        cards.remove(itimai);
         //dealメソッドにcardsからランダムで2枚目のカードを選択。
        int nimai = rand.nextInt(cards.size()-1);
        list1.add(cards.get(nimai));
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
        list2.add(cards.get(itimai));
        cards.remove(itimai);
        return list2; }
         
    @Override
    public int open() {
        int total= 0;
        for (int i = 0; i< mycard.size();i++){
        total += mycard.get(i);
     }
        return total;
    }
        @Override
        public void setCard(ArrayList<Integer> dh) {
        for (int i = 0; i<dh.size();i++)
        mycard.add(dh.get(i));
    }
    
   @Override
    public boolean checkSum() {
        if ( open() < 17){return true;}
        else{return false;}
    }
}
            
