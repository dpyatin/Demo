package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
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
		
		Vehicle tV = new Vehicle("VW", "Tiguan", "Green");
		User cur = new User(nickname);
		cur.setVehicle(tV);
		userRepository.save(cur);

		User user = userRepository.findByNickname(nickname);
		return user;
	}
	
	@RequestMapping(value="/baller/{nickname}", method = RequestMethod.POST)
	public @ResponseBody User createWCar(@PathVariable String nickname, @RequestBody Vehicle vehicle) {
		User user = new User(nickname);
		user.setVehicle(vehicle);
		userRepository.save(user);
		return userRepository.findByNickname(nickname);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public Iterable<User> showAll() {
		return userRepository.findAll();
	}

	//  ability to save & retrieve
	
	
}
