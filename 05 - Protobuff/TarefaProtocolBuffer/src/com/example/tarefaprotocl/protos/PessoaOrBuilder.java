// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: pessoa.proto
// Protobuf Java Version: 4.27.2

package com.example.tarefaprotocl.protos;

public interface PessoaOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tarefaprotocol.Pessoa)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string nome = 1;</code>
   * @return The nome.
   */
  java.lang.String getNome();
  /**
   * <code>string nome = 1;</code>
   * @return The bytes for nome.
   */
  com.google.protobuf.ByteString
      getNomeBytes();

  /**
   * <code>int32 idade = 2;</code>
   * @return The idade.
   */
  int getIdade();

  /**
   * <code>.tarefaprotocol.Pessoa.TipoSangioneo type = 3;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.tarefaprotocol.Pessoa.TipoSangioneo type = 3;</code>
   * @return The type.
   */
  com.example.tarefaprotocl.protos.Pessoa.TipoSangioneo getType();
}
