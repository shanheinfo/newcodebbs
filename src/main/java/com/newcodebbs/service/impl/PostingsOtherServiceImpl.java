package com.newcodebbs.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.newcodebbs.entity.PostingsInfo;
import com.newcodebbs.entity.PostingsOther;
import com.newcodebbs.mapper.PostingsOtherMapper;
import com.newcodebbs.service.IPostingsOtherService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 帖子其他信息 服务实现类
 * </p>
 *
 * @author shanhe
 * @since 2023-10-02
 */
@Service
public class PostingsOtherServiceImpl extends ServiceImpl<PostingsOtherMapper, PostingsOther> implements IPostingsOtherService {
    @Resource
    private PostingsOtherMapper postingsOtherMapper;
    
    @Override
    public List<?> selectPostingOtherData(Object postingsId) {
        QueryWrapper<PostingsOther> wrapper = new QueryWrapper<>();
        wrapper.eq("postings_id",postingsId);
        return postingsOtherMapper.selectList(wrapper);
    }
}
