public class UniversityNonTeachingStaff extends Person{

    public UniversityNonTeachingStaff(String name, String email, long phone) {
        super(name, email, phone);
    }

    public void task() {
        System.out.println("University Admin Task");
    }

    @Override
    public String toString() {
        return "Staff{" +
                "Staff Name='" + name + ", " +
                "Email=" + email + ", " +
                "phone :" + phone+ ", " +
                '}';
    }
}
