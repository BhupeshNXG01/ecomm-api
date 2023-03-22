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
 * UserRes
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-22T16:03:43.394567700+05:30[Asia/Calcutta]")

public class UserRes   {
  @JsonProperty("user_id")
  private Integer userId;

  @JsonProperty("seller_id")
  private Integer sellerId;

  @JsonProperty("email")
  private String email;

  @JsonProperty("username")
  private String username;

  @JsonProperty("mobile")
  private Integer mobile;

  @JsonProperty("seller_password")
  private String sellerPassword;

  public UserRes userId(Integer userId) {
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

  public UserRes sellerId(Integer sellerId) {
    this.sellerId = sellerId;
    return this;
  }

  /**
   * Get sellerId
   * @return sellerId
  */
  @ApiModelProperty(value = "")

@Size(max=11) 
  public Integer getSellerId() {
    return sellerId;
  }

  public void setSellerId(Integer sellerId) {
    this.sellerId = sellerId;
  }

  public UserRes email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  @ApiModelProperty(value = "")

@Size(max=200) 
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserRes username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
  */
  @ApiModelProperty(value = "")

@Size(max=100) 
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public UserRes mobile(Integer mobile) {
    this.mobile = mobile;
    return this;
  }

  /**
   * Get mobile
   * @return mobile
  */
  @ApiModelProperty(value = "")

@Size(max=10) 
  public Integer getMobile() {
    return mobile;
  }

  public void setMobile(Integer mobile) {
    this.mobile = mobile;
  }

  public UserRes sellerPassword(String sellerPassword) {
    this.sellerPassword = sellerPassword;
    return this;
  }

  /**
   * Get sellerPassword
   * @return sellerPassword
  */
  @ApiModelProperty(value = "")

@Size(max=200) 
  public String getSellerPassword() {
    return sellerPassword;
  }

  public void setSellerPassword(String sellerPassword) {
    this.sellerPassword = sellerPassword;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserRes userRes = (UserRes) o;
    return Objects.equals(this.userId, userRes.userId) &&
        Objects.equals(this.sellerId, userRes.sellerId) &&
        Objects.equals(this.email, userRes.email) &&
        Objects.equals(this.username, userRes.username) &&
        Objects.equals(this.mobile, userRes.mobile) &&
        Objects.equals(this.sellerPassword, userRes.sellerPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, sellerId, email, username, mobile, sellerPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserRes {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    sellerId: ").append(toIndentedString(sellerId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    sellerPassword: ").append(toIndentedString(sellerPassword)).append("\n");
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

