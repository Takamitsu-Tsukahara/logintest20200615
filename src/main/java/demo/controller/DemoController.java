package demo.controller;

import java.util.List;

import javax.naming.AuthenticationException;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.WebAttributes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import demo.model.Account;
import demo.repository.AccountRepository;

@Controller
public class DemoController {

	@Autowired
	AccountRepository repository;


	@GetMapping(path = "login")
	public String login(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout,
			Model model, HttpSession session) {
		List<Account> userList = repository.selectByExample();
		model.addAttribute("userList", userList);

		model.addAttribute("showErrorMsg", false);
		model.addAttribute("showLogoutedMsg", false);

		if (error != null) {
			if (session != null) {
				AuthenticationException ex = (AuthenticationException) session
						.getAttribute(WebAttributes.AUTHENTICATION_EXCEPTION);
				if (ex != null) {
					model.addAttribute("showErrorMsg", true);
					model.addAttribute("errorMsg", ex.getMessage());
				}
			}
		} else if (logout != null) {
			model.addAttribute("showLogoutedMsg", true);
		}
		return "login";
	}

	@GetMapping("success")
	public String success() {
		return "success.html";
	}
}
