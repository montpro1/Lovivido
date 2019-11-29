package lovivido;

import javax.swing.JOptionPane;

public class Lovivido {

    public static void main(String[] args) {
        String writeyourname;
        String writeyourage;

        int month;
        int days;
        int hours;
        int years;

        writeyourname = JOptionPane.showInputDialog("Escriba su nombre: ");
        writeyourage = JOptionPane.showInputDialog("Escriba su edad: ");

        years = Integer.parseInt(writeyourage);

        month = (years * 12);
        days = (years * 365);
        hours = (days * 24);

        JOptionPane.showMessageDialog(null, "Meses: " + month, "Numero de meses vividos de " + writeyourname, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Días: " + days, "Numero de días vividos de " + writeyourname, JOptionPane.INFORMATION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Horas: " + hours, "Numero de horas vividos de " + writeyourname, JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }

}
