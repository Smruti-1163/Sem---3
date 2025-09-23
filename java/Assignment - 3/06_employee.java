public class employee {
    public static void display(String ename,String emp_id, int dept_no, int salary){
        System.out.println(ename);
        System.out.println(emp_id);
        System.out.println(dept_no);
        System.out.println(salary);
    }
    public static void main(String args[]){
        if(args.length != 4){
            System.out.println("Error");
        } else {
            String ename = args[0];
            String emp_id = args[1];
            int dept_no = Integer.parseInt(args[2]);
            int salary = Integer.parseInt(args[3]);
            display(ename,emp_id,dept_no,salary);
        }
    }
}
