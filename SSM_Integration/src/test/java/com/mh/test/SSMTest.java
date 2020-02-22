package com.mh.test;

import com.mh.dao.IUserDao;
import com.mh.domain.User;
import com.mh.service.IUserService;
import com.mh.service.impl.UserServiceImpl;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.InputStream;
import java.util.List;

public class SSMTest {

    @Test
    public void testDao() throws Exception {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSession sqlSession = new SqlSessionFactoryBuilder().build(in).openSession();
        IUserDao mapper = sqlSession.getMapper(IUserDao.class);
        List<User> users = mapper.findAll();
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
        in.close();
    }

    @Test
    public void testService(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceImpl usi = (UserServiceImpl) ac.getBean("userService");
        List<User> users = usi.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
