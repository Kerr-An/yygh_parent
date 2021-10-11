package com.atguigu.yygh.hosp.service.impl;

import com.atguigu.yygh.model.hosp.HospitalSet;
import com.atguigu.yygh.hosp.mapper.HospitalSetMapper;
import com.atguigu.yygh.hosp.service.HospitalSetService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;


/**
 * @FileName: HospitalSetServiceImpl
 * @Author: SunJian
 * @Date: 2021/9/23 下午9:13
 * @Description: 医院设置业务类接口
 */
@Service
public class HospitalSetServiceImpl extends ServiceImpl<HospitalSetMapper, HospitalSet> implements HospitalSetService {
// 注入mapper已经由mp完成，不必再次注入
}