package com.itbaizhan.shopping_goods_service.service;

import com.itbaizhan.shopping_common.pojo.Brand;
import com.itbaizhan.shopping_common.service.BrandService;
import com.itbaizhan.shopping_goods_service.mapper.BrandMapper;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * 服务接口写在公共模块中
 *
 * 写在这里是服务的生产者
 */
@DubboService
public class BrandServiceImpl implements BrandService {

    @Autowired
   private BrandMapper brandMapper;


    /**
     * 根据id查询品牌
     * @param id
     * @return
     */
    @Override
    public Brand findById(Long id) {
        return brandMapper.selectById(id);
    }
}
