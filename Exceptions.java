package fr.eiffel.exercices_partie1;

import fr.eiffel.exercices_partie1.exceptions.ExceptionFille;
import fr.eiffel.exercices_partie1.exceptions.ExceptionMere;

import java.io.IOException;

public class Exceptions {

    public static void main(String[] args) {
    }

    /* PRINCIPE DES EXERCICES SUR LES EXCEPTIONS :
         Avant chaque exercice, déterminez quelle(s) phrase(s) va être écrite dans la console
         Une fois que vous êtes décidé, lancez l'exercice et vérifiez si vous avez raison
         Expliquez ensuite avec vos propres mots pourquoi la ou les phrases affichées se sont affichées
     */

    public static void exercice1() {
        try {
            throw new ExceptionMere();
        } catch (ExceptionMere e) {
            // Cette phrase va être afficher
            System.out.println("Phrase 1");
        } catch (Exception e) {
            System.out.println("Phrase 2");
        }
    }

    public static void exercice2() {
        try {
            throw new ExceptionMere();
        } catch (ExceptionFille e) {
            System.out.println("Phrase 1");
        } catch (ExceptionMere e) {
            // Cette phrase va être afficher
            System.out.println("Phrase 2");
        }
    }

    public static void exercice3() {
        try {
            throw new ExceptionFille();
        } catch (ExceptionFille e) {
            // Cette phrase va être afficher
            System.out.println("Phrase 1");
        } catch (ExceptionMere e) {
            System.out.println("Phrase 2");
        }
    }

    public static void exercice4() {
        try {
            throw new IOException();
        } catch (ExceptionMere e) {
            System.out.println("Phrase 1");
        } catch (IOException e) {
            // Cette phrase va être afficher
            System.out.println("Phrase 2");
        }
    }
}
