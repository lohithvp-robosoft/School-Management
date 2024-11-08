import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class Branch {
    String branchName;
    private ArrayList<String> subjects;
    private ArrayList<TeachingStaff> teacherList = new ArrayList<>();
    private ArrayList<Student> studentList = new ArrayList<>();
    private HashMap<String, ArrayList<Integer>> studentMarksRecord = new HashMap<>();
    private HashMap<String, Integer> top3Performer = new HashMap<>();

    Branch(String name, ArrayList<String> subjects) {
        this.branchName = name;
        this.subjects = subjects;
    }


    public void addStudentInRecord(Student student) {
        studentMarksRecord.put(student.getName(), student.getMarks());
        System.out.println(studentMarksRecord);
    }

    public HashMap<String, ArrayList<Integer>> getStudentRecord() {
        return studentMarksRecord;
    }

    public HashMap<String, Integer> getTop3Performer() {
        HashMap<String, Integer> temp = new HashMap<>();
        for (Student student : studentList) {
            student.setAvgMark();
            temp.put(student.getName(), student.getAvgMark());
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(temp.entrySet());
        list.sort((entry1, entry2) -> entry2.getValue() - entry1.getValue());
        Iterator<Map.Entry<String, Integer>> iterator = list.iterator();
        top3Performer.clear();
        int count = 0;
        for (Map.Entry<String, Integer> entry : list) {
            if (count == 3) break;
            top3Performer.put(entry.getKey(), entry.getValue());
            count++;
        }
        return top3Performer;

    }

    public String getBranchName() {
        return branchName;
    }

    public ArrayList<TeachingStaff> getTeacherList() {
        return teacherList;
    }

    public TeachingStaff addOneTeachingStaff(String name, String email, Long phone, String subject) {
        teacherList.add(new TeachingStaff(name, email, phone, branchName, subject));
        System.out.println("Adder teacher " + name + " to the branch "
                + branchName);
        return getTeachingStaffByName(name);
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

    public Student addStudent(String studentName, String email, Long Phone) {
        studentList.add(new Student(studentName, email, Phone));
        System.out.println("Adder student " + studentName + " to the branch");
        return getStudentDetailByName(studentName);
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
