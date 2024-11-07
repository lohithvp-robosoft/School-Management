public class ClgNonTeachingStaff extends UniversityNonTeachingStaff {
    String staffID;

    public ClgNonTeachingStaff(String name, String email, long phone) {
        super(name, email, phone);
        this.staffID = College.generateStaffID();
    }

    public void task() {
        System.out.println("University Admin Task");
    }

    @Override
    public String toString() {
        return "Student{" +
                "StaffId='" + staffID + ", " +
                "StaffName='" + name + ", " +
                "Email=" + email + ", " +
                "phone :" + phone + ", " +
                '}';
    }
}
