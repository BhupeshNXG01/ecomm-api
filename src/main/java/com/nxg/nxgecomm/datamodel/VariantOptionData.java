package com.nxg.nxgecomm.datamodel;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "product_variant")
public class VariantOptionData implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "variant_option_id")
	private int variantOptionId;
	
	@Column(name = "option_name")
	private String optionName;
	
	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "status")
	private int status;	
	
	public int getVariantOptionId() {
		return variantOptionId;
	}

	public void setVariantOptionId(int variantOptionId) {
		this.variantOptionId = variantOptionId;
	}

	public String getOptionName() {
		return optionName;
	}

	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
}
