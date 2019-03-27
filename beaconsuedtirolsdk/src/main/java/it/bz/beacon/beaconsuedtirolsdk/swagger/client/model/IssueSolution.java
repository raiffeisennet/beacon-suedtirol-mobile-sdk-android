/*
 * Beacon Suedtirol API TEST
 * The API for the Beacon Suedtirol project for configuring beacons and accessing beacon data.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package it.bz.beacon.beaconsuedtirolsdk.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * IssueSolution
 */

public class IssueSolution {
  @SerializedName("resolver")
  private String resolver = null;

  @SerializedName("solution")
  private String solution = null;

  @SerializedName("solutionDescription")
  private String solutionDescription = null;

  public IssueSolution resolver(String resolver) {
    this.resolver = resolver;
    return this;
  }

   /**
   * Get resolver
   * @return resolver
  **/
  @ApiModelProperty(required = true, value = "")
  public String getResolver() {
    return resolver;
  }

  public void setResolver(String resolver) {
    this.resolver = resolver;
  }

  public IssueSolution solution(String solution) {
    this.solution = solution;
    return this;
  }

   /**
   * Get solution
   * @return solution
  **/
  @ApiModelProperty(required = true, value = "")
  public String getSolution() {
    return solution;
  }

  public void setSolution(String solution) {
    this.solution = solution;
  }

  public IssueSolution solutionDescription(String solutionDescription) {
    this.solutionDescription = solutionDescription;
    return this;
  }

   /**
   * Get solutionDescription
   * @return solutionDescription
  **/
  @ApiModelProperty(value = "")
  public String getSolutionDescription() {
    return solutionDescription;
  }

  public void setSolutionDescription(String solutionDescription) {
    this.solutionDescription = solutionDescription;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueSolution issueSolution = (IssueSolution) o;
    return Objects.equals(this.resolver, issueSolution.resolver) &&
        Objects.equals(this.solution, issueSolution.solution) &&
        Objects.equals(this.solutionDescription, issueSolution.solutionDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resolver, solution, solutionDescription);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueSolution {\n");
    
    sb.append("    resolver: ").append(toIndentedString(resolver)).append("\n");
    sb.append("    solution: ").append(toIndentedString(solution)).append("\n");
    sb.append("    solutionDescription: ").append(toIndentedString(solutionDescription)).append("\n");
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

