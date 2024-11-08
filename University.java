import java.util.ArrayList;
import java.util.HashMap;

public class University {
    private String name;
    private ArrayList<College> collegeList = new ArrayList<>();
    private static Long studentID = 1000l;
    private ArrayList<UniversityNonTeachingStaff> staffList = new ArrayList<>();
    HashMap<String, ArrayList<String>> hallTicket = new HashMap<>();

    public UniversityNonTeachingStaff getstaffListByName(String name) {
        for (UniversityNonTeachingStaff nonTeachingStaffs : staffList) {
            if (nonTeachingStaffs.getName().equals(name)) return nonTeachingStaffs;
        }
        System.out.println("Non Teacher does not exit");
        return null;
    }

    public void addStaff(String name, String email, long phone) {
        UniversityNonTeachingStaff nonTeachingStaff = new UniversityNonTeachingStaff(name, email, phone);
        staffList.add(nonTeachingStaff);
    }

    public ArrayList<UniversityNonTeachingStaff> getStaffList() {
        return staffList;
    }

    University(String name) {
        this.name = name;
    }

    public HashMap<String, ArrayList<String>> generateAttendance() {

        for (College clg : collegeList) {
            ArrayList<Branch> branches = clg.getALLBranches();
            ArrayList<String> studentNames = new ArrayList<>();

            for (Branch branch : branches) {
                ArrayList<Student> studentList = branch.getStudentList();
                for (Student student : studentList) {
//                    System.out.println("Hello");
                    System.out.println(student.getAttendanceInPercent());
                    if (student.getAttendanceInPercent() >= 75) {
                        studentNames.add(student.getName());
                        student.setHasHallTicket(true);
                    }
                }
            }
            if (!studentNames.isEmpty()) {
                hallTicket.put(clg.getClgName(), studentNames);
            }
        }
        return hallTicket;
    }

    public static String generateID() {
        studentID++;
        return "U" + studentID;
    }

    public String getUniversityName() {
        return this.name;
    }

    public ArrayList<College> getCollegeList() {
        return this.collegeList;

    }

    public void addClg(College clg) {
        this.collegeList.add(clg);
        System.out.println(clg + " is successfully added to the university " + this.name);
    }

    @Override
    public String toString() {
        return "{Name :" + name + ",\nCollege List:" + collegeList + "}";
    }
}
