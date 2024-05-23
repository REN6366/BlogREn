package blog.com.models.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Account {

	// account_id
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long accountId;

	// account_name
	private String accountName;

	// account_email
	private String accountEmail;

	// account_password
	private String accountPassword;

	// 空のコンストラクタ
	public Account() {
	}

	// コンストラクタ
	public Account(String accountName, String accountEmail, String accountPassword) {
		this.accountName = accountName;
		this.accountEmail = accountEmail;
		this.accountPassword = accountPassword;
	}

	// ゲッターセッター
	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountEmail() {
		return accountEmail;
	}

	public void setAccountEmail(String accountEmail) {
		this.accountEmail = accountEmail;
	}

	public String getAccountPassword() {
		return accountPassword;
	}

	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}

}
