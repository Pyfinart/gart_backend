package com.gart.gartbackend.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author Levi
 * @since 2023-12-12
 */
@TableName("tb_activity")
public class Activity implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String type;

    private String fromAddress;

    private String toAddress;

    private String price;

    private Integer amount;

    private String timestamp;

    private LocalDateTime createdAt;

    private String contract;

    private String tokenId;

    private String tokenName;

    private String tokenImage;

    private String collectionId;

    private String collectionName;

    private String collectionImage;

    private String orderId;

    private String orderSide;

    private String orderSource;

    private String orderCriteria;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress;
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    public String getTokenName() {
        return tokenName;
    }

    public void setTokenName(String tokenName) {
        this.tokenName = tokenName;
    }

    public String getTokenImage() {
        return tokenImage;
    }

    public void setTokenImage(String tokenImage) {
        this.tokenImage = tokenImage;
    }

    public String getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public String getCollectionImage() {
        return collectionImage;
    }

    public void setCollectionImage(String collectionImage) {
        this.collectionImage = collectionImage;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderSide() {
        return orderSide;
    }

    public void setOrderSide(String orderSide) {
        this.orderSide = orderSide;
    }

    public String getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource;
    }

    public String getOrderCriteria() {
        return orderCriteria;
    }

    public void setOrderCriteria(String orderCriteria) {
        this.orderCriteria = orderCriteria;
    }

    @Override
    public String toString() {
        return "Activity{" +
            "id = " + id +
            ", type = " + type +
            ", fromAddress = " + fromAddress +
            ", toAddress = " + toAddress +
            ", price = " + price +
            ", amount = " + amount +
            ", timestamp = " + timestamp +
            ", createdAt = " + createdAt +
            ", contract = " + contract +
            ", tokenId = " + tokenId +
            ", tokenName = " + tokenName +
            ", tokenImage = " + tokenImage +
            ", collectionId = " + collectionId +
            ", collectionName = " + collectionName +
            ", collectionImage = " + collectionImage +
            ", orderId = " + orderId +
            ", orderSide = " + orderSide +
            ", orderSource = " + orderSource +
            ", orderCriteria = " + orderCriteria +
        "}";
    }
}
