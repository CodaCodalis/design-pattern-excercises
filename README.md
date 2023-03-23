# Design pattern excercises

1. Strategy Design Pattern
 - Alternative zur Unterklassenbildung
 - Verhalten kann zur Laufzeit geändert werden
 - Zentralisierung des Verhaltens in einer Klasse
 - Fazit: hohe Flexibilität und Dynamik, erleichterte Wartung, schnelle und unkomplizierte Erweiterungen

Vorteile und Nachteile:

| Vorteile                      | Nachteile                                                 |
|-------------------------------|-----------------------------------------------------------|
| hohe Flexibilität und Dynamik | enge Kopplung zwische Client und Strategieimplementierung |
| Wiederverwendbarkeit          | unnötige Context-Strategie-Kommunikation                  |
| Komposition statt Vererbung   |                                                           |
| dynamisches Verhalten         |                                                           |
| Vermeidung von Bedingungen    |                                                           |


Strategy Pattern Termini:

| Klasse                  | Strategy Teilnehmer |
|-------------------------|---------------------|
| Hund                    | Context             |
| BellVerhalten           | Strategy-Interface  |
| LautBellen, LeiseBellen | Konkrete Strategy   |
| bellen()-Methoden       | Algorithmen         |


2. Observer Design Pattern

