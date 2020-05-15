public class example{
	public static void main(String args[]){
		ex2 obj=new ex2();
	        }
	     }
class ex{
	public ex(){
		System.out.println("this is constructor of super class");
		}
	}
class ex2 extends ex{
	public ex2(){
		this(99);
		System.out.println("this is constructor of subclass1 class");
		     }
	public ex2(int x){
		System.out.println("this is constructor of subclass2 class");
		     }
		}
