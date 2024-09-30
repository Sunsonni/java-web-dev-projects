import java.util.Objects;

public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        // Drop your getters and setters below for the Student class.

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public int getStudentId() {
                return studentId;
        }

        public void setStudentId(int studentId) {
                this.studentId = studentId;
        }

        public int getNumberOfCredits() {
                return numberOfCredits;
        }

        public void setNumberOfCredits(int numberOfCredits) {
                this.numberOfCredits = numberOfCredits;
        }

        public double getGpa() {
                return gpa;
        }

        public void setGpa(double gpa) {
                this.gpa = gpa;
        }


        public Student(String name, int numberOfCredits, double gpa) {
                this.name = name;
                this.numberOfCredits = numberOfCredits;
                this.gpa = gpa;
        }

        public static String getGradeLevel (int credits) {
                if(0 <= credits && credits <= 29){
                        return "Freshman";
                } else if (30 <= credits && credits <= 59) {
                        return "Sophomore";
                } else if (60 <= credits && credits <= 59) {
                        return "Junior";
                } else if (90 <= credits){
                        return "Senior";
                } else {
                        return "Not a valid option";
                }
        }

        public void addGrade (int credits, double grade){

                double totalQualityScore = this.gpa*this.numberOfCredits;
                totalQualityScore += credits * grade;
                this.numberOfCredits += credits;
                this.gpa = totalQualityScore/this.numberOfCredits;
        }



        @Override
        public String toString() {
                String studentReport = String.format("%s is a %s with %d credits and a GPA of %.2f", this.name, this.getGradeLevel(this.numberOfCredits), this.getNumberOfCredits(), this.getGpa());
                return studentReport;
        }
        @Override
        public boolean equals(Object obj) {
                if (obj == this) {
                        return true;
                }

                if (obj == null) {
                        return false;
                }

                if(obj.getClass() != getClass()) {
                        return false;
                }
                Student student = (Student) obj;
                return student.getStudentId() == getStudentId();
        }

        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.

}
