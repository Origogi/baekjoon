package algo;

import java.util.Scanner;
import java.util.Stack;

public class M2504 {


	static Stack<Character> stack = new Stack<Character>(); 
	public static void main(String arg[]) {
		Scanner scan = new Scanner(System.in);
		String input;
		input = scan.next();
		
		int idx = 1;
		stack.push(input.charAt(0));
		int mul = 1;

		if ('(' == stack.peek()) {
			mul = 2;
		}
		else if ('[' == stack.peek()) {
			mul = 3;
		}
		else {
			System.out.println(0);
			return;
		}

		int result = 0;

		while (idx < input.length()) {
			char curC = input.charAt(idx);
			char befC = input.charAt(idx-1);
			
			
			if ('(' == curC) {
				idx++;
				stack.push(curC);
				mul = (mul*2);
				continue;
			}
			else if ('[' == curC) {
				idx++;
				stack.push(curC);
				mul = mul*3;			
				continue;
			}
			if (stack.isEmpty()) {
				result = 0;
				break;
				
			}
			
			char top = stack.peek();
			//연속으로 닫힘
			if ((befC == ')' && curC == ']')
					|| (befC == ']' && curC == ')')
					|| (befC == curC)) {
				if (top =='(' && curC != ')' ) {
					
					result =0;
					break;
				}
				if (top =='[' && curC != ']' ) {
					
					result =0;
					break;
				}
				
				
				if (curC == ')') {
					mul /=2;
				}
				else {
					mul/=3;
				}

				stack.pop();
			}
			else if ('(' == top && ')' == curC) {
				int tmp = 2;
				tmp = tmp * mul /2;
				
				result += tmp;
				stack.pop();
				mul /= 2;
			}
			else if ('[' == top && ']' == curC) {
				int tmp = 3;
				tmp = tmp * mul /3;
				result += tmp;
				stack.pop();
				mul /= 3;

			}
			else {
				result =0;
				break;
			}

			idx++;
		}

		if (!stack.isEmpty()) {
			result =0;
		}
		
		
		System.out.println(result);
		
	}
}