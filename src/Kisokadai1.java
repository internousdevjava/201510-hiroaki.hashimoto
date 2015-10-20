import java.io.BufferedReader;
	import java.io.InputStreamReader;

	public class Kisokadai1
	{
		  public static void main(String args[]) 
		  {
			    System.out.println("九九の表");

			    int x;
	            int y;
	            try{
	            // x入力
	            System.out.print("xを入力してください: ");
	            InputStreamReader isrx = new InputStreamReader(System.in);
	            BufferedReader bufx = new BufferedReader(isrx);
	                    String str = bufx.readLine();
	                    x = Integer.parseInt(str);
	         
	            //　y入力
	            System.out.print("yを入力してください: ");
	         
	            y = Integer.parseInt(bufx.readLine());

			    // 九九の結果を表示。
			    for( int i=1; i<x; i++ ) {
			      for( int j=1; j<y; j++ ) { 
			    	  System.out.print(i*j ); 
			      
			      	  System.out.println(""); 
			    }
	            }
	            }
			    catch(Exception e){
                    System.err.println(e);
            }
		  }
	}

