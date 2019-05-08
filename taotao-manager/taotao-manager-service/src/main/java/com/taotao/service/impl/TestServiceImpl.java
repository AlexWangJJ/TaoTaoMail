package com.taotao.service.impl;

import com.taotao.mapper.TestMapper;
import com.taotao.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper mapper;
    /**
     * 从数据库中获取当前的时间
     *
     * @return
     */
    @Override
    public String queryNow() {
        return mapper.queryNow();
    }
}
