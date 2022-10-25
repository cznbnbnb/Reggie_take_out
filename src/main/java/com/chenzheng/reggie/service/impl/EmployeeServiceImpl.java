package com.chenzheng.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chenzheng.reggie.entity.Employee;
import com.chenzheng.reggie.mapper.EmployeeMapper;
import com.chenzheng.reggie.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {


}
