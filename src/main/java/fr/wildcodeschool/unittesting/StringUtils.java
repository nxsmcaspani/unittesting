package fr.wildcodeschool.unittesting;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;


public class StringUtils {

    private static final String ALL_VOWELS = "aeiouyAEIOUY";

    /**
     * Renvoie la chaine formée par les voyelles d'une chaine de caractères
     * @return Chaine avec uniquement des voyelles
     */
    public static String vowels(String candidate) {
        String vowels = "";
        if(candidate != null) {
            char[] letters = candidate.toCharArray();
            for (int i = 0; i < candidate.length(); i++) {
                if (ALL_VOWELS.indexOf(letters[i]) >= 0) {
                    vowels += letters[i];
                }
            }
            return vowels;
        } else {
            return "";
        }
    }

    public static String uniqueVowels(String candidate) {
        if(candidate != null) {
            Set<Character> vowels = new TreeSet<>();
            char[] letters = candidate.toCharArray();
            for (int i = 0; i < candidate.length(); i++) {
                if (ALL_VOWELS.indexOf(letters[i]) >= 0) {
                    vowels.add(letters[i]);
                }
            }
            return vowels.stream().map(String::valueOf).collect(Collectors.joining());
        } else {
            return "";
        }
    }

}
