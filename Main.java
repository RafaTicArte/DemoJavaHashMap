import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello DemoJavaHashMap!");

        // Crear un HashMap de estudiantes
        Map<String, Student> students = new HashMap<>();

        // Añadir estudiantes al HashMap
        students.put("101010A", new Student("101010A", "John", "Doe", 20));
        students.put("202020B", new Student("202020B", "Louis", "Gil", 21));
        students.put("303030C", new Student("303030C", "Jane", "Zoe", 22));

        // No se introduciría el siguiente estudiante, ya que el DNI ya existe
        students.put("303030C", new Student("303030C", "Jane", "Zoe", 22));

        // Añadir un estudiante utilizando su DNI
        Student studentTmp = new Student("404040D", "Luis", "Gonzalez", 23);
        students.put(studentTmp.getDni(), studentTmp);

        // Mostrar el HashMap de estudiantes
        System.out.println(students);

        // Mostrar un estudiante utilizando su clave
        System.out.println(students.get("101010A"));

        // Mostrar las claves del HashMap
        System.out.println(students.keySet());

        // Mostrar los valores del HashMap iterando
        for(String key : students.keySet()){
            System.out.println(students.get(key).getName());
        }

        // Crear un HashMap de estudiantes con objeto como clave
        Map<Student, Student> students2 = new HashMap<>();

        // Añadir estudiantes al HashMap
        Student studentTmp2 = new Student("ZZZZZZZZ", "John", "Doe", 20);
        students2.put(studentTmp2, studentTmp2);
        studentTmp2 = new Student("YYYYYYY", "Louis", "Gil", 21);
        students2.put(studentTmp2, studentTmp2);

        // Mostrar el HashMap de estudiantes
        System.out.println(students2);

        // Mostrar las claves del HashMap
        System.out.println(students2.keySet());
    }
}