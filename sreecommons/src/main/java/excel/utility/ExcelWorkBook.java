/**
 * 
 */
package excel.utility;

import java.util.List;

/**
 * @author skallem
 *
 */
public class ExcelWorkBook {

	private List<ExcelSheet1Row> sheet1;
	private List<ExcelSheet2Row> sheet2;
	
	/**
	 * 
	 */
	public ExcelWorkBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param sheet1
	 * @param sheet2
	 */
	public ExcelWorkBook(List<ExcelSheet1Row> sheet1, List<ExcelSheet2Row> sheet2) {
		super();
		this.sheet1 = sheet1;
		this.sheet2 = sheet2;
	}

	/**
	 * @return the sheet1
	 */
	public List<ExcelSheet1Row> getSheet1() {
		return sheet1;
	}

	/**
	 * @param sheet1 the sheet1 to set
	 */
	public void setSheet1(List<ExcelSheet1Row> sheet1) {
		this.sheet1 = sheet1;
	}

	/**
	 * @return the sheet2
	 */
	public List<ExcelSheet2Row> getSheet2() {
		return sheet2;
	}

	/**
	 * @param sheet2 the sheet2 to set
	 */
	public void setSheet2(List<ExcelSheet2Row> sheet2) {
		this.sheet2 = sheet2;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sheet1 == null) ? 0 : sheet1.hashCode());
		result = prime * result + ((sheet2 == null) ? 0 : sheet2.hashCode());
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
		ExcelWorkBook other = (ExcelWorkBook) obj;
		if (sheet1 == null) {
			if (other.sheet1 != null)
				return false;
		} else if (!sheet1.equals(other.sheet1))
			return false;
		if (sheet2 == null) {
			if (other.sheet2 != null)
				return false;
		} else if (!sheet2.equals(other.sheet2))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ExcelWorkBook [sheet1=" + sheet1 + ", sheet2=" + sheet2 + "]";
	}
}
