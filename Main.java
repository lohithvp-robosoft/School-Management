import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // University created
        University university1 = new University("VTU");

        //  College created
        College clg1 = new College("SMVITM", "VTU");
        College clg2 = new College("MITE", "VTU");

        // University added
        university1.addClg(clg1);
        university1.addClg(clg2);
        System.out.println(university1.getCollegeList());
        System.out.println(university1);

        // Added branch to the college
        Branch csBranch_SMVITM = clg1.addBranch("CS", "DBMS", "OS", "Network");
        Branch ec_Branch_SMVITM = clg1.addBranch("EC");

        // Adding Student to
        Student rahul = csBranch_SMVITM.addStudent("Rahul", "Rahul@gmail.com", 987654345l);
        Student varun = csBranch_SMVITM.addStudent("Varun", "varun@gmail.com", 4374484844l);
        Student teju = csBranch_SMVITM.addStudent("teju", "teju@gmad.com", 287278908l);
        Student kiran = csBranch_SMVITM.addStudent("kiran", "kiran@gmad.com", 28727898608l);

        // Listing out college branch
        System.out.println(clg1.getALLBranches());

        System.out.println(teju);
        System.out.println(rahul);
        System.out.println(varun);


        TeachingStaff lolita = csBranch_SMVITM.addOneTeachingStaff("Lolita", "lolita@gmail.com", 323286248l, "OS");

        System.out.println(lolita);
        System.out.println(lolita.setStudentMarks(rahul, 50));
        System.out.println(rahul.getMarks());

        csBranch_SMVITM.addOneTeachingStaff("Venkat", "Venkat@gmail.com", 323286248l, "OS");

        System.out.println(csBranch_SMVITM.getTeachingStaffByName("Venkat"));
        university1.addStaff("Suresh", "Suresh@jg.com", 84773);
        System.out.println(university1.getstaffListByName("Suresh"));

        lolita.setStudentMarks(varun, 34, 83);

        System.out.println(varun.getMarks());
        System.out.println(csBranch_SMVITM.getStudentRecord());


        lolita.setStudentMarks(teju, 18, 19);
        lolita.setStudentMarks(kiran, 80, 76);
        csBranch_SMVITM.addStudentInRecord(teju);
        csBranch_SMVITM.addStudentInRecord(rahul);
        csBranch_SMVITM.addStudentInRecord(varun);
        csBranch_SMVITM.addStudentInRecord(kiran);
        System.out.println(csBranch_SMVITM.getStudentRecord());
        System.out.println(lolita.setStudentMarks(kiran, 21, 30));
        System.out.println(lolita.PutStudentAttendancePerMonth(kiran, 25, 29));
        System.out.println(lolita.PutStudentAttendancePerMonth(varun, 25, 29));
        System.out.println(kiran.getAttendanceInPercent());
        System.out.println("Hello  " + csBranch_SMVITM.getTop3Performer());////

        lolita.assignAssignment(rahul, "Assignment 1");
        rahul.submitAssignment("Assignment 1", "PDF");
        System.out.println("Hall Ticket" + university1.generateAttendance());

    }
}