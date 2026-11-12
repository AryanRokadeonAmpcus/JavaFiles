public class StudentMarks {
    private int marks;

    public void setMarks(int marks){
        if (marks >= 0 && marks <=100){
         this.marks = marks;
        } else
            System.out.println("Invalid marks");
    }
    int getMarks(){
        return marks ;
    }
    public static void main(String[] args) {
        StudentMarks sm1 = new StudentMarks();
        StudentMarks sm2 = new StudentMarks();

        sm1.setMarks(21);
        sm2.setMarks(12);

        System.out.println(sm1.getMarks());
        System.out.println(sm2.getMarks());
    }
}
