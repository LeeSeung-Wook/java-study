package example01;

public class EmpApp {

    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        Employee e1 = new Employee("김길동", "010-1111-2222");
        e1.setDept("현장팀");
        e1.setEmpNo(1);
        e1.setSalary(2500000);
        e1.setAccount("987-541-3530");
        e1.setPosition("사원");

        Employee e2 = new Employee("이길동", "010-2222-3333");
        e2.setDept("현장팀");
        e2.setEmpNo(2);
        e2.setSalary(2500000);
        e2.setAccount("874-513-5160");
        e2.setPosition("사원");

        Employee e3 = new Employee("박길동", "010-3333-4444");
        e3.setDept("주임원");
        e3.setEmpNo(3);
        e3.setSalary(4000000);
        e3.setAccount("892-131-5460");
        e3.setPosition("과장");

        Employee e4 = new Employee("최길동", "010-1414-4141", "개발팀");
        e4.setEmpNo(4);
        e4.setSalary(3000000);
        e4.setAccount("654-815-1550");
        e4.setPosition("대리");

        Employee e5 = new Employee("신길동", "010-2525-5252", "인사팀");
        e5.setEmpNo(5);
        e5.setSalary(3000000);
        e5.setAccount("654-651-6550");
        e5.setPosition("대리");

        Employee e6 = new Employee("추길동", "010-3636-6363", "현장팀");
        e6.setEmpNo(6);
        e6.setSalary(3000000);
        e6.setAccount("789-489-4880");
        e6.setPosition("대리");

        Employee e7 = new Employee("강길동", "010-4747-7474", "하청팀");
        e7.setEmpNo(7);
        e7.setSalary(2500000);
        e7.setAccount("156-145-1560");
        e7.setPosition("사원");

        Employee e8 = new Employee("경길동", "010-5858-8585", "교육팀");
        e8.setEmpNo(8);
        e8.setSalary(3000000);
        e8.setAccount("141-516-1510");
        e8.setPosition("대리");

        Employee e9 = new Employee("임길동", "010-0001-0002", "교육팀",
                9, 3000000, "012-012-0120", "대리");
        Employee e10 = new Employee("희길동", "010-0003-0004", "주임원",
                10, 5000000, "012-012-0120", "부장");


        employees[0] = e1;
        employees[1] = e2;
        employees[2] = e3;
        employees[3] = e4;
        employees[4] = e5;
        employees[5] = e6;
        employees[6] = e7;
        employees[7] = e8;
        employees[8] = e9;
        employees[9] = e10;

        System.out.println("========전체 사원 목록========");
        for (int i = 0; i < employees.length; i++) {
            employees[i].printInfo();
        }
        System.out.println();

        System.out.println("==이번 달 전체 월급 합계==");
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSalary();
        }
        System.out.println(sum);

        System.out.println("==전체 연봉 합계==");
        int allSum = 0;
        for (int i = 0; i < employees.length; i++) {
            allSum = allSum + employees[i].calcYearSalary();
        }
        System.out.println(allSum);

        System.out.println("==보너스 포함 전체 연봉 합계==");
        int bounsSum = 0;
        for (int i = 0; i < employees.length; i++) {
            bounsSum = bounsSum + employees[i].calcYearSalaryWithBonus();
        }
        System.out.println(bounsSum);

        int a = 8;
        System.out.println("승진 완료!!!");
        employees[a].promote();
        System.out.println(employees[a].getName() + "님의 직급은 " + employees[a].getPosition()
                + "으로 변경되고, 월급은 " + employees[a].getSalary() + "원으로 인상되었습니다.");


        Employee.paySalary(e1);
    }
}
