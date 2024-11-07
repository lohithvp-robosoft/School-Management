public class Main {
    public static void main(String[] args) {

        University university1 = new University("VTU");
        College clg1 = new College("SMVITM", "VTU");
        College clg2 = new College("MITE", "VTU");
        System.out.println(university1.getCollegeList());

        university1.addClg(clg1);
        university1.addClg(clg2);
        System.out.println(university1.getCollegeList());
        System.out.println(university1);

        clg1.addBranch("CS", "DBMS", "OS", "Network");
        clg1.getALLBranches();
        clg1.getOneBranch("CS").addStudent("Rahul", "Rahul@gmail.com", 987654345l);
        System.out.println("Hello " + clg1.getOneBranch("CS").getStudentDetailByName("Rahul"));

        System.out.println(clg1.getALLBranches());

        clg1.getOneBranch("CS").addOneTeachingStaff("Lolita", "lolita@gmail.com", 323286248l, "OS");
        clg1.getOneBranch("CS").addOneTeachingStaff("hbsh", "kss@gmail.com", 323286248l, "OS");
        System.out.println(clg1.getOneBranch("CS"));
        System.out.println(clg1.getOneBranch("CS").getTeachingStaffByName("hbsh"));
        university1.addStaff("dnkjd","jsdsjk@jg.com",84773);
        System.out.println(university1.getstaffListByName("dnkjd"));

    }
}