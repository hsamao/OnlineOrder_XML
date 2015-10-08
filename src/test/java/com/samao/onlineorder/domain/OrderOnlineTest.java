package com.samao.onlineorder.domain;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * Created by hsamao on 10/8/15.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/order-config.xml"})
@Transactional
public class OrderOnlineTest {

    @Autowired
    private SessionFactory sessionFactory;

    @Before
    public void setUp() {
        System.out.println("setUP was called");
    }

    @After
    public void tearDown() {
        System.out.println("tearDown was called");
    }


    @Test
    @Rollback(false)
    public void testSessionFactory() {
        Session session = sessionFactory.getCurrentSession();
        Assert.notNull(session);

        System.out.println("testSessionFactory was called");
    }

}
