package stream.ch06_db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ScoreDAO {
    private Connection con;
    private Statement stmt;

    public Connection connection() throws Exception {
        con = Util.getConnection();
        return con;
    }
    public void close() throws SQLException {
        con.close();
    }

    public int add(ScoreDTO dto) throws SQLException {
        int result=0;

        stmt = con.createStatement();

        String sql = String.format("insert into tbl_score values(%d, '%s', %d, %d, %d, %d)",
                dto.getNo(), dto.getName(), dto.getKoreanScore(), dto.getEnglishScore(), dto.getMathScore(), dto.getJavaScore());
        result = stmt.executeUpdate(sql);
        stmt.close();
        return result;
    }

    public ArrayList<ScoreDTO> lists() throws SQLException {
        ArrayList<ScoreDTO> result = new ArrayList<>();
        stmt = con.createStatement();

        String sql = "select * from tbl_score";
        ResultSet rs = stmt.executeQuery(sql);
        while(rs.next()) {
            ScoreDTO dto = new ScoreDTO();
            dto.setNo(rs.getInt("no"));
            dto.setName(rs.getString("name"));
            dto.setKoreanScore(rs.getInt("kor"));
            dto.setEnglishScore(rs.getInt("eng"));
            dto.setMathScore(rs.getInt("math"));
            dto.setJavaScore(rs.getInt("java"));

            result.add(dto);
        }
        rs.close();
        stmt.close();
        return result;
    }
}
