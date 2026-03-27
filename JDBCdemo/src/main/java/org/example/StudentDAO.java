package org.example;
import java.sql.*;

    public class StudentDAO {

        public void insert(Student stu) throws SQLException {
            String sql = "insert into details(name, gender, reg_no, email, dob) values(?,?,?,?,?)";
            Connection con = DBconnection.getConnection();
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, stu.getName());
            st.setString(2, stu.getGender());
            st.setInt(3, stu.getRegNo());
            st.setString(4, stu.getEmail());
            st.setString(5, stu.getDob());

            st.executeUpdate();
            System.out.println("Inserted Successfully!");
            con.close();
        }

        public void delete(int id) throws SQLException {
            String sql = "delete from details where reg_no=?";
            Connection con = DBconnection.getConnection();
            PreparedStatement st = con.prepareStatement(sql);

            st.setInt(1, id);
            int row = st.executeUpdate();

            if (row >= 1)
                System.out.println("Deleted Successfully!");
            else
                System.out.println("No record found!");

            con.close();
        }

        public void find(int regNo) throws SQLException {
            Connection con = DBconnection.getConnection();
            String query = "SELECT * FROM details WHERE reg_no=?";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, regNo);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                System.out.println("Student Found:");
                System.out.println("Reg No : " + rs.getInt("reg_no"));
                System.out.println("Name   : " + rs.getString("name"));
                System.out.println("Gender : " + rs.getString("gender"));
                System.out.println("Email  : " + rs.getString("email"));
                System.out.println("DOB    : " + rs.getString("dob"));
            } else {
                System.out.println("Student Not Found!");
            }

            con.close();
        }

        public void findAll() throws SQLException {
            Connection con = DBconnection.getConnection();
            String query = "SELECT * FROM details";
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println("\n----------------------------");
                System.out.println("Reg No : " + rs.getInt("reg_no"));
                System.out.println("Name   : " + rs.getString("name"));
                System.out.println("Gender : " + rs.getString("gender"));
                System.out.println("Email  : " + rs.getString("email"));
                System.out.println("DOB    : " + rs.getString("dob"));
            }

            con.close();
        }
    }

