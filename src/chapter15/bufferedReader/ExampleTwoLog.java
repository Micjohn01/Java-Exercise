package chapter15.bufferedReader;

import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExampleTwoLog {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(ExampleTwoLog.class);
        try (BufferedReader bufferedReader =
                     new BufferedReader(new FileReader("C:\\Users\\user\\IdeaProjects\\exercises\\src\\chapter15\\text.txt"))){
            System.out.println(bufferedReader.readLine());
        } catch (IOException exception){
            logger.error(()->exception.getMessage());
        }
    }
}
