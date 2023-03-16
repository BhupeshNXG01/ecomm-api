package com.nxg.nxgecomm.datamodel;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "product_variant")
public class VariantOptionValueData implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "variant_option_value_id")
	private int variantOptionValueId;
	
	@Column(name = "variant_option_id")
	private int variantOptionId;
	
	@Column(name = "option_value")
	private String optionValue;
	
	@Column(name = "status")
	private int status;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "variant_option_id")
	private VariantOptionData variantOptionData;

	
	public VariantOptionData getVariantOptionData() {
		return variantOptionData;
	}

	public void setVariantOptionData(VariantOptionData variantOptionData) {
		this.variantOptionData = variantOptionData;
	}

	public int getVariantOptionValueId() {
		return variantOptionValueId;
	}

	public void setVariantOptionValueId(int variantOptionValueId) {
		this.variantOptionValueId = variantOptionValueId;
	}

	public int getVariantOptionId() {
		return variantOptionId;
	}

	public void setVariantOptionId(int variantOptionId) {
		this.variantOptionId = variantOptionId;
	}

	public String getOptionValue() {
		return optionValue;
	}

	public void setOptionValue(String optionValue) {
		this.optionValue = optionValue;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
}
