package com.gart.gartbackend.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 
 * </p>
 *
 * @author Levi
 * @since 2023-12-12
 */
@TableName("tb_offer_prices")
public class OfferPrices implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String currencyContract;

    private String currencyName;

    private String currencySymbol;

    private Integer currencyDecimals;

    private String amountRaw;

    private BigDecimal amountDecimal;

    private BigDecimal amountUsd;

    private BigDecimal amountNative;

    private String netamountRaw;

    private BigDecimal netamountDecimal;

    private BigDecimal netamountUsd;

    private BigDecimal netamountNative;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCurrencyContract() {
        return currencyContract;
    }

    public void setCurrencyContract(String currencyContract) {
        this.currencyContract = currencyContract;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.currencySymbol = currencySymbol;
    }

    public Integer getCurrencyDecimals() {
        return currencyDecimals;
    }

    public void setCurrencyDecimals(Integer currencyDecimals) {
        this.currencyDecimals = currencyDecimals;
    }

    public String getAmountRaw() {
        return amountRaw;
    }

    public void setAmountRaw(String amountRaw) {
        this.amountRaw = amountRaw;
    }

    public BigDecimal getAmountDecimal() {
        return amountDecimal;
    }

    public void setAmountDecimal(BigDecimal amountDecimal) {
        this.amountDecimal = amountDecimal;
    }

    public BigDecimal getAmountUsd() {
        return amountUsd;
    }

    public void setAmountUsd(BigDecimal amountUsd) {
        this.amountUsd = amountUsd;
    }

    public BigDecimal getAmountNative() {
        return amountNative;
    }

    public void setAmountNative(BigDecimal amountNative) {
        this.amountNative = amountNative;
    }

    public String getNetamountRaw() {
        return netamountRaw;
    }

    public void setNetamountRaw(String netamountRaw) {
        this.netamountRaw = netamountRaw;
    }

    public BigDecimal getNetamountDecimal() {
        return netamountDecimal;
    }

    public void setNetamountDecimal(BigDecimal netamountDecimal) {
        this.netamountDecimal = netamountDecimal;
    }

    public BigDecimal getNetamountUsd() {
        return netamountUsd;
    }

    public void setNetamountUsd(BigDecimal netamountUsd) {
        this.netamountUsd = netamountUsd;
    }

    public BigDecimal getNetamountNative() {
        return netamountNative;
    }

    public void setNetamountNative(BigDecimal netamountNative) {
        this.netamountNative = netamountNative;
    }

    @Override
    public String toString() {
        return "OfferPrices{" +
            "id = " + id +
            ", currencyContract = " + currencyContract +
            ", currencyName = " + currencyName +
            ", currencySymbol = " + currencySymbol +
            ", currencyDecimals = " + currencyDecimals +
            ", amountRaw = " + amountRaw +
            ", amountDecimal = " + amountDecimal +
            ", amountUsd = " + amountUsd +
            ", amountNative = " + amountNative +
            ", netamountRaw = " + netamountRaw +
            ", netamountDecimal = " + netamountDecimal +
            ", netamountUsd = " + netamountUsd +
            ", netamountNative = " + netamountNative +
        "}";
    }
}
