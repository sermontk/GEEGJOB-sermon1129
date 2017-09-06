/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack1;
import java.util.ArrayList;
/**
 *
 * @author t.k
 */
public abstract class Human { 
    ArrayList<Integer> mycard = new ArrayList();
    public abstract int open();
    public abstract void setCard(ArrayList Integer);
    public abstract boolean checkSum();               
}
