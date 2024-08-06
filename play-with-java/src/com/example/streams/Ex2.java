package com.example.streams;

import com.example.streams.model.Trader;
import com.example.streams.model.Transaction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex2 {

    public static void main(String[] args) {


        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        // Q1,Finds all transactions in 2011 and sort by value (small to high)
        transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted((t1, t2) -> Integer.compare(t1.getValue(), t2.getValue()))
                .forEach(System.out::println);
        System.out.println();
        //Q2, What are all the unique cities where the traders work?
        transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .forEach(System.out::println);
        System.out.println();
        // Find all traders from Cambridge and sort them by name
        transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equals("Cambridge"))
                .distinct()
                .sorted((t1, t2) -> t1.getName().compareTo(t2.getName()))
                .forEach(System.out::println);
        System.out.println();
        // Return a string of all traders’ names sorted alphabetically.
        String s=transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println(s);
        // Are any traders based in Milan?
        boolean milanBased = transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));
        System.out.println(milanBased);
        // Print the values of all transactions from the traders living in Cambridge.
        transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .map(Transaction::getValue)
                .reduce(Integer::sum);
        // What’s the highest value of all the transactions?
        System.out.println(
                transactions.stream()
                        .map(Transaction::getValue)
                        .reduce(Integer::max)
        );
        // Find the transaction with the smallest value.
        System.out.println(
                transactions.stream()
                        .reduce((t1, t2) -> t1.getValue() < t2.getValue() ? t1 : t2)
        );

    }

}
