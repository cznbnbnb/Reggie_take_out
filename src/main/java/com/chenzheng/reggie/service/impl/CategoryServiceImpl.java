package com.chenzheng.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenzheng.reggie.entity.Category;
import com.chenzheng.reggie.mapper.CategoryMapper;
import com.chenzheng.reggie.service.CategoryService;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {


}
