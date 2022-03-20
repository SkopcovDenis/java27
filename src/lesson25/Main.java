package lesson25;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/students_27?user=root&password=9939861balonkA");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT t.id, t.term, t.duration, td.id_descipline as id_disc, d.disciplin FROM term_descipline as td\n" +
                    "left join term as t on td.id_term = t.id\n" +
                    "left join discipline as d on td.id_descipline = d.id\n" +
                    "where d.status = 1 and t.status = 1\n" +
                    "order by t.term\n" +
                    "limit 5");
            while (rs.next()){
                System.out.print(rs.getInt("id") + " | ");
                System.out.print(rs.getString("term") + " | ");
                System.out.print(rs.getString("duration") + " | ");
                System.out.print(rs.getInt("id_disc") + " | ");
                System.out.println(rs.getString("disciplin"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
