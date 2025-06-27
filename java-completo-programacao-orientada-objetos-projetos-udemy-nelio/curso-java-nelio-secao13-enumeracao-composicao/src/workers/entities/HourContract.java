package workers.entities;

import java.math.BigDecimal;
import java.util.Date;

public class HourContract {
	private Date date;
	private BigDecimal valuePerHour;
	private Integer hours;

	public HourContract(Date date, BigDecimal valuePerHour, Integer hours) {
		super();
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}

	public HourContract() {
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public BigDecimal getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(BigDecimal valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public BigDecimal totalValue() {
		return this.valuePerHour.multiply(new BigDecimal(this.hours));
	}

}
