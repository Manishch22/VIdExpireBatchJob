package newbatch.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "vid", schema = "idmap")
@Entity
public class Vid implements Comparable<Vid> {
	/** The Id value */
	@Id
	private String id;

	/** The vid value */
	private String vid;
	
	/** The uin Hash value */
	private String uinHash;
	
	/** The uin value */
	private String uin;

	/** The value to hold vid Type Code */
	@Column(name = "vidtyp_code")
	private String vidTypeCode;

	/** The value to hold generated DTimes */
	@Column(name = "generated_dtimes")
	private LocalDateTime generatedDTimes;

	/** The value to hold expiry DTimes */
	@Column(name = "expiry_dtimes")
	private LocalDateTime expiryDTimes;

	/** The value to hold status Code */
	private String statusCode;

	/** The value to hold created By */
	@Column(name = "cr_by")
	private String createdBy;

	/** The value to hold created DTimes */
	@Column(name = "cr_dtimes")
	private LocalDateTime createdDTimes;

	/** The value to hold updated By */
	@Column(name = "upd_by", nullable = true)
	private String updatedBy;

	/** The value to hold updated Time */
	@Column(name = "upd_dtimes", nullable = true)
	private LocalDateTime updatedDTimes;

	/** The boolean of isDeleted */
	@Column(nullable = true)
	private boolean isDeleted;

	/** The value to hold deleted DTimes */
	@Column(name = "del_dtimes", nullable = true)
	private LocalDateTime deletedDTimes;

	@Override
	public int compareTo(Vid vid) {
		return vid.getCreatedDTimes().compareTo(createdDTimes);
	}


}
