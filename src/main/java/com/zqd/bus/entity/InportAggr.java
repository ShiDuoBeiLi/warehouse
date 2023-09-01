package com.zqd.bus.entity;

import com.baomidou.mybatisplus.annotation.FieldStrategy;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@TableName("bus_inport")
public class InportAggr implements Serializable {

    private static final long serialVersionUID=1L;

    private int goodsid;

    @TableField(exist = false)
    private String goodsname;

//    @TableField(exist = false)
//    private String goodsname;
    /**
     * 新增的一列数据 用于存储count字段
     * 注解非常关键
     */
    @TableField(value = "sum(number)", insertStrategy = FieldStrategy.NEVER, updateStrategy = FieldStrategy.NEVER)
    private int sum;

    public InportAggr(InportAggr inport) {
        this.goodsid = inport.goodsid;
        this.sum = inport.sum;
    }


}
