package org.example;

import org.junit.jupiter.api.Test;
import java.io.BufferedReader;
import java.io.StringReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class BufferedLineReaderTest {
    @Test 
    public void testReadLine() throws IOException{
        String donnees = "projet mon-app\ndependency org.acme:lib-a:1.0.0\n";

        BufferedReader bufferedReader = new BufferedReader(new StringReader(donnees));
        ILineReader reader = new BufferedLineReader(bufferedReader);

        assertEquals("projet mon-app", reader.readLine());
        assertEquals("dependency org.acme:lib-a:1.0.0", reader.readLine());
    }
}
