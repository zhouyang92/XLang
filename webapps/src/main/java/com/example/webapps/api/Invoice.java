package com.example.webapps.api;

/**
 * Created by admin on 2018/6/29.
 */
public class Invoice {
    /**
     * 发票名称
     */
    private String invoiceName;
    /**
     * 发票种类
     */
    private String kind;
    /**
     * 发票数量
     */
    private int sum;

    public String getInvoiceName() {
        return invoiceName;
    }

    public void setInvoiceName(String invoiceName) {
        this.invoiceName = invoiceName;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
