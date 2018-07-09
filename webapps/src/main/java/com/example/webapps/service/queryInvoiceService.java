package com.example.webapps.service;

import com.example.webapps.api.Invoice;

/**
 * Created by admin on 2018/6/29.
 */
public interface queryInvoiceService {
    Invoice findById (String id);
}
