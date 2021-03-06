/*
 * Influx API Service
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.influxdb.client.domain;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * TelegrafPluginInputPrometheusConfig
 */

public class TelegrafPluginInputPrometheusConfig {
  public static final String SERIALIZED_NAME_URLS = "urls";
  @SerializedName(SERIALIZED_NAME_URLS)
  private List<String> urls = new ArrayList<>();

  public TelegrafPluginInputPrometheusConfig urls(List<String> urls) {
    this.urls = urls;
    return this;
  }

  public TelegrafPluginInputPrometheusConfig addUrlsItem(String urlsItem) {
    if (this.urls == null) {
      this.urls = new ArrayList<>();
    }
    this.urls.add(urlsItem);
    return this;
  }

   /**
   * Get urls
   * @return urls
  **/
  @ApiModelProperty(value = "")
  public List<String> getUrls() {
    return urls;
  }

  public void setUrls(List<String> urls) {
    this.urls = urls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TelegrafPluginInputPrometheusConfig telegrafPluginInputPrometheusConfig = (TelegrafPluginInputPrometheusConfig) o;
    return Objects.equals(this.urls, telegrafPluginInputPrometheusConfig.urls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urls);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelegrafPluginInputPrometheusConfig {\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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

