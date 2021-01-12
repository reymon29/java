import java.math.BigDecimal;
class BasicsDemo {
  int id = 0;
  int Id= 0;
  int ID= 0;

  static void print() {
    System.out.println("\n\nInside print ...");
    System.out.println("Hello, world!!"); // Advance cursor to beginning of next line
    System.out.println();                 // Print empty line
    /* System.out.print("Hello, world!!");   // Cursor stayed after the printed string
    System.out.println("Hello,");
    System.out.print(" ");  */              // Print a space
    // System.out.print("world!!");
  }

  static void primitives() {
    System.out.println("\n\nInside primitives ...");
    int intHex = 0X0041;
    System.out.println(intHex); // 16 power 0 *1 + 16 power 1 * 4

    // Java 7
    int intBinary = 0b01000001;
    System.out.println("intBinary: " + intBinary);

    int intOctal = 0101;
    System.out.println("intOctal: " + intOctal);
    int intChar = 'A';
    System.out.println("intChar: " + intChar);
    char charInt = 65;
    System.out.println("charInt: " + charInt);
    char charHex = 0X0041;
    System.out.println("charHex: " + charHex);
    char charBinary = 0b01000001;
    System.out.println("charBinary: " + charBinary);
  }

  public static void main(String[] args){
    // print();
    // int i = 6;
    // int j = 2;
    // System.out.println(i + j);
    // System.out.println(i - j);
    // System.out.println(i * j);
    // System.out.println(i / j);
    // System.out.println(i % j);
    primitives();

    // System.out.println(1 - 0.9);
    // System.out.println(0.1 + 0.2);

    // double price = 1000;
    // double discountPercent = 0.9;
    // double discountAmount = price * discountPercent;
    // System.out.println(price - discountAmount);
    // System.out.println(price * (1 - discountPercent));

    // BigDecimal first = new BigDecimal("0.1");
    // BigDecimal second = new BigDecimal("0.2");
    // System.out.println(first.add(second));
  }
}
