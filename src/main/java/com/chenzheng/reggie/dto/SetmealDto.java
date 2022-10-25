package com.chenzheng.reggie.dto;

import com.chenzheng.reggie.entity.Setmeal;
import com.chenzheng.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
