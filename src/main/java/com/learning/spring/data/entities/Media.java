package com.learning.spring.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name="MEDIA")
public class Media
{
	@Id
	@Column (name="MEDIA_ID")
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Integer mediaId;
	
	@Column (name="TITLE")
	private String title;
	
	@Column (name="FORMAT")
	private String format;
	
	@Column (name="LENGTH")
	private Integer length;
	
	@Column (name="RATING")
	private Integer rating;
	
	@Column (name="IS_AVAILABLE")
	private boolean isAvailable;
	
//	@OneToOne
//	@JoinColumn (name="RENTAL_LOCATION_ID")
//	private RentalLocation rentalLocation;
	/**
	 * @return the mediaId
	 */
	public Integer getMediaId()
	{
		return mediaId;
	}
	/**
	 * @param mediaId the mediaId to set
	 */
	public void setMediaId(Integer mediaId)
	{
		this.mediaId = mediaId;
	}
	/**
	 * @return the title
	 */
	public String getTitle()
	{
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}
	/**
	 * @return the format
	 */
	public String getFormat()
	{
		return format;
	}
	/**
	 * @param format the format to set
	 */
	public void setFormat(String format)
	{
		this.format = format;
	}
	/**
	 * @return the length
	 */
	public Integer getLength()
	{
		return length;
	}
	/**
	 * @param length the length to set
	 */
	public void setLength(Integer length)
	{
		this.length = length;
	}
	/**
	 * @return the rating
	 */
	public Integer getRating()
	{
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(Integer rating)
	{
		this.rating = rating;
	}
	/**
	 * @return the isAvailable
	 */
	public boolean isAvailable()
	{
		return isAvailable;
	}
	/**
	 * @param isAvailable the isAvailable to set
	 */
	public void setAvailable(boolean isAvailable)
	{
		this.isAvailable = isAvailable;
	}
//	/**
//	 * @return the rentalLocation
//	 */
//	public RentalLocation getRentalLocation()
//	{
//		return rentalLocation;
//	}
//	/**
//	 * @param rentalLocation the rentalLocation to set
//	 */
//	public void setRentalLocation(RentalLocation rentalLocation)
//	{
//		this.rentalLocation = rentalLocation;
//	}

	@Override
	public String toString (){
		return String.format("Media Id : %d :: Title : %s :: Format : %s :: Length : %d :: Rating : %d :: is Available : %b", 
				getMediaId(), getTitle(), getFormat(), getLength(), getRating(), isAvailable());
	}
}
