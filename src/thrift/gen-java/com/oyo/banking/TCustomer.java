/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.oyo.banking;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2020-02-04")
public class TCustomer implements org.apache.thrift.TBase<TCustomer, TCustomer._Fields>, java.io.Serializable, Cloneable, Comparable<TCustomer> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TCustomer");

  private static final org.apache.thrift.protocol.TField USERNAME_FIELD_DESC = new org.apache.thrift.protocol.TField("username", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField PASSWORD_FIELD_DESC = new org.apache.thrift.protocol.TField("password", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField BRANCH_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("branchCode", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField TRANSACTIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("transactions", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TCustomerStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TCustomerTupleSchemeFactory());
  }

  public String username; // required
  public String password; // required
  public String branchCode; // required
  public List<TTransaction> transactions; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USERNAME((short)1, "username"),
    PASSWORD((short)2, "password"),
    BRANCH_CODE((short)3, "branchCode"),
    TRANSACTIONS((short)4, "transactions");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // USERNAME
          return USERNAME;
        case 2: // PASSWORD
          return PASSWORD;
        case 3: // BRANCH_CODE
          return BRANCH_CODE;
        case 4: // TRANSACTIONS
          return TRANSACTIONS;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USERNAME, new org.apache.thrift.meta_data.FieldMetaData("username", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PASSWORD, new org.apache.thrift.meta_data.FieldMetaData("password", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.BRANCH_CODE, new org.apache.thrift.meta_data.FieldMetaData("branchCode", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TRANSACTIONS, new org.apache.thrift.meta_data.FieldMetaData("transactions", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT            , "TTransaction"))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TCustomer.class, metaDataMap);
  }

  public TCustomer() {
  }

  public TCustomer(
    String username,
    String password,
    String branchCode,
    List<TTransaction> transactions)
  {
    this();
    this.username = username;
    this.password = password;
    this.branchCode = branchCode;
    this.transactions = transactions;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TCustomer(TCustomer other) {
    if (other.isSetUsername()) {
      this.username = other.username;
    }
    if (other.isSetPassword()) {
      this.password = other.password;
    }
    if (other.isSetBranchCode()) {
      this.branchCode = other.branchCode;
    }
    if (other.isSetTransactions()) {
      List<TTransaction> __this__transactions = new ArrayList<TTransaction>(other.transactions.size());
      for (TTransaction other_element : other.transactions) {
        __this__transactions.add(other_element);
      }
      this.transactions = __this__transactions;
    }
  }

  public TCustomer deepCopy() {
    return new TCustomer(this);
  }

  @Override
  public void clear() {
    this.username = null;
    this.password = null;
    this.branchCode = null;
    this.transactions = null;
  }

  public String getUsername() {
    return this.username;
  }

  public TCustomer setUsername(String username) {
    this.username = username;
    return this;
  }

  public void unsetUsername() {
    this.username = null;
  }

  /** Returns true if field username is set (has been assigned a value) and false otherwise */
  public boolean isSetUsername() {
    return this.username != null;
  }

  public void setUsernameIsSet(boolean value) {
    if (!value) {
      this.username = null;
    }
  }

  public String getPassword() {
    return this.password;
  }

  public TCustomer setPassword(String password) {
    this.password = password;
    return this;
  }

  public void unsetPassword() {
    this.password = null;
  }

  /** Returns true if field password is set (has been assigned a value) and false otherwise */
  public boolean isSetPassword() {
    return this.password != null;
  }

  public void setPasswordIsSet(boolean value) {
    if (!value) {
      this.password = null;
    }
  }

  public String getBranchCode() {
    return this.branchCode;
  }

  public TCustomer setBranchCode(String branchCode) {
    this.branchCode = branchCode;
    return this;
  }

  public void unsetBranchCode() {
    this.branchCode = null;
  }

  /** Returns true if field branchCode is set (has been assigned a value) and false otherwise */
  public boolean isSetBranchCode() {
    return this.branchCode != null;
  }

  public void setBranchCodeIsSet(boolean value) {
    if (!value) {
      this.branchCode = null;
    }
  }

  public int getTransactionsSize() {
    return (this.transactions == null) ? 0 : this.transactions.size();
  }

  public java.util.Iterator<TTransaction> getTransactionsIterator() {
    return (this.transactions == null) ? null : this.transactions.iterator();
  }

  public void addToTransactions(TTransaction elem) {
    if (this.transactions == null) {
      this.transactions = new ArrayList<TTransaction>();
    }
    this.transactions.add(elem);
  }

  public List<TTransaction> getTransactions() {
    return this.transactions;
  }

  public TCustomer setTransactions(List<TTransaction> transactions) {
    this.transactions = transactions;
    return this;
  }

  public void unsetTransactions() {
    this.transactions = null;
  }

  /** Returns true if field transactions is set (has been assigned a value) and false otherwise */
  public boolean isSetTransactions() {
    return this.transactions != null;
  }

  public void setTransactionsIsSet(boolean value) {
    if (!value) {
      this.transactions = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case USERNAME:
      if (value == null) {
        unsetUsername();
      } else {
        setUsername((String)value);
      }
      break;

    case PASSWORD:
      if (value == null) {
        unsetPassword();
      } else {
        setPassword((String)value);
      }
      break;

    case BRANCH_CODE:
      if (value == null) {
        unsetBranchCode();
      } else {
        setBranchCode((String)value);
      }
      break;

    case TRANSACTIONS:
      if (value == null) {
        unsetTransactions();
      } else {
        setTransactions((List<TTransaction>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case USERNAME:
      return getUsername();

    case PASSWORD:
      return getPassword();

    case BRANCH_CODE:
      return getBranchCode();

    case TRANSACTIONS:
      return getTransactions();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case USERNAME:
      return isSetUsername();
    case PASSWORD:
      return isSetPassword();
    case BRANCH_CODE:
      return isSetBranchCode();
    case TRANSACTIONS:
      return isSetTransactions();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TCustomer)
      return this.equals((TCustomer)that);
    return false;
  }

  public boolean equals(TCustomer that) {
    if (that == null)
      return false;

    boolean this_present_username = true && this.isSetUsername();
    boolean that_present_username = true && that.isSetUsername();
    if (this_present_username || that_present_username) {
      if (!(this_present_username && that_present_username))
        return false;
      if (!this.username.equals(that.username))
        return false;
    }

    boolean this_present_password = true && this.isSetPassword();
    boolean that_present_password = true && that.isSetPassword();
    if (this_present_password || that_present_password) {
      if (!(this_present_password && that_present_password))
        return false;
      if (!this.password.equals(that.password))
        return false;
    }

    boolean this_present_branchCode = true && this.isSetBranchCode();
    boolean that_present_branchCode = true && that.isSetBranchCode();
    if (this_present_branchCode || that_present_branchCode) {
      if (!(this_present_branchCode && that_present_branchCode))
        return false;
      if (!this.branchCode.equals(that.branchCode))
        return false;
    }

    boolean this_present_transactions = true && this.isSetTransactions();
    boolean that_present_transactions = true && that.isSetTransactions();
    if (this_present_transactions || that_present_transactions) {
      if (!(this_present_transactions && that_present_transactions))
        return false;
      if (!this.transactions.equals(that.transactions))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_username = true && (isSetUsername());
    list.add(present_username);
    if (present_username)
      list.add(username);

    boolean present_password = true && (isSetPassword());
    list.add(present_password);
    if (present_password)
      list.add(password);

    boolean present_branchCode = true && (isSetBranchCode());
    list.add(present_branchCode);
    if (present_branchCode)
      list.add(branchCode);

    boolean present_transactions = true && (isSetTransactions());
    list.add(present_transactions);
    if (present_transactions)
      list.add(transactions);

    return list.hashCode();
  }

  @Override
  public int compareTo(TCustomer other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUsername()).compareTo(other.isSetUsername());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUsername()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.username, other.username);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPassword()).compareTo(other.isSetPassword());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPassword()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.password, other.password);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBranchCode()).compareTo(other.isSetBranchCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBranchCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.branchCode, other.branchCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTransactions()).compareTo(other.isSetTransactions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTransactions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.transactions, other.transactions);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TCustomer(");
    boolean first = true;

    sb.append("username:");
    if (this.username == null) {
      sb.append("null");
    } else {
      sb.append(this.username);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("password:");
    if (this.password == null) {
      sb.append("null");
    } else {
      sb.append(this.password);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("branchCode:");
    if (this.branchCode == null) {
      sb.append("null");
    } else {
      sb.append(this.branchCode);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("transactions:");
    if (this.transactions == null) {
      sb.append("null");
    } else {
      sb.append(this.transactions);
    }
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TCustomerStandardSchemeFactory implements SchemeFactory {
    public TCustomerStandardScheme getScheme() {
      return new TCustomerStandardScheme();
    }
  }

  private static class TCustomerStandardScheme extends StandardScheme<TCustomer> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TCustomer struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USERNAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.username = iprot.readString();
              struct.setUsernameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PASSWORD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.password = iprot.readString();
              struct.setPasswordIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // BRANCH_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.branchCode = iprot.readString();
              struct.setBranchCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TRANSACTIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.transactions = new ArrayList<TTransaction>(_list0.size);
                TTransaction _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = new TTransaction();
                  _elem1.read(iprot);
                  struct.transactions.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setTransactionsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TCustomer struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.username != null) {
        oprot.writeFieldBegin(USERNAME_FIELD_DESC);
        oprot.writeString(struct.username);
        oprot.writeFieldEnd();
      }
      if (struct.password != null) {
        oprot.writeFieldBegin(PASSWORD_FIELD_DESC);
        oprot.writeString(struct.password);
        oprot.writeFieldEnd();
      }
      if (struct.branchCode != null) {
        oprot.writeFieldBegin(BRANCH_CODE_FIELD_DESC);
        oprot.writeString(struct.branchCode);
        oprot.writeFieldEnd();
      }
      if (struct.transactions != null) {
        oprot.writeFieldBegin(TRANSACTIONS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.transactions.size()));
          for (TTransaction _iter3 : struct.transactions)
          {
            _iter3.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TCustomerTupleSchemeFactory implements SchemeFactory {
    public TCustomerTupleScheme getScheme() {
      return new TCustomerTupleScheme();
    }
  }

  private static class TCustomerTupleScheme extends TupleScheme<TCustomer> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TCustomer struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetUsername()) {
        optionals.set(0);
      }
      if (struct.isSetPassword()) {
        optionals.set(1);
      }
      if (struct.isSetBranchCode()) {
        optionals.set(2);
      }
      if (struct.isSetTransactions()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetUsername()) {
        oprot.writeString(struct.username);
      }
      if (struct.isSetPassword()) {
        oprot.writeString(struct.password);
      }
      if (struct.isSetBranchCode()) {
        oprot.writeString(struct.branchCode);
      }
      if (struct.isSetTransactions()) {
        {
          oprot.writeI32(struct.transactions.size());
          for (TTransaction _iter4 : struct.transactions)
          {
            _iter4.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TCustomer struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.username = iprot.readString();
        struct.setUsernameIsSet(true);
      }
      if (incoming.get(1)) {
        struct.password = iprot.readString();
        struct.setPasswordIsSet(true);
      }
      if (incoming.get(2)) {
        struct.branchCode = iprot.readString();
        struct.setBranchCodeIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.transactions = new ArrayList<TTransaction>(_list5.size);
          TTransaction _elem6;
          for (int _i7 = 0; _i7 < _list5.size; ++_i7)
          {
            _elem6 = new TTransaction();
            _elem6.read(iprot);
            struct.transactions.add(_elem6);
          }
        }
        struct.setTransactionsIsSet(true);
      }
    }
  }

}

