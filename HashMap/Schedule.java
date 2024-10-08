import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.HashMap;

public class Schedule {
    private static final int START_HOUR = 8;
    private static final int END_HOUR = 17;
    private final HashMap<String, Class> classCodeAndClass = new HashMap<>();

    public Class addClass(String classCode, String subjectName, LocalDateTime time) {
        if (time.getDayOfWeek() == DayOfWeek.SUNDAY){
            System.out.println("We have a day of on Sunday!");
            return null;
        }


        int hour = time.getHour();
        if (hour < START_HOUR || hour > END_HOUR) {
            System.out.println("Class time must be between 08:00 and 17:00. Invalid time: " + time.getHour() + ":" + time.getMinute());
            return null;
        }

        if (classCodeAndClass.containsKey(classCode)) {
            System.out.println("Class with code " + classCode + " already exists.");
            return null;
        }

        Class newClass = new Class(classCode, subjectName, time);
        classCodeAndClass.put(classCode, newClass);
        return newClass;
    }

    public boolean removeClass(String classCode) {
        if (classCodeAndClass.containsKey(classCode)) {
            classCodeAndClass.remove(classCode);
            return true;
        }
        return false;
    }

    public Class getClass(String classCode) {
        return classCodeAndClass.get(classCode);
    }

    public void printAllClasses() {
        for (Class c : classCodeAndClass.values()) {
            System.out.println(c);
        }
    }
}