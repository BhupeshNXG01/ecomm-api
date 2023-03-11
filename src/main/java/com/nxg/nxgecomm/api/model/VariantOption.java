package com.nxg.nxgecomm.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.nxg.nxgecomm.api.model.VariantOptionValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VariantOption
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-11T18:40:56.382042300+05:30[Asia/Calcutta]")

public class VariantOption   {
  @JsonProperty("variantOptionId")
  private Integer variantOptionId;

  @JsonProperty("optionName")
  private String optionName;

  @JsonProperty("userId")
  private Integer userId;

  @JsonProperty("variantOptionValue")
  @Valid
  private List<VariantOptionValue> variantOptionValue = null;

  public VariantOption variantOptionId(Integer variantOptionId) {
    this.variantOptionId = variantOptionId;
    return this;
  }

  /**
   * Get variantOptionId
   * @return variantOptionId
  */
  @ApiModelProperty(value = "")

@Size(max=11) 
  public Integer getVariantOptionId() {
    return variantOptionId;
  }

  public void setVariantOptionId(Integer variantOptionId) {
    this.variantOptionId = variantOptionId;
  }

  public VariantOption optionName(String optionName) {
    this.optionName = optionName;
    return this;
  }

  /**
   * Get optionName
   * @return optionName
  */
  @ApiModelProperty(value = "")

@Size(max=48) 
  public String getOptionName() {
    return optionName;
  }

  public void setOptionName(String optionName) {
    this.optionName = optionName;
  }

  public VariantOption userId(Integer userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  @ApiModelProperty(value = "")

@Size(max=11) 
  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public VariantOption variantOptionValue(List<VariantOptionValue> variantOptionValue) {
    this.variantOptionValue = variantOptionValue;
    return this;
  }

  public VariantOption addVariantOptionValueItem(VariantOptionValue variantOptionValueItem) {
    if (this.variantOptionValue == null) {
      this.variantOptionValue = new ArrayList<>();
    }
    this.variantOptionValue.add(variantOptionValueItem);
    return this;
  }

  /**
   * Get variantOptionValue
   * @return variantOptionValue
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<VariantOptionValue> getVariantOptionValue() {
    return variantOptionValue;
  }

  public void setVariantOptionValue(List<VariantOptionValue> variantOptionValue) {
    this.variantOptionValue = variantOptionValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariantOption variantOption = (VariantOption) o;
    return Objects.equals(this.variantOptionId, variantOption.variantOptionId) &&
        Objects.equals(this.optionName, variantOption.optionName) &&
        Objects.equals(this.userId, variantOption.userId) &&
        Objects.equals(this.variantOptionValue, variantOption.variantOptionValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variantOptionId, optionName, userId, variantOptionValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariantOption {\n");
    
    sb.append("    variantOptionId: ").append(toIndentedString(variantOptionId)).append("\n");
    sb.append("    optionName: ").append(toIndentedString(optionName)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    variantOptionValue: ").append(toIndentedString(variantOptionValue)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

