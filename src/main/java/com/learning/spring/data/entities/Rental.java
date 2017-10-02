package com.learning.spring.data.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity 
@Table (name="RENTAL")
public class Rental
{
	@Id
	@Column (name="RENTAL_ID")
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Integer rentalId;
	
	@Column (name="PICKUP_DATE")
	private Date pickupDate;
	
	@Column (name="RETURN_DATE")
	private Date returnDate;
	
	@OneToOne
	@JoinColumn (name="MEDIA_ID")
	private Media media;
	
	@OneToOne
	@JoinColumn (name="PICKUP_LOCATION_ID")
	private RentalLocation pickupLocation;
	
	@OneToOne
	@JoinColumn (name="RETURN_LOCATION_ID")
	private RentalLocation returnLcation;
	
	/**
	 * @return the rentalId
	 */
	public Integer getRentalId()
	{
		return rentalId;
	}
	/**
	 * @param rentalId the rentalId to set
	 */
	public void setRentalId(Integer rentalId)
	{
		this.rentalId = rentalId;
	}
	/**
	 * @return the pickupDate
	 */
	public Date getPickupDate()
	{
		return pickupDate;
	}
	/**
	 * @param pickupDate the pickupDate to set
	 */
	public void setPickupDate(Date pickupDate)
	{
		this.pickupDate = pickupDate;
	}
	/**
	 * @return the returnDate
	 */
	public Date getReturnDate()
	{
		return returnDate;
	}
	/**
	 * @param returnDate the returnDate to set
	 */
	public void setReturnDate(Date returnDate)
	{
		this.returnDate = returnDate;
	}
	/**
	 * @return the media
	 */
	public Media getMedia()
	{
		return media;
	}
	/**
	 * @param media the media to set
	 */
	public void setMedia(Media media)
	{
		this.media = media;
	}
	/**
	 * @return the pickupLocation
	 */
	public RentalLocation getPickupLocation()
	{
		return pickupLocation;
	}
	/**
	 * @param pickupLocation the pickupLocation to set
	 */
	public void setPickupLocation(RentalLocation pickupLocation)
	{
		this.pickupLocation = pickupLocation;
	}
	/**
	 * @return the returnLcation
	 */
	public RentalLocation getReturnLcation()
	{
		return returnLcation;
	}
	/**
	 * @param returnLcation the returnLcation to set
	 */
	public void setReturnLcation(RentalLocation returnLcation)
	{
		this.returnLcation = returnLcation;
	}
	
	@Override
	public String toString (){
		return String.format("Rental Id : %d :: Pickup Date : %s :: return date : %s ", getRentalId(), getPickupDate(), getReturnDate());
	}
}
