package service;

import java.util.ArrayList;

import dao.MemberDAOImpl;
import domain.MemberBean;

public class MemberServiceImpl implements MemberService{

	private static MemberServiceImpl instance = new MemberServiceImpl();
	private MemberServiceImpl() {}
	public static MemberServiceImpl getInstance() {return instance;}

	@Override
	public void joinMember(MemberBean member) {
		System.out.println("service/MemberServiceImpl에 진입\n ");
		System.out.println("컨트롤러에서 넘어온 회원정보");
		System.out.println("ID:"+member.getId());
		System.out.println("NAME:"+member.getName());
		System.out.println("PASS:"+member.getPass());
		System.out.println("SSN:"+member.getSsn());
		MemberDAOImpl.getInstance().insertMember(member);
	}

	@Override
	public ArrayList<MemberBean> listMembers() {
		ArrayList<MemberBean> list = new ArrayList<>();
		return list;
	}

	@Override
	public ArrayList<MemberBean> findByName(String name) {
		ArrayList<MemberBean> list = new ArrayList<>();
		return list;
	}

	@Override
	public MemberBean findById(String id) {
		MemberBean member = new MemberBean();
		
		return member;
	}

	@Override
	public int countMembers() {
		int count = 0;
		return count;
	}

	@Override
	public boolean existMember(String id, String pass) {
		boolean exist = false;
		return exist;
	}

	@Override
	public void updateMember(String id, String pass, String newPass) {
		
	}

	@Override
	public void deleteMember(String id, String pass) {
		
	}
	

}
