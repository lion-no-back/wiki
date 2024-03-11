package com.jiawa.wiki.service;

import com.jiawa.wiki.domain.Test;
import com.jiawa.wiki.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Songguo
 * @date 2024/3/11 14:13
 */
@Service
public class TestService {

    @Resource
    private TestMapper testMapper;

    public List<Test> list() {
        return testMapper.list();
    }
}
