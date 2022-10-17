package lecture.p11core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Example1 {
	private Example2 ex2;
	public Example1() {

	}
	
	// 생성자 DI(dependency injection)
	// 코드 작성 
	//생성자가 여러개 인 경우, @Autowired 붙일 생성자 정함. 
	//생성자가 하나면 하나에 자동으로 주입 적용
	@Autowired
	public Example1(Example2 ex2) {
		this.ex2 = ex2;
	}
	
	public Example2 getEx2() {
		return ex2;
	}
}
