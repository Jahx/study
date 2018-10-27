package com.epam.mentoring.codegen.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Load
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-10-27T10:51:38.148+03:00")

public class Load   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("fileId")
  private Long fileId = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  @JsonProperty("shipDate")
  private DateTime shipDate = null;

  /**
   * Load Status
   */
  public enum StatusEnum {
    PLACED("placed"),
    
    APPROVED("approved"),
    
    DELIVERED("delivered");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("complete")
  private Boolean complete = false;

  public Load id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Load fileId(Long fileId) {
    this.fileId = fileId;
    return this;
  }

   /**
   * Get fileId
   * @return fileId
  **/
  @ApiModelProperty(value = "")


  public Long getFileId() {
    return fileId;
  }

  public void setFileId(Long fileId) {
    this.fileId = fileId;
  }

  public Load quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "")


  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Load shipDate(DateTime shipDate) {
    this.shipDate = shipDate;
    return this;
  }

   /**
   * Get shipDate
   * @return shipDate
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DateTime getShipDate() {
    return shipDate;
  }

  public void setShipDate(DateTime shipDate) {
    this.shipDate = shipDate;
  }

  public Load status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Load Status
   * @return status
  **/
  @ApiModelProperty(value = "Load Status")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Load complete(Boolean complete) {
    this.complete = complete;
    return this;
  }

   /**
   * Get complete
   * @return complete
  **/
  @ApiModelProperty(value = "")


  public Boolean getComplete() {
    return complete;
  }

  public void setComplete(Boolean complete) {
    this.complete = complete;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Load load = (Load) o;
    return Objects.equals(this.id, load.id) &&
        Objects.equals(this.fileId, load.fileId) &&
        Objects.equals(this.quantity, load.quantity) &&
        Objects.equals(this.shipDate, load.shipDate) &&
        Objects.equals(this.status, load.status) &&
        Objects.equals(this.complete, load.complete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fileId, quantity, shipDate, status, complete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Load {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    shipDate: ").append(toIndentedString(shipDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    complete: ").append(toIndentedString(complete)).append("\n");
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

