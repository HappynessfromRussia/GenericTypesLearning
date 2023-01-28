package GenericMethods;

import CostomGinericTypes.Account;

public class Main {
    public static void main(String[] args){
        Printer printer = new Printer();
        String[] strings = {"Tom", "Alice", "Sam", "Kate", "Bob", "Helen"};
        Integer[] integers = {21, 211, 345, 5 , 8};
        printer.<String>print(strings);
        printer.<Integer>print(integers);


        Account<Integer> acc3 = new Account<>(13000, 100, "Something");
    }
}
