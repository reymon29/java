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

    // Student[] students = {new Student(), new Student(), new Student()};
    // students[0] = new Student();
    // students[1] = new Student();
    // students[2] = new Student();
    // students[0].name = "John";
    // students[1].name = "Raj";
    // students[2].name = "Anita";
    // System.out.println("Student 1: " + students[0].name);
    // System.out.println("Student 2: " + students[1].name);
    // System.out.println("Student 3: " + students[2].name);
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

  static void varargsOverLoad(boolean b, int i, int j, int k) {
    System.out.println("\nInside without varargs ...");
  }

  static void varargsOverLoad(boolean b, int... list) {
    System.out.println("\nInside varargsOverload with varargs ...");
    System.out.println("list.length: " + list.length);
  }

  static void preAndPost() {
    System.out.println("\nInside preAndPost...");
    int x = 5;
    --x;
    System.out.println("x: " + x);
    int y = x--;
    System.out.println("y: " + y + ", x: " + x);
    int index = -1;
    int[] array = new int[3];
    array[index++] = 10;
    array[index++] = 20;
    array[index++] = 30;

    System.out.println(index);
  }

  static void compoundArithmeticAssigment() {
    int x = 100;

    System.out.println("x += 5: " + (x += 5));
    System.out.println("x -= 5: " + (x -= 5));
    System.out.println("x *= 5: " + (x *= 5));
    System.out.println("x /= 5: " + (x /= 5));
    System.out.println("x %= 5: " + (x %= 5));

    //Invalid
    System.out.println("x =+ 5: " + (x =+ 5)); // Unary plus ~ x +5
    System.out.println("x =- 5: " + (x =- 5)); // Unary plus ~ x +5
    // System.out.println("x =* 5: " + (x =* 5)); // invalid expressions
    // System.out.println("x =/ 5: " + (x =/ 5)); // invalid expressions
    // System.out.println("x =% 5: " + (x =% 5)); // invalid expressions

  }

  static void isOddOrEven(int num){
    System.out.println(num % 2);
  }

  static void charTypePromotion() {
	  System.out.println("\nInside charTypePromotion ...");
	  char char1 = 50; // Will be assigned corresponding UTF16 value 2
	  System.out.println("char1: " + char1); 
	  System.out.println("(73 - char1): " + (73 - char1)); // char1 gets promoted to int, i.e., decimal equivalent 50 in UTF16 is used	  
	  System.out.println("(char1 - '3'): " + (char1 - '3')); // char1 & '3' are promoted to ints	
	  System.out.println("('a' + 'b'): " + ('a' +'b')); // 'a' & 'b' are promoted to ints and the respective equivalents 97 & 98 are added
  }

  static void comparisonOperatios(){
    int age = 20;
    if (age > 21) {
      System.out.println("Graduate student");
    }
    System.out.println("age > 21: " + (age > 21));
	  System.out.println("age >= 21: " + (age >= 21));  
	  System.out.println("age < 21: " + (age < 21));
	  System.out.println("age <= 21: " + (age <= 21));	  
	  System.out.println("age == 21: " + (age == 21)); // equal to (equality operator)
	  System.out.println("age != 21: " + (age != 21)); // not equal to (equality operator)

    boolean isInternational = true;
		//System.out.println("isInternational <= true: " + (isInternational <= true));  
		System.out.println("isInternational == true: " + (isInternational == true)); 
		System.out.println("isInternational != true: " + (isInternational != true));
		
		Student s1 = new Student(1000, "Dheeru");
		Student s2 = new Student(1000, "Dheeru");
		System.out.println("s1 == s2: " + (s1 == s2)); // See object class
		System.out.println("s1 != s2: " + (s1 != s2));
		
    update(s1, "John");
  }

  static boolean update(Student s, String name){
    /* if (s == null) {
      return false;
    }
    s.name = name;
    return true; */

    if (s != null && s.id > 1000) {
      s.name = name;
    }
    return true;
  }

  static void logicalOperators() {
		System.out.println("\nInside logicalOperators ...");
		int age = 37;
	    int salary = 85000;
	    boolean hasBadCredit = false;
		
		// 1. Core (AND, OR, NOT & Operator Chaining)
	    
	    if (age > 35 && salary > 90000 || !hasBadCredit) {
	    	System.out.println("Loan approved!");
	    } else {
			System.out.println("Loan not approved!");
		}
		
		// 2. 
		//    (a) Left-associative ~ Order of grouping
		//    (b) Associativity (a && b) && c = a && (b && c)
		//    Applies to both && and ||
		
		
		// 3. 
		//    (a) Operator precedence of Logical Operators: Helps with ONLY grouping operations. Not order of execution. (! > && > ||)
		
		          // Other Examples: A && B || C && D = (A && B) || (C && D)
				  //                 A && B && C || D = ((A && B) && C) || D
		
		
		//    (b) Operator Precedence across logical, comparison and arithmetic
		//          ! > arithmetic > comparison > &&, ||
		//    See resources section for complete precedence rules
		
		// ALWAYS USE PARENTHESIS for READABILITY. Not everyone is aware of precedence rules
		
		// 4. Use && to avoid NullPointerException
		Student s1 = new Student(1001, "Raj");
		update(s1, "Dheeru");
	}

  static void bitwiseOperators() {
    System.out.println("\nInside bitwiseOperators ...");
    int x = 1;
  int y = 3;
  
  System.out.println("x & y: " + (x & y));
  System.out.println("x | y: " + (x | y));
  System.out.println("x ^ y: " + (x ^ y));
  System.out.println("~x: " + (~x));
  System.out.println("true & false: " + (true & false));
   
  char c1 = 'a'; // U+0061 --> 0110 0001
  char c2 = 'b'; // U+0062 --> 0110 0010
  System.out.println("c1 | c2: " + (c1 | c2)); // 0110 0011 --> 99 in decimal		
  
  // Since bitwise work only on Integer types, following will not compile
  //double d1 = 3.14;
  //double d2 = 5.15;
  //System.out.println("d1 | d2: " + (d1 | d2));
  }

  static boolean ifStatement() {
		boolean approved = false;
		
		int age = 27;
		int salary = 60000;
		boolean hasBadCredit = false;
		
		if (age >= 25 && age <= 35 && salary >= 50000) {		
			approved = true;            			
			System.out.println("age >= 25 && age <= 35 && salary >= 50000");
		} else if (age > 35 && age <= 45 && salary >= 70000) {
			approved = true;			
			System.out.println("age > 35 && age <= 45 && salary >= 70000");
		} else if (age > 45 && age <= 55 && salary >= 90000) {
			approved = true;			
			System.out.println("age > 45 && age <= 55 && salary >= 90000");
		} else {
		    if (age > 55 && !hasBadCredit) {
				approved = true;			
				System.out.println("age > 55 && !hasBadCredit");
			}
			System.out.println("else block");
		}
		
				
		System.out.println("outside if");
		return approved;
	}

  static void switchExample() {
    System.out.println("\nInside switchExample ...");
    // switchExample2(2);
    // final byte month2 = 2;
    int month = 3;
    switch (month) {
      case 1: System.out.println("January");
                break;
      case 2: System.out.println("February");
                break;
      case 3: System.out.println("March");
                break;
      default: System.out.println("April");
    }
  }

  // static void switchExample2(final byte month2) {
  //   byte month = 3;
  //   switch (month) {
  //     case 1: System.out.println("January");
  //               break;
  //     case month2: System.out.println("February");
  //               break;
  //       case 3: System.out.println("March");
  //               break;
  //     default: System.out.println("April");
  // }
	
  static int min(int x, int y){
    int result = (x < y) ? x : y;
    return result;
  }

  public static void main(String[] args){
    int[] iArray = {0,1,2,3,4,5,6,7,8,9};
    for(int i = 0; i < iArray.length; System.out.println(iArray[i++]));
    for(int i = 0; i < iArray.length; i++){
      System.out.println(iArray[i]);
    }
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
    // System.out.println("Hello");
    // int[] array = {1,2};
    // go(array);
    // System.out.println("array[1]: " + array[1]);
    // go(1000);
    // byte b = 22;
    // go(b);
    // varargsOverLoad(true, 1,2,3);
    // varargsOverLoad(true, 1,2,3,4,5,6,7,8);
    // varargsOverLoad(true);
    // preAndPost();
    // compoundArithmeticAssigment();
    // isOddOrEven(50);
    // charTypePromotion();
    // comparisonOperatios();
    // logicalOperators();
    // bitwiseOperators();
    // ifStatement();
    // switchExample();
    // int min = min(9,3);
    // System.out.println("min: " + min);
  }
 
}
