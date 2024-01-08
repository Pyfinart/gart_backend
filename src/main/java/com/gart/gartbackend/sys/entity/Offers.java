package com.gart.gartbackend.sys.entity;

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
@TableName("tb_offers")
public class Offers implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String kind;

    private String side;

    private String status;

    private String tokenSetId;

    private String tokenSetSchemaHash;

    private String contract;

    private String contractKind;

    private String maker;

    private String taker;

    private Long priceId;

    private Long validFrom;

    private Long validUntil;

    private Integer quantityFilled;

    private Integer quantityRemaining;

    private Long criteriaId;

    private String sourceId;

    private Integer feeBps;

    private Long expiration;

    private Boolean isReservoir;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private LocalDateTime originatedAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTokenSetId() {
        return tokenSetId;
    }

    public void setTokenSetId(String tokenSetId) {
        this.tokenSetId = tokenSetId;
    }

    public String getTokenSetSchemaHash() {
        return tokenSetSchemaHash;
    }

    public void setTokenSetSchemaHash(String tokenSetSchemaHash) {
        this.tokenSetSchemaHash = tokenSetSchemaHash;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }

    public String getContractKind() {
        return contractKind;
    }

    public void setContractKind(String contractKind) {
        this.contractKind = contractKind;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getTaker() {
        return taker;
    }

    public void setTaker(String taker) {
        this.taker = taker;
    }

    public Long getPriceId() {
        return priceId;
    }

    public void setPriceId(Long priceId) {
        this.priceId = priceId;
    }

    public Long getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Long validFrom) {
        this.validFrom = validFrom;
    }

    public Long getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(Long validUntil) {
        this.validUntil = validUntil;
    }

    public Integer getQuantityFilled() {
        return quantityFilled;
    }

    public void setQuantityFilled(Integer quantityFilled) {
        this.quantityFilled = quantityFilled;
    }

    public Integer getQuantityRemaining() {
        return quantityRemaining;
    }

    public void setQuantityRemaining(Integer quantityRemaining) {
        this.quantityRemaining = quantityRemaining;
    }

    public Long getCriteriaId() {
        return criteriaId;
    }

    public void setCriteriaId(Long criteriaId) {
        this.criteriaId = criteriaId;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public Integer getFeeBps() {
        return feeBps;
    }

    public void setFeeBps(Integer feeBps) {
        this.feeBps = feeBps;
    }

    public Long getExpiration() {
        return expiration;
    }

    public void setExpiration(Long expiration) {
        this.expiration = expiration;
    }

    public Boolean getIsReservoir() {
        return isReservoir;
    }

    public void setIsReservoir(Boolean isReservoir) {
        this.isReservoir = isReservoir;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDateTime getOriginatedAt() {
        return originatedAt;
    }

    public void setOriginatedAt(LocalDateTime originatedAt) {
        this.originatedAt = originatedAt;
    }

    @Override
    public String toString() {
        return "Offers{" +
            "id = " + id +
            ", kind = " + kind +
            ", side = " + side +
            ", status = " + status +
            ", tokenSetId = " + tokenSetId +
            ", tokenSetSchemaHash = " + tokenSetSchemaHash +
            ", contract = " + contract +
            ", contractKind = " + contractKind +
            ", maker = " + maker +
            ", taker = " + taker +
            ", priceId = " + priceId +
            ", validFrom = " + validFrom +
            ", validUntil = " + validUntil +
            ", quantityFilled = " + quantityFilled +
            ", quantityRemaining = " + quantityRemaining +
            ", criteriaId = " + criteriaId +
            ", sourceId = " + sourceId +
            ", feeBps = " + feeBps +
            ", expiration = " + expiration +
            ", isReservoir = " + isReservoir +
            ", createdAt = " + createdAt +
            ", updatedAt = " + updatedAt +
            ", originatedAt = " + originatedAt +
        "}";
    }
}
