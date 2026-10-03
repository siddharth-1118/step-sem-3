package encapsulation.class_problems;

public class UserSessionManager {

    public static class UserSession {
        private String username;
        private String sessionToken;
        private boolean isActive;

        public UserSession(String username, String sessionToken) {
            this.username = username;
            this.sessionToken = sessionToken;
            this.isActive = true;
        }

        public void logout() {
            this.isActive = false;
        }

        public boolean isSessionValid() {
            return isActive;
        }

        public String getUsername() {
            return username;
        }
    }

    public static void main(String[] args) {
        UserSession session = new UserSession("Priya", "TOKEN123");
        System.out.println("Valid: " + session.isSessionValid());
        session.logout();
        System.out.println("Valid after logout: " + session.isSessionValid());
    }
}
