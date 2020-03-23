package com.lsx.tyre.bean;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {
    private Long id;

    private String seqnum;

    private Long tyreType;

    private Integer tyreNum;

    private Double tyrePrice;

    private Double totalPrice;

    private Double realPrice;

    private String description;

    private Long payStatus;

    private Long payMethod;

    private Date payAt;

    private Long orderType;

    private Date orderAt;

    private Date createAt;

    private Date updateAt;

    private Integer deleted;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSeqnum() {
        return seqnum;
    }

    public void setSeqnum(String seqnum) {
        this.seqnum = seqnum == null ? null : seqnum.trim();
    }

    public Long getTyreType() {
        return tyreType;
    }

    public void setTyreType(Long tyreType) {
        this.tyreType = tyreType;
    }

    public Integer getTyreNum() {
        return tyreNum;
    }

    public void setTyreNum(Integer tyreNum) {
        this.tyreNum = tyreNum;
    }

    public Double getTyrePrice() {
        return tyrePrice;
    }

    public void setTyrePrice(Double tyrePrice) {
        this.tyrePrice = tyrePrice;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Double getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(Double realPrice) {
        this.realPrice = realPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Long getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Long payStatus) {
        this.payStatus = payStatus;
    }

    public Long getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(Long payMethod) {
        this.payMethod = payMethod;
    }

    public Date getPayAt() {
        return payAt;
    }

    public void setPayAt(Date payAt) {
        this.payAt = payAt;
    }

    public Long getOrderType() {
        return orderType;
    }

    public void setOrderType(Long orderType) {
        this.orderType = orderType;
    }

    public Date getOrderAt() {
        return orderAt;
    }

    public void setOrderAt(Date orderAt) {
        this.orderAt = orderAt;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", seqnum=").append(seqnum);
        sb.append(", tyreType=").append(tyreType);
        sb.append(", tyreNum=").append(tyreNum);
        sb.append(", tyrePrice=").append(tyrePrice);
        sb.append(", totalPrice=").append(totalPrice);
        sb.append(", realPrice=").append(realPrice);
        sb.append(", description=").append(description);
        sb.append(", payStatus=").append(payStatus);
        sb.append(", payMethod=").append(payMethod);
        sb.append(", payAt=").append(payAt);
        sb.append(", orderType=").append(orderType);
        sb.append(", orderAt=").append(orderAt);
        sb.append(", createAt=").append(createAt);
        sb.append(", updateAt=").append(updateAt);
        sb.append(", deleted=").append(deleted);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}