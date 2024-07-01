public class Main {
    public static void main(String[] args) {
        String pwd = null;
        
        // Anzahl der Wiederholungen für den Performance-Test
        int repetitions = 10000; // 1 Million Wiederholungen

        // Zeitmessung für die erste Implementierung
        long startTime1 = System.nanoTime();
        
        for (int i = 0; i < repetitions; i++) {
            pwdTestIsBlank(pwd);
        }
        
        long endTime1 = System.nanoTime();
        long totalTime1 = endTime1 - startTime1;
        double averageTime1 = (double) totalTime1 / repetitions;
        
        // Zeitmessung für die zweite Implementierung
        long startTime2 = System.nanoTime();
        
        for (int i = 0; i < repetitions; i++) {
            pwdTestTrimIsEmpty(pwd);
        }
        
        long endTime2 = System.nanoTime();
        long totalTime2 = endTime2 - startTime2;
        double averageTime2 = (double) totalTime2 / repetitions;
        
        // Ausgabe der Ergebnisse
        System.out.println("Erste Implementierung (isBlank) - Gesamtzeit: " + totalTime1 + " Nanosekunden");
        System.out.println("Erste Implementierung (isBlank) - Durchschnittliche Zeit pro Aufruf: " + averageTime1 + " Nanosekunden");
        
        System.out.println("Zweite Implementierung (trim.isEmpty) - Gesamtzeit: " + totalTime2 + " Nanosekunden");
        System.out.println("Zweite Implementierung (trim.isEmpty) - Durchschnittliche Zeit pro Aufruf: " + averageTime2 + " Nanosekunden");
    }

    // Erste Implementierung mit .isBlank() Methode
    public static void pwdTestIsBlank(String pwd) {
        if (pwd == null || pwd.isBlank()) {
            System.out.println("Password is empty");
        } else {
            System.out.println("Entered Password");
        }
    }

    // Zweite Implementierung mit .trim().isEmpty() Methode
    public static void pwdTestTrimIsEmpty(String pwd) {
        if (pwd != null && pwd.trim().isEmpty()) {
            System.out.println("Password is empty");
        } else {
            System.out.println("Entered Password");
        }
    }
}