import java.util.ArrayList;

public class Staff extends Person{
    String staffId;

    Staff(String name, String email, long phone){
        super(name,email,phone);
        this.staffId = College.generateStaffID();
    }
}
