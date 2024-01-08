package com.gart.gartbackend.sys.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Levi
 * @since 2023-12-12
 */
@TableName("tb_offer_fee_breakdown")
public class OfferFeeBreakdown implements Serializable {

    private static final long serialVersionUID = 1L;

    private String transactionId;

    private Integer bps;

    private String kind;

    private String recipient;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public Integer getBps() {
        return bps;
    }

    public void setBps(Integer bps) {
        this.bps = bps;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "OfferFeeBreakdown{" +
            "transactionId = " + transactionId +
            ", bps = " + bps +
            ", kind = " + kind +
            ", recipient = " + recipient +
            ", id = " + id +
        "}";
    }
}
