import java.util.Date;

public final class DayOfLife {

    private final Integer id;
    private final Date date;
    private final String event;

    public DayOfLife(Integer id, Date date, String event) {

        //Идентификатор и день события не могут быть пустыми
        if (id == null)
            throw new IllegalArgumentException("address cannot be null");

        if (date == null)
            throw new IllegalArgumentException("date cannot be null");

        this.id = id;
        this.date = new Date(date.getTime());
        this.event = event;
    }

    public Integer getId(){
        return id;
    }

    public Date getDate(){
        //Возвращает копию объекта вместо оригинального
        return new Date(date.getTime());
    }

    public String getEvent(){
        return event;
    }

    //Строковый вывод представления объекта
    @Override
    public String toString() {
      return "DayOfLife{" +
              "\nid=" + id +
              "\ndate=" + date +
              "\nevent=" + event +
              "\n}";
    }
}
