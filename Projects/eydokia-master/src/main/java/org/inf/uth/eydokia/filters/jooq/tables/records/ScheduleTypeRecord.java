/**
 * This class is generated by jOOQ
 */
package org.inf.uth.eydokia.jooq.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.0"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ScheduleTypeRecord extends org.jooq.impl.UpdatableRecordImpl<org.inf.uth.eydokia.jooq.tables.records.ScheduleTypeRecord> implements org.jooq.Record2<java.lang.Integer, java.lang.String> {

	private static final long serialVersionUID = -346096662;

	/**
	 * Setter for <code>eydokia.schedule_type.schedule_type_id</code>.
	 */
	public void setScheduleTypeId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>eydokia.schedule_type.schedule_type_id</code>.
	 */
	public java.lang.Integer getScheduleTypeId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>eydokia.schedule_type.name</code>.
	 */
	public void setName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>eydokia.schedule_type.name</code>.
	 */
	public java.lang.String getName() {
		return (java.lang.String) getValue(1);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.String> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.String> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.inf.uth.eydokia.jooq.tables.ScheduleType.SCHEDULE_TYPE.SCHEDULE_TYPE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.inf.uth.eydokia.jooq.tables.ScheduleType.SCHEDULE_TYPE.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getScheduleTypeId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ScheduleTypeRecord value1(java.lang.Integer value) {
		setScheduleTypeId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ScheduleTypeRecord value2(java.lang.String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public ScheduleTypeRecord values(java.lang.Integer value1, java.lang.String value2) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached ScheduleTypeRecord
	 */
	public ScheduleTypeRecord() {
		super(org.inf.uth.eydokia.jooq.tables.ScheduleType.SCHEDULE_TYPE);
	}

	/**
	 * Create a detached, initialised ScheduleTypeRecord
	 */
	public ScheduleTypeRecord(java.lang.Integer scheduleTypeId, java.lang.String name) {
		super(org.inf.uth.eydokia.jooq.tables.ScheduleType.SCHEDULE_TYPE);

		setValue(0, scheduleTypeId);
		setValue(1, name);
	}
}