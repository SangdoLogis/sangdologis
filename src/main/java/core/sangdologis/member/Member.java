package core.sangdologis.member;

public class Member {
    //사용자 이름, 이메일 주소, 비밀번호, phone
    private String name;
    private String id;
    private String pw;
    private String email;
    private String phoneNum;
    private Grade grade;

    public Member(String name, String id, String pw, String email, String phoneNum, Grade grade) {
        this.name = name;
        this.id = id;
        this.pw = pw;
        this.email = email;
        this.phoneNum = phoneNum;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }
}
