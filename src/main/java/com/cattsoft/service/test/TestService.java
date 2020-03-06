package com.cattsoft.service.test;

import com.cattsoft.eitity.test.TbUser;

public interface TestService {

    public TbUser findById(String id) throws Exception;

}
