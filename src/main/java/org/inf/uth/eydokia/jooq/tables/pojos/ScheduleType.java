/**
 * This class is generated by jOOQ
 */
package org.inf.uth.eydokia.jooq.tables.pojos;

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
public class ScheduleType implements java.io.Serializable {

	private static final long serialVersionUID = -106703355;

	private java.lang.Integer scheduleTypeId;
	private java.lang.String  name;

	public ScheduleType() {}

	public ScheduleType(
		java.lang.Integer scheduleTypeId,
		java.lang.String  name
	) {
		this.scheduleTypeId = scheduleTypeId;
		this.name = name;
	}

	public java.lang.Integer getScheduleTypeId() {
		return this.scheduleTypeId;
	}

	public void setScheduleTypeId(java.lang.Integer scheduleTypeId) {
		this.scheduleTypeId = scheduleTypeId;
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}
}