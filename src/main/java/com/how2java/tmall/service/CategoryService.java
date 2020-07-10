package com.how2java.tmall.service;

import java.util.List;
import com.how2java.tmall.pojo.Category;
import com.how2java.tmall.util.Page4Navigator;
/**
 * @Author:liusiping
 * @Date: 2020-07-07 16:14
 */
public interface CategoryService {

    public Page4Navigator<Category> list(int start, int size, int navigatePages);

    public List<Category> list();

    public void add(Category bean);

    public void delete(int id);

    public Category get(int id);

    public void update(Category bean);

}
