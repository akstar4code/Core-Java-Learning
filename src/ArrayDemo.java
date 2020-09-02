
public class ArrayDemo
{

	public static void main(String[] args)
	{
		/*
		// 1-D array
		int nums[] = new int[4]; // size must be
		int nums2[] = {8,12,76,54}; // another way
		nums[0] = 8;
		nums[1] = 15;
		nums[2] = 20;
		nums[3] = 63;
		for(int i=0;i<=3;i++)
		{
			System.out.println(nums[i]);
		}
		//2d array
		int a[] = {2,3,6};
		int b[] = {5,6,8};
		int c[] = {8,7,5};
		// int d[][] = {a,b,c};
		int d[][] = {
						{1,2,3,4},
						{4,5,6,9},
						{7,8,3,1}
					};
		System.out.println(d[0][1]);
		for(int r=0;r<=2;r++)
		{
			for(int col=0;col<=3;col++)
			{
				System.out.print(d[r][col]+" ");
			}
			System.out.println();
		}
		*/
		// enhaced for loop
		
		int nums2[] = {8,12,76,54};
		for(int k:nums2) {
			System.out.print(k+" ");
		}
		System.out.println();
		
		int d[][] = {
				{1,2,3,4},
				{4,5,6,9},
				{7,8,3,1}
			};
		
		for(int j[]:d) {
			for(int l:j) {
				System.out.print(l + " ");
			}
			System.out.println();
		}
	}

}
