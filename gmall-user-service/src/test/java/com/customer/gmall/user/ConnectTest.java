package com.customer.gmall.user;

import javax.sql.DataSource;

import java.sql.SQLException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.customer.gmall.beans.UmsMember;
import com.customer.gmall.user.mapper.UmsMemberMapper;

/**
 * ConnectTest
 *
 * @author Zichao Zhang
 * @date 2020/4/26
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ConnectTest {

    @Autowired
    private DataSource dataSource;

    @Test
    public void testConnection(){
        try {
            System.err.println("dataSource.getConnection() = " + dataSource.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Autowired
    private UmsMemberMapper umsMemberMapper;

    @Test
    public void testselectAll(){
        System.err.println("umsMemberMapper.selectAll() = " + umsMemberMapper.selectAll());
    }

}
