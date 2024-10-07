import java.time.LocalTime;
import java.util.HashMap;


public class Schedule {
    public HashMap<String, Class> classCodeAndClass = new HashMap<>();

    public void addClass(String classCode, String subjectName, LocalTime time) {
        LocalTime startTime = LocalTime.of(8, 0);
        LocalTime endTime = LocalTime.of(17, 0);
        if (time.isBefore(startTime) || time.isAfter(endTime)) {
            System.out.println("Class time must be between 08:00 and 17:00. Invalid time: " + time);
            return;
        }

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