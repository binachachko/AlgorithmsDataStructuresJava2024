import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Schedule schedule = new Schedule();

        schedule.addClass("MATH101", "Mathematics", LocalTime.parse("09:00"));
        schedule.addClass("PHY102", "Physics", LocalTime.parse("11:00"));
        schedule.addClass("CHE103", "Chemistry", LocalTime.parse("12:00"));
        schedule.addClass("LIT103", "Literature", LocalTime.parse("13:00"));

        System.out.println("\nAll classes: ");
        schedule.printAllClasses();

        System.out.println("\nFind class MATH101: ");
        schedule.getClass("MATH101");

        schedule.removeClass("PHY102");

        System.out.println("\nAll classes after removal:");
        schedule.printAllClasses();
    }
}
