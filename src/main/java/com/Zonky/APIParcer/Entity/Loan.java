package com.Zonky.APIParcer.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Loan implements Serializable {
    @Id
    private Integer id;
    private String url;
    private String name;
    private String story;
    private String purpose;
    private Integer photoId;
    private Integer userId;
    private Long borrowerNo;
    private String nickName;
    private Integer termInMonths;
    private Double interestRate;
    private Double revenueRate;
    private Double annuity;
    private Integer premium;
    private String rating;
    private Boolean topped;
    private Double amount;
    private Double remainingInvestment;
    private Double investmentRate;
    private Boolean covered;
    private Double reservedAmount;
    private Double zonkyPlusAmount;
    private String datePublished; //date
    private Boolean published;
    private String deadline; //date
    private String myOtherInvestments;
    private String borrowerRelatedInvestmentInfo;
    private Integer investmentsCount;
    private Integer questionsCount;
    private String region;
    private String mainIncomeType;
    private Boolean questionsAllowed;
    private Integer activeLoansCount;
    private Boolean insuranceActive;
    private Integer insuranceHistoryId;
    private String countryOfOrigin;
    private String currency;
    private Boolean insuredInFuture;
    private Boolean additionallyInsured;
    private Double annuityWithInsurance;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getStory() {
        return story;
    }
    public void setStory(String story) {
        this.story = story;
    }

    public String getPurpose() {
        return purpose;
    }
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public Integer getPhotoId() {
        return photoId;
    }
    public void setPhotoId(Integer photoId) {
        this.photoId = photoId;
    }

    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getTermInMonths() {
        return termInMonths;
    }
    public void setTermInMonths(Integer termInMonths) {
        this.termInMonths = termInMonths;
    }

    public Double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public Double getRevenueRate() {
        return revenueRate;
    }
    public void setRevenueRate(Double revenueRate) {
        this.revenueRate = revenueRate;
    }

    public Double getAnnuity() {
        return annuity;
    }
    public void setAnnuity(Double annuity) {
        this.annuity = annuity;
    }

    public Object getPremium() {
        return premium;
    }
    public void setPremium(Integer premium) {
        this.premium = premium;
    }

    public String getRating() {
        return rating;
    }
    public void setRating(String rating) {
        this.rating = rating;
    }

    public Boolean getTopped() {
        return topped;
    }
    public void setTopped(Boolean topped) {
        this.topped = topped;
    }

    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getRemainingInvestment() {
        return remainingInvestment;
    }
    public void setRemainingInvestment(Double remainingInvestment) {
        this.remainingInvestment = remainingInvestment;
    }

    public Double getInvestmentRate() {
        return investmentRate;
    }
    public void setInvestmentRate(Double investmentRate) {
        this.investmentRate = investmentRate;
    }

    public Boolean getCovered() {
        return covered;
    }
    public void setCovered(Boolean covered) {
        this.covered = covered;
    }

    public Double getReservedAmount() {
        return reservedAmount;
    }public void
    setReservedAmount(Double reservedAmount) {
        this.reservedAmount = reservedAmount;
    }

    public Double getZonkyPlusAmount() {
        return zonkyPlusAmount;
    }
    public void setZonkyPlusAmount(Double zonkyPlusAmount) {
        this.zonkyPlusAmount = zonkyPlusAmount;
    }

    public String getDatePublished() {
        return datePublished;
    }
    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }

    public Boolean getPublished() {
        return published;
    }
    public void setPublished(Boolean published) {
        this.published = published;
    }

    public String getDeadline() {
        return deadline;
    }
    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public Object getMyOtherInvestments() {
        return myOtherInvestments;
    }
    public void setMyOtherInvestments(String myOtherInvestments) {
        this.myOtherInvestments = myOtherInvestments;
    }

    public Object getBorrowerRelatedInvestmentInfo() {
        return borrowerRelatedInvestmentInfo;
    }
    public void setBorrowerRelatedInvestmentInfo(String borrowerRelatedInvestmentInfo) {
        this.borrowerRelatedInvestmentInfo = borrowerRelatedInvestmentInfo;
    }

    public Integer getInvestmentsCount() {
        return investmentsCount;
    }
    public void setInvestmentsCount(Integer investmentsCount) {
        this.investmentsCount = investmentsCount;
    }

    public Integer getQuestionsCount() {
        return questionsCount;
    }
    public void setQuestionsCount(Integer questionsCount) {
        this.questionsCount = questionsCount;
    }

    public String getRegion() {
        return region;
    }
    public void setRegion(String region) {
        this.region = region;
    }

    public String getMainIncomeType() {
        return mainIncomeType;
    }
    public void setMainIncomeType(String mainIncomeType) {
        this.mainIncomeType = mainIncomeType;
    }

    public Boolean getQuestionsAllowed() {
        return questionsAllowed;
    }
    public void setQuestionsAllowed(Boolean questionsAllowed) {
        this.questionsAllowed = questionsAllowed;
    }

    public Integer getActiveLoansCount() {
        return activeLoansCount;
    }
    public void setActiveLoansCount(Integer activeLoansCount) {
        this.activeLoansCount = activeLoansCount;
    }

    public Boolean getInsuranceActive() {
        return insuranceActive;
    }
    public void setInsuranceActive(Boolean insuranceActive) {
        this.insuranceActive = insuranceActive;
    }

    public Integer getInsuranceHistoryId() {
        return insuranceHistoryId;
    }
    public void setInsuranceHistoryId(Integer insuranceHistoryId) {
        this.insuranceHistoryId = insuranceHistoryId;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }
    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Boolean getInsuredInFuture() {
        return insuredInFuture;
    }
    public void setInsuredInFuture(Boolean insuredInFuture) {
        this.insuredInFuture = insuredInFuture;
    }

    public Boolean getAdditionallyInsured() {
        return additionallyInsured;
    }
    public void setAdditionallyInsured(Boolean additionallyInsured) {
        this.additionallyInsured = additionallyInsured;
    }

    public Double getAnnuityWithInsurance() {
        return annuityWithInsurance;
    }

    public void setAnnuityWithInsurance(Double annuityWithInsurance) {
        this.annuityWithInsurance = annuityWithInsurance;
    }

    public Long getBorrowerNo() { return borrowerNo; }
    public void setBorrowerNo(Long borrowerNo) { this.borrowerNo = borrowerNo; }
}
