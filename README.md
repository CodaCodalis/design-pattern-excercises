# Design pattern excercises

## Strategy Design Pattern
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


## Observer Design Pattern

Vorteile:
Verlag und Abonnenten sind entkoppelt, da der Verlag seine konkreten Abonnenten nicht kennt, dadurch:
- problemloses Erstellen und Hinzufügen von neuen Abonnenten ohne den Verlagcode anfassen zu müssen; Abonnent muss nur Abonennteninterface implementieren (Wiederverwendbarkeit, Erweiterbarkeit)
- Dynamik: Abonnenten können zur Design- und Laufzeit beliebig hinzugefügt und wieder entfernt werden
- hohes Maß an Flexibilität und Dynamik gewonnen; erleichterte Wartung; Erweiterungen schnell und unkompliziert

Observer Pattern Termini:

| Klasse                   | Strategy Teilnehmer                                                |
|--------------------------|--------------------------------------------------------------------|
| FAZVerlag                | Subject (oder Observable)                                          |
| Abonnent                 | Observer (oder Dependents)                                         |
| verteileZeitung(Zeitung) | Methode mit der die Benachrichtigung aller Observer ausgelöst wird |
| erhalteZeitung()         | Aktualisierungsmethode (oder Updatemethode) der Observer           |


## Decorator Design Pattern

