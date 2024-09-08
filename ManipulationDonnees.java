package fr.eiffel.exercices_partie1;

import fr.eiffel.exercices_partie1.classes.Hero;

import java.util.*;

public class ManipulationDonnees {

    public static void main(String[] args) {
        exercice1();
        exercice2();
        exercice3();
    }

    public static void exercice1() {
        /* Instanciez automatiquement des objets Hero avec les données suivantes : */
        List<List<String>> donnes1 = List.of(List.of("Tristana", "A"),
                                            List.of("Mordekaiser", "S"),
                                            List.of("Lux", "S"),
                                            List.of("Skarner", "F"));

        Object hero = new List<List<String>>;

        Map<String, String> donnees2 = new HashMap<>();
        donnees2.put("Jinx", "A");donnees2.put("Dr. Mundo", "A");donnees2.put("Sett", "S");
    }

    public static void exercice2() {
        String listeDeCoursesRapide = "Pain,Beurre,Riz,Thon,Tomates,Ronaldo";
        List<String> listePropre = new ArrayList<>();

        /* Remplissez automatiquement la liste de courses propre à partir de la liste de courses rapide */
        listePropre.add(Arrays.toString(listeDeCoursesRapide.split(",")));
        listePropre.forEach(System.out::println);
    }

    public static void exercice3() {
        String listeCoursesComplexe = "Pain:1,Beurre:1,Riz:2,Thon:5,Tomates:6";
        Map<String, Integer> listeCoursesPropre = new HashMap<>();

        /* Remplissez automatiquement la liste de courses propre à partir de la liste de courses complexe rapide
        *  Les clés correspondent aux produits à acheter, les valeurs au nombre de produits à acheter
        *  */

        //listeCoursesPropre.put(Arrays.toString(",".split(listeCoursesComplexe)))
    }

}
