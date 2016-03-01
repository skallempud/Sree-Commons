/**
 * 
 */
package excel.utility;

/**
 * @author skallem
 *
 */
public class ExmtItmExcelSheetRow {

	private String superDept;
	private String category;
	private String subCategory;
	private String itemId;
	private String itemName;
	private String upc;

	/**
	 * @param superDept
	 * @param category
	 * @param subCategory
	 * @param itemId
	 * @param itemName
	 * @param upc
	 */
	public ExmtItmExcelSheetRow(String superDept, String category,
			String subCategory, String itemId, String itemName, String upc) {
		super();
		this.superDept = superDept;
		this.category = category;
		this.subCategory = subCategory;
		this.itemId = itemId;
		this.itemName = itemName;
		this.upc = upc;
	}

	/**
 * 
 */
	public ExmtItmExcelSheetRow() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the superDept
	 */
	public String getSuperDept() {
		return superDept;
	}

	/**
	 * @param superDept
	 *            the superDept to set
	 */
	public void setSuperDept(String superDept) {
		this.superDept = superDept;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category
	 *            the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the subCategory
	 */
	public String getSubCategory() {
		return subCategory;
	}

	/**
	 * @param subCategory
	 *            the subCategory to set
	 */
	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

	/**
	 * @return the itemId
	 */
	public String getItemId() {
		return itemId;
	}

	/**
	 * @param itemId
	 *            the itemId to set
	 */
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * @param itemName
	 *            the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * @return the upc
	 */
	public String getUpc() {
		return upc;
	}

	/**
	 * @param upc
	 *            the upc to set
	 */
	public void setUpc(String upc) {
		this.upc = upc;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((itemId == null) ? 0 : itemId.hashCode());
		result = prime * result
				+ ((itemName == null) ? 0 : itemName.hashCode());
		result = prime * result
				+ ((subCategory == null) ? 0 : subCategory.hashCode());
		result = prime * result
				+ ((superDept == null) ? 0 : superDept.hashCode());
		result = prime * result + ((upc == null) ? 0 : upc.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
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
		ExmtItmExcelSheetRow other = (ExmtItmExcelSheetRow) obj;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (itemId == null) {
			if (other.itemId != null)
				return false;
		} else if (!itemId.equals(other.itemId))
			return false;
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
			return false;
		if (subCategory == null) {
			if (other.subCategory != null)
				return false;
		} else if (!subCategory.equals(other.subCategory))
			return false;
		if (superDept == null) {
			if (other.superDept != null)
				return false;
		} else if (!superDept.equals(other.superDept))
			return false;
		if (upc == null) {
			if (other.upc != null)
				return false;
		} else if (!upc.equals(other.upc))
			return false;
		return true;
	}
}
