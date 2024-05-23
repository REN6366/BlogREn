package blog.com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import blog.com.models.dao.AccountDao;
import blog.com.models.entity.Account;

@Service
public class AccountService {
	@Autowired
	private AccountDao accountDao;

	// 登録処理
	// 同じメールアドレスが存在しない時

	public boolean createAccount(String accountName, String accountEmail, String accountPassword) {
		if (accountDao.findByAccountEmail(accountEmail) == null) {
			accountDao.save(new Account(accountName, accountEmail, accountPassword));
			return true;
		} else {
			return false;
		}
	}

///////////////////////////////////////////////////////////////////////	

	// ログイン処理
	public Account loginCheck(String accountEmail, String accountPassword) {
		Account account = accountDao.findByAccountEmailAndAccountPassword(accountEmail, accountPassword);
		if (account == null) {
			return null;
		} else {
			return account;
		}
	}
}
