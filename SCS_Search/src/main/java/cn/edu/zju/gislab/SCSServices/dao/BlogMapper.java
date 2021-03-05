package cn.edu.zju.gislab.SCSServices.dao;

import cn.edu.zju.gislab.SCSServices.po.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {

    List<Blog> getAllBlog();

    Blog getBlogByID(int id);

    List<Blog> getBlogIF(Map<String, Object> map);

    int addBlog(Blog blog);

}
