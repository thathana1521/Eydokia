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
public class Role extends org.jooq.impl.TableImpl<org.inf.uth.eydokia.jooq.tables.records.RoleRecord> {

	private static final long serialVersionUID = 1911381964;

	/**
	 * The reference instance of <code>eydokia.role</code>
	 */
	public static final org.inf.uth.eydokia.jooq.tables.Role ROLE = new org.inf.uth.eydokia.jooq.tables.Role();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.inf.uth.eydokia.jooq.tables.records.RoleRecord> getRecordType() {
		return org.inf.uth.eydokia.jooq.tables.records.RoleRecord.class;
	}

	/**
	 * The column <code>eydokia.role.role_id</code>.
	 */
	public final org.jooq.TableField<org.inf.uth.eydokia.jooq.tables.records.RoleRecord, java.lang.Integer> ROLE_ID = createField("role_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

	/**
	 * The column <code>eydokia.role.name</code>.
	 */
	public final org.jooq.TableField<org.inf.uth.eydokia.jooq.tables.records.RoleRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(32), this, "");

	/**
	 * Create a <code>eydokia.role</code> table reference
	 */
	public Role() {
		this("role", null);
	}

	/**
	 * Create an aliased <code>eydokia.role</code> table reference
	 */
	public Role(java.lang.String alias) {
		this(alias, org.inf.uth.eydokia.jooq.tables.Role.ROLE);
	}

	private Role(java.lang.String alias, org.jooq.Table<org.inf.uth.eydokia.jooq.tables.records.RoleRecord> aliased) {
		this(alias, aliased, null);
	}

	private Role(java.lang.String alias, org.jooq.Table<org.inf.uth.eydokia.jooq.tables.records.RoleRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.inf.uth.eydokia.jooq.Eydokia.EYDOKIA, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.inf.uth.eydokia.jooq.tables.records.RoleRecord, java.lang.Integer> getIdentity() {
		return org.inf.uth.eydokia.jooq.Keys.IDENTITY_ROLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.inf.uth.eydokia.jooq.tables.records.RoleRecord> getPrimaryKey() {
		return org.inf.uth.eydokia.jooq.Keys.KEY_ROLE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.inf.uth.eydokia.jooq.tables.records.RoleRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.inf.uth.eydokia.jooq.tables.records.RoleRecord>>asList(org.inf.uth.eydokia.jooq.Keys.KEY_ROLE_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.inf.uth.eydokia.jooq.tables.Role as(java.lang.String alias) {
		return new org.inf.uth.eydokia.jooq.tables.Role(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.inf.uth.eydokia.jooq.tables.Role rename(java.lang.String name) {
		return new org.inf.uth.eydokia.jooq.tables.Role(name, null);
	}
}
