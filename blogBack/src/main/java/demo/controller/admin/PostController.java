package demo.controller.admin;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import demo.entity.Posts;
import demo.service.impl.IUserServiceImpl;

@RestController
public class PostController {

	
    @Autowired
    private IUserServiceImpl userService;
	
	@RequestMapping(value = "/insertPost", method = RequestMethod.POST)
	public Map<String,Object> insertPost(Posts post){
		System.out.println("----------insertPost----------");
		
		Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
		post.setPost_author("paper");
		
		Random ran = new Random();
		Long id = (long) ran.nextInt(9999999);
		
		post.setPost_id(id);
		post.setPost_excerpt(post.getPost_content().substring(0, 32));
		post.setPost_publish_date(new Date());
		post.setPost_status(1);
		post.setPost_name(post.getPost_title().substring(0, 20));
		int a = userService.insertPost(post);
		if(a!=0)
			resultMap.put("result", "success");
		else
			resultMap.put("result", "failure");
		return resultMap;
		
	}
	
	@RequestMapping(value = "/getAllPost", method = RequestMethod.GET)
	public Map<String,Object> getAllPost(){
		List<Posts> allPosts = userService.getAllPosts();
		Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
		resultMap.put("allPosts", allPosts);
		return null;
		
	}
}
