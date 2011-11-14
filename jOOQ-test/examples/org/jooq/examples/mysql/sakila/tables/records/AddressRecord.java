/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.mysql.sakila.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = {"http://www.jooq.org", "2.0.0"},
                            comments = "This class is generated by jOOQ")
public class AddressRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.mysql.sakila.tables.records.AddressRecord> {

	private static final long serialVersionUID = -1373317564;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setAddressId(java.lang.Short value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.ADDRESS_ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Short getAddressId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.ADDRESS_ID);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.examples.mysql.sakila.tables.records.CustomerRecord> fetchCustomerList() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER)
			.where(org.jooq.examples.mysql.sakila.tables.Customer.CUSTOMER.ADDRESS_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.ADDRESS_ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.examples.mysql.sakila.tables.records.StaffRecord> fetchStaffList() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Staff.STAFF)
			.where(org.jooq.examples.mysql.sakila.tables.Staff.STAFF.ADDRESS_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.ADDRESS_ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.util.List<org.jooq.examples.mysql.sakila.tables.records.StoreRecord> fetchStoreList() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.Store.STORE)
			.where(org.jooq.examples.mysql.sakila.tables.Store.STORE.ADDRESS_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.ADDRESS_ID)))
			.fetch();
	}

	/**
	 * An uncommented item
	 */
	public void setAddress(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.ADDRESS_, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getAddress() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.ADDRESS_);
	}

	/**
	 * An uncommented item
	 */
	public void setAddress2(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.ADDRESS2, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getAddress2() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.ADDRESS2);
	}

	/**
	 * An uncommented item
	 */
	public void setDistrict(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.DISTRICT, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getDistrict() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.DISTRICT);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.address.city_id]
	 * REFERENCES city [sakila.city.city_id]
	 * </pre></code>
	 */
	public void setCityId(java.lang.Short value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.CITY_ID, value);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.address.city_id]
	 * REFERENCES city [sakila.city.city_id]
	 * </pre></code>
	 */
	public java.lang.Short getCityId() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.CITY_ID);
	}

	/**
	 * An uncommented item
	 * <p>
	 * <code><pre>
	 * FOREIGN KEY [sakila.address.city_id]
	 * REFERENCES city [sakila.city.city_id]
	 * </pre></code>
	 */
	public org.jooq.examples.mysql.sakila.tables.records.CityRecord fetchCity() {
		return create()
			.selectFrom(org.jooq.examples.mysql.sakila.tables.City.CITY)
			.where(org.jooq.examples.mysql.sakila.tables.City.CITY.CITY_ID.equal(getValue(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.CITY_ID)))
			.fetchOne();
	}

	/**
	 * An uncommented item
	 */
	public void setPostalCode(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.POSTAL_CODE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getPostalCode() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.POSTAL_CODE);
	}

	/**
	 * An uncommented item
	 */
	public void setPhone(java.lang.String value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.PHONE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getPhone() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.PHONE);
	}

	/**
	 * An uncommented item
	 */
	public void setLastUpdate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.LAST_UPDATE, value);
	}

	/**
	 * An uncommented item
	 */
	public java.sql.Timestamp getLastUpdate() {
		return getValue(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS.LAST_UPDATE);
	}

	/**
	 * Create a detached AddressRecord
	 */
	public AddressRecord() {
		super(org.jooq.examples.mysql.sakila.tables.Address.ADDRESS);
	}
}
