package org.zerock.controller.lecture.p05redirect;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.domain.lecture.JavaBean03;
import org.zerock.domain.lecture.Student;

@Controller
@RequestMapping("ex22")
public class Controller22 {

	@RequestMapping("sub01")
	public String method1(Model model) {
		model.addAttribute("name", "park ji sung");
		
		return "redirect:/ex22/sub02";
	}
	
	@RequestMapping("sub02")
	public void method2(Model model) {
		//method1의 model과 method2의 model은 다른 객체
		boolean hasName = model.containsAttribute("name");
		System.out.println(hasName);
	}
	
	
	@RequestMapping("sub03")
	public String method3(HttpSession session) {
		session.setAttribute("name", "park ji sung");
		
		return "redirect:/ex22/sub04";
	}
	
	@RequestMapping("sub04")
	public void method4(HttpSession session) {
		String name = (String) session.getAttribute("name");
		System.out.println(name);
	}
	
	// sub05 요청
	// /ex22/sub06 redirect
	// session에 attribute 넣는 코드 추가 (Student)
	
	
	@RequestMapping("sub05")
	public String method5(HttpSession session) {
		Student student = new Student();
		student.setClassName("spring");
		student.setName("lee");
		student.setStudentNumber("4");
		session.setAttribute("student", student);
		
		return "redirect:/ex22/sub06";
	}
	
	@RequestMapping("sub06")
	public void method6(HttpSession session) {
		Student s = (Student) session.getAttribute("student");
		System.out.println(s.getName());
		System.out.println(s.getClassName());
		System.out.println(s.getStudentNumber());
		System.out.println(s);
	}
	
	// RedirectAttributes로 객체 넘기기
	@RequestMapping("sub07")
	public String method7(RedirectAttributes rttr) {
		Student student = new Student();
		student.setName("lee");
		student.setClassName("spring");
		student.setStudentNumber("99");
		
		rttr.addFlashAttribute("student", student);
		
		return "redirect:/ex22/sub08";
	}
	
	@RequestMapping("sub08")
	public void method8(Student student) {
		System.out.println(student);
	}
	
	// sub09 요청
	// /ex22/sub10 리다이렉트
	// RedirectAttributes 사용해서 객체를 다음 요청에서 사용할 수 있게 전달
	// 객체의 타입 : org.zerock.domain.lecture.JavaBean03
	@RequestMapping("sub09")
	public String method9(RedirectAttributes rttr) {
		JavaBean03 j = new JavaBean03();
		j.setAvg(99.9);
		j.setClassName("math");
		j.setLocation("korea");
		j.setScore(100);
		j.setStudentNumber("11");
		
		rttr.addFlashAttribute("myBean", j);
		
		return "redirect:/ex22/sub10";
	}
	
	// sub10 요청 
	// 모델에 있는 org.zerock.domain.lecture.JavaBean03 타입의 객체 내용 출력
	@RequestMapping("sub10")
	public void method10(@ModelAttribute("myBean") JavaBean03 bean) {
		System.out.println(bean);
	}
}



















