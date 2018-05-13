package demo.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import demo.util.ueditor.ActionEnter;

/**
 * 用来处理ueditor
 * @author liang
 *
 */
@RestController
public class UeditorController {
//	
//   @RequestMapping(value = "/exec")
//   @ResponseBody
//   public String exec(HttpServletRequest request) throws UnsupportedEncodingException, JSONException{ 
//       System.out.println("---------------ueditor进入----------------");
//       System.out.println(ReadAsChars(request));
//       System.out.println("container"+request.getParameter("container"));
//	   request.setCharacterEncoding("utf-8");
//       String rootPath = request.getRealPath("/");
//       return new ActionEnter( request, rootPath).exec();
//   }
  
   @RequestMapping(value = "/ueditor/exec")
   @ResponseBody
   public String exec(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException, JSONException{ 
       System.out.println("---------------ueditor进入----------------");
       //System.out.println(ReadAsChars(request));
	   request.setCharacterEncoding("utf-8");
       String rootPath = request.getRealPath("/");
       System.out.println(rootPath);
       return new ActionEnter(request, rootPath).exec(); 
   }
   
   @RequestMapping(value = "/sendArticle")
   @ResponseBody
   public String sendArticle(@RequestParam("title") String title,@RequestParam("articleContent") String articleContent) throws UnsupportedEncodingException, JSONException{ 
       System.out.println("---------------sendArticle进入----------------");
       System.out.println(title+"=title");
       System.out.println("articleContent="+articleContent.toString());
       return "成功"; 
   }
   
   
   
   public static String ReadAsChars(HttpServletRequest request)  
   {  
 
       BufferedReader br = null;  
       StringBuilder sb = new StringBuilder("");  
       try  
       {  
           br = request.getReader();  
           String str;  
           while ((str = br.readLine()) != null)  
           {  
               sb.append(str);  
           }  
           br.close();  
       }  
       catch (IOException e)  
       {  
           e.printStackTrace();  
       }  
       finally  
       {  
           if (null != br)  
           {  
               try  
               {  
                   br.close();  
               }  
               catch (IOException e)  
               {  
                   e.printStackTrace();  
               }  
           }  
       }  
       return sb.toString();  
   }  
}
