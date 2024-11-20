public class Q5 {
    public static void main(String[] args) {
        int n = 5; // Nombre de lignes
        for (int i = n; i >= 1; i--) { // Boucle inversée
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
