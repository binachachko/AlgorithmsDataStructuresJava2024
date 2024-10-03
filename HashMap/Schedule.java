import java.time.LocalTime;
import java.util.HashMap;


public class Schedule {
    public HashMap<String, Class> classCodeAndClass = new HashMap<>();

    public void addClass(String classCode, String subjectName, LocalTime time) {
        Class newClass = new Class(classCode, subjectName, time);
        classCodeAndClass.put(classCode, newClass);
    }

    public void removeClass(String classCode) {
        classCodeAndClass.remove(classCode);
    }

    public void getClass(String classCode) {
        System.out.println(classCodeAndClass.get(classCode));
    }

    public void printAllClasses() {
        for (Class c : classCodeAndClass.values()) {
            System.out.println(c);
        }
    }
}