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
public class Events implements java.io.Serializable {

	private static final long serialVersionUID = 1921815181;

	private java.lang.Integer  id;
	private java.sql.Timestamp startDate;
	private java.sql.Timestamp endDate;
	private java.lang.String   text;

	public Events() {}

	public Events(
		java.lang.Integer  id,
		java.sql.Timestamp startDate,
		java.sql.Timestamp endDate,
		java.lang.String   text
	) {
		this.id = id;
		this.startDate = startDate;
		this.endDate = endDate;
		this.text = text;
	}

	public java.lang.Integer getId() {
		return this.id;
	}

	public void setId(java.lang.Integer id) {
		this.id = id;
	}

	public java.sql.Timestamp getStartDate() {
		return this.startDate;
	}

	public void setStartDate(java.sql.Timestamp startDate) {
		this.startDate = startDate;
	}

	public java.sql.Timestamp getEndDate() {
		return this.endDate;
	}

	public void setEndDate(java.sql.Timestamp endDate) {
		this.endDate = endDate;
	}

	public java.lang.String getText() {
		return this.text;
	}

	public void setText(java.lang.String text) {
		this.text = text;
	}
}
