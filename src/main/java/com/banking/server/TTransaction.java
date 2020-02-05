/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.banking.server;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2020-02-04")
public class TTransaction implements org.apache.thrift.TBase<TTransaction, TTransaction._Fields>, java.io.Serializable, Cloneable, Comparable<TTransaction> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TTransaction");

  private static final org.apache.thrift.protocol.TField DEBIT_ACCOUNT_NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("debitAccountNumber", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField CREDIT_ACCOUNT_NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("creditAccountNumber", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField AMOUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("amount", org.apache.thrift.protocol.TType.DOUBLE, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new TTransactionStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new TTransactionTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable java.lang.String debitAccountNumber; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String creditAccountNumber; // required
  public double amount; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DEBIT_ACCOUNT_NUMBER((short)1, "debitAccountNumber"),
    CREDIT_ACCOUNT_NUMBER((short)2, "creditAccountNumber"),
    AMOUNT((short)3, "amount");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // DEBIT_ACCOUNT_NUMBER
          return DEBIT_ACCOUNT_NUMBER;
        case 2: // CREDIT_ACCOUNT_NUMBER
          return CREDIT_ACCOUNT_NUMBER;
        case 3: // AMOUNT
          return AMOUNT;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __AMOUNT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DEBIT_ACCOUNT_NUMBER, new org.apache.thrift.meta_data.FieldMetaData("debitAccountNumber", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CREDIT_ACCOUNT_NUMBER, new org.apache.thrift.meta_data.FieldMetaData("creditAccountNumber", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.AMOUNT, new org.apache.thrift.meta_data.FieldMetaData("amount", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TTransaction.class, metaDataMap);
  }

  public TTransaction() {
  }

  public TTransaction(
    java.lang.String debitAccountNumber,
    java.lang.String creditAccountNumber,
    double amount)
  {
    this();
    this.debitAccountNumber = debitAccountNumber;
    this.creditAccountNumber = creditAccountNumber;
    this.amount = amount;
    setAmountIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TTransaction(TTransaction other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetDebitAccountNumber()) {
      this.debitAccountNumber = other.debitAccountNumber;
    }
    if (other.isSetCreditAccountNumber()) {
      this.creditAccountNumber = other.creditAccountNumber;
    }
    this.amount = other.amount;
  }

  public TTransaction deepCopy() {
    return new TTransaction(this);
  }

  @Override
  public void clear() {
    this.debitAccountNumber = null;
    this.creditAccountNumber = null;
    setAmountIsSet(false);
    this.amount = 0.0;
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getDebitAccountNumber() {
    return this.debitAccountNumber;
  }

  public TTransaction setDebitAccountNumber(@org.apache.thrift.annotation.Nullable java.lang.String debitAccountNumber) {
    this.debitAccountNumber = debitAccountNumber;
    return this;
  }

  public void unsetDebitAccountNumber() {
    this.debitAccountNumber = null;
  }

  /** Returns true if field debitAccountNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetDebitAccountNumber() {
    return this.debitAccountNumber != null;
  }

  public void setDebitAccountNumberIsSet(boolean value) {
    if (!value) {
      this.debitAccountNumber = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getCreditAccountNumber() {
    return this.creditAccountNumber;
  }

  public TTransaction setCreditAccountNumber(@org.apache.thrift.annotation.Nullable java.lang.String creditAccountNumber) {
    this.creditAccountNumber = creditAccountNumber;
    return this;
  }

  public void unsetCreditAccountNumber() {
    this.creditAccountNumber = null;
  }

  /** Returns true if field creditAccountNumber is set (has been assigned a value) and false otherwise */
  public boolean isSetCreditAccountNumber() {
    return this.creditAccountNumber != null;
  }

  public void setCreditAccountNumberIsSet(boolean value) {
    if (!value) {
      this.creditAccountNumber = null;
    }
  }

  public double getAmount() {
    return this.amount;
  }

  public TTransaction setAmount(double amount) {
    this.amount = amount;
    setAmountIsSet(true);
    return this;
  }

  public void unsetAmount() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __AMOUNT_ISSET_ID);
  }

  /** Returns true if field amount is set (has been assigned a value) and false otherwise */
  public boolean isSetAmount() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __AMOUNT_ISSET_ID);
  }

  public void setAmountIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __AMOUNT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case DEBIT_ACCOUNT_NUMBER:
      if (value == null) {
        unsetDebitAccountNumber();
      } else {
        setDebitAccountNumber((java.lang.String)value);
      }
      break;

    case CREDIT_ACCOUNT_NUMBER:
      if (value == null) {
        unsetCreditAccountNumber();
      } else {
        setCreditAccountNumber((java.lang.String)value);
      }
      break;

    case AMOUNT:
      if (value == null) {
        unsetAmount();
      } else {
        setAmount((java.lang.Double)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case DEBIT_ACCOUNT_NUMBER:
      return getDebitAccountNumber();

    case CREDIT_ACCOUNT_NUMBER:
      return getCreditAccountNumber();

    case AMOUNT:
      return getAmount();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case DEBIT_ACCOUNT_NUMBER:
      return isSetDebitAccountNumber();
    case CREDIT_ACCOUNT_NUMBER:
      return isSetCreditAccountNumber();
    case AMOUNT:
      return isSetAmount();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof TTransaction)
      return this.equals((TTransaction)that);
    return false;
  }

  public boolean equals(TTransaction that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_debitAccountNumber = true && this.isSetDebitAccountNumber();
    boolean that_present_debitAccountNumber = true && that.isSetDebitAccountNumber();
    if (this_present_debitAccountNumber || that_present_debitAccountNumber) {
      if (!(this_present_debitAccountNumber && that_present_debitAccountNumber))
        return false;
      if (!this.debitAccountNumber.equals(that.debitAccountNumber))
        return false;
    }

    boolean this_present_creditAccountNumber = true && this.isSetCreditAccountNumber();
    boolean that_present_creditAccountNumber = true && that.isSetCreditAccountNumber();
    if (this_present_creditAccountNumber || that_present_creditAccountNumber) {
      if (!(this_present_creditAccountNumber && that_present_creditAccountNumber))
        return false;
      if (!this.creditAccountNumber.equals(that.creditAccountNumber))
        return false;
    }

    boolean this_present_amount = true;
    boolean that_present_amount = true;
    if (this_present_amount || that_present_amount) {
      if (!(this_present_amount && that_present_amount))
        return false;
      if (this.amount != that.amount)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetDebitAccountNumber()) ? 131071 : 524287);
    if (isSetDebitAccountNumber())
      hashCode = hashCode * 8191 + debitAccountNumber.hashCode();

    hashCode = hashCode * 8191 + ((isSetCreditAccountNumber()) ? 131071 : 524287);
    if (isSetCreditAccountNumber())
      hashCode = hashCode * 8191 + creditAccountNumber.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(amount);

    return hashCode;
  }

  @Override
  public int compareTo(TTransaction other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetDebitAccountNumber()).compareTo(other.isSetDebitAccountNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDebitAccountNumber()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.debitAccountNumber, other.debitAccountNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetCreditAccountNumber()).compareTo(other.isSetCreditAccountNumber());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCreditAccountNumber()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.creditAccountNumber, other.creditAccountNumber);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAmount()).compareTo(other.isSetAmount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAmount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.amount, other.amount);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("TTransaction(");
    boolean first = true;

    sb.append("debitAccountNumber:");
    if (this.debitAccountNumber == null) {
      sb.append("null");
    } else {
      sb.append(this.debitAccountNumber);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("creditAccountNumber:");
    if (this.creditAccountNumber == null) {
      sb.append("null");
    } else {
      sb.append(this.creditAccountNumber);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("amount:");
    sb.append(this.amount);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TTransactionStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TTransactionStandardScheme getScheme() {
      return new TTransactionStandardScheme();
    }
  }

  private static class TTransactionStandardScheme extends org.apache.thrift.scheme.StandardScheme<TTransaction> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TTransaction struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DEBIT_ACCOUNT_NUMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.debitAccountNumber = iprot.readString();
              struct.setDebitAccountNumberIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CREDIT_ACCOUNT_NUMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.creditAccountNumber = iprot.readString();
              struct.setCreditAccountNumberIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // AMOUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.amount = iprot.readDouble();
              struct.setAmountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TTransaction struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.debitAccountNumber != null) {
        oprot.writeFieldBegin(DEBIT_ACCOUNT_NUMBER_FIELD_DESC);
        oprot.writeString(struct.debitAccountNumber);
        oprot.writeFieldEnd();
      }
      if (struct.creditAccountNumber != null) {
        oprot.writeFieldBegin(CREDIT_ACCOUNT_NUMBER_FIELD_DESC);
        oprot.writeString(struct.creditAccountNumber);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(AMOUNT_FIELD_DESC);
      oprot.writeDouble(struct.amount);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TTransactionTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public TTransactionTupleScheme getScheme() {
      return new TTransactionTupleScheme();
    }
  }

  private static class TTransactionTupleScheme extends org.apache.thrift.scheme.TupleScheme<TTransaction> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TTransaction struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetDebitAccountNumber()) {
        optionals.set(0);
      }
      if (struct.isSetCreditAccountNumber()) {
        optionals.set(1);
      }
      if (struct.isSetAmount()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetDebitAccountNumber()) {
        oprot.writeString(struct.debitAccountNumber);
      }
      if (struct.isSetCreditAccountNumber()) {
        oprot.writeString(struct.creditAccountNumber);
      }
      if (struct.isSetAmount()) {
        oprot.writeDouble(struct.amount);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TTransaction struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.debitAccountNumber = iprot.readString();
        struct.setDebitAccountNumberIsSet(true);
      }
      if (incoming.get(1)) {
        struct.creditAccountNumber = iprot.readString();
        struct.setCreditAccountNumberIsSet(true);
      }
      if (incoming.get(2)) {
        struct.amount = iprot.readDouble();
        struct.setAmountIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

