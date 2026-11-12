package org.example;

import java.util.HashMap;
import java.util.Map;

public class Egen {

    private final Map<Character, String> englishToMorseMap = new HashMap<>();
    private final Map<String, Character> morseToEnglishMap = new HashMap<>();

    public Egen() {
        addMapping('A', ".-");
        addMapping('B', "-...");
        addMapping('C', "-.-.");
        addMapping('D', "-..");
        addMapping('E', ".");
        addMapping('F', "..-.");
        addMapping('G', "--.");
        addMapping('H', "....");
        addMapping('I', "..");
        addMapping('J', ".--");
        addMapping('K', "-.-");
        addMapping('L', ".-..");
        addMapping('M', "--");
        addMapping('N', "-.");
        addMapping('O', "---");
        addMapping('P', ".--.");
        addMapping('Q', "--.-");
        addMapping('R', ".-.");
        addMapping('S', "...");
        addMapping('T', "-");
        addMapping('U', "..-");
        addMapping('V', "...-");
        addMapping('W', ".--");
        addMapping('X', "-..-");
        addMapping('Y', "-.--");
        addMapping('Z', "--..");
    }

    private void addMapping(char eng, String morse) {
        englishToMorseMap.put(eng, morse);
        morseToEnglishMap.put(morse, eng);
    }

    public String englishToMorse(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        for (char c : input.toUpperCase().toCharArray()) {
            if (c == ' ') {
                result.append("   ");
            } else if (englishToMorseMap.containsKey(c)) {
                // Lägger till om tecknet finns, annars hoppar den över det i tysthet
                result.append(englishToMorseMap.get(c)).append(" ");
            }
        }
        return result.toString().trim();
    }

    public String morseToEnglish(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        String[] letters = input.trim().split(" ");
        for (String morse : letters) {
            if (morse.isEmpty()) {
                result.append(" ");
            } else if (morseToEnglishMap.containsKey(morse)) {
                // Lägger till om morsekoden finns, annars hoppar den över den
                result.append(morseToEnglishMap.get(morse));
            }
        }
        return result.toString();
    }
}