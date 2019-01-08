package service;

import java.util.ArrayList;

import domain.MemberBean;

public interface MemberService {
//C
	public void joinMember(MemberBean member);
//R
	public ArrayList<MemberBean> listMembers();
	public ArrayList<MemberBean> findByName(String name);
	public MemberBean findById(String id);
	public int countMembers();
	public boolean existMember(String id, String pass);
//U
	public void updateMember(String id, String pass, String newPass);
//D
	public void deleteMember(String id, String pass);
}
