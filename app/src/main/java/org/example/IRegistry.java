package org.example;

import java.io.IOException;
import java.util.Optional;
import java.util.Set;

public interface IRegistry {
    // lève AlreadyPublishedException si la coordonnée de l'artefact est deja publiée
    void publish (Artifact artifact) throws AlreadyPublishedException;
    Optional<Artifact> lookup (Gav gav);
}