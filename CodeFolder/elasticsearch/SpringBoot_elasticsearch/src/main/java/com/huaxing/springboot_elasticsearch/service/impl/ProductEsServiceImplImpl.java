package com.huaxing.springboot_elasticsearch.service.impl;


import com.huaxing.springboot_elasticsearch.common.service.impl.BaseServiceImpl;
import com.huaxing.springboot_elasticsearch.model.ProductEsModel;
import com.huaxing.springboot_elasticsearch.service.IProductEsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Service;

/**
 * @Description product 实现层
 * @Author 姚广星
 * @Date 2020/2/24 16:57
 **/
@Slf4j
@Service
public class ProductEsServiceImplImpl extends BaseServiceImpl<ProductEsModel> implements IProductEsService {

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;


}
