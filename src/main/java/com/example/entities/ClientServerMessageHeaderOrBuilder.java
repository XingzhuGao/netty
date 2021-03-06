// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: model.proto

package com.example.entities;

public interface ClientServerMessageHeaderOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.proto.ClientServerMessageHeader)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string service = 1;</code>
   */
  java.lang.String getService();
  /**
   * <code>string service = 1;</code>
   */
  com.google.protobuf.ByteString
      getServiceBytes();

  /**
   * <code>string tokenId = 2;</code>
   */
  java.lang.String getTokenId();
  /**
   * <code>string tokenId = 2;</code>
   */
  com.google.protobuf.ByteString
      getTokenIdBytes();

  /**
   * <code>string compressed = 3;</code>
   */
  java.lang.String getCompressed();
  /**
   * <code>string compressed = 3;</code>
   */
  com.google.protobuf.ByteString
      getCompressedBytes();

  /**
   * <code>.com.proto.Platform platform = 4;</code>
   */
  int getPlatformValue();
  /**
   * <code>.com.proto.Platform platform = 4;</code>
   */
  com.example.entities.Platform getPlatform();

  /**
   * <pre>
   * 是否不管停机维护
   * </pre>
   *
   * <code>bool ignoreMaintenance = 5;</code>
   */
  boolean getIgnoreMaintenance();

  /**
   * <code>bool hasVersion = 6;</code>
   */
  boolean getHasVersion();

  /**
   * <code>bool hasShard = 7;</code>
   */
  boolean getHasShard();

  /**
   * <code>string shard = 8;</code>
   */
  java.lang.String getShard();
  /**
   * <code>string shard = 8;</code>
   */
  com.google.protobuf.ByteString
      getShardBytes();
}
