package dairy;

import java.util.ArrayList;
import java.util.List;

public class Diary {

    private boolean islocked=true;
    private String password;
    private final List<Entry> entries;

    public Diary(String ownersName, String password){
        this.password = password;
        islocked = true;
        entries = new ArrayList<>();
    }
    public boolean isLocked() {
        return islocked;
    }

    public void unlockWith(String password) {
        boolean passwordMatches = password.equals(this.password);
        if (passwordMatches) islocked = false;
    }

    public void lock() {
        islocked = true;
    }

    public void write(String title, String body) {
        IllegalArgumentException exceptionToThrow = new IllegalArgumentException("Cannot write when diary is locked");
        if (islocked) throw exceptionToThrow;
        writeIntoDiary(title, body);
    }
    private void writeIntoDiary(String title, String body){
        int id = numberOfEntries() + 1;
        Entry newEntry = new Entry(id, title, body);
        entries.add(newEntry);
    }

    public int numberOfEntries() {
        return entries.size();
    }

    public Entry findEntryWithId(int id) {
        for(Entry entry: entries){
            if (entry.getId()==id) return entry;
        }
//        return entries.get(id-1); This one line of code is flawed already because it will add more Id when you start deleting.
        return null;
    }
}
