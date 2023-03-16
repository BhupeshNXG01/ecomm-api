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
 * ProductRequestSeo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-16T13:10:42.607566100+05:30[Asia/Calcutta]")

public class ProductRequestSeo   {
  @JsonProperty("title")
  private String title;

  @JsonProperty("description")
  private String description;

  @JsonProperty("searchTerms")
  private String searchTerms;

  public ProductRequestSeo title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @ApiModelProperty(value = "")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ProductRequestSeo description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProductRequestSeo searchTerms(String searchTerms) {
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
    ProductRequestSeo productRequestSeo = (ProductRequestSeo) o;
    return Objects.equals(this.title, productRequestSeo.title) &&
        Objects.equals(this.description, productRequestSeo.description) &&
        Objects.equals(this.searchTerms, productRequestSeo.searchTerms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, searchTerms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductRequestSeo {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

