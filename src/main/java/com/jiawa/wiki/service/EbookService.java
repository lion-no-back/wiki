package com.jiawa.wiki.service;

import com.jiawa.wiki.domain.Ebook;
import com.jiawa.wiki.domain.EbookExample;
import com.jiawa.wiki.mapper.EbookMapper;
import com.jiawa.wiki.req.EbookReq;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Songguo
 * @date 2024/3/11 14:56
 */
@Service
public class EbookService {

    @Resource
    private EbookMapper ebookMapper;

    public List<Ebook> list(EbookReq req) {
        EbookExample ebookExample = new EbookExample();
        EbookExample.Criteria criteria = ebookExample.createCriteria();
        criteria.andNameLike("%" + req.getName() + "%");
        return ebookMapper.selectByExample(ebookExample);
    }
}
