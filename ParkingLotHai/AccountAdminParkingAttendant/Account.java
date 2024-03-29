package Projects.ParkingLot.AccountAdminParkingAttendant;

import Projects.LibraryManagementSystem.AccountStatus;
import Projects.LibraryManagementSystem.Person;

public abstract class Account {
    private String userName;
    private String password;;
    private AccountStatus status;
    private Person person;

    public boolean resetPassword() {
        return false;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
