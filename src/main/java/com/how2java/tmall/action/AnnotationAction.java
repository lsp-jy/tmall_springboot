package com.how2java.tmall.action;

import org.springframework.stereotype.Component;
import com.alibaba.dubbo.config.annotation.Reference;
import com.how2java.tmall.pojo.Category;
import com.how2java.tmall.service.CategoryService;
import com.how2java.tmall.util.Page4Navigator;
/**
 * @Author:liusiping
 * @Date: 2020-07-10 17:44
 */

@Component("annotationAction")
public class AnnotationAction {

    @Reference(version = CategoryService.VERSION)
    private CategoryService categoryService;


    public Page4Navigator<Category> getList(int start, int size, int navigatePages){
        Page4Navigator<Category> page = categoryService.list(start, size, 5);  //5表示导航分页最多有5个，像 [1,2,3,4,5] 这样
        return page;
    }
}
