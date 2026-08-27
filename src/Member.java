public class Member extends Person {

    private int memberId;
    private boolean active;

    public Member(int memberId, String name, String mail, int age, boolean active) {

        super(name, mail, age);
        this.memberId = memberId;
        this.active = active;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return super.toString() +  "Member{" +
                "memberId=" + memberId +
                ", name='" + getName() + '\'' +
                ", mail='" + getMail() + '\'' +
                ", age=" + getAge() +
                ", active=" + active +
                '}';
    }
}