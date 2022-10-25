package com.chenzheng.reggie.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenzheng.reggie.common.R;
import com.chenzheng.reggie.entity.Category;
import com.chenzheng.reggie.entity.Dish;
import com.chenzheng.reggie.entity.Setmeal;
import com.chenzheng.reggie.exception.CustomException;
import com.chenzheng.reggie.mapper.CategoryMapper;
import com.chenzheng.reggie.service.CategoryService;
import com.chenzheng.reggie.service.DishService;
import com.chenzheng.reggie.service.SetmealService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {
    @Autowired
    private DishService dishService;
    @Autowired
    private SetmealService setmealService;

    @Override
    public void remove(Long id) {
        LambdaQueryWrapper<Dish> dishLambdaQueryWrapper = new LambdaQueryWrapper<>();
        dishLambdaQueryWrapper.eq(Dish::getCategoryId,id);
        int count1 = dishService.count(dishLambdaQueryWrapper);
        if(count1 > 0){
            throw new CustomException("当前分类下关联了菜品，无法直接删除");

        }

        LambdaQueryWrapper<Setmeal> setmealLambdaQueryWrapper = new LambdaQueryWrapper<>();
        setmealLambdaQueryWrapper.eq(Setmeal::getCategoryId,id);
        int count2 = setmealService.count(setmealLambdaQueryWrapper);
        if(count2 > 0){
            throw new CustomException("当前分类下关联了套餐，无法直接删除");
        }
        super.removeById(id);
    }

    @Override
    public R<List<Category>> list(Category category) {
        LambdaQueryWrapper<Category> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(null != category,Category::getType,category.getType());
        queryWrapper.orderByAsc(Category::getSort).orderByDesc(Category::getUpdateTime);
        List<Category> list = this.list(queryWrapper);
        return R.success(list);
    }


}
