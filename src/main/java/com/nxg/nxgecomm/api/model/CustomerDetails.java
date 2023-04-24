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
 * CustomerDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-24T14:14:37.533751100+05:30[Asia/Calcutta]")

public class CustomerDetails   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("email")
  private String email;

  @JsonProperty("mobile")
  private String mobile;

  @JsonProperty("password")
  private String password;

  @JsonProperty("currencyId")
  private Integer currencyId;

  @JsonProperty("isGuest")
  private Integer isGuest;

  public CustomerDetails id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=11) 
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public CustomerDetails name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=120) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CustomerDetails email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=250) 
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CustomerDetails mobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

  /**
   * Get mobile
   * @return mobile
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=10) 
  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public CustomerDetails password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
  */
  @ApiModelProperty(value = "")

@Size(max=120) 
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public CustomerDetails currencyId(Integer currencyId) {
    this.currencyId = currencyId;
    return this;
  }

  /**
   * Get currencyId
   * @return currencyId
  */
  @ApiModelProperty(value = "")

@Size(max=11) 
  public Integer getCurrencyId() {
    return currencyId;
  }

  public void setCurrencyId(Integer currencyId) {
    this.currencyId = currencyId;
  }

  public CustomerDetails isGuest(Integer isGuest) {
    this.isGuest = isGuest;
    return this;
  }

  /**
   * Get isGuest
   * @return isGuest
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=1) 
  public Integer getIsGuest() {
    return isGuest;
  }

  public void setIsGuest(Integer isGuest) {
    this.isGuest = isGuest;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerDetails customerDetails = (CustomerDetails) o;
    return Objects.equals(this.id, customerDetails.id) &&
        Objects.equals(this.name, customerDetails.name) &&
        Objects.equals(this.email, customerDetails.email) &&
        Objects.equals(this.mobile, customerDetails.mobile) &&
        Objects.equals(this.password, customerDetails.password) &&
        Objects.equals(this.currencyId, customerDetails.currencyId) &&
        Objects.equals(this.isGuest, customerDetails.isGuest);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, email, mobile, password, currencyId, isGuest);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerDetails {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    isGuest: ").append(toIndentedString(isGuest)).append("\n");
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

