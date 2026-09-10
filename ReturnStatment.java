public class ReturnStatment {
    public int sum()
    {
        int i = 10, j=30;
        int res = i+j;
        return res;
    }
    public static void main(String[] args) 
    {

        ReturnStatment obj = new ReturnStatment();
        int result = obj.sum();
        System.out.println(result);
    }
    
}
