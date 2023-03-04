package algorithm;

import java.util.Scanner;

public class StudentAndSubject {
    Scanner input = new Scanner(System.in);

    private int noOfStudent;

    private int noOfSubject;

    private int[][] scoresInArray = new int[noOfStudent + 1][noOfSubject + 1];

    public void enterDisplay(){
        System.out.println("How many students do you have? ");
        noOfStudent = input.nextInt();
        System.out.println("How many subjects do you offer? ");
        noOfSubject = input.nextInt();
        System.out.println("saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Successfully saved");
    }

    public void secondDisplay(int studentNumber, int subjectNumber){
        System.out.printf("Enter student score %d%n", studentNumber);
        System.out.printf("Enter subject number %d%n", subjectNumber);
        int score = input.nextInt();
        scoresInArray[studentNumber][subjectNumber] = score;
        System.out.println("saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Successfully saved");
    }

    public void tabularHeaderDisplay(){
        for (int i = 1; i < noOfSubject * 8 + 30; i++){
            System.out.println("=");
        }
        System.out.println();
        System.out.printf("%-10s", "STUDENT");
        for (int i = 1; i < noOfSubject; i++){
            System.out.printf("SUB%-5d", i);
        }
        System.out.printf("%-7s%-5s%s%n", "TOT", "AVE", "POS");
        for (int i = 1; i < noOfSubject * 8 + 30; i++){
            System.out.println("=");
        }
    }

    public void tabularDisplayBody(){
        for (int i = 1; i <= noOfStudent; i++){
            System.out.printf("Student %-7d", i);
            for (int j = 1; j <= noOfStudent; j++){
                System.out.printf("%-8d", scoresInArray[i][j]);
            }
            System.out.printf("%-5d%s-5.2f%d%n", getTotalPerStudent(i),getAveragePerStudent(i),getStudentPosition(i));
        }
    }

    public int getStudentPosition(int studentNumber){
        int[] totalScore = new int[studentNumber];
        for (int i = 1; i <= noOfStudent; i++){
            totalScore[i] = getTotalPerStudent(i);
        }
        for (int i = 1; i <= studentNumber; i++){
            for (int j = 1; j <= noOfStudent; j++){
                if (totalScore[i] < totalScore[j]){
                    int temp = totalScore[i];
                    totalScore[i] = totalScore[j];
                    totalScore[j] = temp;
                }
            }
        }
     int studentTotal = getTotalPerStudent(studentNumber);
        int position = 0;
        for (int i = 1; i <= noOfStudent; i++){
            if (totalScore[i] == studentTotal){
                position = i;
                break;
            }
        }
        return position;
    }

    public int getTotalPerStudent(int studentNumber){
        int total = 0;
        for (int i = 1; i <= noOfSubject; i++){
            total = scoresInArray[studentNumber][i];
        }
        return total;
    }

    public double getAveragePerStudent(int studentNumber){
        int total = getTotalPerStudent(studentNumber);
        return (double) total/noOfSubject;
    }

    public void addScore(int studentNumber, int subjectNumber, int score){
        scoresInArray[studentNumber][studentNumber] = score;
    }

    public int getNoOfStudent() {
        return noOfStudent;
    }

    public void setNoOfStudent(int noOfStudent) {
        this.noOfStudent = noOfStudent;
    }

    public int getNoOfSubject() {
        return noOfSubject;
    }

    public void setNoOfSubject(int noOfSubject) {
        this.noOfSubject = noOfSubject;
    }

    public int[][] getScoresInArray() {
        return scoresInArray;
    }

    public void createScoresArray() {
        scoresInArray = new int[noOfStudent + 1][noOfSubject + 1];
    }
}
