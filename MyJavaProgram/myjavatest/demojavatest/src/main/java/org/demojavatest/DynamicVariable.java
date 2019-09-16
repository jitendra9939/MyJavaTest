package org.demojavatest;

public class DynamicVariable {

	public static void main(String[] args) {
		String input = "my_variable_name";
		String variable = createVariable(input);
		System.out.println("Variable >> " + variable);
		String variableNew = createVariable(variable);
		System.out.println("variableNew >> " + variableNew);
	}

	public static String createVariable(String input) {
		char[] charArray = input.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < charArray.length; i++) {
			if (String.valueOf(charArray[i]).equals("_")) {
				sb.append(Character.toUpperCase(charArray[++i]));
			}
			else if (charArray[i]>=65 && charArray[i]<=90) 
			{
				sb.append("_");
				sb.append(Character.toLowerCase(charArray[i]));
			}
				else {
				sb.append(String.valueOf(charArray[i]));
			}
		}
		return sb.toString();
	}
}
