package d05_input_output_print.Dialog;

import javax.swing.*;

public class DialogWindows {


    public static void main(String[] args) {


        JOptionPane.showMessageDialog(null, "Hello World");
    //ilk paramerte null verilirse kucuk pencere ekranin ortasinda gorulur.

 JOptionPane.showMessageDialog(null,
                               "Emin misiniz",
                         "Baslik-1",3);//JOptionPane.QUESTION_MESSAGE

 JOptionPane.showMessageDialog(null,
                               "Siz bilirsiniz!",
                               "Baslik-2",
                               JOptionPane.WARNING_MESSAGE);//2

    }
}
