package com.customer.gmall.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.customer.gmall.beans.UmsMember;
import com.customer.gmall.beans.UmsMemberReceiveAddress;
import com.customer.gmall.service.UserService;
import com.customer.gmall.user.mapper.UmsMemberMapper;
import com.customer.gmall.user.mapper.UmsMemberReceiveAddressMapper;

import com.alibaba.dubbo.config.annotation.Service;

/**
 * UserServiceImpl
 *
 * @author Zichao Zhang
 * @date 2020/4/26
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UmsMemberMapper umsMemberMapper;

    @Autowired
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
        return umsMemberMapper.selectAll();
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddresseByMemberId(String memberId) {
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);
        return umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
    }
}
