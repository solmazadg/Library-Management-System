package model;

public class Librarian extends Person {

        private int librarianId;

        public Librarian(int librarianId, String name,
                         String mail, int age) {

            super(name, mail, age);
            this.librarianId = librarianId;
        }

    public int getLibrarianId() {
        return librarianId;
    }

    public void setLibrarianId(int librarianId) {
        this.librarianId = librarianId;
    }

    @Override
        public String toString() {
            return super.toString() +  "model.Librarian{" +
                    "librarianId=" + librarianId +
                    ", name='" + getName() + '\'' +
                    ", mail='" + getMail() + '\'' +
                    ", age=" + getAge() +
                    '}';
        }
}


