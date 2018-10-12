package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

	@RequestMapping("/getProfile")
	public Profile getProfile() {

		Profile Profile1 = new Profile(1, "Keval", "Madgaon", "7754695823");
		return Profile1;

	}
}
