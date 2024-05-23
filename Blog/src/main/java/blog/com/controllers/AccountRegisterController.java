package blog.com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import blog.com.services.AccountService;

@Controller
public class AccountRegisterController {

	@Autowired
	private AccountService accountService;
	
	//登録画面表示
	@GetMapping("/account/register")
	public String getAccountRegisterPage() {
		return "register.html";
	}
	
	//登録処理
	@PostMapping("/account/register/process")
	public String accountRegisterProcess(@RequestParam String accountName,@RequestParam String accountEmail,@RequestParam String accountPassword) {
		if(accountService.createAccount(accountName, accountEmail, accountPassword)) {
			return "login.html";
		}else {
			return "register.html";
		}
	}
}
