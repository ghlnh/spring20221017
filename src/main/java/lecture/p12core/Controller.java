package lecture.p12core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Controller {
	@Autowired
	private Service service;
	
	public Service getService() {
		return service;
	}
}
