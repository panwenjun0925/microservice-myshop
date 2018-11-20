package com.team.product.service.Impl;

import com.team.facade.pojo.Goods;
import com.team.product.mapper.GoodsMapper;
import com.team.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Auther: YouQi
 * @Date: 2018/11/20 19:01
 * @Description:
 * @Version: 1.0
 */
public class ProductServiceImpl implements ProductService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public List<Goods> selectAll() {
        return goodsMapper.selectAll();
    }
}
