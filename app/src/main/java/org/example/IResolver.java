package org.example;

import java.io.IOException;
import java.util.Optional;
import java.util.Set;

public interface IResolver {
    Set<Gav> resolve (Set<Gav> directDependencies);
}