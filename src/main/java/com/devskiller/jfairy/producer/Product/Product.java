package com.devskiller.jfairy.producer.Product;

public class Product {

	public Product(){
		this.productId = "productId";
		this.externalProductId = "externalProductId";
		this.name = "name";
		this.type = "type";
		this.applicationCode = "applicationCode";
		this.accountCategoryCode = "accountCategoryCode";
		this.accountSubCategoryCode = "accountSubCategoryCode";
		this.templateName = "templateName";
		this.responsibleOrgId = "responsibleOrgId";
		this.offerIndicator = false;
		this.formsIndicator = false;
		this.subClassCode = "subClassCode";
		this.effectiveDate = "effectiveDate";
		this.expirationDate = "expirationDate";
		this.createdDateTime = "createdDateTime";
		this.createdBy = "createdBy";
		this.lastModifiedDateTime = "lastModifiedDateTime";
		this.lastModifiedBy = "lastModifiedBy";
		this.portfolioGroup = "portfolioGroup";
		this.portfolioLine = "portfolioLine";
		this.attributes = "attributes";
	}

	private  String productId;
	private  String externalProductId;
	private  String name;
	private  String type;
	private  String applicationCode;
	private  String accountCategoryCode;
	private  String accountSubCategoryCode;
	private  String templateName;
	private  String responsibleOrgId;
	private  boolean offerIndicator;
	private  boolean formsIndicator;
	private  String subClassCode;
	private  String effectiveDate;
	private  String expirationDate;
	private  String createdDateTime;
	private  String createdBy;
	private  String lastModifiedDateTime;
	private  String lastModifiedBy;
	private  String portfolioGroup;
	private  String portfolioLine;
	private  String attributes;

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getExternalProductId() {
		return externalProductId;
	}

	public void setExternalProductId(String externalProductId) {
		this.externalProductId = externalProductId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getApplicationCode() {
		return applicationCode;
	}

	public void setApplicationCode(String applicationCode) {
		this.applicationCode = applicationCode;
	}

	public String getAccountCategoryCode() {
		return accountCategoryCode;
	}

	public void setAccountCategoryCode(String accountCategoryCode) {
		this.accountCategoryCode = accountCategoryCode;
	}

	public String getAccountSubCategoryCode() {
		return accountSubCategoryCode;
	}

	public void setAccountSubCategoryCode(String accountSubCategoryCode) {
		this.accountSubCategoryCode = accountSubCategoryCode;
	}

	public String getTemplateName() {
		return templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
	}

	public String getResponsibleOrgId() {
		return responsibleOrgId;
	}

	public void setResponsibleOrgId(String responsibleOrgId) {
		this.responsibleOrgId = responsibleOrgId;
	}

	public boolean isOfferIndicator() {
		return offerIndicator;
	}

	public void setOfferIndicator(boolean offerIndicator) {
		this.offerIndicator = offerIndicator;
	}

	public boolean isFormsIndicator() {
		return formsIndicator;
	}

	public void setFormsIndicator(boolean formsIndicator) {
		this.formsIndicator = formsIndicator;
	}

	public String getSubClassCode() {
		return subClassCode;
	}

	public void setSubClassCode(String subClassCode) {
		this.subClassCode = subClassCode;
	}

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(String createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getLastModifiedDateTime() {
		return lastModifiedDateTime;
	}

	public void setLastModifiedDateTime(String lastModifiedDateTime) {
		this.lastModifiedDateTime = lastModifiedDateTime;
	}

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public String getPortfolioGroup() {
		return portfolioGroup;
	}

	public void setPortfolioGroup(String portfolioGroup) {
		this.portfolioGroup = portfolioGroup;
	}

	public String getPortfolioLine() {
		return portfolioLine;
	}

	public void setPortfolioLine(String portfolioLine) {
		this.portfolioLine = portfolioLine;
	}

	public String getAttributes() {
		return attributes;
	}

	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}
}
