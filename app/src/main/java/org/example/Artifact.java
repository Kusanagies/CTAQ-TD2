package org.example;

import java.util.Set;

public record Artifact(Gav coordinate,Set<Gav> dependencies) {
    
}
