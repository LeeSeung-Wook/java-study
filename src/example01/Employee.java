package example01;

public class Employee {


    private String name; // 이름
    private String phone; // 전화번호
    private String dept; // 부서
    private int empNo; // 사원번호
    private int salary; // 월급
    private String account; // 계좌번호
    private String position; // 직급

    // getter,setter====================================
    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //생성자 ==========================================
    Employee(String name, String phone) {
        this.name = name;
        this.phone = phone;
        dept = "미정";
        empNo = 0;
        salary = 0;
        account = "";
        position = "사원";
    }

    Employee(String name, String phone, String dept) {
        this.name = name;
        this.phone = phone;
        this.dept = dept;
        empNo = 0;
        salary = 0;
        account = "";
        position = "사원";
    }

    Employee(String name, String phone, String dept,
             int empNo, int salary, String account, String position) {

        this.name = name;
        this.phone = phone;
        this.dept = dept;
        this.empNo = empNo;
        this.salary = salary;
        this.account = account;
        this.position = position;
    }

    //출력 =======================================================
    void printInfo() {
        System.out.println("{"+name + " / " + phone + " / " + dept +
                " / " + empNo + " / " + position + " / " + salary + " / " + account+"}");
    }

    // 연봉 계산 ===================================================
    int calcYearSalary() {
        return salary * 12;
    }

    int calcYearSalaryWithBonus() {
        if (position.equals("사원")) {
            salary = (int) ((salary * 12) * 1.1);
        }

        if (position.equals("대리")) {
            salary = (int) ((salary * 12) * 1.2);
        }

        if (position.equals("과장")) {
            salary = (int) ((salary * 12) * 1.3);
        }

        if (position.equals("부장")) {
            salary = (int) ((salary * 12) * 1.4);
        }
        return salary;
    }


    // 승진 ===========================================
    void promote() {
        if (position.equals("사원")) {
            position = "대리";
            salary = 3000000;
            return;
        }
        if (position.equals("대리")) {
            position = "과장";
            salary = 4000000;
            return;
        }
        if (position.equals("과장")) {
            position = "부장";
            salary = 5000000;
            return;
        }
        if (position.equals("부장")) {
            position = "부장";
            return;
        }
    }

    static void paySalary(Employee e) {
        System.out.println("====이체 알림====");
        System.out.println("[급여 이체 완료] " + e.name + "께 "
                + e.salary + "원이 " + e.account + "계좌로 지급되었습니다.");
    }

}
