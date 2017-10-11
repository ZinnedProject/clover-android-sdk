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

package com.clover.sdk.v3.remotemessage;

import com.clover.sdk.GenericClient;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getExternalPrintJobId externalPrintJobId}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class PrintJobStatusRequestMessage extends com.clover.sdk.v3.remotemessage.Message {

  /**
   * External print job ID to retrieve status for
   */
  public java.lang.String getExternalPrintJobId() {
    return genClient.cacheGet(CacheKey.externalPrintJobId);
  }

  /**
   * The list of message types
   */
  @Override
  public com.clover.sdk.v3.remotemessage.Method getMethod() {
    return genClient.cacheGet(CacheKey.method);
  }

  /**
   * The version of this message
   */
  @Override
  public java.lang.Integer getVersion() {
    return genClient.cacheGet(CacheKey.version);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<PrintJobStatusRequestMessage> {
    externalPrintJobId {
      @Override
      public Object extractValue(PrintJobStatusRequestMessage instance) {
        return instance.genClient.extractOther("externalPrintJobId", java.lang.String.class);
      }
    },
    method {
      @Override
      public Object extractValue(PrintJobStatusRequestMessage instance) {
        return instance.genClient.extractEnum("method", com.clover.sdk.v3.remotemessage.Method.class);
      }
    },
    version {
      @Override
      public Object extractValue(PrintJobStatusRequestMessage instance) {
        return instance.genClient.extractOther("version", java.lang.Integer.class);
      }
    },
      ;
  }

  private GenericClient<PrintJobStatusRequestMessage> genClient;

  /**
  * Constructs a new empty instance.
  */
  public PrintJobStatusRequestMessage() {
    super(false);
    genClient = new GenericClient<PrintJobStatusRequestMessage>(this);
    this.setMethod(com.clover.sdk.v3.remotemessage.Method.PRINT_JOB_STATUS_REQUEST);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
  * Constructs a new empty instance.
  */
  protected PrintJobStatusRequestMessage(boolean noInit) {
    super(false);
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public PrintJobStatusRequestMessage(String json) throws IllegalArgumentException {
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
  public PrintJobStatusRequestMessage(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public PrintJobStatusRequestMessage(PrintJobStatusRequestMessage src) {
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

  /** Checks whether the 'externalPrintJobId' field is set and is not null */
  public boolean isNotNullExternalPrintJobId() {
    return genClient.cacheValueIsNotNull(CacheKey.externalPrintJobId);
  }

  /** Checks whether the 'method' field is set and is not null */
  @Override
  public boolean isNotNullMethod() {
    return genClient.cacheValueIsNotNull(CacheKey.method);
  }

  /** Checks whether the 'version' field is set and is not null */
  @Override
  public boolean isNotNullVersion() {
    return genClient.cacheValueIsNotNull(CacheKey.version);
  }



  /** Checks whether the 'externalPrintJobId' field has been set, however the value could be null */
  public boolean hasExternalPrintJobId() {
    return genClient.cacheHasKey(CacheKey.externalPrintJobId);
  }

  /** Checks whether the 'method' field has been set, however the value could be null */
  @Override
  public boolean hasMethod() {
    return genClient.cacheHasKey(CacheKey.method);
  }

  /** Checks whether the 'version' field has been set, however the value could be null */
  @Override
  public boolean hasVersion() {
    return genClient.cacheHasKey(CacheKey.version);
  }


  /**
   * Sets the field 'externalPrintJobId'.
   */
  public PrintJobStatusRequestMessage setExternalPrintJobId(java.lang.String externalPrintJobId) {
    return genClient.setOther(externalPrintJobId, CacheKey.externalPrintJobId);
  }

  /**
   * Sets the field 'method'.
   */
  @Override
  public Message setMethod(com.clover.sdk.v3.remotemessage.Method method) {
    return genClient.setOther(method, CacheKey.method);
  }

  /**
   * Sets the field 'version'.
   */
  @Override
  public Message setVersion(java.lang.Integer version) {
    return genClient.setOther(version, CacheKey.version);
  }


  /** Clears the 'externalPrintJobId' field, the 'has' method for this field will now return false */
  public void clearExternalPrintJobId() {
    genClient.clear(CacheKey.externalPrintJobId);
  }
  /** Clears the 'method' field, the 'has' method for this field will now return false */
  @Override
  public void clearMethod() {
    genClient.clear(CacheKey.method);
  }
  /** Clears the 'version' field, the 'has' method for this field will now return false */
  @Override
  public void clearVersion() {
    genClient.clear(CacheKey.version);
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
  public PrintJobStatusRequestMessage copyChanges() {
    PrintJobStatusRequestMessage copy = new PrintJobStatusRequestMessage();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(PrintJobStatusRequestMessage src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new PrintJobStatusRequestMessage(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<PrintJobStatusRequestMessage> CREATOR = new android.os.Parcelable.Creator<PrintJobStatusRequestMessage>() {
    @Override
    public PrintJobStatusRequestMessage createFromParcel(android.os.Parcel in) {
      PrintJobStatusRequestMessage instance = new PrintJobStatusRequestMessage(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public PrintJobStatusRequestMessage[] newArray(int size) {
      return new PrintJobStatusRequestMessage[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<PrintJobStatusRequestMessage> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<PrintJobStatusRequestMessage>() {
    @Override
    public PrintJobStatusRequestMessage create(org.json.JSONObject jsonObject) {
      return new PrintJobStatusRequestMessage(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean EXTERNALPRINTJOBID_IS_REQUIRED = false;
    public static final boolean METHOD_IS_REQUIRED = false;
    public static final boolean VERSION_IS_REQUIRED = false;

  }

}
