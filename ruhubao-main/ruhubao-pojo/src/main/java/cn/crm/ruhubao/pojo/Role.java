package cn.crm.ruhubao.pojo;

/**  

* <p>Title: Role</p>  

* <p>Description: </p>  

* @author fyc 

* @date 2019年6月17日  

*/  
public class Role {
    private Integer id;

    private Integer areaId;

    private String name;

    private String keyword;

    private String description;

	public Role(Integer id, Integer areaId, String name, String keyword, String description) {
		super();
		this.id = id;
		this.areaId = areaId;
		this.name = name;
		this.keyword = keyword;
		this.description = description;
	}

	public Role() {
		super();
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", areaId=" + areaId + ", name=" + name + ", keyword=" + keyword + ", description="
				+ description + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAreaId() {
		return areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
    
  
   
}