package com.Zonky.APIParcer.DTO;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.stereotype.Component;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "policyPeriodFrom",
        "policyPeriodTo"
})
@Component
public class InsuranceHistoryDTO implements Serializable {

    @JsonProperty("policyPeriodFrom")
    private String policyPeriodFrom;
    @JsonProperty("policyPeriodTo")
    private String policyPeriodTo;
//    @JsonIgnore
//    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -3055902900561143456L;

    @JsonProperty("policyPeriodFrom")
    public String getPolicyPeriodFrom() {
        return policyPeriodFrom;
    }

    @JsonProperty("policyPeriodFrom")
    public void setPolicyPeriodFrom(String policyPeriodFrom) {
        this.policyPeriodFrom = policyPeriodFrom;
    }

    @JsonProperty("policyPeriodTo")
    public String getPolicyPeriodTo() {
        return policyPeriodTo;
    }

    @JsonProperty("policyPeriodTo")
    public void setPolicyPeriodTo(String policyPeriodTo) {
        this.policyPeriodTo = policyPeriodTo;
    }

//    @JsonAnyGetter
//    public Map<String, Object> getAdditionalProperties() {
//        return this.additionalProperties;
//    }
//
//    @JsonAnySetter
//    public void setAdditionalProperty(String name, Object value) {
//        this.additionalProperties.put(name, value);
//    }

}