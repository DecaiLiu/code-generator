package com.lsx.tyre.bean;

import java.io.Serializable;
import java.util.Date;

public class Repertory implements Serializable {
    private Long id;

    private Long tyreId;

    private Integer totalNum;

    private Integer soldNum;

    private Integer residueNum;

    private Date updateAt;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTyreId() {
        return tyreId;
    }

    public void setTyreId(Long tyreId) {
        this.tyreId = tyreId;
    }

    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public Integer getSoldNum() {
        return soldNum;
    }

    public void setSoldNum(Integer soldNum) {
        this.soldNum = soldNum;
    }

    public Integer getResidueNum() {
        return residueNum;
    }

    public void setResidueNum(Integer residueNum) {
        this.residueNum = residueNum;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", tyreId=").append(tyreId);
        sb.append(", totalNum=").append(totalNum);
        sb.append(", soldNum=").append(soldNum);
        sb.append(", residueNum=").append(residueNum);
        sb.append(", updateAt=").append(updateAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}