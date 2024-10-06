package d05_input_output_print.Dialog;

import javax.swing.*;

public class ConfirmDialogWindows {

    public static void main(String[] args) {

 /*
 kullanicidan aldigi cevaba gore ("Yes", "No","Cancel") gibi islem yapilmasini saglayan
 mesaj kutusudur.

 Kullanim sekli:
     JOptionPane.showConfirmDialog(null,"Mesaj", "baslik","dugme","simge");

     ilk parametre --->null
     2.parametre------>mesajinizi
     3.parametre----->mesaj basligini
     4.parametre----->dugmeleri (OK, yesNo,YesNoCancel veya OKCancel)
     5.son paramtre simgelrri gosterir

     SECIM DUGMELERI VE KARSILIKLARI

     DUGME ADI                       KOD ISMI                                   SAYI DEGERI
    -----------------------------------------------------------------------------------
    Tamam               --->        JOptionPane.DEFAULT_OPTION           ----------> -1
    Evet-Hayir          --->        JOptionPane.YES_NO_OPTION            ---------->  0
    Evet-Hayir-Iptal    --->        JOptionPane.YES_NO_CANCEL_OPTION     ---------->  1
    Tamam-Iptal         --->        JOptionPane.OK_CANCEL_OPTION         ---------->  2

Kullanicinin onayinin ne oldugu bilgisini almak icin su komutlar kullanilir.

JOptionPane.OK_OPTION : Kullanici "OK" butonuna tikladi.

OptionPane.YES_OPTION : Kullanici "YES" butonuna tikladi.

OptionPane.NO_OPTION : Kullanici "NO" butonuna tikladi.

OptionPane.CANCEL_OPTION : Kullanici "CANCEL" butonuna tikladi.

JOptionPane.CLOSE_OPTION : Kullanici  baska bir yolla dialog penceresiin kapatti.

  */

 // Bir kafede garsona siparis almada yardimci olacak programi kodlayiniz.

        System.out.println("Merhaba efendim..Isteginizi alabilir miyim");
        int sonuc = JOptionPane.showConfirmDialog(null,
                "Kahve alir misiniz","Java",JOptionPane.YES_NO_OPTION);
        System.out.println((sonuc == JOptionPane.YES_OPTION)?"Evet,Lutfen": "Hayir,Tesekkurler");
    }
}
