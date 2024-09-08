package fr.eiffel.exercices_partie1;

import java.util.HashMap;
import java.util.Map;

public class Dictionnaires {

    public static void main(String[] args) {
        exercice1();
    }

    public static void exercice1() {
        Map<String, String> dico = new HashMap<>();

        dico.put("mail", "truc@muche.fr");
        dico.put("tel", "0102030405");
        dico.put("insta", "@trucmuche");

        /* Répondez aux questions :
           1. Quel est le nom du type "dictionnaire" en Java ?
           Map<K, V>
           K - type de la clé
           V - type de la valeur

              Quelle est la particularité de ce type de collection ?
              Map associe des clés à des valeurs, donc, ils sont uniques

              (Qu'est-ce qu'une collection en programmation ?)
              C'est un regroupement des éléments

           2. Trouvez une méthode pour récupérer toutes les clés du dictionnaire
           .keySet()
           3. Trouvez une méthode pour récupérer toutes les valeurs du dictionnaire
           .values()
           4. Observez les deux méthodes utilisées pour itérer sur ce dictionnaire, puis
              reformulez les avec une phrase pour vous en souvenir */

        System.out.println("Méthode 1 : ");
        for(Map.Entry<String, String> entry : dico.entrySet()) { // .entrySet() récupère le dictionnaire clé par clé obtenant la K et la V
            System.out.println("clé : "+entry.getKey()+", value : "+entry.getValue());
            // .getKey - récupère la clé
            // .getValue - récupère la valeur
        }

        System.out.println("Méthode 2 : ");
        dico.forEach((key, value) -> { // fais la même chose que la méthode précédente
            System.out.println("clé : "+key+", value : "+value);
        });
    }

    // Refaire le code sans copier
    public static void exercice1_bis () {
        Map<String, String> dictionnaire = new HashMap<>();

        dictionnaire.put("Cristiano", "Ronaldo");
        dictionnaire.put("Lionnel", "Messi");
        dictionnaire.put("Jr", "Neymar");

        System.out.println("Méthode 1 :");
        for(Map.Entry<String, String> entry : dictionnaire.entrySet()) {
            System.out.println("Clé : " + entry.getKey() + ", Valeur : " + entry.getValue());
        }

        System.out.println("Méthode 2 :");
        dictionnaire.forEach((key, value) -> {
            System.out.println("Clé : " + key + ", Valeur : " + value);
        });
    }

}
