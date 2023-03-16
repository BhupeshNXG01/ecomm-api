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
 * Categories
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-16T13:10:42.607566100+05:30[Asia/Calcutta]")

public class Categories   {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("position")
  private Integer position;

  @JsonProperty("image")
  private String image;

  @JsonProperty("categoryHandel")
  private String categoryHandel;

  public Categories id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")

@Size(max=11) 
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Categories name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=200) 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Categories position(Integer position) {
    this.position = position;
    return this;
  }

  /**
   * Get position
   * @return position
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=4) 
  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  public Categories image(String image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public Categories categoryHandel(String categoryHandel) {
    this.categoryHandel = categoryHandel;
    return this;
  }

  /**
   * Get categoryHandel
   * @return categoryHandel
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

@Size(max=200) 
  public String getCategoryHandel() {
    return categoryHandel;
  }

  public void setCategoryHandel(String categoryHandel) {
    this.categoryHandel = categoryHandel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Categories categories = (Categories) o;
    return Objects.equals(this.id, categories.id) &&
        Objects.equals(this.name, categories.name) &&
        Objects.equals(this.position, categories.position) &&
        Objects.equals(this.image, categories.image) &&
        Objects.equals(this.categoryHandel, categories.categoryHandel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, position, image, categoryHandel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Categories {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    categoryHandel: ").append(toIndentedString(categoryHandel)).append("\n");
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

