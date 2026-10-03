
public class PasswordCheckerManager {

    public static class PasswordChecker {
        private String password;

        public PasswordChecker(String password) {
            this.password = (password != null) ? password : "";
        }

        public String getStrength() {
            int len = password.length();
            if (len < 6) {
                return "Weak";
            } else if (len <= 9) {
                return "Medium";
            } else {
                return "Strong";
            }
        }
    }

    public static void main(String[] args) {
        PasswordChecker pc1 = new PasswordChecker("abcd");
        System.out.println("Strength ('abcd'): " + pc1.getStrength());

        PasswordChecker pc2 = new PasswordChecker("abcdefghij");
        System.out.println("Strength ('abcdefghij'): " + pc2.getStrength());
    }
}