package stream.ch06_db;
import java.util.Scanner;

public class ScoreManagement {
    private ScoreDAO dao = new ScoreDAO();;
    private static ScoreManagement scoreManagement = new ScoreManagement();
    private ScoreManagement() {
        //외부에서 호출하지 못하게
    }
    public static ScoreManagement getInstance() {

        return scoreManagement;
    }

    public void insertScore() throws Exception {
        dao.connection();
        Scanner input = new Scanner(System.in);
        for(int i=0; i<2; i++) {
            System.out.println("학번 입력 : ");
            int no = input.nextInt();
            System.out.println("이름 입력 : ");
            String name = input.next();
            System.out.println("국어 영어 수학 자바 순으로 성적 입력 : ");
            int kor = input.nextInt();
            int eng = input.nextInt();
            int math = input.nextInt();
            int java = input.nextInt();

            ScoreDTO dto = new ScoreDTO();
            dto.setNo(no);
            dto.setName(name);
            dto.setKoreanScore(kor);
            dto.setEnglishScore(eng);
            dto.setMathScore(math);
            dto.setJavaScore(java);

            int result = dao.add(dto);
            if (result > 0)
                System.out.println("성적 입력 완료");
        }
        dao.close();
    }

    public void showScore() throws Exception {
        dao.connection();
        System.out.println("학번 이름 국어 영어 수학 자바");
        for (ScoreDTO obj : dao.lists()) {
            System.out.println(obj.getNo()+" "+obj.getName()+" "+obj.getKoreanScore()+" "+obj.getEnglishScore()+" "+obj.getMathScore()+" "+obj.getJavaScore());
        }
        dao.close();
    }
}
