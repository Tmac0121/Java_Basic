package com.ascending.training.model;

import java.util.Stack;

public class Ddemo{
	public int calPoints(String[] ops) {
		Stack score = new Stack();
		int totalSum = 0;
		for(int i = 0;i<ops.length;i++){
			if(ops[i].equals("C")){
				int p = (int)score.pop();
				totalSum = totalSum - p;
			}else if(ops[i].equals("D")){
				int s = (int)score.peek();
				score.push(2*s);
				totalSum = totalSum + 2*s;
			}else if(ops[i].equals("+")){
				int s =(int)score.pop();
				int t =(int)score.peek();
				int sum = s+t;
				score.push(s);
				score.push(sum);
				totalSum = totalSum + sum;
			}else{
				int num = Integer.parseInt(ops[i]);
				score.push(num);
				totalSum = totalSum + num;
			}
		}
		return totalSum;
	}

	public static void main(String[] args) {
		String[] example = {"5","-2","4","C","D","9","+","+"};
		// example = ();
		Ddemo d = new Ddemo();
		System.out.println(d.calPoints(example));
	}
}




