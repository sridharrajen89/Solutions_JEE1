/**
 * 
 */
package co.htc.CoreJavaExercise2;
import java.util.*;

/**
 * @author MeenuGarg
 *
 */
public class ParkedBike extends Bike{
	private Date parkedDate;
	private Date deParkedDate;
	public ParkedBike() {
		super();
		this.parkedDate = null;
		this.deParkedDate = null;
	}
	/**
	 * @param parkedDate
	 * @param deParkedDate
	 */
	public ParkedBike(Date parkedDate, Date deParkedDate) {
		super();
		this.parkedDate = parkedDate;
		this.deParkedDate = deParkedDate;
	}
	
	/**
	 * @return the parkedDate
	 */
	public Date getParkedDate() {
		return parkedDate;
	}

	/**
	 * @param parkedDate the parkedDate to set
	 */
	public void setParkedDate(Date parkedDate) {
		this.parkedDate = parkedDate;
	}

	/**
	 * @return the deParkedDate
	 */
	public Date getDeParkedDate() {
		return deParkedDate;
	}

	/**
	 * @param deParkedDate the deParkedDate to set
	 */
	public void setDeParkedDate(Date deParkedDate) {
		this.deParkedDate = deParkedDate;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ParkedBike [parkedDate=" + parkedDate + ", deParkedDate=" + deParkedDate + "]";
	}

	
}
