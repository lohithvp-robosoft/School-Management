import java.util.ArrayList;
import java.util.Arrays;

public class TeachingStaff extends Staff {
    String subject;
    String branchName;
    String staffId;


    TeachingStaff(String name, String email, long phone, String branchName, String subject) {
        super(name, email, phone);
//        super(staffId);
        this.branchName = branchName;
        this.subject = subject;
        this.staffId = College.generateStaffID();
    }

    public void assignAssignment(Student student, String title) {
        Assignment assignment = new Assignment(title);
        student.addAssignment(assignment);
    }

    public ArrayList<Integer> setStudentMarks(Student student, Integer... marks) {
        ArrayList<Integer> newMarks = new ArrayList<>(Arrays.asList(marks));
//        branchName.
        return student.setMarks(newMarks);
    }


    public int PutStudentAttendancePerMonth(Student student, int days, int totalDays) {
        return student.putAttendancePerMonth(student, days, totalDays);
    }


    @Override
    public String toString() {
        return "TeachingStaff{" +
                "staffId='" + staffId + ", " +
                "name='" + name + ", " +
                ", email='" + email + ", " +
                ", phone='" + phone + ", " +
                ", branchName='" + branchName + ", " +
                ", subject='" + subject + ", " +
                '}';
    }
}
