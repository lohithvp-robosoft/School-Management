import java.util.ArrayList;
import java.util.Arrays;

public class College {
    private String clgName;
    private ArrayList<Branch> branches = new ArrayList<>();
    private static Long staffID = 1000l;
    private ArrayList<ClgNonTeachingStaff> nonTeachingStaffsList = new ArrayList<>();

    public static String generateStaffID() {
        staffID++;
        return String.valueOf("Staff" + staffID);
    }

    public ArrayList<ClgNonTeachingStaff> getNonTeachingStaffsList() {
        return nonTeachingStaffsList;
    }

    public ClgNonTeachingStaff getOneNonTeachingStaff(String name) {
        for (ClgNonTeachingStaff nonTeachingStaffs : nonTeachingStaffsList) {
            if (nonTeachingStaffs.getName().equals(name)) return nonTeachingStaffs;
        }
        System.out.println("Non Teacher does not exit");
        return null;

    }

    public void addNonStaff(String name, String email, long phone) {
        ClgNonTeachingStaff nonTeaching = new ClgNonTeachingStaff(name, email, phone);
        nonTeachingStaffsList.add(nonTeaching);
    }

    public ArrayList<Branch> getALLBranches() {
        return branches;
    }

    public Branch getOneBranch(String name) {
        for (Branch branch : branches) {
            if (branch.getBranchName().equals(name)) {
                return branch;
            }
        }
        return null;
    }

    public Branch addBranch(String branchName, String... subject) {
        Branch newBranch = new Branch(branchName, new ArrayList<>(Arrays.asList(subject)));
        branches.add(newBranch);
        return newBranch;
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
