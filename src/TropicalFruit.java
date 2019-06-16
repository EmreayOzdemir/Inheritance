
public class TropicalFruit extends Fruit{

  
  public static void main(String[] args) {
    
    generateJuice();
    Fruit.generateJuice();
    TropicalFruit.generateJuice();
  }
  // hiding static methods
  public static void generateJuice() {
    System.out.println("generate TropicalFruit Juice ");  
  }
  
}
