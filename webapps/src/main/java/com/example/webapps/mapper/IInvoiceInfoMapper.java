package com.example.webapps.mapper;

import com.example.webapps.api.Invoice;
import org.springframework.stereotype.Repository;

/**
 * Created by admin on 2018/6/29.
 */
@Repository
public interface IInvoiceInfoMapper {
    Invoice selectByPrimaryKey(String key);
}
