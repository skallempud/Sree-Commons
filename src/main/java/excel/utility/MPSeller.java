/**
 * 
 */
package excel.utility;

/**
 * @author skallem
 *
 */
public class MPSeller {

	private String nexusMapId;
	private String sellerNexusId;
	private String nexusToken;
	private String sellerId;
	private String partnerName;
	private String partnerDisplayName;
	private String partnerId;
	
	/**
	 * 
	 */
	public MPSeller() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nexusMapId
	 * @param sellerNexusId
	 * @param nexusToken
	 * @param sellerId
	 * @param partnerName
	 * @param partnerDisplayName
	 * @param partnerId
	 */
	public MPSeller(String nexusMapId, String sellerNexusId, String nexusToken,
			String sellerId, String partnerName, String partnerDisplayName,
			String partnerId) {
		super();
		this.nexusMapId = nexusMapId;
		this.sellerNexusId = sellerNexusId;
		this.nexusToken = nexusToken;
		this.sellerId = sellerId;
		this.partnerName = partnerName;
		this.partnerDisplayName = partnerDisplayName;
		this.partnerId = partnerId;
	}

	/**
	 * @return the nexusMapId
	 */
	public String getNexusMapId() {
		return nexusMapId;
	}

	/**
	 * @param nexusMapId the nexusMapId to set
	 */
	public void setNexusMapId(String nexusMapId) {
		this.nexusMapId = nexusMapId;
	}

	/**
	 * @return the sellerNexusId
	 */
	public String getSellerNexusId() {
		return sellerNexusId;
	}

	/**
	 * @param sellerNexusId the sellerNexusId to set
	 */
	public void setSellerNexusId(String sellerNexusId) {
		this.sellerNexusId = sellerNexusId;
	}

	/**
	 * @return the nexusToken
	 */
	public String getNexusToken() {
		return nexusToken;
	}

	/**
	 * @param nexusToken the nexusToken to set
	 */
	public void setNexusToken(String nexusToken) {
		this.nexusToken = nexusToken;
	}

	/**
	 * @return the sellerId
	 */
	public String getSellerId() {
		return sellerId;
	}

	/**
	 * @param sellerId the sellerId to set
	 */
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	/**
	 * @return the partnerName
	 */
	public String getPartnerName() {
		return partnerName;
	}

	/**
	 * @param partnerName the partnerName to set
	 */
	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

	/**
	 * @return the partnerDisplayName
	 */
	public String getPartnerDisplayName() {
		return partnerDisplayName;
	}

	/**
	 * @param partnerDisplayName the partnerDisplayName to set
	 */
	public void setPartnerDisplayName(String partnerDisplayName) {
		this.partnerDisplayName = partnerDisplayName;
	}

	/**
	 * @return the partnerId
	 */
	public String getPartnerId() {
		return partnerId;
	}

	/**
	 * @param partnerId the partnerId to set
	 */
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((nexusMapId == null) ? 0 : nexusMapId.hashCode());
		result = prime * result
				+ ((nexusToken == null) ? 0 : nexusToken.hashCode());
		result = prime
				* result
				+ ((partnerDisplayName == null) ? 0 : partnerDisplayName
						.hashCode());
		result = prime * result
				+ ((partnerId == null) ? 0 : partnerId.hashCode());
		result = prime * result
				+ ((partnerName == null) ? 0 : partnerName.hashCode());
		result = prime * result
				+ ((sellerId == null) ? 0 : sellerId.hashCode());
		result = prime * result
				+ ((sellerNexusId == null) ? 0 : sellerNexusId.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MPSeller other = (MPSeller) obj;
		if (nexusMapId == null) {
			if (other.nexusMapId != null)
				return false;
		} else if (!nexusMapId.equals(other.nexusMapId))
			return false;
		if (nexusToken == null) {
			if (other.nexusToken != null)
				return false;
		} else if (!nexusToken.equals(other.nexusToken))
			return false;
		if (partnerDisplayName == null) {
			if (other.partnerDisplayName != null)
				return false;
		} else if (!partnerDisplayName.equals(other.partnerDisplayName))
			return false;
		if (partnerId == null) {
			if (other.partnerId != null)
				return false;
		} else if (!partnerId.equals(other.partnerId))
			return false;
		if (partnerName == null) {
			if (other.partnerName != null)
				return false;
		} else if (!partnerName.equals(other.partnerName))
			return false;
		if (sellerId == null) {
			if (other.sellerId != null)
				return false;
		} else if (!sellerId.equals(other.sellerId))
			return false;
		if (sellerNexusId == null) {
			if (other.sellerNexusId != null)
				return false;
		} else if (!sellerNexusId.equals(other.sellerNexusId))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MPSeller [nexusMapId=" + nexusMapId + ", sellerNexusId="
				+ sellerNexusId + ", nexusToken=" + nexusToken + ", sellerId="
				+ sellerId + ", partnerName=" + partnerName
				+ ", partnerDisplayName=" + partnerDisplayName + ", partnerId="
				+ partnerId + "]";
	}
	
}
