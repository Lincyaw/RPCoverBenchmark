// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protos/Go_C.proto

package src.main.benchmark;

public final class GoC {
  private GoC() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021protos/Go_C.proto\022\006protos\032\024protos/mess" +
      "age.proto2\264\001\n\004Go_C\0228\n\006Go_C_1\022\025.protos.Co" +
      "mmonMessage\032\025.protos.CommonMessage\"\000\0228\n\006" +
      "Go_C_2\022\025.protos.CommonMessage\032\025.protos.C" +
      "ommonMessage\"\000\0228\n\006Go_C_3\022\025.protos.Common" +
      "Message\032\025.protos.CommonMessage\"\000B\035\n\022src." +
      "main.benchmarkZ\007./protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          src.main.benchmark.Message.getDescriptor(),
        });
    src.main.benchmark.Message.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}