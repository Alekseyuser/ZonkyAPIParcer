package com.Zonky.APIParcer.DTO;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.stereotype.Component;

import javax.persistence.*;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "url",
        "name",
        "story",
        "purpose",
        "photoDTOS",
        "userId",
        "nickName",
        "termInMonths",
        "interestRate",
        "revenueRate",
        "annuity",
        "premium",
        "rating",
        "topped",
        "amount",
        "remainingInvestment",
        "investmentRate",
        "covered",
        "reservedAmount",
        "zonkyPlusAmount",
        "datePublished",
        "published",
        "deadline",
        "myOtherInvestments",
        "borrowerRelatedInvestmentInfo",
        "investmentsCount",
        "questionsCount",
        "region",
        "mainIncomeType",
        "questionsAllowed",
        "activeLoansCount",
        "insuranceActive",
        "insuranceHistoryDTO",
        "multicash",
        "currency",
        "insuredInFuture",
        "additionallyInsured",
        "annuityWithInsurance"
})
@Component
public class LoanDTO implements Serializable {

//    @JsonAnyGetter
@JsonProperty("id")
private Integer id;
    @JsonProperty("url")
    private String url;
    @JsonProperty("name")
    private String name;
    @JsonProperty("story")
    private String story;
    @JsonProperty("purpose")
    private String purpose;
    @JsonProperty("photos")
    private List<PhotoDTO> photoDTOS = null;
    @JsonProperty("userId")
    private Integer userId;
    @JsonProperty("nickName")
    private String nickName;
    @JsonProperty("termInMonths")
    private Integer termInMonths;
    @JsonProperty("interestRate")
    private Double interestRate;
    @JsonProperty("revenueRate")
    private Double revenueRate;
    @JsonProperty("annuity")
    private Double annuity;
    @JsonProperty("premium")
    private Integer premium;
    @JsonProperty("rating")
    private String rating;
    @JsonProperty("topped")
    private Boolean topped;
    @JsonProperty("amount")
    private Double amount;
    @JsonProperty("remainingInvestment")
    private Double remainingInvestment;
    @JsonProperty("investmentRate")
    private Double investmentRate;
    @JsonProperty("covered")
    private Boolean covered;
    @JsonProperty("reservedAmount")
    private Double reservedAmount;
    @JsonProperty("zonkyPlusAmount")
    private Double zonkyPlusAmount;
    @JsonProperty("datePublished")
    private String datePublished;
    @JsonProperty("published")
    private Boolean published;
    @JsonProperty("deadline")
    private String deadline;
    @JsonProperty("myOtherInvestments")
    private String myOtherInvestments;
    @JsonProperty("borrowerRelatedInvestmentInfo")
    private String borrowerRelatedInvestmentInfo;
    @JsonProperty("investmentsCount")
    private Integer investmentsCount;
    @JsonProperty("questionsCount")
    private Integer questionsCount;
    @JsonProperty("region")
    private String region;
    @JsonProperty("mainIncomeType")
    private String mainIncomeType;
    @JsonProperty("questionsAllowed")
    private Boolean questionsAllowed;
    @JsonProperty("activeLoansCount")
    private Integer activeLoansCount;
    @JsonProperty("insuranceActive")
    private Boolean insuranceActive;
    @JsonProperty("insuranceHistory")
    private List<InsuranceHistoryDTO> insuranceHistoryDTO = null;
    @JsonProperty("countryOfOrigin")
    private String countryOfOrigin;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("insuredInFuture")
    private Boolean insuredInFuture;
    @JsonProperty("additionallyInsured")
    private Boolean additionallyInsured;
    @JsonProperty("annuityWithInsurance")
    private Double annuityWithInsurance;
    //@JsonIgnore
    //private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2734762069682323523L;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("story")
    public String getStory() {
        return story;
    }

    @JsonProperty("story")
    public void setStory(String story) {
        this.story = story;
    }

    @JsonProperty("purpose")
    public String getPurpose() {
        return purpose;
    }

    @JsonProperty("purpose")
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @JsonProperty("photos")
    public List<PhotoDTO> getPhotoDTOS() {
        return photoDTOS;
    }

    @JsonProperty("photos")
    public void setPhotoDTOS(List<PhotoDTO> photoDTOS) {
        this.photoDTOS = photoDTOS;
    }

    @JsonProperty("userId")
    public Integer getUserId() {
        return userId;
    }

    @JsonProperty("userId")
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @JsonProperty("nickName")
    public String getNickName() {
        return nickName;
    }

    @JsonProperty("nickName")
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @JsonProperty("termInMonths")
    public Integer getTermInMonths() {
        return termInMonths;
    }

    @JsonProperty("termInMonths")
    public void setTermInMonths(Integer termInMonths) {
        this.termInMonths = termInMonths;
    }

    @JsonProperty("interestRate")
    public Double getInterestRate() {
        return interestRate;
    }

    @JsonProperty("interestRate")
    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    @JsonProperty("revenueRate")
    public Double getRevenueRate() {
        return revenueRate;
    }

    @JsonProperty("revenueRate")
    public void setRevenueRate(Double revenueRate) {
        this.revenueRate = revenueRate;
    }

    @JsonProperty("annuity")
    public Double getAnnuity() {
        return annuity;
    }

    @JsonProperty("annuity")
    public void setAnnuity(Double annuity) {
        this.annuity = annuity;
    }

    @JsonProperty("premium")
    public Object getPremium() {
        return premium;
    }

    @JsonProperty("premium")
    public void setPremium(Integer premium) {
        this.premium = premium;
    }

    @JsonProperty("rating")
    public String getRating() {
        return rating;
    }

    @JsonProperty("rating")
    public void setRating(String rating) {
        this.rating = rating;
    }

    @JsonProperty("topped")
    public Boolean getTopped() {
        return topped;
    }

    @JsonProperty("topped")
    public void setTopped(Boolean topped) {
        this.topped = topped;
    }

    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @JsonProperty("remainingInvestment")
    public Double getRemainingInvestment() {
        return remainingInvestment;
    }

    @JsonProperty("remainingInvestment")
    public void setRemainingInvestment(Double remainingInvestment) {
        this.remainingInvestment = remainingInvestment;
    }

    @JsonProperty("investmentRate")
    public Double getInvestmentRate() {
        return investmentRate;
    }

    @JsonProperty("investmentRate")
    public void setInvestmentRate(Double investmentRate) {
        this.investmentRate = investmentRate;
    }

    @JsonProperty("covered")
    public Boolean getCovered() {
        return covered;
    }

    @JsonProperty("covered")
    public void setCovered(Boolean covered) {
        this.covered = covered;
    }

    @JsonProperty("reservedAmount")
    public Double getReservedAmount() {
        return reservedAmount;
    }

    @JsonProperty("reservedAmount")
    public void setReservedAmount(Double reservedAmount) {
        this.reservedAmount = reservedAmount;
    }

    @JsonProperty("zonkyPlusAmount")
    public Double getZonkyPlusAmount() {
        return zonkyPlusAmount;
    }

    @JsonProperty("zonkyPlusAmount")
    public void setZonkyPlusAmount(Double zonkyPlusAmount) {
        this.zonkyPlusAmount = zonkyPlusAmount;
    }

    @JsonProperty("datePublished")
    public String getDatePublished() {
        return datePublished;
    }

    @JsonProperty("datePublished")
    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }

    @JsonProperty("published")
    public Boolean getPublished() {
        return published;
    }

    @JsonProperty("published")
    public void setPublished(Boolean published) {
        this.published = published;
    }

    @JsonProperty("deadline")
    public String getDeadline() {
        return deadline;
    }

    @JsonProperty("deadline")
    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    @JsonProperty("myOtherInvestments")
    public Object getMyOtherInvestments() {
        return myOtherInvestments;
    }

    @JsonProperty("myOtherInvestments")
    public void setMyOtherInvestments(String myOtherInvestments) {
        this.myOtherInvestments = myOtherInvestments;
    }

    @JsonProperty("borrowerRelatedInvestmentInfo")
    public Object getBorrowerRelatedInvestmentInfo() {
        return borrowerRelatedInvestmentInfo;
    }

    @JsonProperty("borrowerRelatedInvestmentInfo")
    public void setBorrowerRelatedInvestmentInfo(String borrowerRelatedInvestmentInfo) {
        this.borrowerRelatedInvestmentInfo = borrowerRelatedInvestmentInfo;
    }

    @JsonProperty("investmentsCount")
    public Integer getInvestmentsCount() {
        return investmentsCount;
    }

    @JsonProperty("investmentsCount")
    public void setInvestmentsCount(Integer investmentsCount) {
        this.investmentsCount = investmentsCount;
    }

    @JsonProperty("questionsCount")
    public Integer getQuestionsCount() {
        return questionsCount;
    }

    @JsonProperty("questionsCount")
    public void setQuestionsCount(Integer questionsCount) {
        this.questionsCount = questionsCount;
    }

    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    @JsonProperty("mainIncomeType")
    public String getMainIncomeType() {
        return mainIncomeType;
    }

    @JsonProperty("mainIncomeType")
    public void setMainIncomeType(String mainIncomeType) {
        this.mainIncomeType = mainIncomeType;
    }

    @JsonProperty("questionsAllowed")
    public Boolean getQuestionsAllowed() {
        return questionsAllowed;
    }

    @JsonProperty("questionsAllowed")
    public void setQuestionsAllowed(Boolean questionsAllowed) {
        this.questionsAllowed = questionsAllowed;
    }

    @JsonProperty("activeLoansCount")
    public Integer getActiveLoansCount() {
        return activeLoansCount;
    }

    @JsonProperty("activeLoansCount")
    public void setActiveLoansCount(Integer activeLoansCount) {
        this.activeLoansCount = activeLoansCount;
    }

    @JsonProperty("insuranceActive")
    public Boolean getInsuranceActive() {
        return insuranceActive;
    }

    @JsonProperty("insuranceActive")
    public void setInsuranceActive(Boolean insuranceActive) {
        this.insuranceActive = insuranceActive;
    }

    @JsonProperty("insuranceHistory")
    public List<InsuranceHistoryDTO> getInsuranceHistoryDTO() {
        return insuranceHistoryDTO;
    }

    @JsonProperty("insuranceHistory")
    public void setInsuranceHistoryDTO(List<InsuranceHistoryDTO> insuranceHistoryDTO) {
        this.insuranceHistoryDTO = insuranceHistoryDTO;
    }

    @JsonProperty("countryOfOrigin")
    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    @JsonProperty("countryOfOrigin")
    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("insuredInFuture")
    public Boolean getInsuredInFuture() {
        return insuredInFuture;
    }

    @JsonProperty("insuredInFuture")
    public void setInsuredInFuture(Boolean insuredInFuture) {
        this.insuredInFuture = insuredInFuture;
    }

    @JsonProperty("additionallyInsured")
    public Boolean getAdditionallyInsured() {
        return additionallyInsured;
    }

    @JsonProperty("additionallyInsured")
    public void setAdditionallyInsured(Boolean additionallyInsured) {
        this.additionallyInsured = additionallyInsured;
    }

    @JsonProperty("annuityWithInsurance")
    public Double getAnnuityWithInsurance() {
        return annuityWithInsurance;
    }

    @JsonProperty("annuityWithInsurance")
    public void setAnnuityWithInsurance(Double annuityWithInsurance) {
        this.annuityWithInsurance = annuityWithInsurance;
    }
//    public Map<String, Object> getAdditionalProperties() {
//        return this.additionalProperties;
//    }
//
//    @JsonAnySetter
//    public void setAdditionalProperty(String name, Object value) {
//        this.additionalProperties.put(name, value);
//    }

}