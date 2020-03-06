package com.cattsoft.service.test.impl;

import com.cattsoft.dao.test.TestDao;
import com.cattsoft.eitity.test.TbUser;
import com.cattsoft.service.test.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TestServiceImpl implements TestService{

    @Autowired
    private TestDao testDao;


    @Override
    public TbUser findById(String id) throws Exception {
        return testDao.findById(id);
    }
}
