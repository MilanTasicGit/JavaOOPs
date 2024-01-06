package org.JavaOOPs;

public class Registration {
        private String email;
        private String userName;
        private String password;

        public void setEmail(String email) {
            if (isValidEmail(email)) {
                this.email = email;
            } else {
                System.out.println("Invalid email format. Consider using Yahoo.");
            }
        }
        public void setUserName(String userName) {
            if (isValidUserName(userName)) {
                this.userName = userName;
            } else {
                System.out.println("Invalid userName. It should not be empty and should be longer than 6 characters.");
            }
        }
        public void setPassword(String password) {
            if (isValidPassword(password)) {
                this.password = password;
            } else {
                System.out.println("Invalid password. It should not be empty, should be longer than 6 characters, " +
                        "and should not contain the userName.");
            }
        }
        private boolean isValidEmail(String email) {
            return email.endsWith("@yahoo.com");
        }

        private boolean isValidUserName(String userName) {
            return userName.length() > 6;
        }

        private boolean isValidPassword(String password) {
            return password.length() > 6 && !password.contains(userName);
        }
        public static void main(String[] args) {
            Registration userRegistration = new Registration();

            userRegistration.setEmail("user@yahoo.com");
            userRegistration.setUserName("myusername");
            userRegistration.setPassword("mypassword123");

            System.out.println("Email: " + userRegistration.email);
            System.out.println("UserName: " + userRegistration.userName);
            System.out.println("Password: " + userRegistration.password);
        }
    }

