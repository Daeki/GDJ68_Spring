package com.iu.main.member;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class MemberService {
	
	@Autowired
	private MemberDAO memberDAO;
	
	//@Autowired
	private HttpSession session;
	
	public int setJoin(MemberDTO memberDTO, MultipartFile multipartFile)throws Exception{
		//파일의 정보를 이용해서 HDD에 파일을 저장
		
		//1. 어디에 저장??
		String path="/resources/upload/member/";
		
		//2. 실제 경로 알아오기
		//jsp : application
		//java : ServletContext
		String realPath = session.getServletContext().getRealPath(path);
		System.out.println(realPath);
		
		
		
		
		return 0;//memberDAO.setJoin(memberDTO);
	}
	
	public MemberDTO getLogin(MemberDTO memberDTO)throws Exception{
		return memberDAO.getLogin(memberDTO);
	}
	public int setMemberUpdate(MemberDTO memberDTO)throws Exception{
		return memberDAO.setMemberUpdate(memberDTO);
	}	

}
