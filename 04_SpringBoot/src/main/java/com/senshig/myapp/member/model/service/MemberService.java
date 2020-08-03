//package com.senshig.myapp.member.model.service;
//
//import org.apache.ibatis.annotations.Mapper;
//
//import com.senshig.myapp.member.model.vo.Member;
//
//// 인터페이스를 작성하는 이유.
//// 1. 관리의 용이성
//// 2. 인터페이스명을 그대로 두고 실제로 구현하는 MemberServiceImpl 이름이 바뀌어도 소스코드가 문제없이 동작할 수 있다.
//
//@Mapper
//public interface MemberService {
//	Member memberLogin(Member m);
//
//	int insertMember(Member m);
//	
//	int checkIdDup(String id);
//}
