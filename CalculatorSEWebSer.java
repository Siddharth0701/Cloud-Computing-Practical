package calculatorsewebser;
public class CalculatorSEWebSer 
{
public static void main(String[] args) 
   {  
       try{
        int i=7;
        int j=9;
        int result=add(7,9);
        int subresult=sub(7,9);
        System.out.println("Addition of two number using WebServices :"+result);
        System.out.println("Subtraction  of two number using WebServices :"+subresult);
       
       } 
       catch(Exception e)
       {
        e.printStackTrace();
       }
       
   }

    private static int add(int i, int j) {
        com.unique.CalculatorSer_Service service = new com.unique.CalculatorSer_Service();
        com.unique.CalculatorSer port = service.getCalculatorSerPort();
        return port.add(i, j);
    }

    private static int sub(int i, int j) {
        com.unique.CalculatorSer_Service service = new com.unique.CalculatorSer_Service();
        com.unique.CalculatorSer port = service.getCalculatorSerPort();
        return port.sub(i, j);
    }
    
}
