package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InMemoryStorageTest{

    private IStorage storage;

    @BeforeEach 
    void init(){
        storage = new InMemoryStorage();
    }

    @Test 
    public void testPutAndGetExistingArtifact(){
        Gav gav = Gav.parse("org.acme:lib-a:1.0.0");
        Artifact artifact = new Artifact(gav,Set.of());

        storage.put(gav,artifact);

        Optional<Artifact> retrieved = storage.get(gav);
        assertTrue(retrieved.isPresent(),"L'artefact devrait être présent");
        assertEquals(artifact, retrieved.get(),"L'artefact récupéré doit être identique à celui stocké");
    }

    @Test 
    public void testGetNonExistingArtifact(){
        Gav gav = Gav.parse("org.unknow:lib-x:9.9.9");
        
        Optional<Artifact> retrieved = storage.get(gav);
        assertTrue(retrieved.isEmpty(),"L'Optional doit être vide pour un artefact inconnu");
    }
































}