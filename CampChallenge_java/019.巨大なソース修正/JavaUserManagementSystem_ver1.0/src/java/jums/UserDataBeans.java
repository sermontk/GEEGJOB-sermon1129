/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jums;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author t.k
 */
public class UserDataBeans implements Serializable {
    
    private String Messe="";
    private String forminsert="";
    ArrayList<String> formdata = new ArrayList<String>();
   
    public UserDataBeans() {
    }

//フォームで入力した値をArrayListに格納するメソッド。
public void setData(String form, String Data) {

    if (form.equals("name")){
    formdata.add(Data);
}
    if (form.equals("year")){
    formdata.add(Data);
}
    if (form.equals("month")){
    formdata.add(Data);
}
    if (form.equals("day")){
    formdata.add(Data);
}
    if (form.equals("type")){
    formdata.add(Data);
}
    if (form.equals("tell")){
    formdata.add(Data);
}
    if (form.equals("comment")){
    formdata.add(Data);
}
}
//ArrayListに格納したフォームでの入力項目を取得するメソッド。
public String getData(int atai){
        forminsert = formdata.get(atai);
        return forminsert;
    }
//フォームで入力しなかった項目の分だけ注意を表示するメソッド。
public void setMesse(){
    if (formdata.get(0).equals("")){
    Messe += "名前が未入力です！！"+"<br>";     
    }
    if (formdata.get(1).equals("")||formdata.get(2).equals("")||formdata.get(3).equals("")){
    Messe += "生年月日のいずれかが未入力です！！"+"<br>";  
    }
    if (formdata.get(4) == null){
    Messe += "職業を選んでください！！"+"<br>";
    }
    if (formdata.get(5).equals("")){
    Messe += "電話番号が未入力です！！"+"<br>";
    }
    if (formdata.get(6).equals("")){
    Messe += "コメントが未入力です！！"+"<br>";
    }

}
//setMasseメソッドでセットしたメッセージを取得するメソッド。
public String getMesse(){

    return Messe;
}
}

