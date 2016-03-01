/**
 * 
 */
package excel.utility;

/**
 * @author skallem
 *
 */
public class ExcelSheet2Row {

	private String catalogSellerId;
	private String sellerName;
	private String partnerId;
	private String sellerNexusId;
	
	/**
	 * 
	 */
	public ExcelSheet2Row() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param catalogSellerId
	 * @param sellerName
	 * @param partnerId
	 * @param sellerNexusId
	 */
	public ExcelSheet2Row(String catalogSellerId, String sellerName,
			String partnerId, String sellerNexusId) {
		super();
		this.catalogSellerId = catalogSellerId;
		this.sellerName = sellerName;
		this.partnerId = partnerId;
		this.sellerNexusId = sellerNexusId;
	}

	/**
	 * @return the catalogSellerId
	 */
	public String getCatalogSellerId() {
		return catalogSellerId;
	}

	/**
	 * @param catalogSellerId the catalogSellerId to set
	 */
	public void setCatalogSellerId(String catalogSellerId) {
		this.catalogSellerId = catalogSellerId;
	}

	/**
	 * @return the sellerName
	 */
	public String getSellerName() {
		return sellerName;
	}

	/**
	 * @param sellerName the sellerName to set
	 */
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((catalogSellerId == null) ? 0 : catalogSellerId.hashCode());
		result = prime * result
				+ ((partnerId == null) ? 0 : partnerId.hashCode());
		result = prime * result
				+ ((sellerName == null) ? 0 : sellerName.hashCode());
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
		ExcelSheet2Row other = (ExcelSheet2Row) obj;
		if (catalogSellerId == null) {
			if (other.catalogSellerId != null)
				return false;
		} else if (!catalogSellerId.equals(other.catalogSellerId))
			return false;
		if (partnerId == null) {
			if (other.partnerId != null)
				return false;
		} else if (!partnerId.equals(other.partnerId))
			return false;
		if (sellerName == null) {
			if (other.sellerName != null)
				return false;
		} else if (!sellerName.equals(other.sellerName))
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
		return "ExcelSheet2 [catalogSellerId=" + catalogSellerId
				+ ", sellerName=" + sellerName + ", partnerId=" + partnerId
				+ ", sellerNexusId=" + sellerNexusId + "]";
	}
	
}
