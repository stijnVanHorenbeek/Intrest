package views;

import models.SamengesteldeIntrest;

import javax.swing.*;

public class TestIntrest {
    private static char input;
    private static double kapitaal;
    private static double intrest;
    private static int jaren;
    private static SamengesteldeIntrest samengesteldeIntrest;

    public static void main(final String[] args) {
        do {
            getUserInput();
            getSamenGesteldeIntrest();
            showOutput();
            askUserForNewCalculation();
        } while (userSaidJ());
    }

    private static void getUserInput(){
        kapitaal = Double.parseDouble(JOptionPane.showInputDialog("Geef het gewenste kapitaal in: "));
        intrest = Double.parseDouble(JOptionPane.showInputDialog("Geef de intrest in: "));
        jaren = Integer.parseInt(JOptionPane.showInputDialog("Geef het aantal jaren in: "));
    }

    private static void getSamenGesteldeIntrest() {
        samengesteldeIntrest = new SamengesteldeIntrest(kapitaal, intrest, jaren);
    }

    private static void showOutput(){
        JOptionPane.showMessageDialog(null, samengesteldeIntrest.getOpbrengst());
    }

    private static void askUserForNewCalculation(){
        String userInput = JOptionPane.showInputDialog("Nog een berekening? (J/N): ");
        input = userInput.charAt(0);
    }

    private static boolean userSaidJ(){
        return Character.toUpperCase(input) == 'J';
    }
}
