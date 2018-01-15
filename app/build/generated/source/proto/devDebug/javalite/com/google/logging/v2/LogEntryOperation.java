// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v2/log_entry.proto

package com.google.logging.v2;

/**
 * <pre>
 * Additional information about a potentially long-running operation with which
 * a log entry is associated.
 * </pre>
 *
 * Protobuf type {@code google.logging.v2.LogEntryOperation}
 */
public  final class LogEntryOperation extends
    com.google.protobuf.GeneratedMessageLite<
        LogEntryOperation, LogEntryOperation.Builder> implements
    // @@protoc_insertion_point(message_implements:google.logging.v2.LogEntryOperation)
    LogEntryOperationOrBuilder {
  private LogEntryOperation() {
    id_ = "";
    producer_ = "";
  }
  public static final int ID_FIELD_NUMBER = 1;
  private java.lang.String id_;
  /**
   * <pre>
   * Required. An arbitrary operation identifier. Log entries with the
   * same identifier are assumed to be part of the same operation.
   * </pre>
   *
   * <code>optional string id = 1;</code>
   */
  public java.lang.String getId() {
    return id_;
  }
  /**
   * <pre>
   * Required. An arbitrary operation identifier. Log entries with the
   * same identifier are assumed to be part of the same operation.
   * </pre>
   *
   * <code>optional string id = 1;</code>
   */
  public com.google.protobuf.ByteString
      getIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(id_);
  }
  /**
   * <pre>
   * Required. An arbitrary operation identifier. Log entries with the
   * same identifier are assumed to be part of the same operation.
   * </pre>
   *
   * <code>optional string id = 1;</code>
   */
  private void setId(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    id_ = value;
  }
  /**
   * <pre>
   * Required. An arbitrary operation identifier. Log entries with the
   * same identifier are assumed to be part of the same operation.
   * </pre>
   *
   * <code>optional string id = 1;</code>
   */
  private void clearId() {
    
    id_ = getDefaultInstance().getId();
  }
  /**
   * <pre>
   * Required. An arbitrary operation identifier. Log entries with the
   * same identifier are assumed to be part of the same operation.
   * </pre>
   *
   * <code>optional string id = 1;</code>
   */
  private void setIdBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    id_ = value.toStringUtf8();
  }

  public static final int PRODUCER_FIELD_NUMBER = 2;
  private java.lang.String producer_;
  /**
   * <pre>
   * Required. An arbitrary producer identifier. The combination of
   * `id` and `producer` must be globally unique.  Examples for `producer`:
   * `"MyDivision.MyBigCompany.com"`, "github.com/MyProject/MyApplication"`.
   * </pre>
   *
   * <code>optional string producer = 2;</code>
   */
  public java.lang.String getProducer() {
    return producer_;
  }
  /**
   * <pre>
   * Required. An arbitrary producer identifier. The combination of
   * `id` and `producer` must be globally unique.  Examples for `producer`:
   * `"MyDivision.MyBigCompany.com"`, "github.com/MyProject/MyApplication"`.
   * </pre>
   *
   * <code>optional string producer = 2;</code>
   */
  public com.google.protobuf.ByteString
      getProducerBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(producer_);
  }
  /**
   * <pre>
   * Required. An arbitrary producer identifier. The combination of
   * `id` and `producer` must be globally unique.  Examples for `producer`:
   * `"MyDivision.MyBigCompany.com"`, "github.com/MyProject/MyApplication"`.
   * </pre>
   *
   * <code>optional string producer = 2;</code>
   */
  private void setProducer(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    producer_ = value;
  }
  /**
   * <pre>
   * Required. An arbitrary producer identifier. The combination of
   * `id` and `producer` must be globally unique.  Examples for `producer`:
   * `"MyDivision.MyBigCompany.com"`, "github.com/MyProject/MyApplication"`.
   * </pre>
   *
   * <code>optional string producer = 2;</code>
   */
  private void clearProducer() {
    
    producer_ = getDefaultInstance().getProducer();
  }
  /**
   * <pre>
   * Required. An arbitrary producer identifier. The combination of
   * `id` and `producer` must be globally unique.  Examples for `producer`:
   * `"MyDivision.MyBigCompany.com"`, "github.com/MyProject/MyApplication"`.
   * </pre>
   *
   * <code>optional string producer = 2;</code>
   */
  private void setProducerBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    producer_ = value.toStringUtf8();
  }

  public static final int FIRST_FIELD_NUMBER = 3;
  private boolean first_;
  /**
   * <pre>
   * Optional. Set this to True if this is the first log entry in the operation.
   * </pre>
   *
   * <code>optional bool first = 3;</code>
   */
  public boolean getFirst() {
    return first_;
  }
  /**
   * <pre>
   * Optional. Set this to True if this is the first log entry in the operation.
   * </pre>
   *
   * <code>optional bool first = 3;</code>
   */
  private void setFirst(boolean value) {
    
    first_ = value;
  }
  /**
   * <pre>
   * Optional. Set this to True if this is the first log entry in the operation.
   * </pre>
   *
   * <code>optional bool first = 3;</code>
   */
  private void clearFirst() {
    
    first_ = false;
  }

  public static final int LAST_FIELD_NUMBER = 4;
  private boolean last_;
  /**
   * <pre>
   * Optional. Set this to True if this is the last log entry in the operation.
   * </pre>
   *
   * <code>optional bool last = 4;</code>
   */
  public boolean getLast() {
    return last_;
  }
  /**
   * <pre>
   * Optional. Set this to True if this is the last log entry in the operation.
   * </pre>
   *
   * <code>optional bool last = 4;</code>
   */
  private void setLast(boolean value) {
    
    last_ = value;
  }
  /**
   * <pre>
   * Optional. Set this to True if this is the last log entry in the operation.
   * </pre>
   *
   * <code>optional bool last = 4;</code>
   */
  private void clearLast() {
    
    last_ = false;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!id_.isEmpty()) {
      output.writeString(1, getId());
    }
    if (!producer_.isEmpty()) {
      output.writeString(2, getProducer());
    }
    if (first_ != false) {
      output.writeBool(3, first_);
    }
    if (last_ != false) {
      output.writeBool(4, last_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!id_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getId());
    }
    if (!producer_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(2, getProducer());
    }
    if (first_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, first_);
    }
    if (last_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, last_);
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.google.logging.v2.LogEntryOperation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.logging.v2.LogEntryOperation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.logging.v2.LogEntryOperation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.google.logging.v2.LogEntryOperation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.google.logging.v2.LogEntryOperation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.logging.v2.LogEntryOperation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.logging.v2.LogEntryOperation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.google.logging.v2.LogEntryOperation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.google.logging.v2.LogEntryOperation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.google.logging.v2.LogEntryOperation parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.logging.v2.LogEntryOperation prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * <pre>
   * Additional information about a potentially long-running operation with which
   * a log entry is associated.
   * </pre>
   *
   * Protobuf type {@code google.logging.v2.LogEntryOperation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.google.logging.v2.LogEntryOperation, Builder> implements
      // @@protoc_insertion_point(builder_implements:google.logging.v2.LogEntryOperation)
      com.google.logging.v2.LogEntryOperationOrBuilder {
    // Construct using com.google.logging.v2.LogEntryOperation.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <pre>
     * Required. An arbitrary operation identifier. Log entries with the
     * same identifier are assumed to be part of the same operation.
     * </pre>
     *
     * <code>optional string id = 1;</code>
     */
    public java.lang.String getId() {
      return instance.getId();
    }
    /**
     * <pre>
     * Required. An arbitrary operation identifier. Log entries with the
     * same identifier are assumed to be part of the same operation.
     * </pre>
     *
     * <code>optional string id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      return instance.getIdBytes();
    }
    /**
     * <pre>
     * Required. An arbitrary operation identifier. Log entries with the
     * same identifier are assumed to be part of the same operation.
     * </pre>
     *
     * <code>optional string id = 1;</code>
     */
    public Builder setId(
        java.lang.String value) {
      copyOnWrite();
      instance.setId(value);
      return this;
    }
    /**
     * <pre>
     * Required. An arbitrary operation identifier. Log entries with the
     * same identifier are assumed to be part of the same operation.
     * </pre>
     *
     * <code>optional string id = 1;</code>
     */
    public Builder clearId() {
      copyOnWrite();
      instance.clearId();
      return this;
    }
    /**
     * <pre>
     * Required. An arbitrary operation identifier. Log entries with the
     * same identifier are assumed to be part of the same operation.
     * </pre>
     *
     * <code>optional string id = 1;</code>
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setIdBytes(value);
      return this;
    }

    /**
     * <pre>
     * Required. An arbitrary producer identifier. The combination of
     * `id` and `producer` must be globally unique.  Examples for `producer`:
     * `"MyDivision.MyBigCompany.com"`, "github.com/MyProject/MyApplication"`.
     * </pre>
     *
     * <code>optional string producer = 2;</code>
     */
    public java.lang.String getProducer() {
      return instance.getProducer();
    }
    /**
     * <pre>
     * Required. An arbitrary producer identifier. The combination of
     * `id` and `producer` must be globally unique.  Examples for `producer`:
     * `"MyDivision.MyBigCompany.com"`, "github.com/MyProject/MyApplication"`.
     * </pre>
     *
     * <code>optional string producer = 2;</code>
     */
    public com.google.protobuf.ByteString
        getProducerBytes() {
      return instance.getProducerBytes();
    }
    /**
     * <pre>
     * Required. An arbitrary producer identifier. The combination of
     * `id` and `producer` must be globally unique.  Examples for `producer`:
     * `"MyDivision.MyBigCompany.com"`, "github.com/MyProject/MyApplication"`.
     * </pre>
     *
     * <code>optional string producer = 2;</code>
     */
    public Builder setProducer(
        java.lang.String value) {
      copyOnWrite();
      instance.setProducer(value);
      return this;
    }
    /**
     * <pre>
     * Required. An arbitrary producer identifier. The combination of
     * `id` and `producer` must be globally unique.  Examples for `producer`:
     * `"MyDivision.MyBigCompany.com"`, "github.com/MyProject/MyApplication"`.
     * </pre>
     *
     * <code>optional string producer = 2;</code>
     */
    public Builder clearProducer() {
      copyOnWrite();
      instance.clearProducer();
      return this;
    }
    /**
     * <pre>
     * Required. An arbitrary producer identifier. The combination of
     * `id` and `producer` must be globally unique.  Examples for `producer`:
     * `"MyDivision.MyBigCompany.com"`, "github.com/MyProject/MyApplication"`.
     * </pre>
     *
     * <code>optional string producer = 2;</code>
     */
    public Builder setProducerBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setProducerBytes(value);
      return this;
    }

    /**
     * <pre>
     * Optional. Set this to True if this is the first log entry in the operation.
     * </pre>
     *
     * <code>optional bool first = 3;</code>
     */
    public boolean getFirst() {
      return instance.getFirst();
    }
    /**
     * <pre>
     * Optional. Set this to True if this is the first log entry in the operation.
     * </pre>
     *
     * <code>optional bool first = 3;</code>
     */
    public Builder setFirst(boolean value) {
      copyOnWrite();
      instance.setFirst(value);
      return this;
    }
    /**
     * <pre>
     * Optional. Set this to True if this is the first log entry in the operation.
     * </pre>
     *
     * <code>optional bool first = 3;</code>
     */
    public Builder clearFirst() {
      copyOnWrite();
      instance.clearFirst();
      return this;
    }

    /**
     * <pre>
     * Optional. Set this to True if this is the last log entry in the operation.
     * </pre>
     *
     * <code>optional bool last = 4;</code>
     */
    public boolean getLast() {
      return instance.getLast();
    }
    /**
     * <pre>
     * Optional. Set this to True if this is the last log entry in the operation.
     * </pre>
     *
     * <code>optional bool last = 4;</code>
     */
    public Builder setLast(boolean value) {
      copyOnWrite();
      instance.setLast(value);
      return this;
    }
    /**
     * <pre>
     * Optional. Set this to True if this is the last log entry in the operation.
     * </pre>
     *
     * <code>optional bool last = 4;</code>
     */
    public Builder clearLast() {
      copyOnWrite();
      instance.clearLast();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:google.logging.v2.LogEntryOperation)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.google.logging.v2.LogEntryOperation();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.google.logging.v2.LogEntryOperation other = (com.google.logging.v2.LogEntryOperation) arg1;
        id_ = visitor.visitString(!id_.isEmpty(), id_,
            !other.id_.isEmpty(), other.id_);
        producer_ = visitor.visitString(!producer_.isEmpty(), producer_,
            !other.producer_.isEmpty(), other.producer_);
        first_ = visitor.visitBoolean(first_ != false, first_,
            other.first_ != false, other.first_);
        last_ = visitor.visitBoolean(last_ != false, last_,
            other.last_ != false, other.last_);
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
        }
        return this;
      }
      case MERGE_FROM_STREAM: {
        com.google.protobuf.CodedInputStream input =
            (com.google.protobuf.CodedInputStream) arg0;
        com.google.protobuf.ExtensionRegistryLite extensionRegistry =
            (com.google.protobuf.ExtensionRegistryLite) arg1;
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!input.skipField(tag)) {
                  done = true;
                }
                break;
              }
              case 10: {
                String s = input.readStringRequireUtf8();

                id_ = s;
                break;
              }
              case 18: {
                String s = input.readStringRequireUtf8();

                producer_ = s;
                break;
              }
              case 24: {

                first_ = input.readBool();
                break;
              }
              case 32: {

                last_ = input.readBool();
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw new RuntimeException(e.setUnfinishedMessage(this));
        } catch (java.io.IOException e) {
          throw new RuntimeException(
              new com.google.protobuf.InvalidProtocolBufferException(
                  e.getMessage()).setUnfinishedMessage(this));
        } finally {
        }
      }
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        if (PARSER == null) {    synchronized (com.google.logging.v2.LogEntryOperation.class) {
            if (PARSER == null) {
              PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
            }
          }
        }
        return PARSER;
      }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:google.logging.v2.LogEntryOperation)
  private static final com.google.logging.v2.LogEntryOperation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new LogEntryOperation();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.google.logging.v2.LogEntryOperation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<LogEntryOperation> PARSER;

  public static com.google.protobuf.Parser<LogEntryOperation> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}
