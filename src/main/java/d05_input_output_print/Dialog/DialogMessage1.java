package d05_input_output_print.Dialog;

import javax.swing.*;

public class DialogMessage1 {

    public static void main(String[] args) {



//Dialog kutucugunda iletileri "\n " karakterini kullanarak satir v satir gosteriniz

        String ileti = "Kurs Ogrencileri: \n" +
                       "1:Muslum Baba\n " +
                       "2:Ferdi Baba\n" + "3:Orhan Baba";
        JOptionPane.showMessageDialog(null,ileti,"Java Kursu",1);
    }
}
