package org.example;

import java.util.Scanner;

public class EgenMain {
    public static void main(String[] args) {
        Egen egen = new Egen();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== MORSEKODOMVANDLARE ===");
        System.out.println("1. Engelska till Morsekod");
        System.out.println("2. Morsekod till Engelska");
        System.out.print("Välj alternativ (1 eller 2): ");

        // Använder nextLine() så programmet inte kraschar om man skriver text i menyn
        String choice = scanner.nextLine();

        if (choice.equals("1")) {
            System.out.print("Skriv in text på engelska: ");
            String input = scanner.nextLine();
            String translated = egen.englishToMorse(input);

            // Skriver bara ut resultat om det finns giltiga tecken
            if (!translated.isEmpty()) {
                System.out.println("Resultat: " + translated);
            } else {
                System.out.println("Inga giltiga tecken att översätta.");
            }
        } else if (choice.equals("2")) {
            System.out.print("Skriv in morsekod: ");
            String input = scanner.nextLine();
            String translated = egen.morseToEnglish(input);

            // Skriver bara ut resultat om det finns giltig morsekod
            if (!translated.isEmpty()) {
                System.out.println("Resultat: " + translated);
            } else {
                System.out.println("Ingen giltig morsekod att översätta.");
            }
        } else {
            System.out.println("Ogiltigt val!");
        }

        scanner.close();
    }
}