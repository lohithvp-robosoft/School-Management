import java.util.ArrayList;

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
