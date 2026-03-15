import java.time.LocalDate;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Maiin {

    public static void main (String[] args) {
        //Создание экземпляров классов Date и DayOfLife
        Date someDay = java.sql.Date.valueOf(LocalDate.of (2026, 3, 15));
        DayOfLife deadline = new DayOfLife(0, someDay, "The last day for the completion of the 1'st module");
        System.out.println("Initial: " + deadline);
        //Изменение исходного объекта Date
        someDay.setTime(someDay.getTime() + TimeUnit.DAYS.toMillis( 1 ));
        System.out.println("\nAfter changing Date: " + deadline);

        //Изменение исходного объекта Date из getter
        Date anotherDay = deadline.getDate();
        someDay.setTime(12345);
        System.out.println("\nAfter another changing Date: " + deadline);
    }

}
