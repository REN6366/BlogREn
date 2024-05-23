package blog.com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import blog.com.models.entity.Account;
import blog.com.services.AccountService;
import jakarta.servlet.http.HttpSession;

@Controller
public class AccountLoginController {

	@Autowired
	private AccountService accountService;

	// Session宣言
	@Autowired
	private HttpSession session;

	// ログイン画面表示
	@GetMapping("/account/login")
	public String getAccountLoginPage() {
		return "login.html";
	}

	// ログイン処理
	@PostMapping("/account/login/process")
	public String accountLoginProcess(@RequestParam String accountEmail, @RequestParam String accountPassword) {
		Account account = accountService.loginCheck(accountEmail, accountPassword);
		if (account == null) {
			return "login.html";
		} else {
			session.setAttribute("loginAccountInfo", account);
			return "redirect:/blog/list";
		}
	}
}
