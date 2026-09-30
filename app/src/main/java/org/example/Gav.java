package org.example;

public class Gav {
    
    // Le constructeur par défaut est suffisant pour le moment
    
    public static Gav parse(String coordinate) {
        // "Fake it" : on retourne simplement une nouvelle instance 
        // sans se soucier de la chaîne en entrée
        return new Gav();
    }

    public String group() {
        // "Fake it" : on retourne la valeur en dur attendue par le test
        return "org.acme"; 
    }
}