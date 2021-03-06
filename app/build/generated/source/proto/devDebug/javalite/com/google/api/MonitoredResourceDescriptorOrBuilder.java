// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/monitored_resource.proto

package com.google.api;

public interface MonitoredResourceDescriptorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.MonitoredResourceDescriptor)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The monitored resource type. For example, the type `"cloudsql_database"`
   * represents databases in Google Cloud SQL.
   * </pre>
   *
   * <code>optional string type = 1;</code>
   */
  java.lang.String getType();
  /**
   * <pre>
   * The monitored resource type. For example, the type `"cloudsql_database"`
   * represents databases in Google Cloud SQL.
   * </pre>
   *
   * <code>optional string type = 1;</code>
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   * A concise name for the monitored resource type that can be displayed in
   * user interfaces. For example, `"Google Cloud SQL Database"`.
   * </pre>
   *
   * <code>optional string display_name = 2;</code>
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * A concise name for the monitored resource type that can be displayed in
   * user interfaces. For example, `"Google Cloud SQL Database"`.
   * </pre>
   *
   * <code>optional string display_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * A detailed description of the monitored resource type that can be used in
   * documentation.
   * </pre>
   *
   * <code>optional string description = 3;</code>
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * A detailed description of the monitored resource type that can be used in
   * documentation.
   * </pre>
   *
   * <code>optional string description = 3;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * A set of labels that can be used to describe instances of this monitored
   * resource type. For example, Google Cloud SQL databases can be labeled with
   * their `"database_id"` and their `"zone"`.
   * </pre>
   *
   * <code>repeated .google.api.LabelDescriptor labels = 4;</code>
   */
  java.util.List<com.google.api.LabelDescriptor> 
      getLabelsList();
  /**
   * <pre>
   * A set of labels that can be used to describe instances of this monitored
   * resource type. For example, Google Cloud SQL databases can be labeled with
   * their `"database_id"` and their `"zone"`.
   * </pre>
   *
   * <code>repeated .google.api.LabelDescriptor labels = 4;</code>
   */
  com.google.api.LabelDescriptor getLabels(int index);
  /**
   * <pre>
   * A set of labels that can be used to describe instances of this monitored
   * resource type. For example, Google Cloud SQL databases can be labeled with
   * their `"database_id"` and their `"zone"`.
   * </pre>
   *
   * <code>repeated .google.api.LabelDescriptor labels = 4;</code>
   */
  int getLabelsCount();
}
