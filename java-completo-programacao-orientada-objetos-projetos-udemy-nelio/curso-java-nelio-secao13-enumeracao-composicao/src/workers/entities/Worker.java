package workers.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import workers.entities.enums.WorkLevel;

public class Worker {
	private String name;
	private WorkLevel level;
	private BigDecimal baseSalary;
	private List<HourContract> hourContracts;
	private Department department;

	public Worker() {
		if (this.hourContracts == null)
			this.hourContracts = new ArrayList<HourContract>(0);
	}

	public Worker(String name, WorkLevel level, BigDecimal baseSalary, Department departament) {
		super();
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = departament;
		if (this.hourContracts == null)
			this.hourContracts = new ArrayList<HourContract>(0);
	}

	public void addContract(HourContract contract) {
		this.hourContracts.add(contract);
	}

	public void removeContract(HourContract contract) {
		this.hourContracts.remove(contract);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkLevel getLevel() {
		return level;
	}

	public void setLevel(WorkLevel level) {
		this.level = level;
	}

	public BigDecimal getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(BigDecimal baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department departament) {
		this.department = departament;
	}

	public BigDecimal income(Integer year, Integer month) {
		Calendar c = Calendar.getInstance();
		BigDecimal sum = this.baseSalary;
		for (HourContract hourContract : this.hourContracts) {
			c.setTime(hourContract.getDate());
			int _y = c.get(Calendar.YEAR);
			int _m = 1 + c.get(Calendar.MONTH);
			if (year == _y && month == _m)
				sum = sum.add(hourContract.totalValue());
			//System.out.println(sum);
		}
		return sum;
	}

}
