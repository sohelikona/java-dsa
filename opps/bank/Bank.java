package bank;

//----------------access modifiers----------------

// diferent type of information are classified in java
// public
// private
// protected
// default

// ---------- There are two types of functions to access private information.
// Getters and  Setters

class Account {
    public String name;
    protected String email;
    private String password;

    // getters & setters
    public String getPassword() {
        return this.password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }
}

public class Bank {
    public static void main(String args[]) {
        Account account1 = new Account();
        account1.name = "Kona";
        account1.email = "soheliarefinkona@gmail.com";
        account1.setPassword("asdg123");
        System.out.println(account1.getPassword());
    }    
}
