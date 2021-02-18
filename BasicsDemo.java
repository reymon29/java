import java.math.BigDecimal;
class BasicsDemo {
  int id = 0;
  int Id= 0;
  int ID= 0;

  static void print() {
    System.out.println("\n\nInside print ...");
    System.out.println("Hello, world!!"); // Advance cursor to beginning of next line
    System.out.println();                 // Print empty line
    System.out.print("Hello, world!!");   // Cursor stayed after the printed string
    System.out.println("Hello,");
    System.out.print(" ");                // Print a space
    System.out.print("world!!");
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

  static void typeCasting() {
    System.out.println("\nInside typeCasting ...");
      // Explicit casting
    long y = 42;
      //int x = y;
    int x = (int)y;

      // Information loss due to out-of-range assignment
    byte narrowdByte = (byte)123456;
    System.out.println("narrowdByte: " + narrowdByte);

    // Truncation
    int iTruncated = (int)0.99;
    System.out.println("iTruncated: " + iTruncated);

    // Implicit cast (int to long)
    y = x;

    // Implicit cast (char to int)
    char cChar = 'A';
    int iInt = cChar;
    System.out.println("iInt: " + iInt);

    // byte to char using an explicit cast
    byte bByte = 65;
    cChar = (char)bByte; // special conversion (widening from byte --> int followed by narrowing from int --> char)
    System.out.println("cChar: " + cChar);
  }

  static void arrays() {
    System.out.println("\nInside arrays...");
    int[] scores = new int[4];
    // int[] scores = new int[] {90, 70, 80, 100};
    // int[] scores = {90, 70, 80, 100};
    scores[0] = 90;
    scores[1] = 70;
    scores[2] = 80;
    scores[3] = 100;

    System.out.println("Mid-term1: " + scores[0]);
    System.out.println("Mid-term2: " + scores[1]);
    System.out.println("Final: " + scores[2]);
    System.out.println("Project: " + scores[3]);
    System.out.println("# of exams: " + scores.length);

    Student[] students = {new Student(), new Student(), new Student()};
    // students[0] = new Student();
    // students[1] = new Student();
    // students[2] = new Student();
    students[0].name = "John";
    students[1].name = "Raj";
    students[2].name = "Anita";
    System.out.println("Student 1: " + students[0].name);
    System.out.println("Student 2: " + students[1].name);
    System.out.println("Student 3: " + students[2].name);
  }

  static void threeDimensionalArrays() {
     System.out.println("\nInside threeDimensionalArrays ...");
     int[][][] unitsSold = new int[][][]{
                       { // New York
                       {0,0,0,0}, // Jan
                       {0,0,0,0}, // Feb
                       {0,0,0,0}, // Mar
                       {0,850,0,0}// Apr
                       },
                       { // San Francisco
                       {0,0,0,0}, // Jan
                       {0,0,0,0}, // Feb
                       {0,0,0,0}, // Mar
                       {0,0,0,0}  // Apr
                       },
                       {
                       {0,0,0,0},
                       {0,0,0,0},
                       {0,0,0,0},
                       {0,0,0,0}
                       },
                       {
                       {0,0,0,0},
                       {0,0,0,0},
                       {0,0,0,0},
                       {0,0,0,0}
                       }
                     };

    System.out.println("unitsSold[0][3][1]: " + unitsSold[0][3][1]);
  }

  static double sum(double x, double y){
    return x + y;
  }

  static double avg(double x, double y){
    double sum = sum(x, y);
    return sum/2;
  }

  static boolean search(int[] list, int key) {
    return true;
  }

  static void go(int[] array) {
    System.out.println("array[0]: " + array[0]);
    System.out.println("array[1]: " + array[1]);
    array[1] = 22;
  }

  static void go(int i) {
    System.out.println("go(int i)");
  }

  static void go(short s) {
    System.out.println("go(short s)");
  }

  public static void main(String[] args){
    // print();
    // primitives();
    // typeCasting();
    // arrays();
    // threeDimensionalArrays();
    // double d = sum(3.0, 2.0);
    // System.out.println(d);
    // double d2 = avg(3.0, 2.0);
    // System.out.println(d2);
    // int[] list = {2,1};
    // search(list, 2);
    System.out.println("Hello");
    int[] array = {1,2};
    go(array);
    System.out.println("array[1]: " + array[1]);

    go(1000);

    byte b = 22;
    go(b);
  }
}
