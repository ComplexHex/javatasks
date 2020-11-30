public class ExceptionExample 
{
    public static void main(String[] args)
    {
        method1();
    }

    private static void method1()
    {
        method2();
    }

    private static void method2()
    {
        method3();
    }

    private static void method3()
    {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements)
        {
            System.out.println(element.getMethodName());
        }
    }
}
