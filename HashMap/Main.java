import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Schedule schedule = new Schedule();

        schedule.addClass("MATH101", "Mathematics", LocalDateTime.parse("2024-10-07T09:00"));
        schedule.addClass("PHY102", "Physics", LocalDateTime.parse("2024-10-07T10:00"));
        schedule.addClass("CHE103", "Chemistry", LocalDateTime.parse("2024-10-07T11:00"));
        schedule.addClass("LIT104", "Literature", LocalDateTime.parse("2024-10-07T12:00"));

        System.out.println("\nAll classes: ");
        schedule.printAllClasses();

        System.out.println("\nFind class MATH101: ");
        System.out.println(schedule.getClass("MATH101"));



        System.out.println("\nAll classes after removal class Physics:");
        System.out.println(schedule.removeClass("PHY102"));
        schedule.printAllClasses();

        System.out.println("\nAdd class BIO105 with incorrect time: ");
        System.out.println(schedule.addClass("BIO105", "Biology", LocalDateTime.parse("2024-10-07T18:00")));

        System.out.println("\nAdd incorrect class Biology with the same code: ");
        System.out.println(schedule.addClass("MATH101", "Biology", LocalDateTime.parse("2024-10-07T09:00")));


        System.out.println("\nAdd incorrect class Biology (on Sunday): ");
        System.out.println(schedule.addClass("BIO105", "Biology", LocalDateTime.parse("2024-10-06T09:00")));

        System.out.println("\nAdd correct class Biology: ");
        System.out.println(schedule.addClass("BIO105", "Biology", LocalDateTime.parse("2024-10-07T09:00")));
        schedule.printAllClasses();
    }
}
