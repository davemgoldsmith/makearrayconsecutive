package makearrayconsecutive;


import java.util.Arrays;

public class MakeArrayConsective {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] statues = {0,3};
		makeArrayConsecutive2  (statues);

	}
	
	 static int makeArrayConsecutive2(int[] statues) {
		 
		 
		Arrays.sort(statues);

		int range = statues[statues.length - 1] - statues[0];
		int missing = range - statues.length  +1;
	
		System.out.println(missing);

		return 0;
		
		
	}

}
