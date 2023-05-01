public class StackFullException  extends Exception
{
    public StackFullException()
    {
        super("Stack full");
    }
    public StackFullException(String errorMessage)
    {
        super(errorMessage);
    }
}
