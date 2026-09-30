package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GavTest {

    @Test
    public void testParseGroup() {
        // Le test construit une coordonnée à partir de la chaîne demandée
        Gav gav = Gav.parse("org.acme:lib-a:1.0.0");
        
        // Vérification avec assertEquals que le groupe vaut "org.acme"
        assertEquals("org.acme", gav.group());
    }
}