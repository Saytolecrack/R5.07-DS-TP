public class Q4 {
  public static void main(String[] args) {
    
    int numberOfStars = int (args[0]);
    String ligne = "*";
      for (int i = 0; i < numberOfStars; i++) {
          System.out.println(ligne);
      ligne += "*";
      }
      System.out.println(); // Passe à la ligne après avoir affiché les étoiles
  }
}
