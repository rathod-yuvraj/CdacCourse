package com.demo.sort;

public class Employee {
	int empid;
	String eName;
	int sal;

	public Employee() {
		super();
	}

	public Employee(int empid, String eName, int sal) {
		super();
		this.empid = empid;
		this.eName = eName;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "[empid=" + empid + ", eName=" + eName + ", sal=" + sal + "]";
	}

	public void bubbleSort(Employee arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] != null && arr[j + 1] != null) {
					if (arr[j].sal > arr[j + 1].sal) {
						Employee temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
					}
				}
			}
		}
	}

	public void insertionSort(Employee[] arr, Employee data , int n) {
		int pos = n;
		while (pos > 0 && arr[pos-1].sal > data.sal) {
			arr[pos] = arr[pos-1];
			pos--;
		}
		arr[pos]=data;
	}

}
