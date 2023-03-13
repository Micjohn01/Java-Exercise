package dairy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    private Diary michaelDiary;
    @BeforeEach

    public void setUp(){
        michaelDiary = new Diary("Michael", "correctPassword");
    }

    @Test
    public void  diaryExistTest(){
//        Diary michaelDiary = new Diary();
        assertNotNull(michaelDiary);
    }
    @Test
    public void newDiaryIsLocked(){
        assertTrue(michaelDiary.isLocked());
    }
    @Test
    public void lockedDairyCanBeUnlockedTest(){
        assertTrue(michaelDiary.isLocked());
        michaelDiary.unlockWith("correctPassword");
        assertFalse(michaelDiary.isLocked());
    }
    @Test
    public void wrongPasswordCannotUnlockDiaryTest(){
        assertTrue(michaelDiary.isLocked());
        michaelDiary.unlockWith("wrongPassword");
        assertTrue(michaelDiary.isLocked());
    }
    @Test
    public void diaryCanBeLockedTest(){
        michaelDiary.unlockWith("correctPassword");
        assertFalse(michaelDiary.isLocked());

        michaelDiary.lock();
        assertTrue(michaelDiary.isLocked());
    }
    @Test
    public void happeningsCanBeAddedToTheDiary(){
        michaelDiary.unlockWith("correctPassword");
        assertFalse(michaelDiary.isLocked());

        michaelDiary.write("I remember the day I asked my girlfriend out",
                "twas really cool. It all started with...");

        assertEquals(1, michaelDiary.numberOfEntries());
    }
    @Test
    public void entriesCannotBeAddedWhenDiaryIsLockedTest(){
        assertTrue(michaelDiary.isLocked());

        try {
            michaelDiary.write("I remember the day I asked my girlfriend out",
                    "twas really cool. It all started with...");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        assertEquals(0, michaelDiary.numberOfEntries());
    }
    @Test
    public void writingToLockedDiaryThrowsExceptionTest(){
        assertTrue(michaelDiary.isLocked());

        assertThrows(Exception.class,()-> michaelDiary.write("I remember the day I asked my girlfriend out",
                "twas really cool. It all started with...")
        );

//        assertEquals(0, michaelDiary.numberOfEntries());
    }
    @Test
    public void entriesCanBeFoundByIdTest(){
        michaelDiary.unlockWith("correctPassword");
        assertFalse(michaelDiary.isLocked());
        michaelDiary.write("I remember the day I asked my girlfriend out",
                "twas really cool. It all started with...");
        assertEquals(1, michaelDiary.numberOfEntries());

        Entry foundEntry = michaelDiary.findEntryWithId(1);

        assertEquals(1, foundEntry.getId());
        assertEquals("I remember the day I asked my girlfriend out", foundEntry.getTitle());
        assertEquals("twas really cool. It all started with...", foundEntry.getBody());
    }
}
