// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: messaging.proto

package messaging;

public interface MessageRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:messaging.MessageRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string sender_id = 1;</code>
   */
  java.lang.String getSenderId();
  /**
   * <code>string sender_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getSenderIdBytes();

  /**
   * <code>string receiver_id = 2;</code>
   */
  java.lang.String getReceiverId();
  /**
   * <code>string receiver_id = 2;</code>
   */
  com.google.protobuf.ByteString
      getReceiverIdBytes();

  /**
   * <code>string message = 3;</code>
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 3;</code>
   */
  com.google.protobuf.ByteString
      getMessageBytes();
}
