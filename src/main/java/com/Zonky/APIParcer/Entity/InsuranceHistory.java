package com.Zonky.APIParcer.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class InsuranceHistory implements Serializable {
    @Id
    private Integer id;
    private String policyPeriodFrom;
    private String policyPeriodTo;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

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
