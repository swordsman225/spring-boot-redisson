package com.huawei.hicloud.vo;

/**
 * Netowork
 */
public class NetworkVO {

    private String id;

    private String name;

    private String tenantId;

    private String ipv4AddressScope;

    private String ipv6AddressScope;

    private SubnetVO[] subnetVOs;

    private String[] sids;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getIpv4AddressScope() {
        return ipv4AddressScope;
    }

    public void setIpv4AddressScope(String ipv4AddressScope) {
        this.ipv4AddressScope = ipv4AddressScope;
    }

    public String getIpv6AddressScope() {
        return ipv6AddressScope;
    }

    public void setIpv6AddressScope(String ipv6AddressScope) {
        this.ipv6AddressScope = ipv6AddressScope;
    }

    public SubnetVO[] getSubnetVOs() {
        return subnetVOs;
    }

    public void setSubnetVOs(SubnetVO[] subnetVOs) {
        this.subnetVOs = subnetVOs;
    }

    public String[] getSids() {
        return sids;
    }

    public void setSids(String[] sids) {
        this.sids = sids;
    }
}
