//package com.senshig.myapp.member.model.dao;
//
//import org.mybatis.spring.SqlSessionTemplate;
//import org.springframework.stereotype.Repository;
//
//import com.senshig.myapp.member.model.vo.Member;
//
//@Repository("mDAO")
//public class MemberDAO {
//	public MemberDAO() {}
//	
//	public Member memberLogin(SqlSessionTemplate sqlSession, Member m) {
//		return sqlSession.selectOne("memberMapper.memberLogin", m);
//	}
//
//}
