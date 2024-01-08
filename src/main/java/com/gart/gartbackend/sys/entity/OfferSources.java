package com.gart.gartbackend.sys.entity;

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
@TableName("tb_offer_sources")
public class OfferSources implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String domain;

    private String name;

    private String icon;

    private String url;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "OfferSources{" +
            "id = " + id +
            ", domain = " + domain +
            ", name = " + name +
            ", icon = " + icon +
            ", url = " + url +
        "}";
    }
}
