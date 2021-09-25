package atividade01;

public class Palindromo {

    public boolean EhPalindromo(String frase) {

        String frases = frase.toUpperCase().toLowerCase().replace(" ", "").replace(",", "")
                .replace("/", "").replace("!", "").replace("’", "").replace(".", "");

        for (int i = 0; i < frases.length(); i++) {
            if (frases.charAt(i) != frases.charAt(frases.length() - (i + 1))) {
                return false;
            }
        }

        return true;
    }
}