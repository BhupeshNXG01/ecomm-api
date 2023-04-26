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
 * ProductsSeo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-04-26T13:46:54.439309700+05:30[Asia/Calcutta]")

public class ProductsSeo   {
  @JsonProperty("seoTitle")
  private String seoTitle;

  @JsonProperty("metaDescription")
  private String metaDescription;

  @JsonProperty("searchTerms")
  private String searchTerms;

  public ProductsSeo seoTitle(String seoTitle) {
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

  public ProductsSeo metaDescription(String metaDescription) {
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

  public ProductsSeo searchTerms(String searchTerms) {
    this.searchTerms = searchTerms;
    return this;
  }

  /**
   * Get searchTerms
   * @return searchTerms
  */
  @ApiModelProperty(value = "")


  public String getSearchTerms() {
    return searchTerms;
  }

  public void setSearchTerms(String searchTerms) {
    this.searchTerms = searchTerms;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductsSeo productsSeo = (ProductsSeo) o;
    return Objects.equals(this.seoTitle, productsSeo.seoTitle) &&
        Objects.equals(this.metaDescription, productsSeo.metaDescription) &&
        Objects.equals(this.searchTerms, productsSeo.searchTerms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seoTitle, metaDescription, searchTerms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductsSeo {\n");
    
    sb.append("    seoTitle: ").append(toIndentedString(seoTitle)).append("\n");
    sb.append("    metaDescription: ").append(toIndentedString(metaDescription)).append("\n");
    sb.append("    searchTerms: ").append(toIndentedString(searchTerms)).append("\n");
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

