/**
 * This class is generated by jOOQ
 */
package org.inf.uth.eydokia.jooq.tables.daos;

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
public class RoomDao extends org.jooq.impl.DAOImpl<org.inf.uth.eydokia.jooq.tables.records.RoomRecord, org.inf.uth.eydokia.jooq.tables.pojos.Room, java.lang.Integer> {

	/**
	 * Create a new RoomDao without any configuration
	 */
	public RoomDao() {
		super(org.inf.uth.eydokia.jooq.tables.Room.ROOM, org.inf.uth.eydokia.jooq.tables.pojos.Room.class);
	}

	/**
	 * Create a new RoomDao with an attached configuration
	 */
	public RoomDao(org.jooq.Configuration configuration) {
		super(org.inf.uth.eydokia.jooq.tables.Room.ROOM, org.inf.uth.eydokia.jooq.tables.pojos.Room.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(org.inf.uth.eydokia.jooq.tables.pojos.Room object) {
		return object.getRoomId();
	}

	/**
	 * Fetch records that have <code>room_id IN (values)</code>
	 */
	public java.util.List<org.inf.uth.eydokia.jooq.tables.pojos.Room> fetchByRoomId(java.lang.Integer... values) {
		return fetch(org.inf.uth.eydokia.jooq.tables.Room.ROOM.ROOM_ID, values);
	}

	/**
	 * Fetch a unique record that has <code>room_id = value</code>
	 */
	public org.inf.uth.eydokia.jooq.tables.pojos.Room fetchOneByRoomId(java.lang.Integer value) {
		return fetchOne(org.inf.uth.eydokia.jooq.tables.Room.ROOM.ROOM_ID, value);
	}

	/**
	 * Fetch records that have <code>disabled IN (values)</code>
	 */
	public java.util.List<org.inf.uth.eydokia.jooq.tables.pojos.Room> fetchByDisabled(java.lang.Boolean... values) {
		return fetch(org.inf.uth.eydokia.jooq.tables.Room.ROOM.DISABLED, values);
	}

	/**
	 * Fetch records that have <code>name IN (values)</code>
	 */
	public java.util.List<org.inf.uth.eydokia.jooq.tables.pojos.Room> fetchByName(java.lang.String... values) {
		return fetch(org.inf.uth.eydokia.jooq.tables.Room.ROOM.NAME, values);
	}

	/**
	 * Fetch records that have <code>description IN (values)</code>
	 */
	public java.util.List<org.inf.uth.eydokia.jooq.tables.pojos.Room> fetchByDescription(java.lang.String... values) {
		return fetch(org.inf.uth.eydokia.jooq.tables.Room.ROOM.DESCRIPTION, values);
	}

	/**
	 * Fetch records that have <code>create_time IN (values)</code>
	 */
	public java.util.List<org.inf.uth.eydokia.jooq.tables.pojos.Room> fetchByCreateTime(java.sql.Timestamp... values) {
		return fetch(org.inf.uth.eydokia.jooq.tables.Room.ROOM.CREATE_TIME, values);
	}
}
