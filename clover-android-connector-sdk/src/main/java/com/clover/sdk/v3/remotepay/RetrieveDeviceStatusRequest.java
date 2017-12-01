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

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getSendLastMessage sendLastMessage}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class RetrieveDeviceStatusRequest extends com.clover.sdk.v3.remotepay.BaseRequest {

  /**
   * Send last message, if true
   */
  public java.lang.Boolean getSendLastMessage() {
    return genClient.cacheGet(CacheKey.sendLastMessage);
  }

  /**
   * Identifier for the request
   */
  @Override
  public java.lang.String getRequestId() {
    return genClient.cacheGet(CacheKey.requestId);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<RetrieveDeviceStatusRequest> {
    sendLastMessage {
      @Override
      public Object extractValue(RetrieveDeviceStatusRequest instance) {
        return instance.genClient.extractOther("sendLastMessage", java.lang.Boolean.class);
      }
    },
    requestId {
      @Override
      public Object extractValue(RetrieveDeviceStatusRequest instance) {
        return instance.genClient.extractOther("requestId", java.lang.String.class);
      }
    },
      ;
  }

  private GenericClient<RetrieveDeviceStatusRequest> genClient;

  /**
  * Constructs a new empty instance.
  */
  public RetrieveDeviceStatusRequest() {
    super(false);
    genClient = new GenericClient<RetrieveDeviceStatusRequest>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
  * Constructs a new empty instance.
  */
  protected RetrieveDeviceStatusRequest(boolean noInit) {
    super(false);
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public RetrieveDeviceStatusRequest(String json) throws IllegalArgumentException {
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
  public RetrieveDeviceStatusRequest(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public RetrieveDeviceStatusRequest(RetrieveDeviceStatusRequest src) {
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
    genClient.validateLength(getRequestId(), 13);
  }

  /** Checks whether the 'sendLastMessage' field is set and is not null */
  public boolean isNotNullSendLastMessage() {
    return genClient.cacheValueIsNotNull(CacheKey.sendLastMessage);
  }

  /** Checks whether the 'requestId' field is set and is not null */
  @Override
  public boolean isNotNullRequestId() {
    return genClient.cacheValueIsNotNull(CacheKey.requestId);
  }



  /** Checks whether the 'sendLastMessage' field has been set, however the value could be null */
  public boolean hasSendLastMessage() {
    return genClient.cacheHasKey(CacheKey.sendLastMessage);
  }

  /** Checks whether the 'requestId' field has been set, however the value could be null */
  @Override
  public boolean hasRequestId() {
    return genClient.cacheHasKey(CacheKey.requestId);
  }


  /**
   * Sets the field 'sendLastMessage'.
   */
  public RetrieveDeviceStatusRequest setSendLastMessage(java.lang.Boolean sendLastMessage) {
    return genClient.setOther(sendLastMessage, CacheKey.sendLastMessage);
  }

  /**
   * Sets the field 'requestId'.
   */
  @Override
  public BaseRequest setRequestId(java.lang.String requestId) {
    return genClient.setOther(requestId, CacheKey.requestId);
  }


  /** Clears the 'sendLastMessage' field, the 'has' method for this field will now return false */
  public void clearSendLastMessage() {
    genClient.clear(CacheKey.sendLastMessage);
  }
  /** Clears the 'requestId' field, the 'has' method for this field will now return false */
  @Override
  public void clearRequestId() {
    genClient.clear(CacheKey.requestId);
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
  public RetrieveDeviceStatusRequest copyChanges() {
    RetrieveDeviceStatusRequest copy = new RetrieveDeviceStatusRequest();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(RetrieveDeviceStatusRequest src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new RetrieveDeviceStatusRequest(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<RetrieveDeviceStatusRequest> CREATOR = new android.os.Parcelable.Creator<RetrieveDeviceStatusRequest>() {
    @Override
    public RetrieveDeviceStatusRequest createFromParcel(android.os.Parcel in) {
      RetrieveDeviceStatusRequest instance = new RetrieveDeviceStatusRequest(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public RetrieveDeviceStatusRequest[] newArray(int size) {
      return new RetrieveDeviceStatusRequest[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<RetrieveDeviceStatusRequest> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<RetrieveDeviceStatusRequest>() {
    @Override
    public RetrieveDeviceStatusRequest create(org.json.JSONObject jsonObject) {
      return new RetrieveDeviceStatusRequest(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean SENDLASTMESSAGE_IS_REQUIRED = false;
    public static final boolean REQUESTID_IS_REQUIRED = false;
    public static final long REQUESTID_MAX_LEN = 13;

  }

}