package com.puboot.module.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.puboot.module.admin.model.BizArticleLook;
import com.puboot.module.admin.vo.CountVo;
import com.puboot.module.admin.vo.StatisticVo;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * @author Linzhaoguan
 * @version V1.0
 * @date 2019年9月11日
 */
public interface BizArticleLookMapper extends BaseMapper<BizArticleLook> {

    int checkArticleLook(@Param("articleId") Integer articleId, @Param("userIp") String userIp, @Param("lookTime") Date lookTime);

    List<CountVo> lookCountByDay(int day);

    List<CountVo> userCountByDay(int day);
}
