package stream.ch06_db;

public class ScoreTest {
    public static void main(String[] args) throws Exception {
        ScoreManagement scoreManagement = ScoreManagement.getInstance();

        scoreManagement.insertScore();
        scoreManagement.showScore();
    }
}
