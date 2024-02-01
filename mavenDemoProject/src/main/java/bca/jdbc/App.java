package bca.jdbc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException
    {
        System.out.println( "Hello World!" );
        Class.forName("com.mysql.cj.jdbc.Driver");
    }
}
