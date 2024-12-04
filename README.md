# Array Java

## NextElements

Creare la classe `NextElements` con relativo JUnit di test per verificare se un array di int contiene due elementi consecutivi a 10 o 20 ma non entrambi.

### Definire il seguente metodo statico:

- `static boolean isArrayCorrect(int[] inp)`

### Esempio

> `int[] {10, 10, 2, 4, 20, 20} ❌`
> `int[] {10, 10, 2, 4, 45, 20} ✅`

### La mia soluzione

Analizzo ogni elemento dell'array e lo salvo ogni volta in una variabile `previousNumber`, questo per verificare al prossimo ciclo che l'elemento corrente sia uguale a quello precedente (10 o 20). In caso positivo segno (in base al numero) una di queste due variabili flag come **true**: `consecutiveTenCheck` e `consecutiveTwentyCheck`.
Per l'esito positivo del metodo occorre che **solo una** di queste 2 variabili sia **true**.