// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: pessoa.proto
// Protobuf Java Version: 4.27.2

package com.example.tarefaprotocl.protos;

/**
 * Protobuf type {@code tarefaprotocol.ListaPessoas}
 */
public final class ListaPessoas extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:tarefaprotocol.ListaPessoas)
    ListaPessoasOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      ListaPessoas.class.getName());
  }
  // Use ListaPessoas.newBuilder() to construct.
  private ListaPessoas(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ListaPessoas() {
    pessoas_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return PessoaProtos.internal_static_tarefaprotocol_ListaPessoas_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return PessoaProtos.internal_static_tarefaprotocol_ListaPessoas_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ListaPessoas.class, Builder.class);
  }

  public static final int PESSOAS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<Pessoa> pessoas_;
  /**
   * <code>repeated .tarefaprotocol.Pessoa pessoas = 1;</code>
   */
  @Override
  public java.util.List<Pessoa> getPessoasList() {
    return pessoas_;
  }
  /**
   * <code>repeated .tarefaprotocol.Pessoa pessoas = 1;</code>
   */
  @Override
  public java.util.List<? extends PessoaOrBuilder>
      getPessoasOrBuilderList() {
    return pessoas_;
  }
  /**
   * <code>repeated .tarefaprotocol.Pessoa pessoas = 1;</code>
   */
  @Override
  public int getPessoasCount() {
    return pessoas_.size();
  }
  /**
   * <code>repeated .tarefaprotocol.Pessoa pessoas = 1;</code>
   */
  @Override
  public Pessoa getPessoas(int index) {
    return pessoas_.get(index);
  }
  /**
   * <code>repeated .tarefaprotocol.Pessoa pessoas = 1;</code>
   */
  @Override
  public PessoaOrBuilder getPessoasOrBuilder(
      int index) {
    return pessoas_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < pessoas_.size(); i++) {
      output.writeMessage(1, pessoas_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < pessoas_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, pessoas_.get(i));
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ListaPessoas)) {
      return super.equals(obj);
    }
    ListaPessoas other = (ListaPessoas) obj;

    if (!getPessoasList()
        .equals(other.getPessoasList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getPessoasCount() > 0) {
      hash = (37 * hash) + PESSOAS_FIELD_NUMBER;
      hash = (53 * hash) + getPessoasList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ListaPessoas parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ListaPessoas parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ListaPessoas parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ListaPessoas parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ListaPessoas parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ListaPessoas parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ListaPessoas parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ListaPessoas parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static ListaPessoas parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static ListaPessoas parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ListaPessoas parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static ListaPessoas parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ListaPessoas prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code tarefaprotocol.ListaPessoas}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tarefaprotocol.ListaPessoas)
      ListaPessoasOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return PessoaProtos.internal_static_tarefaprotocol_ListaPessoas_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return PessoaProtos.internal_static_tarefaprotocol_ListaPessoas_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ListaPessoas.class, Builder.class);
    }

    // Construct using com.example.tarefaprotocl.protos.ListaPessoas.newBuilder()
    private Builder() {

    }

    private Builder(
        BuilderParent parent) {
      super(parent);

    }
    @Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (pessoasBuilder_ == null) {
        pessoas_ = java.util.Collections.emptyList();
      } else {
        pessoas_ = null;
        pessoasBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return PessoaProtos.internal_static_tarefaprotocol_ListaPessoas_descriptor;
    }

    @Override
    public ListaPessoas getDefaultInstanceForType() {
      return ListaPessoas.getDefaultInstance();
    }

    @Override
    public ListaPessoas build() {
      ListaPessoas result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public ListaPessoas buildPartial() {
      ListaPessoas result = new ListaPessoas(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(ListaPessoas result) {
      if (pessoasBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          pessoas_ = java.util.Collections.unmodifiableList(pessoas_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.pessoas_ = pessoas_;
      } else {
        result.pessoas_ = pessoasBuilder_.build();
      }
    }

    private void buildPartial0(ListaPessoas result) {
      int from_bitField0_ = bitField0_;
    }

    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ListaPessoas) {
        return mergeFrom((ListaPessoas)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ListaPessoas other) {
      if (other == ListaPessoas.getDefaultInstance()) return this;
      if (pessoasBuilder_ == null) {
        if (!other.pessoas_.isEmpty()) {
          if (pessoas_.isEmpty()) {
            pessoas_ = other.pessoas_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePessoasIsMutable();
            pessoas_.addAll(other.pessoas_);
          }
          onChanged();
        }
      } else {
        if (!other.pessoas_.isEmpty()) {
          if (pessoasBuilder_.isEmpty()) {
            pessoasBuilder_.dispose();
            pessoasBuilder_ = null;
            pessoas_ = other.pessoas_;
            bitField0_ = (bitField0_ & ~0x00000001);
            pessoasBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getPessoasFieldBuilder() : null;
          } else {
            pessoasBuilder_.addAllMessages(other.pessoas_);
          }
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @Override
    public final boolean isInitialized() {
      return true;
    }

    @Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              Pessoa m =
                  input.readMessage(
                      Pessoa.parser(),
                      extensionRegistry);
              if (pessoasBuilder_ == null) {
                ensurePessoasIsMutable();
                pessoas_.add(m);
              } else {
                pessoasBuilder_.addMessage(m);
              }
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.util.List<Pessoa> pessoas_ =
      java.util.Collections.emptyList();
    private void ensurePessoasIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        pessoas_ = new java.util.ArrayList<Pessoa>(pessoas_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        Pessoa, Pessoa.Builder, PessoaOrBuilder> pessoasBuilder_;

    /**
     * <code>repeated .tarefaprotocol.Pessoa pessoas = 1;</code>
     */
    public java.util.List<Pessoa> getPessoasList() {
      if (pessoasBuilder_ == null) {
        return java.util.Collections.unmodifiableList(pessoas_);
      } else {
        return pessoasBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .tarefaprotocol.Pessoa pessoas = 1;</code>
     */
    public int getPessoasCount() {
      if (pessoasBuilder_ == null) {
        return pessoas_.size();
      } else {
        return pessoasBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .tarefaprotocol.Pessoa pessoas = 1;</code>
     */
    public Pessoa getPessoas(int index) {
      if (pessoasBuilder_ == null) {
        return pessoas_.get(index);
      } else {
        return pessoasBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .tarefaprotocol.Pessoa pessoas = 1;</code>
     */
    public Builder setPessoas(
        int index, Pessoa value) {
      if (pessoasBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePessoasIsMutable();
        pessoas_.set(index, value);
        onChanged();
      } else {
        pessoasBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tarefaprotocol.Pessoa pessoas = 1;</code>
     */
    public Builder setPessoas(
        int index, Pessoa.Builder builderForValue) {
      if (pessoasBuilder_ == null) {
        ensurePessoasIsMutable();
        pessoas_.set(index, builderForValue.build());
        onChanged();
      } else {
        pessoasBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tarefaprotocol.Pessoa pessoas = 1;</code>
     */
    public Builder addPessoas(Pessoa value) {
      if (pessoasBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePessoasIsMutable();
        pessoas_.add(value);
        onChanged();
      } else {
        pessoasBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .tarefaprotocol.Pessoa pessoas = 1;</code>
     */
    public Builder addPessoas(
        int index, Pessoa value) {
      if (pessoasBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePessoasIsMutable();
        pessoas_.add(index, value);
        onChanged();
      } else {
        pessoasBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tarefaprotocol.Pessoa pessoas = 1;</code>
     */
    public Builder addPessoas(
        Pessoa.Builder builderForValue) {
      if (pessoasBuilder_ == null) {
        ensurePessoasIsMutable();
        pessoas_.add(builderForValue.build());
        onChanged();
      } else {
        pessoasBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tarefaprotocol.Pessoa pessoas = 1;</code>
     */
    public Builder addPessoas(
        int index, Pessoa.Builder builderForValue) {
      if (pessoasBuilder_ == null) {
        ensurePessoasIsMutable();
        pessoas_.add(index, builderForValue.build());
        onChanged();
      } else {
        pessoasBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tarefaprotocol.Pessoa pessoas = 1;</code>
     */
    public Builder addAllPessoas(
        Iterable<? extends Pessoa> values) {
      if (pessoasBuilder_ == null) {
        ensurePessoasIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, pessoas_);
        onChanged();
      } else {
        pessoasBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .tarefaprotocol.Pessoa pessoas = 1;</code>
     */
    public Builder clearPessoas() {
      if (pessoasBuilder_ == null) {
        pessoas_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        pessoasBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .tarefaprotocol.Pessoa pessoas = 1;</code>
     */
    public Builder removePessoas(int index) {
      if (pessoasBuilder_ == null) {
        ensurePessoasIsMutable();
        pessoas_.remove(index);
        onChanged();
      } else {
        pessoasBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .tarefaprotocol.Pessoa pessoas = 1;</code>
     */
    public Pessoa.Builder getPessoasBuilder(
        int index) {
      return getPessoasFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .tarefaprotocol.Pessoa pessoas = 1;</code>
     */
    public PessoaOrBuilder getPessoasOrBuilder(
        int index) {
      if (pessoasBuilder_ == null) {
        return pessoas_.get(index);  } else {
        return pessoasBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .tarefaprotocol.Pessoa pessoas = 1;</code>
     */
    public java.util.List<? extends PessoaOrBuilder>
         getPessoasOrBuilderList() {
      if (pessoasBuilder_ != null) {
        return pessoasBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(pessoas_);
      }
    }
    /**
     * <code>repeated .tarefaprotocol.Pessoa pessoas = 1;</code>
     */
    public Pessoa.Builder addPessoasBuilder() {
      return getPessoasFieldBuilder().addBuilder(
          Pessoa.getDefaultInstance());
    }
    /**
     * <code>repeated .tarefaprotocol.Pessoa pessoas = 1;</code>
     */
    public Pessoa.Builder addPessoasBuilder(
        int index) {
      return getPessoasFieldBuilder().addBuilder(
          index, Pessoa.getDefaultInstance());
    }
    /**
     * <code>repeated .tarefaprotocol.Pessoa pessoas = 1;</code>
     */
    public java.util.List<Pessoa.Builder>
         getPessoasBuilderList() {
      return getPessoasFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        Pessoa, Pessoa.Builder, PessoaOrBuilder>
        getPessoasFieldBuilder() {
      if (pessoasBuilder_ == null) {
        pessoasBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            Pessoa, Pessoa.Builder, PessoaOrBuilder>(
                pessoas_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        pessoas_ = null;
      }
      return pessoasBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:tarefaprotocol.ListaPessoas)
  }

  // @@protoc_insertion_point(class_scope:tarefaprotocol.ListaPessoas)
  private static final ListaPessoas DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ListaPessoas();
  }

  public static ListaPessoas getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListaPessoas>
      PARSER = new com.google.protobuf.AbstractParser<ListaPessoas>() {
    @Override
    public ListaPessoas parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<ListaPessoas> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<ListaPessoas> getParserForType() {
    return PARSER;
  }

  @Override
  public ListaPessoas getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
