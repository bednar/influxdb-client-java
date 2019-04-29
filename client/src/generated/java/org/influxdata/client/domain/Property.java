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


package org.influxdata.client.domain;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.influxdata.client.domain.Expression;
import org.influxdata.client.domain.PropertyKey;

/**
 * the value associated with a key
 */
@ApiModel(description = "the value associated with a key")

public class Property {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type = null;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  @JsonAdapter(PropertyKeyAdapter.class)
  private PropertyKey key = null;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  @JsonAdapter(PropertyValueAdapter.class)
  private Expression value = null;

  public Property type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Property key(PropertyKey key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @ApiModelProperty(value = "")
  public PropertyKey getKey() {
    return key;
  }

  public void setKey(PropertyKey key) {
    this.key = key;
  }

  public Property value(Expression value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public Expression getValue() {
    return value;
  }

  public void setValue(Expression value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Property property = (Property) o;
    return Objects.equals(this.type, property.type) &&
        Objects.equals(this.key, property.key) &&
        Objects.equals(this.value, property.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, key, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Property {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

  public class PropertyKeyAdapter implements JsonDeserializer<Object>, JsonSerializer<Object> {
    private final String discriminator = "type";

    public PropertyKeyAdapter() {
    }

    @Override
    public Object deserialize(final JsonElement json, final Type typeOfT, final JsonDeserializationContext context) throws JsonParseException {

      JsonObject jsonObject = json.getAsJsonObject();

      String type = jsonObject.get(discriminator).getAsString();

      return deserialize(type, jsonObject, context);
    }

    @Override
    public JsonElement serialize(Object object, Type typeOfSrc, JsonSerializationContext context) {

      return context.serialize(object);
    }

    private Object deserialize(final String type, final JsonElement json, final JsonDeserializationContext context) {

      if ("Identifier".equals(type)) {
        return context.deserialize(json, Identifier.class);
      }
      if ("StringLiteral".equals(type)) {
        return context.deserialize(json, StringLiteral.class);
      }

      return context.deserialize(json, Object.class);
    }
  }
  public class PropertyValueAdapter implements JsonDeserializer<Object>, JsonSerializer<Object> {
    private final String discriminator = "type";

    public PropertyValueAdapter() {
    }

    @Override
    public Object deserialize(final JsonElement json, final Type typeOfT, final JsonDeserializationContext context) throws JsonParseException {

      JsonObject jsonObject = json.getAsJsonObject();

      String type = jsonObject.get(discriminator).getAsString();

      return deserialize(type, jsonObject, context);
    }

    @Override
    public JsonElement serialize(Object object, Type typeOfSrc, JsonSerializationContext context) {

      return context.serialize(object);
    }

    private Object deserialize(final String type, final JsonElement json, final JsonDeserializationContext context) {

      if ("ArrayExpression".equals(type)) {
        return context.deserialize(json, ArrayExpression.class);
      }
      if ("FunctionExpression".equals(type)) {
        return context.deserialize(json, FunctionExpression.class);
      }
      if ("BinaryExpression".equals(type)) {
        return context.deserialize(json, BinaryExpression.class);
      }
      if ("CallExpression".equals(type)) {
        return context.deserialize(json, CallExpression.class);
      }
      if ("ConditionalExpression".equals(type)) {
        return context.deserialize(json, ConditionalExpression.class);
      }
      if ("LogicalExpression".equals(type)) {
        return context.deserialize(json, LogicalExpression.class);
      }
      if ("MemberExpression".equals(type)) {
        return context.deserialize(json, MemberExpression.class);
      }
      if ("IndexExpression".equals(type)) {
        return context.deserialize(json, IndexExpression.class);
      }
      if ("ObjectExpression".equals(type)) {
        return context.deserialize(json, ObjectExpression.class);
      }
      if ("PipeExpression".equals(type)) {
        return context.deserialize(json, PipeExpression.class);
      }
      if ("UnaryExpression".equals(type)) {
        return context.deserialize(json, UnaryExpression.class);
      }
      if ("BooleanLiteral".equals(type)) {
        return context.deserialize(json, BooleanLiteral.class);
      }
      if ("DateTimeLiteral".equals(type)) {
        return context.deserialize(json, DateTimeLiteral.class);
      }
      if ("DurationLiteral".equals(type)) {
        return context.deserialize(json, DurationLiteral.class);
      }
      if ("FloatLiteral".equals(type)) {
        return context.deserialize(json, FloatLiteral.class);
      }
      if ("IntegerLiteral".equals(type)) {
        return context.deserialize(json, IntegerLiteral.class);
      }
      if ("PipeLiteral".equals(type)) {
        return context.deserialize(json, PipeLiteral.class);
      }
      if ("RegexpLiteral".equals(type)) {
        return context.deserialize(json, RegexpLiteral.class);
      }
      if ("StringLiteral".equals(type)) {
        return context.deserialize(json, StringLiteral.class);
      }
      if ("UnsignedIntegerLiteral".equals(type)) {
        return context.deserialize(json, UnsignedIntegerLiteral.class);
      }
      if ("Identifier".equals(type)) {
        return context.deserialize(json, Identifier.class);
      }

      return context.deserialize(json, Object.class);
    }
  }
}
