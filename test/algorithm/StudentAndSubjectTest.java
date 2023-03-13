package algorithm;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class StudentAndSubjectTest {

    @Test
    public void tabularHeaderDisplay(){
        StudentAndSubject student = new StudentAndSubject();
        student.setNoOfStudent(5);
        student.tabularHeaderDisplay();
    }

    @Test
    void scoresArrayTest(){
        StudentAndSubject student = new StudentAndSubject();
        student.setNoOfStudent(2);
        student.tabularHeaderDisplay();
        System.out.println(Arrays.deepToString(student.getScoresInArray()));
        student.addScore(1, 2, 38);
        System.out.println(Arrays.deepToString(student.getScoresInArray()));
    }

    @Test
    void tabularDisplayBodyTest(){
        StudentAndSubject student = new StudentAndSubject();
        student.setNoOfStudent(3);
        student.setNoOfStudent(3);
        student.createScoresArray();
        student.addScore(1,1,20);
        student.addScore(1,2,50);
        student.addScore(2,3,70);
        student.addScore(2,1,60);
        student.addScore(3,2,60);
        student.addScore(3,3,60);
        student.addScore(3,1,60);
        student.addScore(3,2,60);
        student.addScore(2,3,60);
        student.tabularHeaderDisplay();
        System.out.println();
    }



}