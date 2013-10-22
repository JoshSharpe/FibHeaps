public class Document
{
    public static void main(String[] args)
    {
        try
        {
            System.out.printf("Start:\n");
            Process proc = Runtime.getRuntime().exec("javadoc ../*.java\n");
            proc.waitFor();
            System.out.printf("End:\n");
        }
        catch(Throwable t)
        {
            t.printStackTrace();
        }
    }
}//end class
