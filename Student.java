class Student {
  int id = 1000;
  byte age = 1_8;

  long phone = 223_456_7890L;
  double gpa = 3.8;

  char degree = 'B';

  void compute() {
    int nextId = id + 1;
    System.out.println("id: " + id);
    System.out.println("nextId: " + nextId);
    System.out.println("age: " + age);
    System.out.println("gpa: " + gpa);
    System.out.println("degree: " + degree);

  }

  public static void main(String[] args){
    Student s = new Student();
    s.compute();
  }
}
