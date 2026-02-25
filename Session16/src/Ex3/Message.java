package Ex3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Message {
    private String sender;
    private String content;
    private LocalDateTime timestamp;

    public Message() {
    }

    public Message(String content, String sender, LocalDateTime timestamp) {
        this.content = content;
        this.sender = sender;
        this.timestamp = timestamp;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(timestamp.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm")));
        sb.append("] ").append(sender);
        sb.append(": ").append(content);
        return sb.toString();
    }


}
