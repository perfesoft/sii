package es.fpm.log;

public final class Log {
	public static int DEBUG = 1;
	public static int INFO = 2;
	public static int WARNIG = 3;
	public static int ERROR = 4;
	
	public static void print (String msg, int level){
	// TODO de momento a consola
		System.out.println(msg);
	}

}
