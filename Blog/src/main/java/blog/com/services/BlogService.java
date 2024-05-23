package blog.com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import blog.com.models.dao.BlogDao;
import blog.com.models.entity.Blog;

@Service
public class BlogService {
	@Autowired
	private BlogDao blogDao;

	public List<Blog> selectAllBlogList(Long accountId) {
		if (accountId == null) {
			return null;
		} else {
			return blogDao.findAll();
		}
	}

	// 登録処理
	public boolean createBlog(String blogTitle, String blogCategory, String blogImage, String blogArticle,
			Long accountId) {
		if (blogDao.findByBlogTitle(blogTitle) == null) {
			blogDao.save(new Blog(blogTitle, blogCategory, blogImage, blogArticle, accountId));
			return true;
		} else {
			return false;
		}
	}

	// 編集画面を表示する
	public Blog blogEditCheck(Long blogId) {
		if (blogId == null) {
			return null;
		} else {
			return blogDao.findByBlogId(blogId);
		}
	}

	// 更新処理
	public boolean blogUpdate(Long blogId, String blogTitle, String blogCategory, String blogImag, String blogArticle,
			Long accountId) {
		if (blogId == null) {
			return false;
		} else {
			Blog blog = blogDao.findByBlogId(blogId);
			blog.setBlogTitle(blogTitle);
			blog.setBlogCategory(blogCategory);
			blog.setBlogImage(blogImag);
			blog.setBlogArticle(blogArticle);
			blog.setAccountId(accountId);
			blogDao.save(blog);
			return true;
		}
	}
}
