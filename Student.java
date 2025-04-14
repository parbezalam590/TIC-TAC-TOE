class Student {
    
    //Instance Variables
    String name;
    int grade;
    
    //Default Constructor
    public Student() {
        name = "Unknown";
        grade = 0;
    }
    
    //overload constructor 
    public Student(String name) {
        this.name = name;
        this.grade = 9; // default salary
    }

    public void StudentDetails() {
        System.out.println("Student Name : " + name);
        System.out.println("Student grade : " + grade);
    }
    
    // main method to test the class 
    public static void main (String[] args) {
      
        Student s1 = new Student();
        s1.StudentDetails(); // display details
        
        System.out.println();
        
       
        Student s2 = new Student("Sahil");
        s2.StudentDetails(); // Displaying details
    }
}