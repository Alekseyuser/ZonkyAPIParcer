package com.Zonky.APIParcer.Entity;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class InsuranceHistory implements Serializable {

    private Integer id;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    private String policyPeriodFrom;
    private String policyPeriodTo;

    public String getPolicyPeriodFrom() {
        return policyPeriodFrom;
    }
    public void setPolicyPeriodFrom(String policyPeriodFrom) {
        this.policyPeriodFrom = policyPeriodFrom;
    }

    public String getPolicyPeriodTo() {
        return policyPeriodTo;
    }
    public void setPolicyPeriodTo(String policyPeriodTo) {
        this.policyPeriodTo = policyPeriodTo;
    }

}
