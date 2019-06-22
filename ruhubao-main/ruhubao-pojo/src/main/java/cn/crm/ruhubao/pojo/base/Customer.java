package cn.crm.ruhubao.pojo.base;

import java.util.Date;

public class Customer {
    private Integer id;

    private String name;

    private String telPhone;

    private String weixinQq;

    private String ageGroups;

    private String type;

    private String area;

    private String education;

    private String major;

    private String nvq;

    private String yearsSocial;

    private String ruhuReason;

    private String livePermitYears;

    private String marriage;

    private String birthControl;

    private String hasHours;

    private Integer createUserId;

    private Integer status;

    private String remark;

    private String sourceLink;

    private String fromPlatform;

    private String haveLaborContract;

    private String moveAddress;

    private Date createTime;

    private Date updateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTelPhone() {
        return telPhone;
    }

    public void setTelPhone(String telPhone) {
        this.telPhone = telPhone == null ? null : telPhone.trim();
    }

    public String getWeixinQq() {
        return weixinQq;
    }

    public void setWeixinQq(String weixinQq) {
        this.weixinQq = weixinQq == null ? null : weixinQq.trim();
    }

    public String getAgeGroups() {
        return ageGroups;
    }

    public void setAgeGroups(String ageGroups) {
        this.ageGroups = ageGroups == null ? null : ageGroups.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getNvq() {
        return nvq;
    }

    public void setNvq(String nvq) {
        this.nvq = nvq == null ? null : nvq.trim();
    }

    public String getYearsSocial() {
        return yearsSocial;
    }

    public void setYearsSocial(String yearsSocial) {
        this.yearsSocial = yearsSocial == null ? null : yearsSocial.trim();
    }

    public String getRuhuReason() {
        return ruhuReason;
    }

    public void setRuhuReason(String ruhuReason) {
        this.ruhuReason = ruhuReason == null ? null : ruhuReason.trim();
    }

    public String getLivePermitYears() {
        return livePermitYears;
    }

    public void setLivePermitYears(String livePermitYears) {
        this.livePermitYears = livePermitYears == null ? null : livePermitYears.trim();
    }

    public String getMarriage() {
        return marriage;
    }

    public void setMarriage(String marriage) {
        this.marriage = marriage == null ? null : marriage.trim();
    }

    public String getBirthControl() {
        return birthControl;
    }

    public void setBirthControl(String birthControl) {
        this.birthControl = birthControl == null ? null : birthControl.trim();
    }

    public String getHasHours() {
        return hasHours;
    }

    public void setHasHours(String hasHours) {
        this.hasHours = hasHours == null ? null : hasHours.trim();
    }

    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getSourceLink() {
        return sourceLink;
    }

    public void setSourceLink(String sourceLink) {
        this.sourceLink = sourceLink == null ? null : sourceLink.trim();
    }

    public String getFromPlatform() {
        return fromPlatform;
    }

    public void setFromPlatform(String fromPlatform) {
        this.fromPlatform = fromPlatform == null ? null : fromPlatform.trim();
    }

    public String getHaveLaborContract() {
        return haveLaborContract;
    }

    public void setHaveLaborContract(String haveLaborContract) {
        this.haveLaborContract = haveLaborContract == null ? null : haveLaborContract.trim();
    }

    public String getMoveAddress() {
        return moveAddress;
    }

    public void setMoveAddress(String moveAddress) {
        this.moveAddress = moveAddress == null ? null : moveAddress.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

	public Customer() {
		super();
	}

	public Customer(Integer id, String name, String telPhone, String weixinQq, String ageGroups, String type,
			String area, String education, String major, String nvq, String yearsSocial, String ruhuReason,
			String livePermitYears, String marriage, String birthControl, String hasHours, Integer createUserId,
			Integer status, String remark, String sourceLink, String fromPlatform, String haveLaborContract,
			String moveAddress, Date createTime, Date updateTime) {
		super();
		this.id = id;
		this.name = name;
		this.telPhone = telPhone;
		this.weixinQq = weixinQq;
		this.ageGroups = ageGroups;
		this.type = type;
		this.area = area;
		this.education = education;
		this.major = major;
		this.nvq = nvq;
		this.yearsSocial = yearsSocial;
		this.ruhuReason = ruhuReason;
		this.livePermitYears = livePermitYears;
		this.marriage = marriage;
		this.birthControl = birthControl;
		this.hasHours = hasHours;
		this.createUserId = createUserId;
		this.status = status;
		this.remark = remark;
		this.sourceLink = sourceLink;
		this.fromPlatform = fromPlatform;
		this.haveLaborContract = haveLaborContract;
		this.moveAddress = moveAddress;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", telPhone=" + telPhone + ", weixinQq=" + weixinQq
				+ ", ageGroups=" + ageGroups + ", type=" + type + ", area=" + area + ", education=" + education
				+ ", major=" + major + ", nvq=" + nvq + ", yearsSocial=" + yearsSocial + ", ruhuReason=" + ruhuReason
				+ ", livePermitYears=" + livePermitYears + ", marriage=" + marriage + ", birthControl=" + birthControl
				+ ", hasHours=" + hasHours + ", createUserId=" + createUserId + ", status=" + status + ", remark="
				+ remark + ", sourceLink=" + sourceLink + ", fromPlatform=" + fromPlatform + ", haveLaborContract="
				+ haveLaborContract + ", moveAddress=" + moveAddress + ", createTime=" + createTime + ", updateTime="
				+ updateTime + "]";
	}
    
}