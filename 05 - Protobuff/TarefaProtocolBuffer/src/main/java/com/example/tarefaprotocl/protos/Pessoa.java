// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: pessoa.proto
// Protobuf Java Version: 4.27.2

package com.example.tarefaprotocl.protos;

/**
 * Protobuf type {@code tarefaprotocol.Pessoa}
 */
public final class Pessoa extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:tarefaprotocol.Pessoa)
    PessoaOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      Pessoa.class.getName());
  }
  // Use Pessoa.newBuilder() to construct.
  private Pessoa(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Pessoa() {
    nome_ = "";
    type_ = 0;
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return PessoaProtos.internal_static_tarefaprotocol_Pessoa_descriptor;
  }

  @Override
  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return PessoaProtos.internal_static_tarefaprotocol_Pessoa_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            Pessoa.class, Builder.class);
  }

  /**
   * Protobuf enum {@code tarefaprotocol.Pessoa.TipoSangioneo}
   */
  public enum TipoSangioneo
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>TIPO_SANGUINEO_NAOESPECIFICADO = 0;</code>
     */
    TIPO_SANGUINEO_NAOESPECIFICADO(0),
    /**
     * <code>TIPO_SANGUINEO_AP = 1;</code>
     */
    TIPO_SANGUINEO_AP(1),
    /**
     * <code>TIPO_SANGUINEO_AN = 2;</code>
     */
    TIPO_SANGUINEO_AN(2),
    /**
     * <code>TIPO_SANGUINEO_BP = 3;</code>
     */
    TIPO_SANGUINEO_BP(3),
    /**
     * <code>TIPO_SANGUINEO_BN = 4;</code>
     */
    TIPO_SANGUINEO_BN(4),
    /**
     * <code>TIPO_SANGUINEO_OP = 5;</code>
     */
    TIPO_SANGUINEO_OP(5),
    /**
     * <code>TIPO_SANGUINEO_ON = 6;</code>
     */
    TIPO_SANGUINEO_ON(6),
    /**
     * <code>TIPO_SANGUINEO_ABP = 7;</code>
     */
    TIPO_SANGUINEO_ABP(7),
    /**
     * <code>TIPO_SANGUINEO_ABN = 8;</code>
     */
    TIPO_SANGUINEO_ABN(8),
    /**
     * <code>TIPO_SANGUINEO_NULL = 9;</code>
     */
    TIPO_SANGUINEO_NULL(9),
    UNRECOGNIZED(-1),
    ;

    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        TipoSangioneo.class.getName());
    }
    /**
     * <code>TIPO_SANGUINEO_NAOESPECIFICADO = 0;</code>
     */
    public static final int TIPO_SANGUINEO_NAOESPECIFICADO_VALUE = 0;
    /**
     * <code>TIPO_SANGUINEO_AP = 1;</code>
     */
    public static final int TIPO_SANGUINEO_AP_VALUE = 1;
    /**
     * <code>TIPO_SANGUINEO_AN = 2;</code>
     */
    public static final int TIPO_SANGUINEO_AN_VALUE = 2;
    /**
     * <code>TIPO_SANGUINEO_BP = 3;</code>
     */
    public static final int TIPO_SANGUINEO_BP_VALUE = 3;
    /**
     * <code>TIPO_SANGUINEO_BN = 4;</code>
     */
    public static final int TIPO_SANGUINEO_BN_VALUE = 4;
    /**
     * <code>TIPO_SANGUINEO_OP = 5;</code>
     */
    public static final int TIPO_SANGUINEO_OP_VALUE = 5;
    /**
     * <code>TIPO_SANGUINEO_ON = 6;</code>
     */
    public static final int TIPO_SANGUINEO_ON_VALUE = 6;
    /**
     * <code>TIPO_SANGUINEO_ABP = 7;</code>
     */
    public static final int TIPO_SANGUINEO_ABP_VALUE = 7;
    /**
     * <code>TIPO_SANGUINEO_ABN = 8;</code>
     */
    public static final int TIPO_SANGUINEO_ABN_VALUE = 8;
    /**
     * <code>TIPO_SANGUINEO_NULL = 9;</code>
     */
    public static final int TIPO_SANGUINEO_NULL_VALUE = 9;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @Deprecated
    public static TipoSangioneo valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static TipoSangioneo forNumber(int value) {
      switch (value) {
        case 0: return TIPO_SANGUINEO_NAOESPECIFICADO;
        case 1: return TIPO_SANGUINEO_AP;
        case 2: return TIPO_SANGUINEO_AN;
        case 3: return TIPO_SANGUINEO_BP;
        case 4: return TIPO_SANGUINEO_BN;
        case 5: return TIPO_SANGUINEO_OP;
        case 6: return TIPO_SANGUINEO_ON;
        case 7: return TIPO_SANGUINEO_ABP;
        case 8: return TIPO_SANGUINEO_ABN;
        case 9: return TIPO_SANGUINEO_NULL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<TipoSangioneo>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        TipoSangioneo> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<TipoSangioneo>() {
            public TipoSangioneo findValueByNumber(int number) {
              return TipoSangioneo.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return Pessoa.getDescriptor().getEnumTypes().get(0);
    }

    private static final TipoSangioneo[] VALUES = values();

    public static TipoSangioneo valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private TipoSangioneo(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:tarefaprotocol.Pessoa.TipoSangioneo)
  }

  public static final int NOME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile Object nome_ = "";
  /**
   * <code>string nome = 1;</code>
   * @return The nome.
   */
  @Override
  public String getNome() {
    Object ref = nome_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      nome_ = s;
      return s;
    }
  }
  /**
   * <code>string nome = 1;</code>
   * @return The bytes for nome.
   */
  @Override
  public com.google.protobuf.ByteString
      getNomeBytes() {
    Object ref = nome_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      nome_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IDADE_FIELD_NUMBER = 2;
  private int idade_ = 0;
  /**
   * <code>int32 idade = 2;</code>
   * @return The idade.
   */
  @Override
  public int getIdade() {
    return idade_;
  }

  public static final int TYPE_FIELD_NUMBER = 3;
  private int type_ = 0;
  /**
   * <code>.tarefaprotocol.Pessoa.TipoSangioneo type = 3;</code>
   * @return The enum numeric value on the wire for type.
   */
  @Override public int getTypeValue() {
    return type_;
  }
  /**
   * <code>.tarefaprotocol.Pessoa.TipoSangioneo type = 3;</code>
   * @return The type.
   */
  @Override public TipoSangioneo getType() {
    TipoSangioneo result = TipoSangioneo.forNumber(type_);
    return result == null ? TipoSangioneo.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(nome_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, nome_);
    }
    if (idade_ != 0) {
      output.writeInt32(2, idade_);
    }
    if (type_ != TipoSangioneo.TIPO_SANGUINEO_NAOESPECIFICADO.getNumber()) {
      output.writeEnum(3, type_);
    }
    getUnknownFields().writeTo(output);
  }

  @Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(nome_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, nome_);
    }
    if (idade_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, idade_);
    }
    if (type_ != TipoSangioneo.TIPO_SANGUINEO_NAOESPECIFICADO.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, type_);
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
    if (!(obj instanceof Pessoa)) {
      return super.equals(obj);
    }
    Pessoa other = (Pessoa) obj;

    if (!getNome()
        .equals(other.getNome())) return false;
    if (getIdade()
        != other.getIdade()) return false;
    if (type_ != other.type_) return false;
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
    hash = (37 * hash) + NOME_FIELD_NUMBER;
    hash = (53 * hash) + getNome().hashCode();
    hash = (37 * hash) + IDADE_FIELD_NUMBER;
    hash = (53 * hash) + getIdade();
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static Pessoa parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Pessoa parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Pessoa parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Pessoa parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Pessoa parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static Pessoa parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static Pessoa parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static Pessoa parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static Pessoa parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static Pessoa parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static Pessoa parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static Pessoa parseFrom(
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
  public static Builder newBuilder(Pessoa prototype) {
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
   * Protobuf type {@code tarefaprotocol.Pessoa}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tarefaprotocol.Pessoa)
      PessoaOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return PessoaProtos.internal_static_tarefaprotocol_Pessoa_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return PessoaProtos.internal_static_tarefaprotocol_Pessoa_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              Pessoa.class, Builder.class);
    }

    // Construct using com.example.tarefaprotocl.protos.Pessoa.newBuilder()
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
      nome_ = "";
      idade_ = 0;
      type_ = 0;
      return this;
    }

    @Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return PessoaProtos.internal_static_tarefaprotocol_Pessoa_descriptor;
    }

    @Override
    public Pessoa getDefaultInstanceForType() {
      return Pessoa.getDefaultInstance();
    }

    @Override
    public Pessoa build() {
      Pessoa result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @Override
    public Pessoa buildPartial() {
      Pessoa result = new Pessoa(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(Pessoa result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.nome_ = nome_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.idade_ = idade_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.type_ = type_;
      }
    }

    @Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof Pessoa) {
        return mergeFrom((Pessoa)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(Pessoa other) {
      if (other == Pessoa.getDefaultInstance()) return this;
      if (!other.getNome().isEmpty()) {
        nome_ = other.nome_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getIdade() != 0) {
        setIdade(other.getIdade());
      }
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
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
              nome_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              idade_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              type_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private Object nome_ = "";
    /**
     * <code>string nome = 1;</code>
     * @return The nome.
     */
    public String getNome() {
      Object ref = nome_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        nome_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string nome = 1;</code>
     * @return The bytes for nome.
     */
    public com.google.protobuf.ByteString
        getNomeBytes() {
      Object ref = nome_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        nome_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string nome = 1;</code>
     * @param value The nome to set.
     * @return This builder for chaining.
     */
    public Builder setNome(
        String value) {
      if (value == null) { throw new NullPointerException(); }
      nome_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string nome = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNome() {
      nome_ = getDefaultInstance().getNome();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string nome = 1;</code>
     * @param value The bytes for nome to set.
     * @return This builder for chaining.
     */
    public Builder setNomeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      nome_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int idade_ ;
    /**
     * <code>int32 idade = 2;</code>
     * @return The idade.
     */
    @Override
    public int getIdade() {
      return idade_;
    }
    /**
     * <code>int32 idade = 2;</code>
     * @param value The idade to set.
     * @return This builder for chaining.
     */
    public Builder setIdade(int value) {

      idade_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int32 idade = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIdade() {
      bitField0_ = (bitField0_ & ~0x00000002);
      idade_ = 0;
      onChanged();
      return this;
    }

    private int type_ = 0;
    /**
     * <code>.tarefaprotocol.Pessoa.TipoSangioneo type = 3;</code>
     * @return The enum numeric value on the wire for type.
     */
    @Override public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.tarefaprotocol.Pessoa.TipoSangioneo type = 3;</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.tarefaprotocol.Pessoa.TipoSangioneo type = 3;</code>
     * @return The type.
     */
    @Override
    public TipoSangioneo getType() {
      TipoSangioneo result = TipoSangioneo.forNumber(type_);
      return result == null ? TipoSangioneo.UNRECOGNIZED : result;
    }
    /**
     * <code>.tarefaprotocol.Pessoa.TipoSangioneo type = 3;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(TipoSangioneo value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.tarefaprotocol.Pessoa.TipoSangioneo type = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      bitField0_ = (bitField0_ & ~0x00000004);
      type_ = 0;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:tarefaprotocol.Pessoa)
  }

  // @@protoc_insertion_point(class_scope:tarefaprotocol.Pessoa)
  private static final Pessoa DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Pessoa();
  }

  public static Pessoa getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Pessoa>
      PARSER = new com.google.protobuf.AbstractParser<Pessoa>() {
    @Override
    public Pessoa parsePartialFrom(
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

  public static com.google.protobuf.Parser<Pessoa> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<Pessoa> getParserForType() {
    return PARSER;
  }

  @Override
  public Pessoa getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

