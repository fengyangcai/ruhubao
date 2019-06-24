package cn.crm.ruhubao.pojo.jilu;

public class PushSuccess {
    private Integer psId;

    private String psName;

    private String psGetPhone;

    public Integer getPsId() {
        return psId;
    }

    public void setPsId(Integer psId) {
        this.psId = psId;
    }

    public String getPsName() {
        return psName;
    }

    public void setPsName(String psName) {
        this.psName = psName == null ? null : psName.trim();
    }

    public String getPsGetPhone() {
        return psGetPhone;
    }

    public void setPsGetPhone(String psGetPhone) {
        this.psGetPhone = psGetPhone == null ? null : psGetPhone.trim();
    }
}