package fr.eiffel.exercices_partie1;

import java.util.ArrayList;
import java.util.List;

public class Listes {

    public static void main(String[] args) {
        exercice1(); exercice2();
    }

    public static void exercice1() {
        List<String> liste = List.of("A", "B", "C", "D", "E");

        /* Répondez aux questions suivantes :

           1. Comment récupère-t-on un item dans une liste ?
           Avec son index

           2. Comment trouve-t-on la taille d'une liste ?
           .size

           3. Observez les trois méthodes de parcours de liste, et trouvez une phrase décrivant chaque méthode
              Essayez de les retenir, et de trouver votre méthode favorite */

        // Récupérer par son index, comme les fonctions dans python
        System.out.println("Méthode 1 : ");
        for(int i=0;i<liste.size();i++) {
            System.out.println(liste.get(i));
        }

        // boucle foreach des flémmard
        System.out.println("Méthode 2 : ");
        for(String s : liste) {
            System.out.println(s);
        }

        // le mec qui veut trop prouver qu'il connaît plus que les autres
        // foreach en tant que méthode/classe d'une liste
        System.out.println("Méthode 3 : ");
        liste.forEach(System.out::println);

        System.out.println("Ma méthode préférée :");
        liste.forEach(System.out::println);
    }

    public static void exercice2() {
        List<String> liste = new ArrayList<>();

        /* Trouvez deux façons d'ajouter des éléments dans la liste de
           manière à ce que le mot "WESH" soit affiché */

        liste.add("WESH");

        System.out.println(liste.get(3)+liste.get(0)+liste.get(2)+liste.get(1));
    }

}
