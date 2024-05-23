package blog.com.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import blog.com.models.entity.Blog;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface BlogDao extends JpaRepository<Blog, Long> {

	// 保存と更新
	Blog save(Blog blog);

	// 商品の一覧を表示させ
	List<Blog> findAll();

	// 同じ商品名を登録されないよう
	Blog findByBlogTitle(String blogTitle);

	// 編集画面画面を表示する
	Blog findByBlogId(Long blogId);

	// 削除処理を使用
	void deleteByBlogId(Long blogId);
}
