package org.example;

import java.io.IOException;
import java.util.Optional;
import java.util.Set;

public interface IStorage {
    void put (Gav gav, Artifact artifact);
    Optional<Artifact> get (Gav gav);
}