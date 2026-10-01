package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class InMemoryStorage implements IStorage{
    private final Map<Gav,Artifact> store = new HashMap<>();

    @Override 
    public void put(Gav gav,Artifact artifact){
        store.put(gav,artifact);
    }
    @Override 
    public Optional<Artifact> get(Gav gav){
        return Optional.ofNullable(store.get(gav));
    }
}
