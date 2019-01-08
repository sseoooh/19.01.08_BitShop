package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import domain.MemberBean;

public class MemberDAOImpl implements MemberDAO{
	
	
	private static MemberDAOImpl instance = new MemberDAOImpl();
	private MemberDAOImpl() {}
	public static MemberDAOImpl getInstance() {return instance;}
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	@Override
	public void insertMember(MemberBean member) {
		System.out.println("MemberDAOImpl에 진입\n");
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("INSERT INTO member(id, name, pass, ssn)\n" + "VALUES('%s','%s', '%s', '%s')",
			member.getId(), member.getName(), member.getPass(), member.getSsn());
			System.out.println("SQL ::: "+sql);
			//rs = stmt.executeQuery(sql); insert니까 안씀
			
			if(stmt.executeUpdate(sql)==1) {
				System.out.println("회원가입 성공!!");
			}else {
				System.out.println("회원가입 실패!!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<MemberBean> selectMembers() {
		return null;
	}

	@Override
	public ArrayList<MemberBean> selectByName(String name) {
		return null;
	}

	@Override
	public MemberBean selectById(String id) {
		return null;
	}

	@Override
	public int countMembers() {
		return 0;
	}
	

	@Override
	public void updatePass(String id, String pass, String newPass) {
		
	}

	@Override
	public void deleteInfo(String id, String pass) {
		
	}

}
