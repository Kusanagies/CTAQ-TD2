package org.example;

import java.io.IOException;
import java.util.Optional;
import java.util.Set;

public interface IPomParser {
    Project parse (ILineReader reader) throws IOException;
}