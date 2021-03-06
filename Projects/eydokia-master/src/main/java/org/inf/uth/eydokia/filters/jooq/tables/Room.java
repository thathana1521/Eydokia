/**
 * This class is generated by jOOQ
 */
package org.inf.uth.eydokia.jooq.tables;

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
public class Room extends org.jooq.impl.TableImpl<org.inf.uth.eydokia.jooq.tables.records.RoomRecord> {

	private static final long serialVersionUID = 651309996;

	/**
	 * The reference instance of <code>eydokia.room</code>
	 */
	public static final org.inf.uth.eydokia.jooq.tables.Room ROOM = new org.inf.uth.eydokia.jooq.tables.Room();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.inf.uth.eydokia.jooq.tables.records.RoomRecord> getRecordType() {
		return org.inf.uth.eydokia.jooq.tables.records.RoomRecord.class;
	}

	/**
	 * The column <code>eydokia.room.room_id</code>.
	 */
	public final org.jooq.TableField<org.inf.uth.eydokia.jooq.tables.records.RoomRecord, java.lang.Integer> ROOM_ID = createField("room_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>eydokia.room.disabled</code>.
	 */
	public final org.jooq.TableField<org.inf.uth.eydokia.jooq.tables.records.RoomRecord, java.lang.Boolean> DISABLED = createField("disabled", org.jooq.impl.SQLDataType.BIT, this, "");

	/**
	 * The column <code>eydokia.room.name</code>.
	 */
	public final org.jooq.TableField<org.inf.uth.eydokia.jooq.tables.records.RoomRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "");

	/**
	 * The column <code>eydokia.room.description</code>.
	 */
	public final org.jooq.TableField<org.inf.uth.eydokia.jooq.tables.records.RoomRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.CLOB.length(65535), this, "");

	/**
	 * The column <code>eydokia.room.create_time</code>.
	 */
	public final org.jooq.TableField<org.inf.uth.eydokia.jooq.tables.records.RoomRecord, java.sql.Timestamp> CREATE_TIME = createField("create_time", org.jooq.impl.SQLDataType.TIMESTAMP.defaulted(true), this, "");

	/**
	 * Create a <code>eydokia.room</code> table reference
	 */
	public Room() {
		this("room", null);
	}

	/**
	 * Create an aliased <code>eydokia.room</code> table reference
	 */
	public Room(java.lang.String alias) {
		this(alias, org.inf.uth.eydokia.jooq.tables.Room.ROOM);
	}

	private Room(java.lang.String alias, org.jooq.Table<org.inf.uth.eydokia.jooq.tables.records.RoomRecord> aliased) {
		this(alias, aliased, null);
	}

	private Room(java.lang.String alias, org.jooq.Table<org.inf.uth.eydokia.jooq.tables.records.RoomRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.inf.uth.eydokia.jooq.Eydokia.EYDOKIA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.inf.uth.eydokia.jooq.tables.records.RoomRecord, java.lang.Integer> getIdentity() {
		return org.inf.uth.eydokia.jooq.Keys.IDENTITY_ROOM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.inf.uth.eydokia.jooq.tables.records.RoomRecord> getPrimaryKey() {
		return org.inf.uth.eydokia.jooq.Keys.KEY_ROOM_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.inf.uth.eydokia.jooq.tables.records.RoomRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.inf.uth.eydokia.jooq.tables.records.RoomRecord>>asList(org.inf.uth.eydokia.jooq.Keys.KEY_ROOM_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.inf.uth.eydokia.jooq.tables.Room as(java.lang.String alias) {
		return new org.inf.uth.eydokia.jooq.tables.Room(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.inf.uth.eydokia.jooq.tables.Room rename(java.lang.String name) {
		return new org.inf.uth.eydokia.jooq.tables.Room(name, null);
	}
}
