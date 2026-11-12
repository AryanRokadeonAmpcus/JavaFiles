package inheritance.ex;

class Students {

    String name = "Aryan";
    int rollNo = 333;

    void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}

class CollegeStudent extends Students {

    String course = "BE CSE";

    void displayCollegeStudent() {
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {

        CollegeStudent s1 = new CollegeStudent();

        s1.displayStudent();
        s1.displayCollegeStudent();
    }
}