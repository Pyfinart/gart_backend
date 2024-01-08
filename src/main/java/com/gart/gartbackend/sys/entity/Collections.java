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
@TableName("tb_collections")
public class Collections implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private Integer chainId;

    private String slug;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private String name;

    private String image;

    private String banner;

    private String discordUrl;

    private String externalUrl;

    private String twitterUsername;

    private String openseaVerificationStatus;

    private String description;

    private String tokenCount;

    private String onSaleCount;

    private String primaryContract;

    private String tokenSetId;

    private String creator;

    private String royalties;

    private String allRoyalties;

    private String floorAsk;

    private String topBid;

    private String rank;

    private String volume;

    private String volumeChange;

    private String floorSale;

    private String floorSaleChange;

    private Boolean collectionBidSupported;

    private Integer ownerCount;

    private String contractKind;

    private String mintedTimestamp;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getChainId() {
        return chainId;
    }

    public void setChainId(Integer chainId) {
        this.chainId = chainId;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getDiscordUrl() {
        return discordUrl;
    }

    public void setDiscordUrl(String discordUrl) {
        this.discordUrl = discordUrl;
    }

    public String getExternalUrl() {
        return externalUrl;
    }

    public void setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
    }

    public String getTwitterUsername() {
        return twitterUsername;
    }

    public void setTwitterUsername(String twitterUsername) {
        this.twitterUsername = twitterUsername;
    }

    public String getOpenseaVerificationStatus() {
        return openseaVerificationStatus;
    }

    public void setOpenseaVerificationStatus(String openseaVerificationStatus) {
        this.openseaVerificationStatus = openseaVerificationStatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTokenCount() {
        return tokenCount;
    }

    public void setTokenCount(String tokenCount) {
        this.tokenCount = tokenCount;
    }

    public String getOnSaleCount() {
        return onSaleCount;
    }

    public void setOnSaleCount(String onSaleCount) {
        this.onSaleCount = onSaleCount;
    }

    public String getPrimaryContract() {
        return primaryContract;
    }

    public void setPrimaryContract(String primaryContract) {
        this.primaryContract = primaryContract;
    }

    public String getTokenSetId() {
        return tokenSetId;
    }

    public void setTokenSetId(String tokenSetId) {
        this.tokenSetId = tokenSetId;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getRoyalties() {
        return royalties;
    }

    public void setRoyalties(String royalties) {
        this.royalties = royalties;
    }

    public String getAllRoyalties() {
        return allRoyalties;
    }

    public void setAllRoyalties(String allRoyalties) {
        this.allRoyalties = allRoyalties;
    }

    public String getFloorAsk() {
        return floorAsk;
    }

    public void setFloorAsk(String floorAsk) {
        this.floorAsk = floorAsk;
    }

    public String getTopBid() {
        return topBid;
    }

    public void setTopBid(String topBid) {
        this.topBid = topBid;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getVolumeChange() {
        return volumeChange;
    }

    public void setVolumeChange(String volumeChange) {
        this.volumeChange = volumeChange;
    }

    public String getFloorSale() {
        return floorSale;
    }

    public void setFloorSale(String floorSale) {
        this.floorSale = floorSale;
    }

    public String getFloorSaleChange() {
        return floorSaleChange;
    }

    public void setFloorSaleChange(String floorSaleChange) {
        this.floorSaleChange = floorSaleChange;
    }

    public Boolean getCollectionBidSupported() {
        return collectionBidSupported;
    }

    public void setCollectionBidSupported(Boolean collectionBidSupported) {
        this.collectionBidSupported = collectionBidSupported;
    }

    public Integer getOwnerCount() {
        return ownerCount;
    }

    public void setOwnerCount(Integer ownerCount) {
        this.ownerCount = ownerCount;
    }

    public String getContractKind() {
        return contractKind;
    }

    public void setContractKind(String contractKind) {
        this.contractKind = contractKind;
    }

    public String getMintedTimestamp() {
        return mintedTimestamp;
    }

    public void setMintedTimestamp(String mintedTimestamp) {
        this.mintedTimestamp = mintedTimestamp;
    }

    @Override
    public String toString() {
        return "Collections{" +
            "id = " + id +
            ", chainId = " + chainId +
            ", slug = " + slug +
            ", createdAt = " + createdAt +
            ", updatedAt = " + updatedAt +
            ", name = " + name +
            ", image = " + image +
            ", banner = " + banner +
            ", discordUrl = " + discordUrl +
            ", externalUrl = " + externalUrl +
            ", twitterUsername = " + twitterUsername +
            ", openseaVerificationStatus = " + openseaVerificationStatus +
            ", description = " + description +
            ", tokenCount = " + tokenCount +
            ", onSaleCount = " + onSaleCount +
            ", primaryContract = " + primaryContract +
            ", tokenSetId = " + tokenSetId +
            ", creator = " + creator +
            ", royalties = " + royalties +
            ", allRoyalties = " + allRoyalties +
            ", floorAsk = " + floorAsk +
            ", topBid = " + topBid +
            ", rank = " + rank +
            ", volume = " + volume +
            ", volumeChange = " + volumeChange +
            ", floorSale = " + floorSale +
            ", floorSaleChange = " + floorSaleChange +
            ", collectionBidSupported = " + collectionBidSupported +
            ", ownerCount = " + ownerCount +
            ", contractKind = " + contractKind +
            ", mintedTimestamp = " + mintedTimestamp +
        "}";
    }
}
