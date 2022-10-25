package com.chenzheng.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chenzheng.reggie.common.R;
import com.chenzheng.reggie.entity.Category;

import java.util.List;


public interface CategoryService extends IService<Category> {
    public void remove(Long id);
    public R<List<Category>> list(Category category);
}
