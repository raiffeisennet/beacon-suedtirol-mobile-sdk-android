// SPDX-FileCopyrightText: NOI Techpark <digital@noi.bz.it>
//
// SPDX-License-Identifier: AGPL-3.0-or-later

/**
 * Beacon Suedtirol API
 * The API for the Beacon Suedtirol project for configuring beacons and accessing beacon data.
 *
 * OpenAPI spec version: 0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package it.bz.beacon.beaconsuedtirolsdk.swagger.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class ResetPasswordRequest {
  
  @SerializedName("username")
  private String username = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getUsername() {
    return username;
  }
  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResetPasswordRequest resetPasswordRequest = (ResetPasswordRequest) o;
    return (this.username == null ? resetPasswordRequest.username == null : this.username.equals(resetPasswordRequest.username));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.username == null ? 0: this.username.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResetPasswordRequest {\n");
    
    sb.append("  username: ").append(username).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}