//package com.senshig.myapp.member.model.service;
//
//import org.mybatis.spring.SqlSessionTemplate;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.senshig.myapp.member.model.dao.MemberDAO;
//import com.senshig.myapp.member.model.vo.Member;
//
//// 이 아이를 서비스로 bean등록을 하겠다는 어노테이션
//@Service("mService") 
////@Service "mService"가 없어도 상관은 없지만 
//public class MemberServiceImpl implements MemberService{
//
//	@Autowired
//	private MemberDAO mDAO;
//	
//	@Autowired
//	private SqlSessionTemplate sqlSession;
//	
//	@Override
//	public Member memberLogin(Member m) {
//		return mDAO.memberLogin(sqlSession,m);
//	}
//
//	@Override
//	public int insertMember(Member m) {
//		return mDAO.insertMember(sqlSession, m);
//	}
//	@Override
//	public int checkIdDup(String id) {
//		return mDAO.checkIdDup(sqlSession, id);
//	}
//
//}
