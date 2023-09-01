package com.zqd.bus.mapper;

import com.zqd.bus.entity.Provider;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

public interface ProviderMapper extends BaseMapper<Provider> {

    /**
     * 根据供应商id删除货物信息
     * @param id
     */
    void deleteGoodsByProviderId(@Param("pid") Integer id);

    /**
     * 根据供应商id删除货物进货信息
     * @param id
     */
    void deleteInportByProviderId(@Param("pid") Integer id);

    /**
     * 根据供应商id删除货物退货信息
     * @param id
     */
    void deleteOutPortByProviderId(@Param("pid") Integer id);


}
