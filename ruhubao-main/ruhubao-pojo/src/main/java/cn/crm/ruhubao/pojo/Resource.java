package cn.crm.ruhubao.pojo;

public class Resource {
    private Integer id;

    private String name;

    private String grantKey;

    private String page;

    private Integer sqe;

    private String resourceType;

    private String icon;

    private Integer pid;

    private Integer open;

	public Resource() {
		super();
	}

	public Resource(Integer id, String name, String grantKey, String page, Integer sqe, String resourceType,
			String icon, Integer pid, Integer open) {
		super();
		this.id = id;
		this.name = name;
		this.grantKey = grantKey;
		this.page = page;
		this.sqe = sqe;
		this.resourceType = resourceType;
		this.icon = icon;
		this.pid = pid;
		this.open = open;
	}

	@Override
	public String toString() {
		return "Resource [id=" + id + ", name=" + name + ", grantKey=" + grantKey + ", page=" + page + ", sqe=" + sqe
				+ ", resourceType=" + resourceType + ", icon=" + icon + ", pid=" + pid + ", open=" + open + "]";
	}

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
		this.name = name;
	}

	public String getGrantKey() {
		return grantKey;
	}

	public void setGrantKey(String grantKey) {
		this.grantKey = grantKey;
	}

	public String getPage() {
		return page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public Integer getSqe() {
		return sqe;
	}

	public void setSqe(Integer sqe) {
		this.sqe = sqe;
	}

	public String getResourceType() {
		return resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Integer getOpen() {
		return open;
	}

	public void setOpen(Integer open) {
		this.open = open;
	}
    
    
   
}