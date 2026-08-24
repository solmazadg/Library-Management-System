public class Member {

    private int memberId;
    private String name;
    private String mail;
    private int age;
    private boolean active;

    public Member(int memberId , String name , String mail , int age , boolean active){
        this.memberId = memberId;
        this.name = name;
        this.mail = mail;
        this.age = age;
        this.active = active;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public int getAge() {
        return age;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isActive() {
        return active;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId=" + memberId +
                ", name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", age=" + age +
                ", active=" + active +
                '}';
    }

}
