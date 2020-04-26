package com.customer.gmall.service;

import java.util.List;

import com.customer.gmall.beans.PmsBaseAttrInfo;

/**
 * AttibuteService
 *
 * @author Zichao Zhang
 * @date 2020/4/26
 */
public interface AttibuteService {
    List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);
}
