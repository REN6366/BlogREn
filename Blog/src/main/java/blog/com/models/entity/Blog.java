package blog.com.models.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Blog {

	// blog_id
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long blogId;

	// blog_title
	private String blogTitle;

	// blog_category
	private String blogCategory;

	// blog_image
	private String blogImage;

	// blog_article
	private String blogArticle;

	// acccount_id
	private Long accountId;

	// 空のコンストラクタ
	public Blog() {
	}

	// コンストラクタ
	public Blog(String blogTitle, String blogCategory, String blogImage, String blogArticle, Long accountId) {
		this.blogTitle = blogTitle;
		this.blogCategory = blogCategory;
		this.blogImage = blogImage;
		this.blogArticle = blogArticle;
		this.accountId = accountId;
	}

	//　ゲッターセッター
	public Long getBlogId() {
		return blogId;
	}

	public void setBlogId(Long blogId) {
		this.blogId = blogId;
	}

	public String getBlogTitle() {
		return blogTitle;
	}

	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}

	public String getBlogCategory() {
		return blogCategory;
	}

	public void setBlogCategory(String blogCategory) {
		this.blogCategory = blogCategory;
	}

	public String getBlogImage() {
		return blogImage;
	}

	public void setBlogImage(String blogImage) {
		this.blogImage = blogImage;
	}

	public String getBlogArticle() {
		return blogArticle;
	}

	public void setBlogArticle(String blogArticle) {
		this.blogArticle = blogArticle;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	
	

}
