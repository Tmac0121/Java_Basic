public class Demo{
	// int x=1; 		//primitive type 存入具体数值；
	// Integer y = 1; 	//reference type，存入一个地址；

//	 int sumTwo(int x, int y){
//	 	return x+y;
//	 }

	


	public static void main(String[] args){		// String[]定义一个字符串,
		boolean x = true;
		boolean y = false;

		//  ********* 新建array； **********
		// int a = 1;
		// int[] b = {1,2,3};	//定义一个static array；
		// int[] c = new int[8]; //另一种定义方法；
		// c[6] = 7;
		// b[0] = 3;	//不需要再申明array的类型；
		// System.out.println(args[2]);

		//  ******** 判断语句； ********
		// if (!(1==2)){
		// 	System.out.println("Hello, World!");
		// }

		// ******** 循环语句两种写法； *******
		// int j = 0;
		// for (int i = 1; i<100 ; i++ ){		//for循环之后仍然重要的变量写在循环之外；反之写在循环里；
		// 	if (i%3==0){
		// 		j++;
		// 	}
		// }
		// System.out.println(j);
		// int i = 0;
		// if (i<10){System.out.println(i)} else {break}; // 每次循环都在做的事；
		// int j = 0;
		// for (int i=1; i<=10; i++){
		// 	j = i+j;
		// }
		// System.out.println(j);
		// int[] a = {1,2,3,4,5,6,7};
		// int sum = 0;
		// for (int i : a){				// for each 循环
		// 	sum =sum + i;
		// }
		// System.out.println(sum);

		// ******  try... catch...  *******
		// try {
		// 	int[] a = {1,2,3};
		// 	System.out.println(a[3]);
		// } catch (Exception e){
		// 	System.out.println("error");
		// } finally {		// 不管try catch结果如何，都执行finally语句；
		// 	...
		// }



//		int j = 0;
//		for(int i = 1; i <= 1000; i++){
//			if(i%7==0){
//				j = j+1;
//			}else if(i/100==7){
//				j = j+1;
//			}else if((i%100)/10==7){
//				j = j+1;
//			}else if(i%10==7){
//				j = j+1;
//			}else{
//				continue;
//			}
//		}
//		System.out.println(j);

		int j = 0;
		for(int i = 1;i<=1000; i++){
			if(i%7==0){
				j = j+1;
			}
			if(i/100==7){
				j = j+1;
			}
			if((i%100)/10==7){
				j = j+1;
			}
			if(i%10==7){
				j = j+1;
//			}else{
//				continue;
			}
		}
		System.out.println(j);



	}

}