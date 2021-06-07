package Student_Inherit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.Student;

public class ProcessStudent {
	private Connection cn;

	public static Connection getConnection() {
		Connection cn = null;
		String url = "jdbc:mysql://localhost:3306/DBStudent3";
		String user = "root";
		String password = "meo12345";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
                      

			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cn;
	}

	public static void main(String[] args) {

		Connection connection = getConnection();
		if (connection != null) {
			System.out.println("Success");
		} else {
			System.out.println("Fail");
		}
	}

	public static boolean insertStudent(String ID, String name, String classID, boolean Gender, double mark)
			throws SQLException {
		Connection connection = getConnection();
		String sql = "insert into student(id, name, classid, gender, mark) values(?, ?, ?, ?, ?)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		try {
			preparedStatement.setString(1, ID);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, classID);
			preparedStatement.setBoolean(4, Gender);
			preparedStatement.setDouble(5, mark);
			preparedStatement.executeUpdate();
			connection.close();
			System.out.println("Success");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Fail");
			return false;
		}
	}

	public static boolean update(String id) {
		Connection connection = getConnection();
		String sql = "update student set id = ?, set name = ?, set gender = ?, set classid = ?, set mark = ? where id like ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(0, id);
			preparedStatement.executeUpdate();
			System.out.println("Success");
			connection.close();
			return true;
		} catch (SQLException e) {
			System.out.println("Fail");
			return false;
		}
	}
	public boolean delete(String id)
	{
		Connection connection = getConnection();
		String sql = "delete from student where id like ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, id);
			preparedStatement.executeUpdate();
			connection.close();
			System.out.println("Success");
			return true;
		} catch (SQLException e) {
			System.out.println("Fail");
			return false;
		}
	}

	public ArrayList<Student> getStudent_byClassID(String classid) {
		Connection connection = getConnection();
		String sql = "select * from student  where Classid like ?";
		ArrayList<Student> students = new ArrayList<Student>();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, classid);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				Student s = new Student();
				s.setId(rs.getString("ID"));
				s.setName(rs.getString("Name"));
				s.setGender(rs.getBoolean("Gender"));
				s.setClassID(rs.getString("ClassID"));
				s.setMark(rs.getDouble("Mark"));
				students.add(s);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return students;

	}
        public ArrayList<Student> getList() {
		Connection connection = getConnection();
		String sql = "select * from student";
		ArrayList<Student> students = new ArrayList<Student>();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				Student s = new Student();
				s.setId(rs.getString("ID"));
				s.setName(rs.getString("Name"));
				s.setGender(rs.getBoolean("Gender"));
				s.setClassID(rs.getString("ClassID"));
				s.setMark(rs.getDouble("Mark"));
				students.add(s);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return students;

	}
        
}