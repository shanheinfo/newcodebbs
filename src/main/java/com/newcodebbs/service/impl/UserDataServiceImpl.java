package com.newcodebbs.service.impl;

import com.newcodebbs.entity.UserData;
import com.newcodebbs.mapper.UserDataMapper;
import com.newcodebbs.service.IUserDataService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author shanhe
 * @since 2023-08-28
 */
@Service
public class UserDataServiceImpl extends ServiceImpl<UserDataMapper, UserData> implements IUserDataService {

}