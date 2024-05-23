package blog.com.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import blog.com.models.entity.Account;

@Repository
public interface AccountDao extends JpaRepository<Account, Long> {

	// 保存と更新処理
	Account save(Account account);

	// 同じメールアドレスを却下
	Account findByAccountEmail(String accountEmail);

	// ログインとき、メールとパス一致する
	Account findByAccountEmailAndAccountPassword(String accountEmail, String accountPassword);

}
