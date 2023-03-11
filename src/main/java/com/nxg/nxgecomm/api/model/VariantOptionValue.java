package com.nxg.nxgecomm.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * VariantOptionValue
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-11T18:40:56.382042300+05:30[Asia/Calcutta]")

public class VariantOptionValue   {
  @JsonProperty("variantOptionValueId")
  private Integer variantOptionValueId;

  @JsonProperty("variantOptionId")
  private Integer variantOptionId;

  @JsonProperty("optionValue")
  private String optionValue;

  public VariantOptionValue variantOptionValueId(Integer variantOptionValueId) {
    this.variantOptionValueId = variantOptionValueId;
    return this;
  }

  /**
   * Get variantOptionValueId
   * @return variantOptionValueId
  */
  @ApiModelProperty(value = "")

@Size(max=11) 
  public Integer getVariantOptionValueId() {
    return variantOptionValueId;
  }

  public void setVariantOptionValueId(Integer variantOptionValueId) {
    this.variantOptionValueId = variantOptionValueId;
  }

  public VariantOptionValue variantOptionId(Integer variantOptionId) {
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

  public VariantOptionValue optionValue(String optionValue) {
    this.optionValue = optionValue;
    return this;
  }

  /**
   * Get optionValue
   * @return optionValue
  */
  @ApiModelProperty(value = "")

@Size(max=25) 
  public String getOptionValue() {
    return optionValue;
  }

  public void setOptionValue(String optionValue) {
    this.optionValue = optionValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VariantOptionValue variantOptionValue = (VariantOptionValue) o;
    return Objects.equals(this.variantOptionValueId, variantOptionValue.variantOptionValueId) &&
        Objects.equals(this.variantOptionId, variantOptionValue.variantOptionId) &&
        Objects.equals(this.optionValue, variantOptionValue.optionValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(variantOptionValueId, variantOptionId, optionValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariantOptionValue {\n");
    
    sb.append("    variantOptionValueId: ").append(toIndentedString(variantOptionValueId)).append("\n");
    sb.append("    variantOptionId: ").append(toIndentedString(variantOptionId)).append("\n");
    sb.append("    optionValue: ").append(toIndentedString(optionValue)).append("\n");
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

