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

package com.clover.sdk.v3.custom;

import com.clover.sdk.GenericClient;
import com.clover.sdk.GenericParcelable;

/**
 * This is an auto-generated Clover data object.
 * <p>
 * <h3>Fields</h3>
 * <ul>
 * <li>{@link #getAction action}</li>
 * <li>{@link #getCategories categories}</li>
 * </ul>
 */
@SuppressWarnings("all")
public class CustomActivity extends GenericParcelable implements com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {

  /**
   * Action for the custom activity
   */
  public java.lang.String getAction() {
    return genClient.cacheGet(CacheKey.action);
  }

  /**
   * List of categories for the specified action.
   */
  public java.util.List<java.lang.String> getCategories() {
    return genClient.cacheGet(CacheKey.categories);
  }




  private enum CacheKey implements com.clover.sdk.ValueExtractorEnum<CustomActivity> {
    action {
      @Override
      public Object extractValue(CustomActivity instance) {
        return instance.genClient.extractOther("action", java.lang.String.class);
      }
    },
    categories {
      @Override
      public Object extractValue(CustomActivity instance) {
        return instance.genClient.extractListOther("categories", java.lang.String.class);
      }
    },
      ;
  }

  private GenericClient<CustomActivity> genClient;

  /**
  * Constructs a new empty instance.
  */
  public CustomActivity() {
    genClient = new GenericClient<CustomActivity>(this);
  }

  @Override
  protected GenericClient getGenericClient() {
    return genClient;
  }

  /**
  * Constructs a new empty instance.
  */
  protected CustomActivity(boolean noInit) {
    genClient = null;
  }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public CustomActivity(String json) throws IllegalArgumentException {
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
  public CustomActivity(org.json.JSONObject jsonObject) {
    this();
    genClient.setJsonObject(jsonObject);
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public CustomActivity(CustomActivity src) {
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

  /** Checks whether the 'action' field is set and is not null */
  public boolean isNotNullAction() {
    return genClient.cacheValueIsNotNull(CacheKey.action);
  }

  /** Checks whether the 'categories' field is set and is not null */
  public boolean isNotNullCategories() {
    return genClient.cacheValueIsNotNull(CacheKey.categories);
  }

  /** Checks whether the 'categories' field is set and is not null and is not empty */
  public boolean isNotEmptyCategories() { return isNotNullCategories() && !getCategories().isEmpty(); }



  /** Checks whether the 'action' field has been set, however the value could be null */
  public boolean hasAction() {
    return genClient.cacheHasKey(CacheKey.action);
  }

  /** Checks whether the 'categories' field has been set, however the value could be null */
  public boolean hasCategories() {
    return genClient.cacheHasKey(CacheKey.categories);
  }


  /**
   * Sets the field 'action'.
   */
  public CustomActivity setAction(java.lang.String action) {
    return genClient.setOther(action, CacheKey.action);
  }

  /**
   * Sets the field 'categories'.
   *
   * Nulls in the given List are skipped. List parameter is copied, so it will not reflect any changes, but objects inside it will.
   */
  public CustomActivity setCategories(java.util.List<java.lang.String> categories) {
    return genClient.setArrayOther(categories, CacheKey.categories);
  }


  /** Clears the 'action' field, the 'has' method for this field will now return false */
  public void clearAction() {
    genClient.clear(CacheKey.action);
  }
  /** Clears the 'categories' field, the 'has' method for this field will now return false */
  public void clearCategories() {
    genClient.clear(CacheKey.categories);
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
  public CustomActivity copyChanges() {
    CustomActivity copy = new CustomActivity();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(CustomActivity src) {
    if (src.genClient.getChangeLog() != null) {
      genClient.mergeChanges(new CustomActivity(src).getJSONObject(), src.genClient);
    }
  }

  public static final android.os.Parcelable.Creator<CustomActivity> CREATOR = new android.os.Parcelable.Creator<CustomActivity>() {
    @Override
    public CustomActivity createFromParcel(android.os.Parcel in) {
      CustomActivity instance = new CustomActivity(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.genClient.setBundle(in.readBundle(getClass().getClassLoader()));
      instance.genClient.setChangeLog(in.readBundle());
      return instance;
    }

    @Override
    public CustomActivity[] newArray(int size) {
      return new CustomActivity[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<CustomActivity> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<CustomActivity>() {
    @Override
    public CustomActivity create(org.json.JSONObject jsonObject) {
      return new CustomActivity(jsonObject);
    }
  };

  public interface Constraints {

    public static final boolean ACTION_IS_REQUIRED = false;
    public static final boolean CATEGORIES_IS_REQUIRED = false;

  }

}
