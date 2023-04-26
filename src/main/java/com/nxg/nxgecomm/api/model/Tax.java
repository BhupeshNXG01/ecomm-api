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
 * Tax
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-26T19:45:12.001100+05:30[Asia/Calcutta]")

public class Tax   {
  @JsonProperty("taxId")
  private Integer taxId;

  @JsonProperty("taxName")
  private String taxName;

  @JsonProperty("taxRate")
  private Float taxRate;

  @JsonProperty("status")
  private String status;

  public Tax taxId(Integer taxId) {
    this.taxId = taxId;
    return this;
  }

  /**
   * Get taxId
   * @return taxId
  */
  @ApiModelProperty(value = "")


  public Integer getTaxId() {
    return taxId;
  }

  public void setTaxId(Integer taxId) {
    this.taxId = taxId;
  }

  public Tax taxName(String taxName) {
    this.taxName = taxName;
    return this;
  }

  /**
   * Get taxName
   * @return taxName
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=120) 
  public String getTaxName() {
    return taxName;
  }

  public void setTaxName(String taxName) {
    this.taxName = taxName;
  }

  public Tax taxRate(Float taxRate) {
    this.taxRate = taxRate;
    return this;
  }

  /**
   * Get taxRate
   * @return taxRate
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Float getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(Float taxRate) {
    this.taxRate = taxRate;
  }

  public Tax status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tax tax = (Tax) o;
    return Objects.equals(this.taxId, tax.taxId) &&
        Objects.equals(this.taxName, tax.taxName) &&
        Objects.equals(this.taxRate, tax.taxRate) &&
        Objects.equals(this.status, tax.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxId, taxName, taxRate, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tax {\n");
    
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
    sb.append("    taxName: ").append(toIndentedString(taxName)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

