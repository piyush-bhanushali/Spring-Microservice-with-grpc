// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user-service.proto

package com.piyush.grpcflix.user;

public final class UserServiceOuterClass {
  private UserServiceOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UserSearchRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UserSearchRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UserResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UserResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UserGenreUpdateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UserGenreUpdateRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022user-service.proto\032\023common/common.prot" +
      "o\"%\n\021UserSearchRequest\022\020\n\010login_id\030\001 \001(\t" +
      "\"L\n\014UserResponse\022\020\n\010login_id\030\001 \001(\t\022\014\n\004na" +
      "me\030\002 \001(\t\022\034\n\005genre\030\003 \001(\0162\r.common.Genre\"H" +
      "\n\026UserGenreUpdateRequest\022\020\n\010login_id\030\001 \001" +
      "(\t\022\034\n\005genre\030\002 \001(\0162\r.common.Genre2{\n\013User" +
      "Service\0221\n\014getUserGenre\022\022.UserSearchRequ" +
      "est\032\r.UserResponse\0229\n\017updateUserGenre\022\027." +
      "UserGenreUpdateRequest\032\r.UserResponseB\034\n" +
      "\030com.piyush.grpcflix.userP\001b\006proto3"
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
          com.piyush.grpcflix.common.Common.getDescriptor(),
        }, assigner);
    internal_static_UserSearchRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UserSearchRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UserSearchRequest_descriptor,
        new java.lang.String[] { "LoginId", });
    internal_static_UserResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_UserResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UserResponse_descriptor,
        new java.lang.String[] { "LoginId", "Name", "Genre", });
    internal_static_UserGenreUpdateRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_UserGenreUpdateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UserGenreUpdateRequest_descriptor,
        new java.lang.String[] { "LoginId", "Genre", });
    com.piyush.grpcflix.common.Common.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
