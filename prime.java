find the number is prime or not.if the number is prime print "yes" or print "no".
  
  
  import java.utill.*;

public class solution{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    
    int i,m=0,flag=0;
    
    m = n/2;
    if(n==0||n==1){
      System.out.println("no");
      
      
  }
    else{
      for(i =2;i<m;i++){
        if(n%i==0){
          System.out.println("no");
          flag =1;
          break;
          }
      }
      if(flag==0){
        System.out.println("yes");
      }
        
}
  }
