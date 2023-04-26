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
 * Seo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-26T19:45:12.001100+05:30[Asia/Calcutta]")

public class Seo   {
  @JsonProperty("seoTitle")
  private String seoTitle;

  @JsonProperty("metaDescription")
  private String metaDescription;

  @JsonProperty("searchTerms")
  private String searchTerms;

  @JsonProperty("status")
  private String status;

  public Seo seoTitle(String seoTitle) {
    this.seoTitle = seoTitle;
    return this;
  }

  /**
   * Get seoTitle
   * @return seoTitle
  */
  @ApiModelProperty(value = "")


  public String getSeoTitle() {
    return seoTitle;
  }

  public void setSeoTitle(String seoTitle) {
    this.seoTitle = seoTitle;
  }

  public Seo metaDescription(String metaDescription) {
    this.metaDescription = metaDescription;
    return this;
  }

  /**
   * Get metaDescription
   * @return metaDescription
  */
  @ApiModelProperty(value = "")


  public String getMetaDescription() {
    return metaDescription;
  }

  public void setMetaDescription(String metaDescription) {
    this.metaDescription = metaDescription;
  }

  public Seo searchTerms(String searchTerms) {
    this.searchTerms = searchTerms;
    return this;
  }

  /**
   * Get searchTerms
   * @return searchTerms
  */
  @ApiModelProperty(value = "")

@Size(max=250) 
  public String getSearchTerms() {
    return searchTerms;
  }

  public void setSearchTerms(String searchTerms) {
    this.searchTerms = searchTerms;
  }

  public Seo status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")

@Size(max=8) 
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
    Seo seo = (Seo) o;
    return Objects.equals(this.seoTitle, seo.seoTitle) &&
        Objects.equals(this.metaDescription, seo.metaDescription) &&
        Objects.equals(this.searchTerms, seo.searchTerms) &&
        Objects.equals(this.status, seo.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seoTitle, metaDescription, searchTerms, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Seo {\n");
    
    sb.append("    seoTitle: ").append(toIndentedString(seoTitle)).append("\n");
    sb.append("    metaDescription: ").append(toIndentedString(metaDescription)).append("\n");
    sb.append("    searchTerms: ").append(toIndentedString(searchTerms)).append("\n");
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

