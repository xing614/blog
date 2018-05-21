package demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import demo.entity.Posts;

@Mapper
public interface IPostsDao {

	List<Posts> getAllPosts();
	
	int insertSelectivePost(Posts post);
	
	int insertpost(Posts post);
}

