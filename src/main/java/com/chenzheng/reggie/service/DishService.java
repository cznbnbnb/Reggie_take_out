package com.chenzheng.reggie.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.chenzheng.reggie.common.R;
import com.chenzheng.reggie.dto.DishDto;
import com.chenzheng.reggie.entity.Category;
import com.chenzheng.reggie.entity.Dish;

import java.util.List;


public interface DishService extends IService<Dish> {
    public void saveWithFlavor(DishDto dishDto);
    public DishDto getByIdWithFlavor(Long id);
    public void updateWithFlavor(DishDto dishDto);
    public R<List<Dish>> list(Dish dish);

}
