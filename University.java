import java.util.ArrayList;

public class University {
    private String name;
    private ArrayList<College> collegeList = new ArrayList<>();
    private static Long studentID = 1000l;
    private ArrayList<UniversityNonTeachingStaff> staffList = new ArrayList<>();

    public UniversityNonTeachingStaff getstaffListByName(String name) {
        for (UniversityNonTeachingStaff nonTeachingStaffs : staffList) {
            if (nonTeachingStaffs.getName().equals(name)) return nonTeachingStaffs;
        }
        System.out.println("Non Teacher does not exit");
        return null;
    }

    public void addStaff(String name, String email, long phone){
        staffList.add(new UniversityNonTeachingStaff(name,email,phone));
    }

    public ArrayList<UniversityNonTeachingStaff> getStaffList() {
        return staffList;
    }

    University(String name) {
        this.name = name;
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
