package com.customer.gmall.service;

import java.util.List;

import com.customer.gmall.beans.UmsMember;
import com.customer.gmall.beans.UmsMemberReceiveAddress;

/**
 * UserService
 *
 * @author Zichao Zhang
 * @date 2020/4/26
 */
public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddresseByMemberId(String memberId);
}
