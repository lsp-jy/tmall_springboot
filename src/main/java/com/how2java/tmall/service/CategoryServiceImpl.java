package com.how2java.tmall.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import com.alibaba.dubbo.config.annotation.Service;
import com.how2java.tmall.dao.CategoryDAO;
import com.how2java.tmall.pojo.Category;
import com.how2java.tmall.util.Page4Navigator;

@Component
@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired CategoryDAO categoryDAO;


	@Override
	public Page4Navigator<Category> list(int start, int size, int navigatePages) {
		Sort sort = new Sort(Sort.Direction.DESC, "id");
		Pageable pageable = new PageRequest(start, size,sort);
		Page pageFromJPA =categoryDAO.findAll(pageable);

		return new Page4Navigator<>(pageFromJPA,navigatePages);
	}
	@Override
	public List<Category> list() {
    	Sort sort = new Sort(Sort.Direction.DESC, "id");
		return categoryDAO.findAll(sort);
	}

	@Override
	public void add(Category bean) {
		categoryDAO.save(bean);
	}

	@Override
	public void delete(int id) {
		categoryDAO.delete(id);
	}

	@Override
	public Category get(int id) {
		Category c= categoryDAO.findOne(id);
		return c;
	}
	@Override
	public void update(Category bean) {
		categoryDAO.save(bean);
	}
}
