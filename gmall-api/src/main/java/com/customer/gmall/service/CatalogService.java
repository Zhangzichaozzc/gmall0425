package com.customer.gmall.service;

import java.util.List;

import com.customer.gmall.beans.PmsBaseCatalog1;
import com.customer.gmall.beans.PmsBaseCatalog2;
import com.customer.gmall.beans.PmsBaseCatalog3;

/**
 * CatalogService
 *
 * @author Zichao Zhang
 * @date 2020/4/26
 */
public interface CatalogService {

    List<PmsBaseCatalog1> getCatalog1();

    List<PmsBaseCatalog2> getCatalog2(String catalog1Id);

    List<PmsBaseCatalog3> getCatalog3(String catalog2Id);
}
