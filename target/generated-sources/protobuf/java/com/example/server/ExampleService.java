// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: exampleService.proto

package com.example.server;

public final class ExampleService {
  private ExampleService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_server_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_server_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_server_HelloRequest_BagOfTricksEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_server_HelloRequest_BagOfTricksEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_example_server_HelloResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_example_server_HelloResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024exampleService.proto\022\022com.example.serv" +
      "er\"\251\001\n\014HelloRequest\022\014\n\004name\030\001 \001(\t\022\017\n\007hob" +
      "bies\030\002 \003(\t\022F\n\013bagOfTricks\030\003 \003(\01321.com.ex" +
      "ample.server.HelloRequest.BagOfTricksEnt" +
      "ry\0322\n\020BagOfTricksEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005v" +
      "alue\030\002 \001(\t:\0028\001\"4\n\rHelloResponse\022\020\n\010greet" +
      "ing\030\001 \001(\t\022\021\n\tbgreeting\030\002 \001(\t2b\n\017Greeting" +
      "Service\022O\n\010greeting\022 .com.example.server" +
      ".HelloRequest\032!.com.example.server.Hello" +
      "ResponseB\002P\001b\006proto3"
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
    internal_static_com_example_server_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_example_server_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_server_HelloRequest_descriptor,
        new java.lang.String[] { "Name", "Hobbies", "BagOfTricks", });
    internal_static_com_example_server_HelloRequest_BagOfTricksEntry_descriptor =
      internal_static_com_example_server_HelloRequest_descriptor.getNestedTypes().get(0);
    internal_static_com_example_server_HelloRequest_BagOfTricksEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_server_HelloRequest_BagOfTricksEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_com_example_server_HelloResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_example_server_HelloResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_example_server_HelloResponse_descriptor,
        new java.lang.String[] { "Greeting", "Bgreeting", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
