package java_interview_problems;

public class badexample {
    public static void main(String[] args) {

        VWOLogin vwoLogin = new VWOLogin("admin", "admin");
        //vwoLogin.password = "admin123";
        boolean checkLogin = vwoLogin.isLoggedIn("admin", "admin");

        //vwoLogin.password = "admin123";
        System.out.println(vwoLogin.password);
    }
}

class VWOLogin {
    public String username;
    public String password;

    public VWOLogin(String username, String password) {
        this.username = username;
        // this.password = password;
        System.out.println(this.password = password);
    }

    boolean isLoggedIn(String username, String password) {
        if (this.username.toLowerCase().equals(username) && this.password.toLowerCase().equals(password)) {
            System.out.println("Logged In");
            System.out.println(this.password = password);
            return true;
        } else {
            System.out.println("Wrong User");
            return false;
        }
    }
}