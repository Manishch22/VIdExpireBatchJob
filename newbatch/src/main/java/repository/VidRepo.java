package repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import entity.Vid;


@Repository
public interface VidRepo extends JpaRepository<Vid, String> {
	/**
	 * This Method is used to retrieve Vid Object.
	 *
	 * @param vid the vid
	 * @return Vid Object
	 */
	Vid findByVid(String vid);
	
	/**
	 * The Query will retrieve List of vid based on the conditions provided.
	 *
	 * @param uinHash the uin hash
	 * @param statusCode the status code
	 * @param vidTypeCode the vid type code
	 * @param currentTime the current time
	 * @return the list
	 */
	List<Vid> findByUinHashAndStatusCodeAndVidTypeCodeAndExpiryDTimesAfter(String uinHash, String statusCode, String vidTypeCode, LocalDateTime currentTime);
	
	/**
	 * The Query to retrieve Uin by passing vid as parameter.
	 *
	 * @param vid the vid
	 * @return String Uin
	 */
	@Query("select uin from Vid where vid = :vid")
	public String retrieveUinByVid(@Param("vid") String vid);
	
	List<Vid> findByUinHashAndStatusCodeAndExpiryDTimesAfter(String uinHash, String statusCode, LocalDateTime currentTime);

	@Query("SELECT * FROM idmap.vid WHERE vidtyp_code= 'TEMPORARY' AND (expiry_dtimes :: DATE) <= (NOW() :: DATE)")
	public List<Vid> findByExpiryDTimes();

}
