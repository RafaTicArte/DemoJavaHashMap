import java.util.Objects;

public class Student {
    private String dni;
    private String name;
    private String surname;
    private int age;

    public Student() {
        this.dni = "";
        this.name = "";
        this.surname = "";
        this.age = 0;
    }

    public Student(String dni, String name, String surname, int age){
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return dni+" - "+surname+", "+name+" ("+age+") // "+hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    @Override
    public boolean equals(Object obj) {
        boolean isEquals = false;
        if (this == obj){
            isEquals = true;
        } else if (obj == null || getClass() != obj.getClass()) {
            isEquals = false;
        } else {
            Student student = (Student) obj;
            isEquals = Objects.equals(dni, student.getDni());
        }
        return isEquals;
    }
}