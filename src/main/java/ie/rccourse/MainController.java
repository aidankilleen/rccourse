package ie.rccourse;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ie.rccourse.userdb.User;
import ie.rccourse.userdb.UserDb;

@Controller
public class MainController {

	UserDb userDb;
	
	public MainController() {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringBeans.xml");
		userDb = context.getBean(UserDb.class);
	}
	
	@RequestMapping("/user/{name}")
	public ModelAndView showUsers(@PathVariable("name") String name) {
		
		return new ModelAndView("aidan", "name", name);
	}
	
}
