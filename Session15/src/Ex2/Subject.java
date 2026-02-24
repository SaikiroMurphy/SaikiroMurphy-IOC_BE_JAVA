package Ex2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Subject {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    private String code;
    private String name;
    private int credits;
    private LocalDate startDate;

    public Subject() {
    }

    public Subject(String code, int credits, String name, LocalDate startDate) {
        this.code = code;
        this.credits = credits;
        this.name = name;
        this.startDate = startDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Subject{");
        sb.append("code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", credits=").append(credits);
        sb.append(", startDate=").append(startDate.format(formatter));
        sb.append('}');
        return sb.toString();
    }
}
