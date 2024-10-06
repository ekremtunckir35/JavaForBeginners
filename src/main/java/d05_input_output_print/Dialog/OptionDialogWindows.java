package d05_input_output_print.Dialog;

import javax.swing.*;

public class OptionDialogWindows {
    public static void main(String[] args) {

  /*
  OPTION DIALOG PENCERESI //SECENEK PENCERESI

-Kullanicidan seceneklerden birisi secmesi istendiginde kullanilan bir iletisim kutusudur.
-Option iletisim kutysundan farkli olarak  sabit secenekler;
                        OK
                        YesNo
                        YesNoCancel
                        OkCancel
       seceneklerinin yerine,programcinin tanimladigi seceneklerin
           Tamam
           EvetHayir
           gibi kullaniciya sunulabilen iletisim penceresidir.

   Kullanim Sekli
     LOptionPane.showConfirmDialog(null, "Mesaj","baslik","dugme","simge",null,secenekler, null);


   */



 //Ornek : Bir kafedeki garsona  siparis  yardimci olacak pragrami OPTION dialog kutusu ile yapiniz

 //secenekler String dizi de tutuluyor

 String[]secenekler ={ "Yes","No","One minute"};
 String message = "Kahve ister misiniz?";

 //Kullanicinin secimi aliniyor

  int secim = JOptionPane.showOptionDialog(null,message,
          "Java",JOptionPane.YES_NO_CANCEL_OPTION,
          2,null,secenekler,null);

  //secim ekrana yazdiriliyor
        JOptionPane.showMessageDialog(null,secenekler[secim]);


    }
}
