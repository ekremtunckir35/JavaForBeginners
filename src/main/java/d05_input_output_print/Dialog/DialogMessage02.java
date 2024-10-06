package d05_input_output_print.Dialog;

import javax.swing.*;

public class DialogMessage02 {

    public static void main(String[] args) {


 //Grafiksel ortamda iki sayi degerine gore dort islemi( +,-,*,/) gerceklestiren
        // basit bir hesap makinesi programi yapiniz


  String s ;
  float s1 , s2;
  double toplama,cikarma,carpma,bolme;

  s1 =Float.parseFloat(JOptionPane.showInputDialog("1.sayi :"));
  s2=Float.parseFloat(JOptionPane.showInputDialog("2.sayi :"));

  toplama = s1 + s2 ;
  cikarma =s1 -s2 ;
  carpma =s1 * s2 ;
bolme =(float)s1 /s2;
       s = "";
       s = s + s1 + " + " + s2 + " = " +  toplama +"\n";
       s = s + s1  + " - " + s2 + "= "  + cikarma  +"\n";
       s = s + s1  + " / " + s2 + "= "  + bolme  +"\n";
       s =s + s1  + " * " + s2 + "= "  +  carpma +"\n";
       JOptionPane.showMessageDialog(null, s,"Hesap Makinesi",1);





    }
}
