package Ex2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Event {
    private String name;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    public Event() {
    }

    public Event(String name, LocalDateTime startDate, LocalDateTime endDate) {
        this.endDate = endDate;
        this.name = name;
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        // build a header/footer separator matching the column widths used
        final int NAME_WIDTH = 50;
        final int START_WIDTH = 20;
        final int END_WIDTH = 20;

        StringBuilder sb = new StringBuilder();
        
        sb.append(String.format("|%-" + NAME_WIDTH + "s|%-" + START_WIDTH + "s|%-" + END_WIDTH + "s|\n",
                                 name, startDate.format(FORMATTER), endDate.format(FORMATTER)));

        sb.append("+")
          .append("-".repeat(NAME_WIDTH))
          .append("+")
          .append("-".repeat(START_WIDTH))
          .append("+")
          .append("-".repeat(END_WIDTH))
          .append("+");

        return sb.toString();
    }


}
