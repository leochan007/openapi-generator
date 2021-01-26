/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.openapitools.client.JSON;


/**
 * TriangleInterface
 */
@JsonPropertyOrder({
  TriangleInterface.JSON_PROPERTY_TRIANGLE_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TriangleInterface {
  public static final String JSON_PROPERTY_TRIANGLE_TYPE = "triangleType";
  private String triangleType;


  public TriangleInterface triangleType(String triangleType) {
    this.triangleType = triangleType;
    return this;
  }

   /**
   * Get triangleType
   * @return triangleType
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TRIANGLE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTriangleType() {
    return triangleType;
  }


  public void setTriangleType(String triangleType) {
    this.triangleType = triangleType;
  }


  /**
   * Return true if this TriangleInterface object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TriangleInterface triangleInterface = (TriangleInterface) o;
    return Objects.equals(this.triangleType, triangleInterface.triangleType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(triangleType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TriangleInterface {\n");
    sb.append("    triangleType: ").append(toIndentedString(triangleType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

