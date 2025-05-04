class Employee:
    def __init__(self, name, emp_id, hourly_wage):
        self.name = name
        self.emp_id = emp_id
        self.hourly_wage = hourly_wage

    def calculate_wages(self, hours_per_week):
        weekly_wage = self.hourly_wage * hours_per_week
        monthly_wage = weekly_wage * 4
        return weekly_wage, monthly_wage

# Taking inputs from the user
name = input().strip()  # Employee Name
emp_id = input().strip()  # Employee ID
hourly_wage = int(input().strip())  # Hourly Wage
hours_per_week = int(input().strip())  # Hours worked per week

# Creating an Employee object
employee = Employee(name, emp_id, hourly_wage)

# Calculating wages
weekly_wage, monthly_wage = employee.calculate_wages(hours_per_week)

# Printing the output
print(f"Weekly wage of {name}: {weekly_wage}")
print(f"Monthly wage of {name}: {monthly_wage}")