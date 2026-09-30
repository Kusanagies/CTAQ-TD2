Partie 2

Question 2 : 
Junit, Mockito, Hamrest

Jacoco est une bibliothèque de couverture de code

Question 3:
Task List

[1] - Types de données de bases : Création des classes pour Java (avec sa logique de validation), Artifact (coordonnée et dépendances directes) et Project (nom et dépendances directes)
[2] -ILineReader/BufferedLineReader : Implémenter la lecure ligne à ligne du fichier de build via un adapteur sur Buffered Reader.
[3] - IStorage/InMemoryStorage : Développer le stockage clé-valeur associant une coordonnée à son artefact.
[4] - IRegistry/StorageBasedRegistry : Créer le registre permettant de publier et de rechercher des artefacts. Il faut inclure la règle métier levant une exception AlreadyPublishedException pour refuser la republication d'une coordonnée déjà existante.
[5] - IPomParser/LineBasedPomParser : Coder l'analyseur lisant la première ligne pour le nom du projet et les suivantes pour les dépendances déclarées. L'analyseur doit ignorer les lignes vides.
[6] - IResolver/AllVersionsResolver : Implémenter le calcul de la fermeture transitive des dépendances en interrogeant le registre pour chaque artefact. Il faut intégrer la règle métier spécifique à ce TD stipulant que toutes les versions sont conservées en cas de conflit.
[7] - BuildTool : Construire l'orchestrateur de haut niveau qui n'a pas d'interface propre. Il lira le fichier via le parseur puis résoudra les dépendances via le résolveur.

Question 5 :

La chaine de caractère "org.acme". Elle est présente à la fois dans l'assertion du test GavTest et en dur dans la méthode groupe() du code de Gav.

Le code n'est pas générique. La chaine de caractère avait été créer juste pour répondre à ce test spécifique, si l'on avait mis une autre coordonnée, le code renverrait toujours "org.acme".C'est pour ca qu'on doit passer à la prochaine phase pour forcer l'écriture du vrai algoerithme de découpage.

