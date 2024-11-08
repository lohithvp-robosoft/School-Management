import java.util.ArrayList;

public class Student extends Person {
    //    Branch branch;
    String studentID;
    //    String branchName;
    ArrayList<Integer> marks = new ArrayList<>();
    int AttendanceInPercent;
    ArrayList<Assignment> assignmentArrayList = new ArrayList<>();
    boolean hasHallTicket;
    int avgMark = 0;

    public void setHasHallTicket(boolean hasHallTicket) {
        this.hasHallTicket = hasHallTicket;
    }

    Student(String name, String email, long phone) {
        super(name, email, phone);
        this.studentID = University.generateID();
//        this.branchName = branchName;
        this.hasHallTicket = false;
//        this.Attendance = 0;
//        this.branch = branch.getBranchName(branch);
    }

    public int getAvgMark() {
        return avgMark;
    }

    public void setAvgMark() {
        for (Integer mark : marks) {
            this.avgMark += mark;
            this.avgMark /= marks.size();
        }
    }

    public int getAttendanceInPercent() {
        return AttendanceInPercent;
    }


    public void submitAssignment(String assingmentName, String format) {
        for (Assignment assignment : assignmentArrayList) {
            if (assignment.getTitle().equals(assingmentName)) {
                assignment.setCompleted(true);
                marks.add(30);
                assignment.setFormat(format);
                System.out.println("Assignment " + assingmentName + " is completed");
            }
        }
    }

    void addAssignment(Assignment assignment) {
        assignmentArrayList.add(assignment);
        System.out.println("Assignment assigned");
    }


    int putAttendancePerMonth(Student student, int attendance, int totalDay) {
        this.AttendanceInPercent = (attendance * 100) / totalDay;
//        System.out.println(AttendanceInPercent);
        return AttendanceInPercent;
    }

    public String getStudentID() {
        return studentID;
    }

    public ArrayList<Integer> getMarks() {
        return marks;
    }

    protected ArrayList<Integer> setMarks(ArrayList<Integer> newMarks) {
        this.marks = new ArrayList<>(newMarks);
        return this.marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + ", " +
                "studentName='" + name + ", " +
                "Email=" + email + ", " +
                "phone :" + phone + ", " +
//                "branch :" + branchName +
                '}';
    }
}
