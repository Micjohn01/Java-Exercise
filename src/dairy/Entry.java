package dairy;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Entry {

    private String title;
    private String body;
    private int id;
    private LocalDateTime timeOfEntry;

    public Entry(int id, String title, String body) {
        this.title = title;
        this.body = body;
        timeOfEntry = LocalDateTime.now();
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        String time = DateTimeFormatter.ofPattern("EEE, dd/MM/yyyy, hh:mm:ss a").format(timeOfEntry);
        return String.format("""
                ===========================
                Entry %s
                Title: %s
                Body: %s
                Body: %s
                ===========================
                """, id, time, title, body);

    }
}
