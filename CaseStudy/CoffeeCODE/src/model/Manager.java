package model;

public class Manager {
    private Person managerInfo;
    private  Account loginInfo;

    public Manager() {
    }

    public Manager(Person managerInfo, Account loginInfo) {
        this.managerInfo = managerInfo;
        this.loginInfo = loginInfo;
    }

    public Person getManagerInfo() {
        return managerInfo;
    }

    public void setManagerInfo(Person managerInfo) {
        this.managerInfo = managerInfo;
    }

    public Account getLoginInfo() {
        return loginInfo;
    }

    public void setLoginInfo(Account loginInfo) {
        this.loginInfo = loginInfo;
    }
}
