// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: messaging.proto

package messaging;

public final class MessagingProto {
  private MessagingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messaging_MessageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messaging_MessageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messaging_UserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messaging_UserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messaging_MessageResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messaging_MessageResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messaging_MessageList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messaging_MessageList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_messaging_Message_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_messaging_Message_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017messaging.proto\022\tmessaging\"I\n\016MessageR" +
      "equest\022\021\n\tsender_id\030\001 \001(\t\022\023\n\013receiver_id" +
      "\030\002 \001(\t\022\017\n\007message\030\003 \001(\t\"\036\n\013UserRequest\022\017" +
      "\n\007user_id\030\001 \001(\t\"!\n\017MessageResponse\022\016\n\006st" +
      "atus\030\001 \001(\t\"3\n\013MessageList\022$\n\010messages\030\001 " +
      "\003(\0132\022.messaging.Message\"B\n\007Message\022\021\n\tse" +
      "nder_id\030\001 \001(\t\022\023\n\013receiver_id\030\002 \001(\t\022\017\n\007co" +
      "ntent\030\003 \001(\t2\227\001\n\020MessagingService\022D\n\013Send" +
      "Message\022\031.messaging.MessageRequest\032\032.mes" +
      "saging.MessageResponse\022=\n\013GetMessages\022\026.",
      "messaging.UserRequest\032\026.messaging.Messag" +
      "eListB\035\n\tmessagingB\016MessagingProtoP\001b\006pr" +
      "oto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_messaging_MessageRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_messaging_MessageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messaging_MessageRequest_descriptor,
        new java.lang.String[] { "SenderId", "ReceiverId", "Message", });
    internal_static_messaging_UserRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_messaging_UserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messaging_UserRequest_descriptor,
        new java.lang.String[] { "UserId", });
    internal_static_messaging_MessageResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_messaging_MessageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messaging_MessageResponse_descriptor,
        new java.lang.String[] { "Status", });
    internal_static_messaging_MessageList_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_messaging_MessageList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messaging_MessageList_descriptor,
        new java.lang.String[] { "Messages", });
    internal_static_messaging_Message_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_messaging_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_messaging_Message_descriptor,
        new java.lang.String[] { "SenderId", "ReceiverId", "Content", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
