package constructor.ex5;

    public class Exam {

        String subject;
        int marks;

        Exam(String subject, int marks) {
            this.subject = subject;
            this.marks = marks;
        }

        void result() {

            System.out.println("Subject = " + subject);
            System.out.println("Marks = " + marks);

            if (marks >= 35) {
                System.out.println("Pass");
            } else {
                System.out.println("Fail");
            }
        }

        public static void main(String[] args) {

            Exam e1 = new Exam("Java", 85);

            e1.result();
        }
    }