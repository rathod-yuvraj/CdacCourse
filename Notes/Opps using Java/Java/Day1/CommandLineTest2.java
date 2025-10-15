class CommandLineTest2{
   public static void main(String[] args){
       if(args.length<0){
	      System.out.println("Error: pass minimu 1 parameter");
	   }else{
	       int sum=0;
		   for(int i=0;i<args.length;i++){
		      sum=sum+Integer.parseInt(args[i]);
		   }
		   System.out.println("Sum : "+sum);
	   }
   }
 
}