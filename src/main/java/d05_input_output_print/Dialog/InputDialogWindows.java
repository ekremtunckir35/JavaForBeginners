package d05_input_output_print.Dialog;

import javax.swing.*;

public class InputDialogWindows {

    public static void main(String[] args) {

 /*
 - Veri girisi String tipinde kullanilan iletisim kutusudur.
 -Kullanim Sekli :
     JOptionPane.showInputDialog(null, "Mesaj","baslik","simge");

     ilk parametre null verildiginde kucuk pencere ekranin ortasinda gozokur.
     "baslik" ve "simge" parametreleri secimliktir.Kyllanilmasa da olur.

  */


//Grafik ortaminda girilen iki sayinin toplamini(iletisim pencereleri kullanilarak)
// hesaplayan programi yaziniz.

    String s1 = JOptionPane.showInputDialog(null,"1.sayi..:");

    String s2 =JOptionPane.showInputDialog(null,"2.sayi..:");

     int toplam =Integer.parseInt(s1) +  Integer.parseInt(s2);

     JOptionPane.showMessageDialog(null,"Toplam =" +toplam);


    }

}
