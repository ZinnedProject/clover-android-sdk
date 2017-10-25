/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


/*
 * Copyright (C) 2016 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clover.sdk.v3.remotepay;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getExternalPaymentId externalPaymentId}</li>
 * <li>{@link #getCustomActivityId customActivityId}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class ExternalDeviceStateData extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * External Payment Id, if applicable
   */
  public java.lang.String getExternalPaymentId() {
    return genClient.cacheGet(CacheKey.externalPaymentId);
  }

  /**
   * Custom Activity Id, if applicable
   */
  public java.lang.String getCustomActivityId() {
    return genClient.cacheGet(CacheKey.customActivityId);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<ExternalDeviceStateData> {
    externalPaymentId {
      @Override
      public Object extractValue(ExternalDeviceStateData instance) {
        return instance.genClient.extractOther("externalPaymentId", java.lang.String.class);
      }
    },
    customActivityId {
      @Override
      public Object extractValue(ExternalDeviceStateData instance) {
        return instance.genClient.extractOther("customActivityId", java.lang.String.class);
      }
    },
      ;
  }

  private GenericClient<ExternalDeviceStateData> genClient;

  /**
  * Constructs a new empty instance.
  */
  public ExternalDeviceStateData() {
    genClient = new GenericClient<ExternalDeviceStateData>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
  * Constructs a new empty instance.
  */
  protected ExternalDeviceStateData(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public ExternalDeviceStateData(String json) throws IllegalArgumentException {
    this();
    try {
      genClient.setJsonObject(new org.json.JSONObject(json));
    } catch (org.json.JSONException e) {
      throw new IllegalArgumentException("invalid json", e);
    }
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public ExternalDeviceStateData(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public ExternalDeviceStateData(ExternalDeviceStateData src) {
    this();
    if (src.genClient.getJsonObject() != null) {
      genClient.setJsonObject(com.clover.sdk.v3.JsonHelper.deepCopy(src.genClient.getJSONObject()));
    }
  }

  /**
   * Returns the internal JSONObject backing this instance, the return value is not a copy so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public org.json.JSONObject getJSONObject() {
    return genClient.getJSONObject();
  }

  @Override
  public void validate() {
  }

  /** Checks whether the 'externalPaymentId' field is set and is not null */
  public boolean isNotNullExternalPaymentId() {
    return genClient.cacheValueIsNotNull(CacheKey.externalPaymentId);
  }

  /** Checks whether the 'customActivityId' field is set and is not null */
  public boolean isNotNullCustomActivityId() {
    return genClient.cacheValueIsNotNull(CacheKey.customActivityId);
  }



  /** Checks whether the 'externalPaymentId' field has been set, however the value could be null */
  public boolean hasExternalPaymentId() {
    return genClient.cacheHasKey(CacheKey.externalPaymentId);
  }

  /** Checks whether the 'customActivityId' field has been set, however the value could be null */
  public boolean hasCustomActivityId() {
    return genClient.cacheHasKey(CacheKey.customActivityId);
  }


  /**
   * Sets the field 'externalPaymentId'.
   */
  public ExternalDeviceStateData setExternalPaymentId(java.lang.String externalPaymentId) {
    return genClient.setOther(externalPaymentId, CacheKey.externalPaymentId);
  }

  /**
   * Sets the field 'customActivityId'.
   */
  public ExternalDeviceStateData setCustomActivityId(java.lang.String customActivityId) {
    return genClient.setOther(customActivityId, CacheKey.customActivityId);
  }


  /** Clears the 'externalPaymentId' field, the 'has' method for this field will now return false */
  public void clearExternalPaymentId() {
    genClient.clear(CacheKey.externalPaymentId);
  }
  /** Clears the 'customActivityId' field, the 'has' method for this field will now return false */
  public void clearCustomActivityId() {
    genClient.clear(CacheKey.customActivityId);
  }


  /**
   * Returns true if this instance has any changes.
   */
  public boolean containsChanges() {
    return genClient.containsChanges();
  }

  /**
   * Reset the log of changes made to this instance, calling copyChanges() after this would return an empty instance.
   */
  public void resetChangeLog() {
    genClient.resetChangeLog();
  }

  /**
   * Create a copy of this instance that contains only fields that were set after the constructor was called.
   */
  public ExternalDeviceStateData copyChanges() {
    ExternalDeviceStateData copy = new ExternalDeviceStateData();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(ExternalDeviceStateData src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new ExternalDeviceStateData(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<ExternalDeviceStateData> CREATOR = new android.os.Parcelable.Creator<ExternalDeviceStateData>() {
    @Override
    public ExternalDeviceStateData createFromParcel(android.os.Parcel in) {
      ExternalDeviceStateData instance = new ExternalDeviceStateData(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public ExternalDeviceStateData[] newArray(int size) {
      return new ExternalDeviceStateData[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<ExternalDeviceStateData> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<ExternalDeviceStateData>() {
    @Override
    public ExternalDeviceStateData create(org.json.JSONObject jsonObject) {
      return new ExternalDeviceStateData(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean EXTERNALPAYMENTID_IS_REQUIRED = false;
    public static final boolean CUSTOMACTIVITYID_IS_REQUIRED = false;

  }

}
