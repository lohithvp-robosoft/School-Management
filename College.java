import java.util.ArrayList;
import java.util.Arrays;

public class College {
    private String clgName;
    private ArrayList<Branch> branches = new ArrayList<>();
    private static Long staffID = 1000l;
    private ArrayList<UniversityNonTeachingStaff> nonTeachingStaffsList = new ArrayList<>();

    public static String generateStaffID() {
        staffID++;
        return String.valueOf("Staff" + staffID);
    }

    public ArrayList<UniversityNonTeachingStaff> getNonTeachingStaffsList() {
        return nonTeachingStaffsList;
    }

    public UniversityNonTeachingStaff getOneNonTeachingStaff(String name) {
        for (UniversityNonTeachingStaff nonTeachingStaffs : nonTeachingStaffsList) {
            if (nonTeachingStaffs.getName().equals(name)) return nonTeachingStaffs;
        }
        System.out.println("Non Teacher does not exit");
        return null;

    }

    public void addNonStaff(String name, String email, long phone) {
        UniversityNonTeachingStaff nonTeaching = new ClgNonTeachingStaff(name, email, phone);
        nonTeachingStaffsList.add(nonTeaching);
    }

    public ArrayList<Branch> getALLBranches() {
        return branches;
    }

    public Branch getOneBranch(String name) {
        for (Branch branch : branches) {
            if (branch.getBranchName().equals(name)) {  // Use .equals() for String comparison
                return branch;
            }
        }
        return null;  // Return null if no branch found
    }

    public void addBranch(String branchName, String... subject) {
        branches.add(new Branch(branchName, new ArrayList<>(Arrays.asList(subject))));
    }

    College(String clgName, String universityName) {
        this.clgName = clgName;
    }

    @Override
    public String toString() {
        return "College{" + "clgName='" + clgName + '\'' + ", branches=" + branches + '}';
    }

    public String getClgName() {
        return clgName;
    }

}
