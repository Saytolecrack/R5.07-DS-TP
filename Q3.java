public class Q3 {
  public static void main(String[] args) {
    
    int numberOfStars = int (args[0]); // Modifier ce nombre pour changer la longueur de la ligne
      for (int i = 0; i < numberOfStars; i++) {
          System.out.print("*");
      }
      System.out.println(); // Passe à la ligne après avoir affiché les étoiles
  }
}