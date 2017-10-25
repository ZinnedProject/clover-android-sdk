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
 * <li>{@link #getState state}</li>
 * <li>{@link #getData data}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class RetrieveDeviceStatusResponse extends com.clover.sdk.v3.remotepay.BaseResponse {

  /**
   * High level state of the connected device.
   */
  public com.clover.sdk.v3.remotepay.ExternalDeviceState getState() {
    return genClient.cacheGet(CacheKey.state);
  }

  /**
   * Additional data elements supplementing the state of the connected device.
   */
  public com.clover.sdk.v3.remotepay.ExternalDeviceStateData getData() {
    return genClient.cacheGet(CacheKey.data);
  }

  /**
   * If true then the requested operation succeeded
   */
  @Override
  public java.lang.Boolean getSuccess() {
    return genClient.cacheGet(CacheKey.success);
  }

  /**
   * The result of the requested operation.
   */
  @Override
  public com.clover.sdk.v3.remotepay.ResponseCode getResult() {
    return genClient.cacheGet(CacheKey.result);
  }

  /**
   * Optional information about result.
   */
  @Override
  public java.lang.String getReason() {
    return genClient.cacheGet(CacheKey.reason);
  }

  /**
   * Detailed information about result.
   */
  @Override
  public java.lang.String getMessage() {
    return genClient.cacheGet(CacheKey.message);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<RetrieveDeviceStatusResponse> {
    state {
      @Override
      public Object extractValue(RetrieveDeviceStatusResponse instance) {
        return instance.genClient.extractEnum("state", com.clover.sdk.v3.remotepay.ExternalDeviceState.class);
      }
    },
    data {
      @Override
      public Object extractValue(RetrieveDeviceStatusResponse instance) {
        return instance.genClient.extractRecord("data", com.clover.sdk.v3.remotepay.ExternalDeviceStateData.JSON_CREATOR);
      }
    },
    success {
      @Override
      public Object extractValue(RetrieveDeviceStatusResponse instance) {
        return instance.genClient.extractOther("success", java.lang.Boolean.class);
      }
    },
    result {
      @Override
      public Object extractValue(RetrieveDeviceStatusResponse instance) {
        return instance.genClient.extractEnum("result", com.clover.sdk.v3.remotepay.ResponseCode.class);
      }
    },
    reason {
      @Override
      public Object extractValue(RetrieveDeviceStatusResponse instance) {
        return instance.genClient.extractOther("reason", java.lang.String.class);
      }
    },
    message {
      @Override
      public Object extractValue(RetrieveDeviceStatusResponse instance) {
        return instance.genClient.extractOther("message", java.lang.String.class);
      }
    },
      ;
  }

  private GenericClient<RetrieveDeviceStatusResponse> genClient;

  /**
  * Constructs a new empty instance.
  */
  public RetrieveDeviceStatusResponse() {
    super(false);
    genClient = new GenericClient<RetrieveDeviceStatusResponse>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
  * Constructs a new empty instance.
  */
  protected RetrieveDeviceStatusResponse(boolean noInit) {
    super(false);
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public RetrieveDeviceStatusResponse(String json) throws IllegalArgumentException {
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
  public RetrieveDeviceStatusResponse(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public RetrieveDeviceStatusResponse(RetrieveDeviceStatusResponse src) {
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

  /** Checks whether the 'state' field is set and is not null */
  public boolean isNotNullState() {
    return genClient.cacheValueIsNotNull(CacheKey.state);
  }

  /** Checks whether the 'data' field is set and is not null */
  public boolean isNotNullData() {
    return genClient.cacheValueIsNotNull(CacheKey.data);
  }

  /** Checks whether the 'success' field is set and is not null */
  @Override
  public boolean isNotNullSuccess() {
    return genClient.cacheValueIsNotNull(CacheKey.success);
  }

  /** Checks whether the 'result' field is set and is not null */
  @Override
  public boolean isNotNullResult() {
    return genClient.cacheValueIsNotNull(CacheKey.result);
  }

  /** Checks whether the 'reason' field is set and is not null */
  @Override
  public boolean isNotNullReason() {
    return genClient.cacheValueIsNotNull(CacheKey.reason);
  }

  /** Checks whether the 'message' field is set and is not null */
  @Override
  public boolean isNotNullMessage() {
    return genClient.cacheValueIsNotNull(CacheKey.message);
  }



  /** Checks whether the 'state' field has been set, however the value could be null */
  public boolean hasState() {
    return genClient.cacheHasKey(CacheKey.state);
  }

  /** Checks whether the 'data' field has been set, however the value could be null */
  public boolean hasData() {
    return genClient.cacheHasKey(CacheKey.data);
  }

  /** Checks whether the 'success' field has been set, however the value could be null */
  @Override
  public boolean hasSuccess() {
    return genClient.cacheHasKey(CacheKey.success);
  }

  /** Checks whether the 'result' field has been set, however the value could be null */
  @Override
  public boolean hasResult() {
    return genClient.cacheHasKey(CacheKey.result);
  }

  /** Checks whether the 'reason' field has been set, however the value could be null */
  @Override
  public boolean hasReason() {
    return genClient.cacheHasKey(CacheKey.reason);
  }

  /** Checks whether the 'message' field has been set, however the value could be null */
  @Override
  public boolean hasMessage() {
    return genClient.cacheHasKey(CacheKey.message);
  }


  /**
   * Sets the field 'state'.
   */
  public RetrieveDeviceStatusResponse setState(com.clover.sdk.v3.remotepay.ExternalDeviceState state) {
    return genClient.setOther(state, CacheKey.state);
  }

  /**
   * Sets the field 'data'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public RetrieveDeviceStatusResponse setData(com.clover.sdk.v3.remotepay.ExternalDeviceStateData data) {
    return genClient.setRecord(data, CacheKey.data);
  }

  /**
   * Sets the field 'success'.
   */
  @Override
  public BaseResponse setSuccess(java.lang.Boolean success) {
    return genClient.setOther(success, CacheKey.success);
  }

  /**
   * Sets the field 'result'.
   */
  @Override
  public BaseResponse setResult(com.clover.sdk.v3.remotepay.ResponseCode result) {
    return genClient.setOther(result, CacheKey.result);
  }

  /**
   * Sets the field 'reason'.
   */
  @Override
  public BaseResponse setReason(java.lang.String reason) {
    return genClient.setOther(reason, CacheKey.reason);
  }

  /**
   * Sets the field 'message'.
   */
  @Override
  public BaseResponse setMessage(java.lang.String message) {
    return genClient.setOther(message, CacheKey.message);
  }


  /** Clears the 'state' field, the 'has' method for this field will now return false */
  public void clearState() {
    genClient.clear(CacheKey.state);
  }
  /** Clears the 'data' field, the 'has' method for this field will now return false */
  public void clearData() {
    genClient.clear(CacheKey.data);
  }
  /** Clears the 'success' field, the 'has' method for this field will now return false */
  @Override
  public void clearSuccess() {
    genClient.clear(CacheKey.success);
  }
  /** Clears the 'result' field, the 'has' method for this field will now return false */
  @Override
  public void clearResult() {
    genClient.clear(CacheKey.result);
  }
  /** Clears the 'reason' field, the 'has' method for this field will now return false */
  @Override
  public void clearReason() {
    genClient.clear(CacheKey.reason);
  }
  /** Clears the 'message' field, the 'has' method for this field will now return false */
  @Override
  public void clearMessage() {
    genClient.clear(CacheKey.message);
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
  public RetrieveDeviceStatusResponse copyChanges() {
    RetrieveDeviceStatusResponse copy = new RetrieveDeviceStatusResponse();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(RetrieveDeviceStatusResponse src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new RetrieveDeviceStatusResponse(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<RetrieveDeviceStatusResponse> CREATOR = new android.os.Parcelable.Creator<RetrieveDeviceStatusResponse>() {
    @Override
    public RetrieveDeviceStatusResponse createFromParcel(android.os.Parcel in) {
      RetrieveDeviceStatusResponse instance = new RetrieveDeviceStatusResponse(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public RetrieveDeviceStatusResponse[] newArray(int size) {
      return new RetrieveDeviceStatusResponse[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<RetrieveDeviceStatusResponse> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<RetrieveDeviceStatusResponse>() {
    @Override
    public RetrieveDeviceStatusResponse create(org.json.JSONObject jsonObject) {
      return new RetrieveDeviceStatusResponse(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean STATE_IS_REQUIRED = false;
    public static final boolean DATA_IS_REQUIRED = false;
    public static final boolean SUCCESS_IS_REQUIRED = false;
    public static final boolean RESULT_IS_REQUIRED = false;
    public static final boolean REASON_IS_REQUIRED = false;
    public static final boolean MESSAGE_IS_REQUIRED = false;

  }

}
