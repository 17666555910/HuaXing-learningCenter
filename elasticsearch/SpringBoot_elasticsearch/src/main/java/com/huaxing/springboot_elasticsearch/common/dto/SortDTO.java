package com.huaxing.springboot_elasticsearch.common.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description 排序类
 * @Author 姚广星
 * @Date 2020/2/29 22:58
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "排序基类")
public class SortDTO {

    /**
     * 需要排序的字段
     */
    @ApiModelProperty(value = "需要排序的字段")
    private String key;

    /**
     * 排序规则
     */
    @ApiModelProperty(value = "排序规则")
    private Boolean isASC;
}
