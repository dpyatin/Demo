package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value="/{nickname}", method = RequestMethod.POST)
	public @ResponseBody User create(@PathVariable("nickname") String nickname) {
		User saved = userRepository.save(new User(nickname));
		User user = userRepository.findByNickname(nickname);
		return saved;
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public Iterable<User> showAll() {
		return userRepository.findAll();
	}

	//  ability to save & retrieve
	
	
}
