package com.dnobre.worker.form;

public class WorkerForm {
	private Long id;
	private String name;
	private Double dailyIncome;

	public static class WorkerFormPost {
		private String name;
		private Double dailyIncome;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Double getDailyIncome() {
			return dailyIncome;
		}

		public void setDailyIncome(Double dailyIncome) {
			this.dailyIncome = dailyIncome;
		}

		public WorkerFormPost() {
			super();
		}

	}

	public WorkerForm() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getDailyIncome() {
		return dailyIncome;
	}

	public void setDailyIncome(Double dailyIncome) {
		this.dailyIncome = dailyIncome;
	}

}
