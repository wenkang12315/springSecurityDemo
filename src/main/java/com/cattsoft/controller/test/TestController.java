package com.cattsoft.controller.test;

import com.cattsoft.eitity.test.TbUser;
import com.cattsoft.service.test.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping("/printToPage.do")
    public void printToPage(HttpServletResponse response) throws Exception {
        response.setContentType("text/html;charset=utf-8");

        try {
            //测试一下 提交
            PrintWriter writer = response.getWriter();
            TbUser user = testService.findById("16");
            writer.print("SUCCESS"+user);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
