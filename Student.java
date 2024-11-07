public class Student extends Person {
    //    Branch branch;
    String studentID;
    String branchName;

    Student(String name, String email, long phone, String branchName) {
        super(name, email, phone);
        this.studentID = University.generateID();
        this.branchName = branchName;
//        this.branch = branch.getBranchName(branch);
    }

    public String getStudentID() {
        return studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + ", " +
                "studentName='" + name + ", " +
                "Email=" + email + ", " +
                "phone :" + phone+ ", " +
                "branch :"+ branchName+
                '}';
    }
}
