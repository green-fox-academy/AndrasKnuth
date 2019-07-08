package com.contacts.blogsamples.modells;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Weather {
  @SerializedName("TEMPERATURE")
  private Float temperature;
  @SerializedName("TWD")
  private Float twd;
  @SerializedName("PRESSURE")
  private Float pressure;
  @SerializedName("RAIN_MONTH")
  private Float rainMonth;
  @SerializedName("TWS_GUST")
  private Float twsGust;
  @SerializedName("RAIN_DAY")
  private Float rainDay;
  @SerializedName("RAIN")
  private Float rain;
  @SerializedName("HUMIDITY")
  private Float humidity;
  @SerializedName("TWS")
  private Float tws;
  @SerializedName("TIME_STRING")
  private String timeString;
  @SerializedName("TWD_GUST")
  private Float twdGust;
  @SerializedName("TIME")
  private Long time;
  @SerializedName("LATITUDE")
  private Float latitude;
  @SerializedName("LONGITUDE")
  private Float longitude;
  @SerializedName("LOCALTIME")
  private Float localtime;
}
