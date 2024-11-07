import java.util.ArrayList;

public class Branch {
    String branchName;
    private ArrayList<String> subjects;
    private ArrayList<TeachingStaff> teacherList = new ArrayList<>();
    private ArrayList<Student> studentList = new ArrayList<>();

    Branch(String name, ArrayList<String> subjects) {
        this.branchName = name;
        this.subjects = subjects;
    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<TeachingStaff> getTeacherList() {
        return teacherList;
    }

    public void addOneTeachingStaff(String name, String email, Long phone, String subject) {
        teacherList.add(new TeachingStaff(name, email, phone, subject, branchName));
        System.out.println("Adder teacher " + name + " to the branch " + branchName);
    }

    public TeachingStaff getTeachingStaffByName(String name) {
        for (TeachingStaff teachingStaff : teacherList) {
            if (teachingStaff.getName().equals(name)) return teachingStaff;
        }
        System.out.println("Teacher does not exit");
        return null;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public Student getStudentDetailByName(String name) {
        for (Student student : studentList) {
            if (student.getName().equals(name)) return student;
        }
        return null;
    }

//    public void addTeacher(TeachingStaff teacher) {
//        teacherList.add(teacher);
//        System.out.println("Adder teacher " + teacher + " to the branch " + branchName);
//    }

    public void addStudent(String studentName, String email, Long Phone) {

        studentList.add(new Student(studentName, email, Phone, branchName));
        System.out.println("Adder student " + studentName + " to the branch " + branchName);
    }


    @Override

    public String toString() {
        return "Branch{" +
                "branchName='" + branchName + '\'' +
                ", subjects=" + subjects +
                ", teacherList=" + teacherList +
                ", studentList=" + studentList +
                '}';
    }
}
