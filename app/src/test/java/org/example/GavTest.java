package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class GavTest {


    @Test
    public void testParseGroup() {
        // Le test construit une coordonnée à partir de la chaîne demandée
        Gav gav = Gav.parse("org.acme:lib-a:1.0.0");
        
        // Vérification avec assertEquals que le groupe vaut "org.acme"
        assertEquals("org.acme", gav.group());
    }
    @Test 
    public void testParseFullCoordinate(){
        Gav gav = Gav.parse("org.other:lib-c:3.0.0");

        assertEquals("org.other",gav.group());
        assertEquals("lib-c",gav.artifact());
        assertEquals("3.0.0",gav.version());
    }

    @ParameterizedTest
    /*CsvFileSource(resources = "/gav_donnees.csv") */
    @CsvSource({
        "org.acme:lib-a:1.0.0, org.acme, lib-a, 1.0.0",
        "org.other:lib-c:3.0.0, org.other,lib-c,3.0.0"
    })
    public void testParseCoordinates(String coordinate, String expectedGroup, String expectedArtifact, String expectedVersion){
        Gav gav = Gav.parse(coordinate);
        
        assertEquals(expectedGroup, gav.group());
        assertEquals(expectedArtifact, gav.artifact());
        assertEquals(expectedVersion, gav.version());
    }

    @ParameterizedTest 
    @NullSource 
    @ValueSource(strings={
        "",
        "org.acme:lib-a",
        "org.acme",
        "org.acme:lib-a:1.0.0:extra",
        ":lib-a:1.0.0",
        "org.acme::1.0.0",
        "org.acme:lib-a"
    })
    public void testParseInvalidCoordinates(String invalidCoordinate) {
        assertThrows(IllegalArgumentException.class, () -> {
            Gav.parse(invalidCoordinate);
        });
    }
}