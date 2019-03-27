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
import it.bz.beacon.beaconsuedtirolsdk.swagger.client.model.BeaconOrderData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * BeaconOrder
 */

public class BeaconOrder {
  @SerializedName("beacons")
  private List<BeaconOrderData> beacons = null;

  @SerializedName("orderSymbol")
  private String orderSymbol = null;

  public BeaconOrder beacons(List<BeaconOrderData> beacons) {
    this.beacons = beacons;
    return this;
  }

  public BeaconOrder addBeaconsItem(BeaconOrderData beaconsItem) {
    if (this.beacons == null) {
      this.beacons = new ArrayList<BeaconOrderData>();
    }
    this.beacons.add(beaconsItem);
    return this;
  }

   /**
   * Get beacons
   * @return beacons
  **/
  @ApiModelProperty(value = "")
  public List<BeaconOrderData> getBeacons() {
    return beacons;
  }

  public void setBeacons(List<BeaconOrderData> beacons) {
    this.beacons = beacons;
  }

  public BeaconOrder orderSymbol(String orderSymbol) {
    this.orderSymbol = orderSymbol;
    return this;
  }

   /**
   * Get orderSymbol
   * @return orderSymbol
  **/
  @ApiModelProperty(value = "")
  public String getOrderSymbol() {
    return orderSymbol;
  }

  public void setOrderSymbol(String orderSymbol) {
    this.orderSymbol = orderSymbol;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeaconOrder beaconOrder = (BeaconOrder) o;
    return Objects.equals(this.beacons, beaconOrder.beacons) &&
        Objects.equals(this.orderSymbol, beaconOrder.orderSymbol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beacons, orderSymbol);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeaconOrder {\n");
    
    sb.append("    beacons: ").append(toIndentedString(beacons)).append("\n");
    sb.append("    orderSymbol: ").append(toIndentedString(orderSymbol)).append("\n");
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

