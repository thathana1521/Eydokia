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
public class RoleDao extends org.jooq.impl.DAOImpl<org.inf.uth.eydokia.jooq.tables.records.RoleRecord, org.inf.uth.eydokia.jooq.tables.pojos.Role, java.lang.Integer> {

	/**
	 * Create a new RoleDao without any configuration
	 */
	public RoleDao() {
		super(org.inf.uth.eydokia.jooq.tables.Role.ROLE, org.inf.uth.eydokia.jooq.tables.pojos.Role.class);
	}

	/**
	 * Create a new RoleDao with an attached configuration
	 */
	public RoleDao(org.jooq.Configuration configuration) {
		super(org.inf.uth.eydokia.jooq.tables.Role.ROLE, org.inf.uth.eydokia.jooq.tables.pojos.Role.class, configuration);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected java.lang.Integer getId(org.inf.uth.eydokia.jooq.tables.pojos.Role object) {
		return object.getRoleId();
	}

	/**
	 * Fetch records that have <code>role_id IN (values)</code>
	 */
	public java.util.List<org.inf.uth.eydokia.jooq.tables.pojos.Role> fetchByRoleId(java.lang.Integer... values) {
		return fetch(org.inf.uth.eydokia.jooq.tables.Role.ROLE.ROLE_ID, values);
	}

	/**
	 * Fetch a unique record that has <code>role_id = value</code>
	 */
	public org.inf.uth.eydokia.jooq.tables.pojos.Role fetchOneByRoleId(java.lang.Integer value) {
		return fetchOne(org.inf.uth.eydokia.jooq.tables.Role.ROLE.ROLE_ID, value);
	}

	/**
	 * Fetch records that have <code>name IN (values)</code>
	 */
	public java.util.List<org.inf.uth.eydokia.jooq.tables.pojos.Role> fetchByName(java.lang.String... values) {
		return fetch(org.inf.uth.eydokia.jooq.tables.Role.ROLE.NAME, values);
	}
}
