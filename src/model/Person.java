package model;

public class Person {

        private String name;
        private String mail;
        private int age;

        public Person(String name, String mail, int age) {
            this.name = name;
            this.mail = mail;
            this.age = age;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "model.Person{" +
                "name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", age=" + age +
                '}';
    }
}


